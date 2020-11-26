/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3cfp27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katsuo
 */
public class ConexionDB {
    
    private static final String BASE_DATO = "cfp27";
    
    private static final String URL = "jdbc:mysql://localhost/" + BASE_DATO + "?autoReconnect=true&useSSL=false";
    private static final String USUARIO = "root";
    private static final String CONTRASENIA = "123";
    
    private Connection conexionDB;//null
    
    public ConexionDB(){        
        try {
            conexionDB = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            System.out.println("Logro conectarse a la base de datos "+ BASE_DATO);
        } catch (SQLException ex) {
            System.out.println("No logro conectarse a la base de datos "+ BASE_DATO + "\n"+ex);
        }
    }
    
    public boolean verificarUsuarioRegistrado(){
        boolean resultado = false;
        try {
            PreparedStatement pstm = conexionDB.prepareStatement("SELECT * FROM estudiantes WHERE nombre = 'asdasd'");
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                System.out.println("Nombre de usuario " +rs.getString("nombre") );
                System.out.println("Email de usuario " +rs.getString("email") );
                System.out.println("Comentario de usuario " +rs.getString("comentario") );
                resultado = true;
            }else{
                System.out.println("No existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
    }
}
