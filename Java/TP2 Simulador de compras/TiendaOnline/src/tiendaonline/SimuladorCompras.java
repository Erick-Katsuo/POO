/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import productos.Producto;
import tienda.Chango;
import tienda.SuperMercado;

/**
 * Contiene las caracteristicas y comportamientos necesarios para simular una
 * compra entre un chango y supermercado.
 *
 * @author Katsuo
 */
public class SimuladorCompras {

    private static final String ARCHIVO_PRODUCTOS = "productos.txt";
    private static final String RUTA_ARCHIVO_PRODUCTOS = "C:/Users/Katsuo/Documents/Temas nuevos CFP27/Java/nuevo/";
    
    private SuperMercado miSuper;
    private Chango miChango;
    
    public SimuladorCompras(){
        miSuper = new SuperMercado();
    }
    
    public void iniciarSimulacion(){
        leerArchivo();// carga los productos en el super mercado
        
        mostrarInfoProductos();
    }
    
    /**
    * Muestra todos los productos disponbiles en miSuper
    */
    public void mostrarInfoProductos(){
        miSuper.mostrarProductosLacteo();
        miSuper.mostrarProductosCarne();
    }
    
    
    
    
    /**
     * Controla la lectura de caracteristicas de los productos.
     * Dependiento de la cantidad de caracteristicas se sigue tomando más o se prepara para cargar el producto.
     * 
     * @param contadorCaracteristicas contiene el numero actual de caracteristicas leidas
     * @param infoProducto contiene la informacion actual obtenida del producto
     * 
     * @return el valor correspondiente del contaddor de caracteristicas
     */
    private int controlarLectura(int contadorCaracteristicas, String[] infoProducto) {
        if (contadorCaracteristicas == Producto.CANT_CARACTERISTICAS) {
            miSuper.agregarProducto(infoProducto);
            contadorCaracteristicas = 0; // reinicio el contador de productos para comenzar a guardar la informacion del siguiente
            System.out.println("--------------------------------------------------");
        } else {
            contadorCaracteristicas++; // ASIGNARLE UN NUEVO VALOR AL CONTADOR PARA QUE PASE AL SIGUIENT ELEMENTO DEL VECTOR
        }
        return contadorCaracteristicas;
    }
    
    /**
     * Muestra la informacion guardada de un producto.
     * Muestra las caracteristicas del producto a guardar
     * 
     * @param info contiene la caracteristica actual correspondiente
     * @param infoProducto contenedor de todas las caracteristicas del producto actual
     * @param contadorCaracteristicas contiene el valor numero de la caracteristica correspondiente
     */
    private void prepararProducto(String info, String[] infoProducto, int contadorCaracteristicas){
        switch(contadorCaracteristicas){
            case Producto.TIPO_PRODUCTO:
                System.out.println("Tipo de producto: " + info);
                infoProducto[Producto.TIPO_PRODUCTO] = info;
                break;
            case Producto.NOMBRE_PRODUCTO:
                System.out.println("Nombre del producto: " + info);
                infoProducto[Producto.NOMBRE_PRODUCTO] = info;
                break;
            case Producto.MARCA:
                System.out.println("Marca del producto: " + info);
                infoProducto[Producto.MARCA] = info;
                break;
            case Producto.PESO:
                System.out.println("Peso del producto: " + info);
                infoProducto[Producto.PESO] = info;
                break;
            case Producto.PRECIO:
                System.out.println("Precio del producto: " + info);
                infoProducto[Producto.PRECIO] = info;
                break;
            case Producto.FECHA_VENCIMIENTO:
                System.out.println("Fecha de vencimiento del producto: " + info);
                infoProducto[Producto.FECHA_VENCIMIENTO] = info;
                break;
            case Producto.OFERTA:
                System.out.println("Estado de oferta del producto: " + info);
                infoProducto[Producto.OFERTA] = info;
                break;
            case Producto.INFO_EXTRA:
                System.out.println("Info extra de producto: " + info);
                infoProducto[Producto.INFO_EXTRA] = info;
                break;
            case Producto.UNIDAD_PESO:
                System.out.println("Unidad de peso del producto: " + info);
                infoProducto[Producto.UNIDAD_PESO] = info;
                break;
        }
    }

    /**
     * Comienza a leer el archivo y separar la informacion.
     * 
     * @param infoArchivo contiene toda la informacion del archivo leido
     */
    private void separarInformacion(Scanner infoArchivo) {
        String[] infoProducto = new String[9];
        String info = "def caracteristica";
        int contadorCaracteristicas = 0;// posicion inicial de caracteristicas
        while (infoArchivo.hasNextLine()) { // verifica que el archivo no este vacio
            info = infoArchivo.next();// agarra la primer caracteristica y lo guarda en "informacion"
            prepararProducto(info, infoProducto, contadorCaracteristicas);//mostrar y guardar las caracteristicas leidas
            contadorCaracteristicas = controlarLectura(contadorCaracteristicas, infoProducto);
        }
    }

    /**
     * Prepara la lectura del archivo. 
     * Lee el archivo "productos"
     */
    public void leerArchivo() {
        FileReader archivoProductos;
        try {// intentamos leer el archivo
            archivoProductos = new FileReader(RUTA_ARCHIVO_PRODUCTOS + ARCHIVO_PRODUCTOS);
            Scanner archivoScan = new Scanner(archivoProductos);// lee el archivo y guarda la informacion en archivoScan
            System.out.println("Encontro el archivo!");
            separarInformacion(archivoScan);
            System.out.println("Termino de leer el archivo");
            archivoProductos.close();
        }catch (IOException ex) {
            System.out.println("No encontro el archivo \n" + ex);
        }
    }
}
