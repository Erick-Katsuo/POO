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
    
    public static int contadorLimpieza;
    
    private String tipoLimpieza;

    public Limpieza(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String tipoLimpieza, String unidad) {
        super(tipoProducto, nombre, marca, precio, peso, fechaVencimiento, tieneOferta, unidad);
        this.tipoLimpieza = tipoLimpieza;
        contadorLimpieza++;
    }
    
    
    
    @Override
    public void infoProducto(){
        System.out.println("Mostrando informacion de un producto limpieza");
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Tipo de Limpieza: " + tipoLimpieza);
        System.out.println("Peso: " + peso + unidad);
        System.out.println("Tiene oferta: " + tieneOferta);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio + "$");
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
}
