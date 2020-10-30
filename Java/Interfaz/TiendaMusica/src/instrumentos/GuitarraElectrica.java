/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author Katsuo
 */
public class GuitarraElectrica extends Guitarra implements InstrumentoMusical{
    
    public static final boolean CON_AMPLIFICADOR = true;
    
    private boolean tieneAmplificador;
    
    /**
     * Instancia una guitarra electrica.
     * Instancia el objeto con un amplificador
     */
    public GuitarraElectrica(){
        this.tieneAmplificador = CON_AMPLIFICADOR;
    }
    
    public boolean isTieneAmplificador(){
        return tieneAmplificador;
    }
    
    public void setTieneAmplificador(boolean tieneAmplificador){
        this.tieneAmplificador = tieneAmplificador;
    }
    
    @Override
    public void usarPua(){
        System.out.println("Usando pua en guitarra electrica");
    }
    
    @Override
    public void afinarCuerdas(){
        System.out.println("Afinando cuerdas");
    }
    
    @Override
    public void vender(){
        System.out.println("Vendiendo guitarra electrica y amplificador");
    }
    
    /**
     *Vende toda la guitarra con amplificador o solo el amplificador.
     * Vende todo llama al metodo vender() y caso contrario solo imprime un mensaje
     * 
     * @param venderTodo indica si se desea vender la guitarra con amplificador
     */
    public void vender(boolean venderTodo){
        if(venderTodo){
            vender();
        }else{
            System.out.println("Vendiendo solo el amplificador");
        }
    }
    
    @Override
    public void guardar(){
        System.out.println("Guardando guitarra electrica");
    }
    
    @Override
    public void usar(){
        if(tieneAmplificador){
            System.out.println("Usando guitarra electrica con amplificador");
        }else{
            System.out.println("Usando guitarra electrica sin amplificador");
        }
    }
}
