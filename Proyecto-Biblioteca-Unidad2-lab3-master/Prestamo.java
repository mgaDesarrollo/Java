/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author hogar
 */
public class Prestamo {
    private String solicitante;
    private int dias;
    private boolean devuelto;

    public Prestamo(String solicitante, int dias, boolean devuelto) {
        this.solicitante = solicitante;
        this.dias = dias;
        this.devuelto = devuelto;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public int getDias() {
        return dias;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "solicitante=" + solicitante + ", dias=" + dias + ", devuelto=" + devuelto + '}';
    }
    
    
}
