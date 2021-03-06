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
    
    public static float OFERTA_LACTEO = 0.25F;
    
    public static int contadorLacteos; // es un atributo de la clase
    
    public static final int MOD_CODIGO_LACTEO = 231312334;
    
    private String tipoLacteo;

    public Lacteo(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String tipoLacteo, String unidad) {
        super(tipoProducto, nombre, marca, precio, peso, fechaVencimiento, tieneOferta, unidad);
        this.tipoLacteo = tipoLacteo;
        codigoProducto = contadorLacteos + MOD_CODIGO_LACTEO;
        contadorLacteos++;
    }
    
        
    @Override
    public void infoProducto() {
        System.out.println("Mostrando informacion de un producto lacteo");
        System.out.println("Nombre del producto: " + nombre + " #"+codigoProducto);
        System.out.println("Tipo de lacteo: " + tipoLacteo);
        System.out.println("Peso: " + peso + unidad);
        System.out.println("Tiene oferta: " + tieneOferta);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio + "$");
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
    
}
