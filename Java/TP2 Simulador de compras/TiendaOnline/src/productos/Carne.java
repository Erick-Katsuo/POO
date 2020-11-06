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
    
    public Carne(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String tipoCarne, String unidad) {
        super(tipoProducto, nombre, marca, precio, peso, fechaVencimiento, tieneOferta, unidad);
        this.tipoCarne = tipoCarne;
    }
    
    @Override
    public void infoProducto() {
        System.out.println("Mostrando informacion de un producto de Carne");
    }
    
    
}
