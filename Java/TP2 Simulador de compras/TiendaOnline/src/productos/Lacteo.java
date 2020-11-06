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
public class Lacteo extends Producto{
    
    public static int contadorLacteos; // es un atributo de la clase
    
    private String tipoLacteo;

    public Lacteo(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String tipoLacteo, String unidad) {
        super(tipoProducto, nombre, marca, precio, peso, fechaVencimiento, tieneOferta, unidad);
        this.tipoLacteo = tipoLacteo;
        contadorLacteos++;
    }
    
        
    @Override
    public void infoProducto() {
        System.out.println("Mostrando informacion de un producto lacteo");
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Tipo de lacteo: " + tipoLacteo);
        System.out.println("Peso: " + peso + unidad);
    }
    
}
