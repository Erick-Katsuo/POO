/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katsuo
 */
public class TiendaOnline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivoProductos = new File("C:/Users/Katsuo/Documents/Temas nuevos CFP27/Java/nuevo/productos_prueba.txt");
        
        try {// intentamos leer el archivo
            Scanner archivoScan = new Scanner(archivoProductos);
            System.out.println("Encontro el archivo!");
            String informacion;
            while(archivoScan.hasNextLine()){ // verifica que el archivo no este vacio
                informacion = archivoScan.nextLine();// agarra la primer linea y lo guarda en "informacion"
                System.out.println(informacion);//muestra la linea de texto guardad en "informacion"
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No encontro el archivo \n" + ex);
        }
    }
    
}
