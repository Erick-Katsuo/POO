/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Katsuo
 */
public abstract class Tienda {
    private String nombre;
    private boolean oferta;
    
    /**
     * Agrega un producto con toda su informacion.
     * Agrega producto a la tienda
     * @param infoProducto contiene toda la informacion del producto a agregar
     */
    public abstract void agregarProducto(String[] infoProducto);
}
