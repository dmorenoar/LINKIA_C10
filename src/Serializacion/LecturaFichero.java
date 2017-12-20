/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;

import java.io.File;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author
 */
public class LecturaFichero {
    //archivo.xml

    public static void main(String[] args) {

        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("archivo.xml");

        try {
            //Creamos el documento
            Document document = builder.build(xmlFile);
            
            Element rootNode = document.getRootElement();
            
            List list = rootNode.getChildren("pais");
            
        } catch (Exception e) {

        }

    }

}
