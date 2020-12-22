/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author hogar
 */
public class Pago {
    private int demoras;
    private float importe;
    private float intereses;

    public int getDemoras() {
        return demoras;
    }

    public float getImporte() {
        return importe;
    }

    public float getIntereses() {
        return intereses;
    }

    public void setDemoras(int demoras) {
        this.demoras = demoras;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public void setIntereses(float intereses) {
        this.intereses = intereses;
    }

    public Pago(int demoras, float importe, float intereses) {
        this.demoras = demoras;
        this.importe = importe;
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "Pago{" + "demoras=" + demoras + ", importe=" + importe + ", intereses=" + intereses + '}';
    }
    
    
}
