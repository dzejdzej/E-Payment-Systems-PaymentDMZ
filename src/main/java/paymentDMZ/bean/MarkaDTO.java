package paymentDMZ.bean; 

import java.io.Serializable;

public class MarkaDTO implements Serializable {

    private int id;
    private String naziv;

    public MarkaDTO(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
