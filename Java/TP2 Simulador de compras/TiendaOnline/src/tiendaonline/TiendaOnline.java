/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        FileReader archivoProductos;
        String[] infoProducto = new String[9];
        int contadorCaracteristicas = 0;// posicion inicial de caracteristicas
        
        try {// intentamos leer el archivo
            archivoProductos = new FileReader("C:/Users/Katsuo/Documents/Temas nuevos CFP27/Java/nuevo/productos.txt");
            Scanner archivoScan = new Scanner(archivoProductos);// lee el archivo y guarda la informacion en archivoScan
            System.out.println("Encontro el archivo!");
            while(archivoScan.hasNextLine()){ // verifica que el archivo no este vacio
                infoProducto[contadorCaracteristicas] = archivoScan.next();// agarra la primer linea y lo guarda en "informacion"
                System.out.println(infoProducto[contadorCaracteristicas]);//muestra la linea de texto guardad en "informacion"
                
                if(contadorCaracteristicas == 8){
                    contadorCaracteristicas = 0; // reinicio el contador de productos para comenzar a guardar la informacion del siguiente
                }else{
                    contadorCaracteristicas++; // ASIGNARLE UN NUEVO VALOR AL CONTADOR PARA QUE PASE AL SIGUIENT ELEMENTO DEL VECTOR
                }
            }
            
            System.out.println("Termino de leer el archivo");
        } catch (FileNotFoundException ex) {
            System.out.println("No encontro el archivo \n" + ex);
        }
        
        System.out.println("Codigo que le sigue a la lectura");
        
        for(int i = 0 ; i < 9 ; i++){
            System.out.println( "Info del producto en la posicion " + i + " " +  infoProducto[i] );
        }
        
    }
    
}
