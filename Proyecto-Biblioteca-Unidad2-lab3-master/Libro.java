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
public class Libro {

    private String titulo;
    private int precio;
    private int estado;
    private Prestamo[] prestamos;

    public Libro(String titulo, int precio, int estado, int cant) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = estado;
        prestamos = new Prestamo[cant];
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void agregarPrestamo(Prestamo pr) {
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = pr;
                break;
            }

        }
    }

    public String listadoSolicitantes() {
        String listado = " ";
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] != null) {
                listado += prestamos[i].getSolicitante();
            }

        }

        return listado;
    }//returna una cadena con todos los solicitantes
    

    public int cantPrestamos() {
        int cant = 0;
        for (int i = 0; i < prestamos.length; i++) {
            if(prestamos[i]!=null){
            cant++;}
            
        }
        return cant;
    }//cuenta cantidad de prestamos por libro para sacar luego promedio

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", estado=" + estado + ", prestamos=" + prestamos + '}';
    }

}
