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
public class Enlatado extends Producto{
    
    public static int contadorEnlatado;
    
    private String tipoEnlatado;
    
    public Enlatado(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String tipoEnlatado, String unidad) {
        super(tipoProducto, nombre, marca, precio, peso, fechaVencimiento, tieneOferta, unidad);
        this.tipoEnlatado = tipoEnlatado;
        contadorEnlatado++;
    }
    
    @Override
    public void infoProducto() {
        System.out.println("Mostrando informacion de un producto lacteo");
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Tipo de Enlatado: " + tipoEnlatado);
        System.out.println("Peso: " + peso + unidad);
        System.out.println("Tiene oferta: " + tieneOferta);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio + "$");
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
    
    
}