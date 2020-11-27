/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3cfp27;

/**
 *
 * @author Katsuo
 */
public class Estudiante {
    private String nombre;
    private String email;
    private String comentario;
    private int[] notas;
    
    public static final int MAX_NOTAS = 3;
    
    public Estudiante(String nombre, String email, String comentario, int[] notas){
        this.nombre = nombre;
        this.email = email;
        this.comentario = comentario;
        this.notas = notas;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    
}
