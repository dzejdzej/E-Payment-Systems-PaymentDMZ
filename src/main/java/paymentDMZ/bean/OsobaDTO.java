package paymentDMZ.bean;

import java.io.Serializable;

public class OsobaDTO implements Serializable {

    private int id;
    private String ime;
    private String prezime;
    private String JMBG;
    private String adresa;

    public OsobaDTO(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "OsobaDTO{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", JMBG='" + JMBG + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
