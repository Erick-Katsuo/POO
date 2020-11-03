/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prendas;

/**
 *
 * @author Katsuo
 */
public class Pantalon extends Ropa{
    private boolean tieneAgujeros;
    
    public boolean isTieneAgujeros(){
        return tieneAgujeros;
    }
    
    public void setTieneAgujeros(boolean tieneAgujeros){
        this.tieneAgujeros = tieneAgujeros;
    }
    
    @Override
    public void vender(){
        System.out.println("Vendiendo pantalon");
    }
    
    @Override
    public void mostrarTipoRopa(){
        System.out.println("Soy un pantalon");
    }
}
