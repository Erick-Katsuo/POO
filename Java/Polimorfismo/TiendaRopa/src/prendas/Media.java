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
public class Media extends Ropa{
    private boolean algodon;

    public boolean isAlgodon() {
        return algodon;
    }

    public void setAlgodon(boolean algodon) {
        this.algodon = algodon;
    }
    
    @Override
    public void vender(){
        System.out.println("Vendiendo media");
    }
    
    @Override
    public void mostrarTipoRopa(){
        System.out.println("Soy una media");
    }
}
