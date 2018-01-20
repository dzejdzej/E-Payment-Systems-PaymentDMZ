package paymentDMZ.insurance.rest;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CreateTransakcijaDTO implements Serializable {

	private int id; 
	private Date timestamp; 
	
	@JsonSerialize(using = MoneySerializer.class)
    private BigDecimal iznosTransakcije;
	
	public CreateTransakcijaDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public BigDecimal getIznosTransakcije() {
		return iznosTransakcije;
	}

	public void setIznosTransakcije(BigDecimal iznosTransakcije) {
		this.iznosTransakcije = iznosTransakcije;
	}	
}
