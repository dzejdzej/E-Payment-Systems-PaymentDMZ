package paymentDMZ.bean;

import java.util.Date;

public class OsobaDTO {
	
	public int id;
	public String ime;
	public String prezime;
	public String jmbg;
	public String adresa;
	public String brojTelefona;
	public String brojPasosa;
	public Date datumRodjenja;
	public String email;
	public TipOsobe tipOsobe;
	
	public enum TipOsobe{
		  OSIGURANIK,
		  DRUGO_LICE,
		  PRODAVAC
	}
}



