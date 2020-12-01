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
    
    private Estudiante estudianteVerificado;
    
    private Connection conexionObtenida;//null caso contrario mantiene la conexion a la base de datos
    
    public ConexionDB(){        
        try {
            conexionObtenida = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
            System.out.println("Logro conectarse a la base de datos "+ BASE_DATO);
        } catch (SQLException ex) {
            System.out.println("No logro conectarse a la base de datos "+ BASE_DATO + "\n"+ex);
        }
    }
    
    /**
     * Verifica el usuario requerido.
     * Comprueba si existe el usuario y si la contrasenia coincide con el usuario encontrado en la base de datos
     * 
     * @param usuario nombre de usuario a buscar en la base de datos
     * @param contrasenia a verificar con el usuario encontrado en la base de datos
     * 
     * @return true en caso de que el usuario exista y la contrasenia coincida con el registro encontrado en la base de datos, false caso contrario
     */
    public boolean verificarUsuarioRegistrado(String usuario, String contrasenia){
        boolean resultado = false;
        try {
            PreparedStatement pstm = 
                    conexionObtenida.prepareStatement("SELECT * FROM estudiantes WHERE nombre = ?");// preparamos el comando en lenguaje sql
            pstm.setString(1, usuario);// reemplazar el '?' por el valor de "usuario"
            System.out.println(pstm);// vamos a ver que comando se esta ejecutando en sql
            
            ResultSet rs = pstm.executeQuery();// contener el resultado del comanddo ejecutado
            if(rs.next() && contrasenia.equals(rs.getString("contrasenia"))){// verifica que haya informacion para "leer" y en caso positivo procede a apuntar al primer registro de la tabla
                estudianteVerificado = new Estudiante(
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getString("Comentario"),
                        new int[]{rs.getInt("nota_mod_uno"), rs.getInt("nota_mod_dos"), rs.getInt("nota_mod_tres")});
                resultado = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultado;
    }

    public Estudiante getEstudianteVerificado() {
        return estudianteVerificado;
    }
    
    
}
