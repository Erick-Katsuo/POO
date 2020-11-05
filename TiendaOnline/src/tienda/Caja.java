/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author Katsuo
 */
public interface Caja {
    
    /**
     * Muestra las operaciones al recibir un cliente.
     * @param changoCliente chango a operar en caja
     */
    public abstract void atenderCliente(Chango changoCliente);
    
    
    /**
     * Calcula costo final de la compra.
     * Costo final resultado de la suma del precio de cada producto del cliente
     * 
     * @param changoCliente el chango del cliente
     * @param cantidadCuotas elegidas por el cliente para pagar el costo final
     */
    public abstract void calcularCostoFinal(Chango changoCliente, int cantidadCuotas);
    
    
    /**
     * Calcula el precio de cada cuota.
     *  dependiendo de la cantidad elegida por el cliente
     * 
     * @param precioFinal de la cantidad de productos a comprar
     * @param cantidadCuotas la cantidad elegida por el cliente
     * 
     * @return el precio de cada cuota
     */
    public abstract float calcularCuotas(float precioFinal, int cantidadCuotas);
}
