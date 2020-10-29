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
public class Cliente extends Usuario {

    private static final boolean CLIENTE_BAJA = false;
    private static final boolean CLIENTE_ALTA = true;
    
    private static final String CLIENTE = "Cliente";
    
    private static final float PANTALON = 30.0F;
    private static final float MEDIAS =  10.0F;

    private float saldo;
    private int cantCompras;
    private boolean activo;

    /**
     * Crea una instancia. Asigna el valor de CLIENTE_ALTA al atributo activo
     */
    public Cliente() {
        this.activo = CLIENTE_ALTA;
    }

    public Cliente(String nombre, int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.nombre = nombre;
        this.activo = CLIENTE_ALTA;
        this.tipoUsuario = CLIENTE;
    }
    
    /**
     * Instancia el Cliente y a sus atributos.
     * Asigna los valores correspondientes a los atributos
     * @param codigoUsuario numero que identifica al Cliente
     * @param nombre inicial del Cliente
     * @param saldo inicial del Cliente
     * 
     */
    public Cliente(String nombre, int codigoUsuario, float saldo) {
        this.codigoUsuario = codigoUsuario;
        this.nombre = nombre;
        this.activo = CLIENTE_ALTA;
        this.tipoUsuario = CLIENTE;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Mostrando info de cliente");
        System.out.println(tipoUsuario + " " + nombre + "\nCodigo del usuario: " + codigoUsuario + " - activo: " + activo);
        System.out.println("Cantidad compras: " + cantCompras + "\nSaldo: " + saldo + "$");
    }

    /**
     * Aumenta la cantidad de compras del objeto y resta el saldo. 
     * Imprime un mensaje y aumenta el atributo cantiCompras en uno, resta el saldo 
     */
    public void comprar() {
        System.out.println("comprando");
        cantCompras++;
        saldo-= PANTALON; // saldo = saldo - PANTALON;
    }
    
    /**
     * Aumenta la cantidad de compras y resta el saldo del objeto con la cantidad recibida.
     * Imprime un mensaje la cantidad de veces recibida y resta el saldo comprando MEDIAS
     * @param cantidad de compras a realizar
     */
    public void comprar(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            System.out.println("comprando");
            saldo -= MEDIAS; // saldo = saldo - MEDIAS;
        }

        cantCompras += cantidad; // cantiCompras = cantCompras + cantidad;
    }

    /**
     * Imprime un mensaje y actualiza el atributo activo a CLIENTE_BAJA.
     */
    public void bajaCliente() {
        System.out.println("dando de baja al cliente");
        activo = CLIENTE_BAJA;
    }

    @Override
    public int cantidadDiasRegistrado() {
        return 5;
    }
}
