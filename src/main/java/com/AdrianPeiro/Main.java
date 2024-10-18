package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("src/main/resources/datos.xml");
        Persona persona = xmlMapper.readValue(xmlFile, Persona.class);

        xmlMapper.writeValue(new File("src/main/resources/destino.xml"), persona);
       xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);






    }
}