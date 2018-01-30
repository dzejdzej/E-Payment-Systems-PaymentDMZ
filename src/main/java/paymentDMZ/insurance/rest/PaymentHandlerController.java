package paymentDMZ.insurance.rest;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import paymentDMZ.bean.PolisaDTO;

@RestController
@CrossOrigin
@RequestMapping("/paymentDMZMain")
public class PaymentHandlerController {

	
	@Value("${datacentar.url}")
    private String datacentarUrl;
	
	@Value("${paymentConcentrator.url}")
    private String paymentConcentratorUrl;
	
	@Value("${merchant.id}")
	private String merchantId;
	

	@Value("${merchant.password}")
	private String merchantPassword;
	
	@Value("${insurance.web.app.error.url}")
	private String insuranceWebAppErrorUrl;
	
	@Value("${insurance.web.app.failed.url}")
	private String insuranceWebAppFailedUrl;
	
	@Value("${insurance.web.app.success.url}")
	private String insuranceWebAppSuccessUrl;
	

	@Value("${error.origin.name}")
	private String errorOriginName; 
	
	@Autowired
	private RestTemplate rt;

	private final Log logger = LogFactory.getLog(this.getClass());
	
	@RequestMapping(value = "/buyPolicy", method = RequestMethod.POST, consumes = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ResponseEntity<?> buyPolicy(@RequestBody PolisaDTO polisaDTO) {
		String url = "https://" + this.datacentarUrl + "/dcTransakcije/logBeginOfTransaction";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<PolisaDTO> request = new HttpEntity<>(polisaDTO);
				
		ResponseEntity<CreateTransakcijaDTO> createTransResponse = rt.postForEntity(url , request , CreateTransakcijaDTO.class);
		CreateTransakcijaDTO createTransDTO = createTransResponse.getBody();
		
		System.out.println("createTransDTO:		" + createTransDTO);
		
		// dobijen Transcation ID , dobijen Transcation timestamp
		
		PCNewPaymentDTO paymentDTO = new PCNewPaymentDTO();
		paymentDTO.setMerchantId(merchantId);
		paymentDTO.setMerchantPassword(merchantPassword);
		
		paymentDTO.setAmmount(createTransDTO.getIznosTransakcije());
		paymentDTO.setMerchantOrderId(createTransDTO.getId());
		paymentDTO.setMerchantTimestamp(createTransDTO.getTimestamp());
		paymentDTO.setErrorURL(insuranceWebAppErrorUrl.replace("{id}",
				String.valueOf(createTransDTO.getId())));
		paymentDTO.setFailedURL(insuranceWebAppFailedUrl.replace("{id}", String.valueOf(createTransDTO.getId())));
		paymentDTO.setSuccessURL(insuranceWebAppSuccessUrl.replace("{id}", String.valueOf(createTransDTO.getId())));
		paymentDTO.setVrstaPlacanja(polisaDTO.vrstaPlacanja);
		
		System.out.println("PaymentDTO:		" + paymentDTO);
		
		HttpEntity<PCNewPaymentDTO> requestProcessPayment = new HttpEntity<>(paymentDTO);
		String processPaymentURL = "https://" + this.paymentConcentratorUrl + "paymentConcentratorMain/processPayment"; 
		ResponseEntity<BuyPolicyDTO> processPaymentResponse = rt.postForEntity(processPaymentURL , requestProcessPayment , BuyPolicyDTO.class);
		
		//////////////////////////////////////////////////////////////
		// AKO JE PROSLO OK
		// Kreirati polisu osiguranja, poslati je DC
		
		// kada to sve isto prodje
		// TEK Onda vratiti odgovor
		return ResponseEntity.ok(processPaymentResponse.getBody());//u dmz ocekuje string?????????
	}	
	
	
	@RequestMapping(value = "/completePaymentResponse", method = RequestMethod.POST, consumes = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ResponseEntity<?> completePaymentResponse(@RequestBody ResponseDTO responseDTO) {
		String url = "https://" + this.datacentarUrl + "/dcTransakcije/logEndOfTransaction";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<ResponseDTO> response = new HttpEntity<>(responseDTO);
				
		rt.postForEntity(url , response , String.class);
		
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	
	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<?> exceptionHandlerHttpError(HttpClientErrorException ex) {
		String body = ex.getResponseBodyAsString();
		RestClientExceptionInfo info = new RestClientExceptionInfo(); 
		
		
		if(RestClientExceptionInfo.parse(body) == null) {
			//ova aplikacija je uzrok exceptiona
			//priprema se exception za propagiranje dalje i loguje se
			info.setOrigin(errorOriginName);
			info.setInfo(body);
		}
		else {
			info.setOrigin(RestClientExceptionInfo.parse(body).getOrigin() );
			info.setInfo(RestClientExceptionInfo.parse(body).getInfo() );
		}
		logger.error("HttpClientErrorException, info:" + RestClientExceptionInfo.toJSON(info));
		
		
		return ResponseEntity.status(ex.getStatusCode()).body(RestClientExceptionInfo.toJSON(info));
	}
	
}

