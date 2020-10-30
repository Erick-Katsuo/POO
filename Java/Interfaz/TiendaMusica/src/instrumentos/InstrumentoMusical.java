/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *  Representa el comportamiento para cualquier instrumento musical.
 * @author Katsuo
 */
public interface InstrumentoMusical {
    
    /**
     * Usa el instrumento.
     * Usa el instrumento de la menera correspondiente.
     */
    public abstract void usar();
    
    /**
     * Guarda el instrumento.
     * Guarda el instrumento de la menera correspondiente.
     */
    public abstract void guardar();
    
    /**
     * Vende el instrumento.
     * Vende el instrumento de la menera correspondiente.
     */
    public abstract void vender();
    
    
}
