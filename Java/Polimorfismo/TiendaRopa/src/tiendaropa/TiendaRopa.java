/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaropa;

import java.util.Scanner;
import prendas.*;

/**
 *
 * @author Katsuo
 */
public class TiendaRopa {

    /**
     * Vende la ropa recibida.
     * @param ropaRecibida ropa a vender
     */
    public static void venderRopa(Ropa ropaRecibida){
        ropaRecibida.vender();
        ropaRecibida.getPrecio();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner opcCantidad = new Scanner(System.in);
        System.out.println("Ingrese tamanio del vector");
        int opcRopa = opcCantidad.nextInt();
        
        Ropa[] armario = new Ropa[ opcRopa ]; // polimorfismo
        
        armario[0] = new Remera();
        armario[1] = new Pantalon();
        armario[2] = new Media();
        
        for(int i = 0 ; i < opcRopa ; i++){
            armario[i].mostrarTipoRopa();
            armario[i].vender();
        }
    }
    
}
