package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        XmlMapper mapper = new XmlMapper();
        Persona persona  =new Persona();
        persona.setNom("Adrian Peiro");
        persona.setEdat(20);
        persona.setNotes("Esta és una persona molt important.");

       List<Adreca> adreces = new ArrayList<>();
        Adreca casa = new Adreca();
        casa.setTipus("casa");
        casa.setCarrer("Barrio Carbonaire");
        casa.setCiutat("Vall de Uxo");
        adreces.add(casa);

        Adreca oficina = new Adreca();
        oficina.setTipus("Instituto");
        oficina.setCarrer("Canto del Bobet");
        oficina.setCiutat("Benigaslo");
        adreces.add(oficina);

        persona.setAdreces(adreces);

        try {
            String xml = mapper.writeValueAsString(persona);
            System.out.println(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}