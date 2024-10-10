package com.AdrianPeiro;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import java.util.List;

@JacksonXmlRootElement (localName = "persona")
public class Persona {

    @JacksonXmlProperty(localName = "nom")
    private String nom;

    @JacksonXmlProperty(localName = "edat")
    private int edat;
    @JacksonXmlElementWrapper(localName = "adreces")
    @JacksonXmlProperty(localName = "adreca")
    private List<Adreca> adreces;
    @JacksonXmlText(value = false)
    private String notes;

    public Persona() {
    }
    public Persona(String nom, int edat,String notes, List<Adreca> adreces) {
        this.nom = nom;
        this.edat = edat;
        this.notes = notes;
        this.adreces = adreces;

    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getEdat() {
        return edat;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }
    public List<Adreca> getAdreces() {
        return adreces;
    }
    public void setAdreces(List<Adreca> adreces) {
        this.adreces = adreces;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

}
