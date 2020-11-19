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
    
    public static int contadorCarne;
    
    private String tipoCarne;
    
    /**
     * Instancia un objeto Carne.
     * Asignar valores correspondientes a los atributos y aumenta el contadorCarne
     * 
     * @param tipoProducto tipo del producto
     * @param nombre del producto
     */
    public Carne(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String tipoCarne, String unidad) {
        super(tipoProducto, nombre, marca, precio, peso, fechaVencimiento, tieneOferta, unidad);
        this.tipoCarne = tipoCarne;
        contadorCarne++;
    }
    
    @Override
    public void infoProducto() {
        System.out.println("Mostrando informacion de un producto carne");
        System.out.println("Nombre del producto: " + nombre + " #"+codigoProducto);
        System.out.println("Tipo de carne: " + tipoCarne);
        System.out.println("Peso: " + peso + unidad);
        System.out.println("Tiene oferta: " + tieneOferta);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio + "$");
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
    
    
}
