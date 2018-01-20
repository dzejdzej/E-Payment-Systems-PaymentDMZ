package paymentDMZ.bean;

import java.io.Serializable;

public class NekretninaDTO implements Serializable {

    private int id;
    private OsobaDTO osoba;

    public NekretninaDTO(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OsobaDTO getOsoba() {
        return osoba;
    }

    public void setOsoba(OsobaDTO osoba) {
        this.osoba = osoba;
    }

}
