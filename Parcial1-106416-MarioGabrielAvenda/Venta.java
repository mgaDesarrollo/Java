/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author hogar
 */
public class Venta {
    private String nombre;
    private int tel;
    private int cantProductos;
    private float importeTotal;
    private float saldoAdeudado;

    public Venta(String nombre, int tel, int cantProductos, float importeTotal, float saldoAdeudado) {
        this.nombre = nombre;
        this.tel = tel;
        this.cantProductos = cantProductos;
        this.importeTotal = importeTotal;
        this.saldoAdeudado = saldoAdeudado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(int cantProductos) {
        this.cantProductos = cantProductos;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    public float getSaldoAdeudado() {
        return saldoAdeudado;
    }

    public void setSaldoAdeudado(float saldoAdeudado) {
        this.saldoAdeudado = saldoAdeudado;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombre=" + nombre + ", tel=" + tel + ", cantProductos=" + cantProductos + ", importeTotal=" + importeTotal + ", saldoAdeudado=" + saldoAdeudado + '}';
    }
    
    
    
    
}
