package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class MainXmL {
    public static void main(String[] args) {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("C:\\Users\\serra\\IdeaProjects\\PruebaMaven\\src\\main\\resources\\datos.xml");

        try {
            if (xmlFile.exists()) {
                Persona persona = xmlMapper.readValue(xmlFile, Persona.class);

                System.out.println("Nom: " + persona.getNom());
                System.out.println("Edat: " + persona.getEdat());
                System.out.println("Notes: " + persona.getNotes());

                for (Adreca adreca : persona.getAdreces()) {
                    System.out.println("Tipus d'adreça: " + adreca.getTipus());
                    System.out.println("Carrer: " + adreca.getCarrer());
                    System.out.println("Ciutat: " + adreca.getCiutat());
                    System.out.println();
                }
            } else {
                System.err.println("El fitxer XML no existeix.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
