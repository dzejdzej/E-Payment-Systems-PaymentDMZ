package paymentDMZ.insurance.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestClientExceptionInfo {

	String origin; 
	String info; 
	
	public RestClientExceptionInfo() {
		
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public static RestClientExceptionInfo parse(String content) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			//JSON from String to Object
			RestClientExceptionInfo obj = mapper.readValue(content, RestClientExceptionInfo.class);
			return obj; 
		}catch(Exception e) {
			e.printStackTrace();
			return null; 
		}
	}
	
	public static String toJSON(RestClientExceptionInfo content) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			//JSON from String to Object
			return mapper.writeValueAsString(content); 
		}catch(Exception e) {
			e.printStackTrace();
			return null; 
		}
	}
	
	
	
	
	
	
}
