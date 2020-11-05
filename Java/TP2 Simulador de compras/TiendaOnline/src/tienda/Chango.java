/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import productos.Producto;

/**
 *
 * @author Katsuo
 */
public class Chango {
    public static final int MAX_COMPRAS = 100;
    
    private Producto[] carritoCompras;
    private int cantCompras;
    
    public Chango(){
        carritoCompras = new Producto[MAX_COMPRAS];
    }
    
    /**
     * Agrega un producto al carritoCompras.
     * Accede al vector carritoCompras guardando el productoComprado
     * 
     * @param productoComprado producto a agregar en el carritoCompras
     */
    public void agregarProducto(Producto productoComprado){
        carritoCompras[cantCompras] = productoComprado;
        cantCompras++; // aumente la cantidad de productos comprados en el carritoCompras
    }
    
    /**
     * Muestra la informacion del producto comprado.
     * El producto del carritoCompras muestra su informacion
     */
    public void mostrarCompras(){
        for(int i = 0 ; i < cantCompras ; i++){
            carritoCompras[i].infoProducto();
        }
    }
}
