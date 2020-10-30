/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *  Clase abstracta guitarra para dar la forma a otros tipos de guitarra.
 * @author Katsuo
 */
public abstract class Guitarra {
    protected String marca;
    protected float precio;
    protected String tipoGuitarra;
    protected boolean afinado;
    protected boolean tienePua;
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }

    public String getTipoGuitarra() {
        return tipoGuitarra;
    }

    public void setTipoGuitarra(String tipoGuitarra) {
        this.tipoGuitarra = tipoGuitarra;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }

    public boolean isTienePua() {
        return tienePua;
    }

    public void setTienePua(boolean tienePua) {
        this.tienePua = tienePua;
    }
    
    
    
    /**
     * Afinar todas las cuerdas del tipo de guitarra que se usa.
     * Muestra un mensaje informando la accion
     */
    public abstract void afinarCuerdas();
    
    /**
     *Usa la pua con el instrumento que se usa.
     * Muestra un mensaje informando como usa la pua
     */
    public abstract void usarPua();
    
    
}
