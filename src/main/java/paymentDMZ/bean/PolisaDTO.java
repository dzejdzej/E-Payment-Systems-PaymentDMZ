package paymentDMZ.bean;

import java.util.ArrayList;
import java.util.Date;

public class PolisaDTO {
	
	public ArrayList<OsobaDTO> osiguranici;
	public ArrayList<RizikDTO> riziciPutno;
	public OsobaDTO nosilac;
	public ArrayList<NekretninaDTO> nekretnine;
	public ArrayList<VoziloDTO> vozila;
	public int trajanjeOsiguranja;
	public String vrstaPaketa;
	public Date pocetakOsiguranja;
	public VrstaPlacanja vrstaPlacanja; 


	@Override
	public String toString() {
		return "PolisaDTO{" +
				"osiguranici=" + osiguranici.size() +
				", riziciPutno=" + riziciPutno +
				", nosilac=" + nosilac.email +
				", nekretnine=" + nekretnine .size()+
				", vozila=" + vozila.size() +
				", trajanjeOsiguranja=" + trajanjeOsiguranja +
				", vrstaPaketa='" + vrstaPaketa + '\'' +
				", pocetakOsiguranja=" + pocetakOsiguranja +
				", vrstaPlacanja=" + vrstaPlacanja +
				'}';
	}
}
