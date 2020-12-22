/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

public class Biblioteca {

    Libro[] libros;

    public Biblioteca(int cantLibros) {
        this.libros = new Libro[cantLibros];
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "libros=" + libros + '}';
    }

//agrega un libro al vector libros[]
    public void agregarLibro(Libro l) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = l;
                break;
            }

        }
    }

//indica la cantidad de libros que hay por estado(1,2 o 3)
    public int cantidadLibrosEstado(int estado) {
        int cant = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getEstado() == estado) {
                cant++;
            }

        }

        return cant;
    }

    public float sumaPrecioExtraviado() {
        float precio = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getEstado() == 3) {
                precio += libros[i].getPrecio();
            }
        }
        return precio;
    }
    //Nombre de todos los solicitantes de un libro en particular identificado por su título

    public String listadoSolicitantes(String tit) {
        String listado = "";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null && libros[i].getTitulo().equals(tit)) {
                listado += libros[i].listadoSolicitantes();
            }

        }
        return listado;
    }

}
