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

    private Lacteo[] productosLacteo;
    private Carne[] productosCarne;
    private Enlatado[] productosEnlatado;
    private Limpieza[] productosLimpieza;
    
    
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
    
    @Override
    public void agregarProducto(String[] infoProducto) {
        
    }
    
}
