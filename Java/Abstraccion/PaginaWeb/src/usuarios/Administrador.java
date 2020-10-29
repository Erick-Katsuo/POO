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
public class Administrador extends Usuario{
    private int nivel;
    
    public Administrador(){
        this.tipoUsuario = "Administrador";
        this.nombre = "un nombre";
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public void banCliente(Cliente malo){
        System.out.println("Baneando cliente: " + malo.getNombre() + "- con codigo: " + malo.getCodigoUsuario());
        malo.bajaCliente();
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Mostrando informacion del administrador");
        System.out.println("Nombre del " + tipoUsuario +": "+ nombre + " codigo: " + codigoUsuario);
        System.out.println("Nivel del "+ tipoUsuario + ": " + nivel);
    }

    @Override
    public int cantidadDiasRegistrado() {
       return 3;
    }
}
