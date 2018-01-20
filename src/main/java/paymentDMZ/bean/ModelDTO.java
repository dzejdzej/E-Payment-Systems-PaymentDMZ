package paymentDMZ.bean;

import java.io.Serializable;

public class ModelDTO implements Serializable {

    private int id;
    private String ime;
    private MarkaDTO marka;

    public ModelDTO(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String name) {
        this.ime = name;
    }

    public MarkaDTO getMarka() {
        return marka;
    }

    public void setMarka(MarkaDTO marka) {
        this.marka = marka;
    }
}
