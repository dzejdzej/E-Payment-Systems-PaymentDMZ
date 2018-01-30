package paymentDMZ.insurance.rest;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import paymentDMZ.bean.VrstaPlacanja;

public class PCNewPaymentDTO {
	
	private String merchantId;

	private String merchantPassword;

    @JsonSerialize(using = MoneySerializer.class)
    private BigDecimal ammount;
	
    private int merchantOrderId;
    
    private Date merchantTimestamp;
    
	private String errorURL;
	private String failedURL;
	private String successURL;
	private VrstaPlacanja vrstaPlacanja; 
	
	public PCNewPaymentDTO() {
	
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantPassword() {
		return merchantPassword;
	}

	public void setMerchantPassword(String merchantPassword) {
		this.merchantPassword = merchantPassword;
	}

	public BigDecimal getAmmount() {
		return ammount;
	}

	public void setAmmount(BigDecimal ammount) {
		this.ammount = ammount;
	}

	public int getMerchantOrderId() {
		return merchantOrderId;
	}

	public void setMerchantOrderId(int merchantOrderId) {
		this.merchantOrderId = merchantOrderId;
	}

	public Date getMerchantTimestamp() {
		return merchantTimestamp;
	}

	public void setMerchantTimestamp(Date merchantTimestamp) {
		this.merchantTimestamp = merchantTimestamp;
	}

	public String getErrorURL() {
		return errorURL;
	}

	public void setErrorURL(String errorURL) {
		this.errorURL = errorURL;
	}

	public String getFailedURL() {
		return failedURL;
	}

	public void setFailedURL(String failedURL) {
		this.failedURL = failedURL;
	}

	public String getSuccessURL() {
		return successURL;
	}

	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}

	public VrstaPlacanja getVrstaPlacanja() {
		return vrstaPlacanja;
	}

	public void setVrstaPlacanja(VrstaPlacanja vrstaPlacanja) {
		this.vrstaPlacanja = vrstaPlacanja;
	}
}
