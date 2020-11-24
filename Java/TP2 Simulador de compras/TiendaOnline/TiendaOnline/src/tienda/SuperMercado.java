/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import productos.*;

/**
 *
 * @author Katsuo
 */
public class SuperMercado extends Tienda implements Caja {

    private static final float OFERTA_SUPER = 0.7F;

    private static final int MAX_LACTEOS = 10;
    private static final int MAX_CARNES = 10;
    private static final int MAX_ENLATADO = 10;
    private static final int MAX_LIMPIEZA = 10;

    private static final String PROD_LACTEO = "Lacteo";
    private static final String PROD_CARNE = "Carne";
    private static final String PROD_ENLATADO = "Enlatado";
    private static final String PROD_LIMPIEZA = "Limpieza";

    private static final int PAGO_UNA_CUOTA = 1;

    private Lacteo[] productosLacteo;
    private Carne[] productosCarne;
    private Enlatado[] productosEnlatado;
    private Limpieza[] productosLimpieza;

    public SuperMercado(String nombre, boolean estaOferta) {// se crea una instancia de la clase SuperMercado
        super(nombre, estaOferta);// se crea una instancia de la clase TIenda
        productosLacteo = new Lacteo[MAX_LACTEOS];
        productosCarne = new Carne[MAX_CARNES];
        productosEnlatado = new Enlatado[MAX_ENLATADO];
        productosLimpieza = new Limpieza[MAX_LIMPIEZA];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaOferta() {
        return estaOferta;
    }

    public void setEstaOferta(boolean estaOferta) {
        this.estaOferta = estaOferta;
    }

    public void agregarProductoLacteoChango(Chango changoCliente, int opcProducto) {
        if (productosLacteo[opcProducto - Lacteo.MOD_CODIGO_LACTEO] != null) {
            changoCliente.agregarProducto(productosLacteo[opcProducto - Lacteo.MOD_CODIGO_LACTEO]);
        } else {
            System.out.println("codigo del producto no existe, el producto no fue agregado");
        }
    }

    public void agregarProductoCarneChango(Chango changoCliente, int opcProducto) {
        if (productosCarne[opcProducto - Carne.MOD_CODIGO_CARNE] != null) {
            changoCliente.agregarProducto(productosCarne[opcProducto - Carne.MOD_CODIGO_CARNE]);
        } else {
            System.out.println("codigo del producto no existe, el producto no fue agregado");
        }
    }

    public void agregarProductoEnlatadoChango(Chango changoCliente, int opcProducto) {
        if (productosEnlatado[opcProducto - Enlatado.MOD_CODIGO_ENLATADO] != null) {
            changoCliente.agregarProducto(productosEnlatado[opcProducto - Enlatado.MOD_CODIGO_ENLATADO]);
        } else {
            System.out.println("codigo del producto no existe, el producto no fue agregado");
        }

    }

    public void agregarProductoLimpiezaChango(Chango changoCliente, int opcProducto) {
        if (productosLimpieza[opcProducto - Limpieza.MOD_CODIGO_LIMPIEZA] != null) {
            changoCliente.agregarProducto(productosLimpieza[opcProducto - Limpieza.MOD_CODIGO_LIMPIEZA]);
        } else {
            System.out.println("codigo del producto no existe, el producto no fue agregado");
        }
    }

    private void menuCaja() {
        System.out.println("\t***Pasando por caja!");
        System.out.println("\t***Menu caja***");
        System.out.println("• Opc pagar 1 cuota [1]");
        System.out.println("• Opc pagar en cuotas [2]");
    }

    private void ejecutarOpcCaja(int opcRecbPago, Chango changoCliente) {
        Scanner opcCuotas = new Scanner(System.in);
        int cuotas = PAGO_UNA_CUOTA;
        switch (opcRecbPago) {
            case 1:
                System.out.println("Calculando pago en 1 cuota");
                calcularCostoFinal(changoCliente, cuotas);
                break;
            case 2:
                System.out.println("Calculando pago en cuotas");
                System.out.println("Ingrese cantidad de cuotas");
                cuotas = opcCuotas.nextInt();
                calcularCostoFinal(changoCliente, cuotas);
                break;
            default:
                System.out.println("Ingreso no aceptado");
        }
    }

    @Override
    public void atenderCliente(Chango changoCliente) {
        Scanner opcPago = new Scanner(System.in);
        int opcRecibPago;
        do {
            menuCaja();
            opcRecibPago = opcPago.nextInt();
            ejecutarOpcCaja(opcRecibPago, changoCliente);
        } while ((opcRecibPago != 1) && (opcRecibPago != 2));
    }

    @Override
    public void calcularCostoFinal(Chango changoCliente, int cantidadCuotas) {
        float costoFinal = 0;
        float precioAux = 0.0F;
        for (int i = 0; i < changoCliente.getCantCompras(); i++) {
            precioAux = changoCliente.getCarritoCompras()[i].getPrecio();
            if (changoCliente.getCarritoCompras()[i].isTieneOferta()) {
                System.out.println("tiene oferta!");
                System.out.println("Precio antes sin descuento: $" + precioAux);
                precioAux *= (1-OFERTA_SUPER);// precioAux = precioAux * (1-OFERTA_SUPER);
                System.out.println("Precio luego con descuento: $" + precioAux);
                costoFinal += precioAux;
            } else {
                costoFinal += precioAux;
                System.out.println("Precio sin descuento:" + precioAux);
            }
        }
        System.out.println("costo final: " + calcularCuotas(costoFinal, cantidadCuotas));
    }

    @Override
    public float calcularCuotas(float precioFinal, int cantidadCuotas) {
        System.out.println("Calculando cuotas" + cantidadCuotas);
        return precioFinal / cantidadCuotas;
    }

    /**
     * Agrega un producto Lacteo. Agrega un producto Lacteo al vector
     * productosLacteo
     *
     * @param infoRestanteProducto contiene informacion restante del producto
     * @param precio del producto
     * @param peso del producto
     * @param oferta del producto
     */
    private void agregarProductoLacteo(String[] infoRestanteProducto, float precio, float peso, boolean oferta) {
        System.out.println("Antes de agregar un producto lacteo el valor de contadorLacteos es:" + Lacteo.contadorLacteos);
        productosLacteo[Lacteo.contadorLacteos] = new Lacteo(infoRestanteProducto[Producto.TIPO_PRODUCTO],
                infoRestanteProducto[Producto.NOMBRE_PRODUCTO], infoRestanteProducto[Producto.MARCA],
                precio, peso, infoRestanteProducto[Producto.FECHA_VENCIMIENTO], oferta,
                infoRestanteProducto[Producto.INFO_EXTRA], infoRestanteProducto[Producto.UNIDAD_PESO]);
    }

    /**
     * Agrega un producto Carne. Agrega un producto Carne al vector
     * productosCarne
     *
     * @param infoRestanteProducto contiene informacion restante del producto
     * @param precio del producto
     * @param peso del producto
     * @param oferta del producto
     */
    private void agregarProductoCarne(String[] infoRestanteProducto, float precio, float peso, boolean oferta) {
        System.out.println("Antes de agregar un producto Carne el valor de contadorLacteos es:" + Lacteo.contadorLacteos);
        productosCarne[Carne.contadorCarne] = new Carne(infoRestanteProducto[Producto.TIPO_PRODUCTO],
                infoRestanteProducto[Producto.NOMBRE_PRODUCTO], infoRestanteProducto[Producto.MARCA],
                precio, peso, infoRestanteProducto[Producto.FECHA_VENCIMIENTO], oferta,
                infoRestanteProducto[Producto.INFO_EXTRA], infoRestanteProducto[Producto.UNIDAD_PESO]);
    }

    /**
     * Agrega un producto Enlatado. Agrega un producto Enlatado al vector
     * productosCarne
     *
     * @param infoRestanteProducto contiene informacion restante del producto
     * @param precio del producto
     * @param peso del producto
     * @param oferta del producto
     */
    private void agregarProductoEnlatado(String[] infoRestanteProducto, float precio, float peso, boolean oferta) {
        System.out.println("Antes de agregar un producto Enlatado el valor de contadorLacteos es:" + Lacteo.contadorLacteos);
        productosEnlatado[Enlatado.contadorEnlatado] = new Enlatado(infoRestanteProducto[Producto.TIPO_PRODUCTO],
                infoRestanteProducto[Producto.NOMBRE_PRODUCTO], infoRestanteProducto[Producto.MARCA],
                precio, peso, infoRestanteProducto[Producto.FECHA_VENCIMIENTO], oferta,
                infoRestanteProducto[Producto.INFO_EXTRA], infoRestanteProducto[Producto.UNIDAD_PESO]);
    }

    /**
     * Agrega un producto Enlatado. Agrega un producto Enlatado al vector
     * productosCarne
     *
     * @param infoRestanteProducto contiene informacion restante del producto
     * @param precio del producto
     * @param peso del producto
     * @param oferta del producto
     */
    private void agregarProductoLimpieza(String[] infoRestanteProducto, float precio, float peso, boolean oferta) {
        System.out.println("Antes de agregar un producto Limpieza el valor de contadorLacteos es:" + Lacteo.contadorLacteos);
        productosLimpieza[Limpieza.contadorLimpieza] = new Limpieza(infoRestanteProducto[Producto.TIPO_PRODUCTO],
                infoRestanteProducto[Producto.NOMBRE_PRODUCTO], infoRestanteProducto[Producto.MARCA],
                precio, peso, infoRestanteProducto[Producto.FECHA_VENCIMIENTO], oferta,
                infoRestanteProducto[Producto.INFO_EXTRA], infoRestanteProducto[Producto.UNIDAD_PESO]);
    }

    public void mostrarProductosLacteo() {
        System.out.println("-------------------------------------------");
        System.out.println("\tMostrando productos [lacteos] disponibles en el supermercado");
        for (int i = 0; i < Lacteo.contadorLacteos; i++) {
            System.out.println("\t\t***********");
            productosLacteo[i].infoProducto();
        }
    }

    public void mostrarProductosCarne() {
        System.out.println("-------------------------------------------");
        System.out.println("\tMostrando productos [Carne] disponibles en el supermercado");
        for (int i = 0; i < Carne.contadorCarne; i++) {
            System.out.println("\t\t***********");
            productosCarne[i].infoProducto();
        }
    }

    public void mostrarProductosEnlatado() {
        System.out.println("-------------------------------------------");
        System.out.println("\tMostrando productos [Enlatado] disponibles en el supermercado");
        for (int i = 0; i < Enlatado.contadorEnlatado; i++) {
            System.out.println("\t\t***********");
            productosEnlatado[i].infoProducto();
        }
    }

    public void mostrarProductosLimpieza() {
        System.out.println("-------------------------------------------");
        System.out.println("\tMostrando productos [Limpieza] disponibles en el supermercado");
        for (int i = 0; i < Limpieza.contadorLimpieza; i++) {
            System.out.println("\t\t***********");
            productosLimpieza[i].infoProducto();
        }
    }

    @Override
    public void agregarProducto(String[] infoProducto) {
        float precioProducto = Float.parseFloat(infoProducto[Producto.PRECIO]);
        float pesoProducto = Float.parseFloat(infoProducto[Producto.PESO]);
        boolean ofertaProducto = Boolean.parseBoolean(infoProducto[Producto.OFERTA]);
        switch (infoProducto[Producto.TIPO_PRODUCTO]) {
            case PROD_LACTEO:
                agregarProductoLacteo(infoProducto, precioProducto, pesoProducto, ofertaProducto);
                System.out.println("Agregando producto Lacteo");
                break;
            case PROD_CARNE:
                agregarProductoCarne(infoProducto, precioProducto, pesoProducto, ofertaProducto);
                System.out.println("Agregando producto Carne");
                break;
            case PROD_ENLATADO:
                agregarProductoEnlatado(infoProducto, precioProducto, pesoProducto, ofertaProducto);
                System.out.println("Agregando producto Enlatado");
                break;
            case PROD_LIMPIEZA:
                agregarProductoLimpieza(infoProducto, precioProducto, pesoProducto, ofertaProducto);
                System.out.println("Agregando producto Limpieza");
        }
    }

}
