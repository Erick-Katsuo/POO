/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusica;

import instrumentos.*;

/**
 *
 * @author Katsuo
 */
public class TiendaMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuitarraElectrica miGuitarra = new GuitarraElectrica();
        
        miGuitarra.vender(false);
    }

}
