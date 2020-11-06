/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import productos.*;

/**
 *
 * @author Katsuo
 */
public class SuperMercado extends Tienda implements Caja{

    private static final int MAX_LACTEOS = 10;
    
    private Lacteo[] productosLacteo;
    private Carne[] productosCarne;
    private Enlatado[] productosEnlatado;
    private Limpieza[] productosLimpieza;
    
    
    public SuperMercado(){
        productosLacteo = new Lacteo[MAX_LACTEOS];
    }
    
    @Override
    public void atenderCliente(Chango changoCliente) {

    }

    @Override
    public void calcularCostoFinal(Chango changoCliente, int cantidadCuotas) {
        
    }

    @Override
    public float calcularCuotas(float precioFinal, int cantidadCuotas) {
        return 0.0F;
    }
    
    /**
     * Agrega un producto Lacteo.
     * Agrega un producto Lacteo al vector productosLacteo
     * 
     * @param infoRestanteProducto contiene informacion restante del producto
     * @param precio del producto
     * @param peso del producto
     * @param oferta del producto
     */
    private void agregarProductoLacteo(String[] infoRestanteProducto, float precio, float peso, boolean oferta){
        System.out.println("Antes de agregar un producto lacteo el valor de contadorLacteos es:" + Lacteo.contadorLacteos);
        productosLacteo[Lacteo.contadorLacteos] = new Lacteo(infoRestanteProducto[Producto.TIPO_PRODUCTO],
                infoRestanteProducto[Producto.NOMBRE_PRODUCTO], infoRestanteProducto[Producto.MARCA],
                precio, peso, infoRestanteProducto[Producto.FECHA_VENCIMIENTO], oferta,
                infoRestanteProducto[Producto.INFO_EXTRA], infoRestanteProducto[Producto.UNIDAD_PESO]);  
    }
    
    public void mostrarProductosLacteo(){
        System.out.println("-------------------------------------------");
        System.out.println("\tMostrando productos lacteos disponibles");
        for(int i = 0 ; i < Lacteo.contadorLacteos ; i++){            
            System.out.println("\t\t***********");
            productosLacteo[i].infoProducto();
        }
    }
    
    
    @Override
    public void agregarProducto(String[] infoProducto) {
        float precioProducto = Float.parseFloat(infoProducto[Producto.PRECIO]);
        float pesoProducto = Float.parseFloat(infoProducto[Producto.PESO]);
        boolean ofertaProducto = Boolean.parseBoolean(infoProducto[Producto.OFERTA]);
        switch(infoProducto[Producto.TIPO_PRODUCTO]){
            case "Lacteo":
                agregarProductoLacteo(infoProducto, precioProducto, pesoProducto, ofertaProducto);
                System.out.println("Agregando producto Lacteo");
                break;
            case "Carne":
                //cargar un producto Carne al super mercado
                System.out.println("Agregando producto Carne");
                break;
            case "Enlatado":
                //cargar un producto Enlatado al super mercado
                System.out.println("Agregando producto Enlatado");
                break;
            case "Limpieza":
                //cargar un producto Limpieza al super mercado
                System.out.println("Agregando producto Limpieza");
                break;
                
        }
    }
    
}
