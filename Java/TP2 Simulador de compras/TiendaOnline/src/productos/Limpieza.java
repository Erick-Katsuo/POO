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
public class Limpieza extends Producto{
    private String tipoLimpieza;

    public Limpieza(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String tipoLimpieza, String unidad) {
        super(tipoProducto, nombre, marca, precio, peso, fechaVencimiento, tieneOferta, unidad);
        this.tipoLimpieza = tipoLimpieza;
    }
    
    
    
    @Override
    public void infoProducto(){
        System.out.println("mostrando informacion de un producto de limpieza");
    }
}
