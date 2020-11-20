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
public abstract class Producto {
    public static final int TIPO_PRODUCTO = 0;
    public static final int NOMBRE_PRODUCTO = 1;
    public static final int MARCA = 2;
    public static final int PRECIO = 3;
    public static final int PESO = 4;
    public static final int FECHA_VENCIMIENTO = 5;
    public static final int OFERTA = 6;
    public static final int INFO_EXTRA = 7;
    public static final int UNIDAD_PESO = 8;
    
    public static final int CANT_CARACTERISTICAS = 8;
    
    protected String tipoProducto;
    protected String nombre;
    protected String marca;
    protected float precio;
    protected float peso;
    protected String fechaVencimiento;
    protected boolean tieneOferta;
    protected String unidad;
    
    protected int codigoProducto;
    protected static int cantProductos;
    
    public Producto(String tipoProducto, String nombre, String marca, float precio, float peso, String fechaVencimiento, boolean tieneOferta, String unidad) {
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.fechaVencimiento = fechaVencimiento;
        this.tieneOferta = tieneOferta;
        this.unidad = unidad;
        
        cantProductos++;
    }
    
    public String getTipoProducto(){
        return tipoProducto;
    }
    
    public void setTipoProducto(String tipoProducto){
        this.tipoProducto = tipoProducto;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isTieneOferta() {
        return tieneOferta;
    }

    public void setTieneOferta(boolean tieneOferta) {
        this.tieneOferta = tieneOferta;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    
    /**
     * Muestra la informacion del producto
     */
    public abstract void infoProducto();
    
}
