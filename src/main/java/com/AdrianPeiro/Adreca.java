package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Adreca {
    @JacksonXmlProperty(isAttribute=true , localName = "tipus")
    private String tipus;
    @JacksonXmlProperty(localName = "carrer")
    private String carrer;
    @JacksonXmlProperty(localName = "ciutat")
    private String ciutat;

    public Adreca() {}

    public Adreca(String tipus, String carrer, String ciutat ){
    this.tipus = tipus;
    this.carrer = carrer;
    this.ciutat = ciutat;
    }
    public String getTipus() {
        return tipus;
    }
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    public String getCarrer() {
        return carrer;
    }
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }
    public String getCiutat() {
        return ciutat;
    }
    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

}


