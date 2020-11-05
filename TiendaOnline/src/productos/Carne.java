/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Katsuo
 */
public class Carne extends Producto {
    
    private String tipoCarne;

    @Override
    public void infoProducto() {
        System.out.println("Mostrando informacion de un producto de Carne");
    }
    
    
}
