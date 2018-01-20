package paymentDMZ.insurance.rest;

import java.util.Date;

public class CompletePaymentResponseDTO {

	private Boolean success; 
	private String errorInfo; 
	private String reason; 
	private int issuerTransactionId; 
	private Date issuerTimestamp; 
	private int acquirerOrderId; 
	private Date acquirerTimestamp; 
	
	public CompletePaymentResponseDTO() {
		
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getIssuerTransactionId() {
		return issuerTransactionId;
	}

	public void setIssuerTransactionId(int issuerTransactionId) {
		this.issuerTransactionId = issuerTransactionId;
	}

	public Date getIssuerTimestamp() {
		return issuerTimestamp;
	}

	public void setIssuerTimestamp(Date issuerTimestamp) {
		this.issuerTimestamp = issuerTimestamp;
	}

	public int getAcquirerOrderId() {
		return acquirerOrderId;
	}

	public void setAcquirerOrderId(int acquirerOrderId) {
		this.acquirerOrderId = acquirerOrderId;
	}

	public Date getAcquirerTimestamp() {
		return acquirerTimestamp;
	}

	public void setAcquirerTimestamp(Date acquirerTimestamp) {
		this.acquirerTimestamp = acquirerTimestamp;
	}
}
