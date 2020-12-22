/*
de los clientes preferenciales se conoce adicionalmente su saldo,
límite (saldo máximo) y su domicilio.
 */
package javaapplicationherencia1;

/**
 *
 * @author hogar
 */
public class ClientePreferencial extends Cliente {

    private float saldo;
    private float saldoMax;
    private String domicilio;

    public ClientePreferencial(int id, long tel, String nom) {
        super(id, tel, nom);
    }

    public float getSaldo() {
        return saldo;
    }

    public float getSaldoMax() {
        return saldoMax;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setSaldoMax(float saldoMax) {
        this.saldoMax = saldoMax;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return super.toString()+ "ClientePreferencial{" + "saldo=" + saldo + ", saldoMax=" + saldoMax + ", domicilio=" + domicilio + '}';
    }
    
    

}
