package paymentDMZ.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OsiguranjeDTO implements Serializable {

    private List<OsiguranikDTO> osiguranici;
    private OsobaDTO nosilac;
    private boolean nosilacJeOsiguranik;
    private List<VoziloDTO> vozila;
    private List<NekretninaDTO> nekretnine;
    private String destinacija;
    private Date pocetakOsiguranja;
    private String svrhaOsiguranja;
    private int trajanjeOsiguranja;
    private String emailNosioca;
    private VrstaPlacanja vrstaPlacanja; 

    public OsiguranjeDTO() {
    }

    public List<OsiguranikDTO> getOsiguranici() {
        return osiguranici;
    }

    public void setOsiguranici(List<OsiguranikDTO> osiguranici) {
        this.osiguranici = osiguranici;
    }

    public OsobaDTO getNosilac() {
        return nosilac;
    }

    public void setNosilac(OsobaDTO nosilac) {
        this.nosilac = nosilac;
    }

    public boolean isNosilacJeOsiguranik() {
        return nosilacJeOsiguranik;
    }

    public void setNosilacJeOsiguranik(boolean nosilacJeOsiguranik) {
        this.nosilacJeOsiguranik = nosilacJeOsiguranik;
    }

    public List<VoziloDTO> getVozila() {
        return vozila;
    }

    public void setVozila(List<VoziloDTO> vozila) {
        this.vozila = vozila;
    }

    public List<NekretninaDTO> getNekretnine() {
        return nekretnine;
    }

    public void setNekretnine(List<NekretninaDTO> nekretnine) {
        this.nekretnine = nekretnine;
    }

    public String getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(String destinacija) {
        this.destinacija = destinacija;
    }

    public Date getPocetakOsiguranja() {
        return pocetakOsiguranja;
    }

    public void setPocetakOsiguranja(Date pocetakOsiguranja) {
        this.pocetakOsiguranja = pocetakOsiguranja;
    }

    public String getSvrhaOsiguranja() {
        return svrhaOsiguranja;
    }

    public void setSvrhaOsiguranja(String svrhaOsiguranja) {
        this.svrhaOsiguranja = svrhaOsiguranja;
    }

    public int getTrajanjeOsiguranja() {
        return trajanjeOsiguranja;
    }

    public void setTrajanjeOsiguranja(int trajanjeOsiguranja) {
        this.trajanjeOsiguranja = trajanjeOsiguranja;
    }

    public String getEmailNosioca() {
        return emailNosioca;
    }

    public void setEmailNosioca(String emailNosioca) {
        this.emailNosioca = emailNosioca;
    }

    public VrstaPlacanja getVrstaPlacanja() {
		return vrstaPlacanja;
	}

	public void setVrstaPlacanja(VrstaPlacanja vrstaPlacanja) {
		this.vrstaPlacanja = vrstaPlacanja;
	}

	@Override
    public String toString() {
        return "OsiguranjeDTO{" +
                "osiguranici=" + osiguranici +
                ", nosilac=" + nosilac +
                ", nosilacJeOsiguranik=" + nosilacJeOsiguranik +
                ", vozila=" + vozila +
                ", nekretnine=" + nekretnine +
                ", destinacija='" + destinacija + '\'' +
                ", pocetakOsiguranja=" + pocetakOsiguranja +
                ", svrhaOsiguranja='" + svrhaOsiguranja + '\'' +
                ", trajanjeOsiguranja=" + trajanjeOsiguranja +
                ", emailNosioca='" + emailNosioca + '\'' +
                ", vrstaPlacanja='" + vrstaPlacanja + '\'' +
                '}';
    }
}
