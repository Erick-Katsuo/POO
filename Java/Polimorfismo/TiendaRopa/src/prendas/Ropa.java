/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prendas;

/**
 *
 * @author Katsuo
 */
public abstract class Ropa {
    
    public static final float DEF_PRECIO = 500.0F;
    protected float precio = DEF_PRECIO;
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    /**
     * Vende la ropa.
     * Muestra un mensaje informando la venta.
     */
    public abstract void vender();
    
    /**
     * Muesta el tipo de ropa.
     */
    public abstract void mostrarTipoRopa();
}
