package paymentDMZ.bean;

import java.io.Serializable;

public class OsiguranikDTO implements Serializable {

    private int id;
    private String brojPasosa;
    private String brojTelefona;
    private OsobaDTO osoba;

    public OsiguranikDTO(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrojPasosa() {
        return brojPasosa;
    }

    public void setBrojPasosa(String brojPasosa) {
        this.brojPasosa = brojPasosa;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public OsobaDTO getOsoba() {
        return osoba;
    }

    public void setOsoba(OsobaDTO osoba) {
        this.osoba = osoba;
    }

    @Override
    public String toString() {
        return "OsiguranikDTO{" +
                "id=" + id +
                ", brojPasosa='" + brojPasosa + '\'' +
                ", brojTelefona='" + brojTelefona + '\'' +
                ", osoba=" + osoba +
                '}';
    }
}
