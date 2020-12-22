/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadoparcial;

/**
 *
 * @author hogar
 */
public class Oferta {

    private int numProducto;
    private String descrip;
    private double prec;
    private double ofert;
    private int dias;
    private int stock;

    public Oferta(int numProducto, String descrip, double prec, double ofert, int dias, int stock) {
        this.numProducto = numProducto;
        this.descrip = descrip;
        this.prec = prec;
        this.ofert = ofert;
        this.dias = dias;
        this.stock = stock;
    }

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public double getOfert() {
        return ofert;
    }

    public void setOfert(double ofert) {
        this.ofert = ofert;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Oferta{" + "numProducto=" + numProducto + ", descrip=" + descrip + ", prec=" + prec + ", ofert=" + ofert + ", dias=" + dias + ", stock=" + stock + '}';
    }
    
    

}
