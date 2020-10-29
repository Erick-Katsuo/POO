/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginaweb;

import usuarios.Administrador;
import usuarios.Cliente;
import usuarios.Usuario;

/**
 *
 * @author Katsuo
 */
public class PaginaWeb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente("Erick", 123123, 109.0F);
              
        Administrador admin = new Administrador();
        
        nuevoCliente.obtenerInformacion();
        
        nuevoCliente.comprar(2);
        nuevoCliente.comprar();
        
        nuevoCliente.obtenerInformacion();
        System.out.println("------------------------");
        admin.obtenerInformacion();
    }
    
}
