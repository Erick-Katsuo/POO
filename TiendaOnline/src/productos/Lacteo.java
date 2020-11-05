/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author Katsuo
 */
public class Lacteo extends Producto{

    private String tipoLacteo;
    
    @Override
    public void infoProducto() {
        System.out.println("Mostrando informacion de un producto lacteo");
    }
    
}
