/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomunirepaso;

/**
 *
 * @author hogar
 */
public class Pago {
    private int demora;
    private float importe;

    public Pago(int demora, float importe) {
        this.demora = demora;
        this.importe = importe;
    }

    public int getDemora() {
        return demora;
    }

    public float getImporte() {
        return importe;
    }


    public void setDemora(int demora) {
        this.demora = demora;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }


    @Override
    public String toString() {
        return "Pago{" + "demora=" + demora + ", importe=" + importe + ", interesAdicional=" +'}';
    }
    
    
}
