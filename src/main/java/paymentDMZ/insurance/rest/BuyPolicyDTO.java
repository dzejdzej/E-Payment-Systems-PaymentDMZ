package paymentDMZ.insurance.rest;

public class BuyPolicyDTO {

	private String paymentURL;
	private int paymentID;
	private int orderId; 

	public BuyPolicyDTO() {
	
	}
	
	public void setPaymentURL(String paymentURL) {
		this.paymentURL = paymentURL;
		
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public String getPaymentURL() {
		return paymentURL;
	}

	public int getPaymentID() {
		return paymentID;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
