/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author Katsuo
 */
public abstract class Usuario {
    protected String nombre;
    protected String tipoUsuario;
    protected int codigoUsuario;
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTipoUsuario(){
        return tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    
    /**
     * Muestra la informacion de la clase usuario actual.
     * La informacion mostrada debe contener todos los atributos de la clase usuario necesitada.
     */
    public abstract void obtenerInformacion();
    
    
    public abstract int cantidadDiasRegistrado();
    
}
