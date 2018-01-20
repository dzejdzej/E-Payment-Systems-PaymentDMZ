package paymentDMZ.bean;

import java.io.Serializable;
import java.util.Date;

public class VoziloDTO implements Serializable {

    private int id;
    private Date godProizvodnje;
    private String regTablice;
    private String brSasije;
    private OsobaDTO osoba;
    private MarkaDTO marka;
    private ModelDTO model;
    private boolean jeVlasnik = true;

    public VoziloDTO(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getGodProizvodnje() {
        return godProizvodnje;
    }

    public void setGodProizvodnje(Date godProizvodnje) {
        this.godProizvodnje = godProizvodnje;
    }

    public String getRegTablice() {
        return regTablice;
    }

    public void setRegTablice(String regTablice) {
        this.regTablice = regTablice;
    }

    public String getBrSasije() {
        return brSasije;
    }

    public void setBrSasije(String brSasije) {
        this.brSasije = brSasije;
    }

    public OsobaDTO getOsoba() {
        return osoba;
    }

    public void setOsoba(OsobaDTO osoba) {
        this.osoba = osoba;
    }

    public MarkaDTO getMarka() {
        return marka;
    }

    public void setMarka(MarkaDTO marka) {
        this.marka = marka;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    public boolean isJeVlasnik() {
        return jeVlasnik;
    }

    public void setJeVlasnik(boolean jeVlasnik) {
        this.jeVlasnik = jeVlasnik;
    }
}
