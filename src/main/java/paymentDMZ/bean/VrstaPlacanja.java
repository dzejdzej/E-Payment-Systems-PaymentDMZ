package paymentDMZ.bean; 

import com.fasterxml.jackson.annotation.JsonCreator;

public enum VrstaPlacanja {
	Banka("Banka"), 
	PayPal("PayPal");

    private String text;

    VrstaPlacanja (String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @JsonCreator
    public static VrstaPlacanja create (String value) {
        if(value == null) {
            throw new IllegalArgumentException();
        }
        for(VrstaPlacanja v : values()) {
            if(value.equals(v.getText())) {
                return v;
            }
        }
        throw new IllegalArgumentException();
    }

    public String getText() {
        return text;
    }
}
