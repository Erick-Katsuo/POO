/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prendas;

/**
 *
 * @author Katsuo
 */
public class Remera extends Ropa{
    private boolean mangaLarga;
    
    public boolean getMangaLarga(){
        return mangaLarga;
    }
    
    public void setMangaLarga(boolean mangaLarga){
        this.mangaLarga = mangaLarga;
    }
    
    @Override
    public void vender(){
        System.out.println("Vendiendo remera");
    }
    
    @Override
    public void mostrarTipoRopa(){
        System.out.println("Soy una remera");
    }
}
