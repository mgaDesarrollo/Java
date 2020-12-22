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
public class Folleto {

    private int fecha;
    private Oferta[] ofertas;

    public Folleto() {
    }

    public Folleto(int fecha, int cant) {
        this.fecha = fecha;
        this.ofertas = new Oferta[cant];
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void agregarOferta(Oferta ofrt) {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] == null) {
                ofertas[i] = ofrt;
                break;
            }
        }
    }

    //1. Cantidad de artículos ofertados por más de 5 días.
    public int putoUno() {
        int cant = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && ofertas[i].getDias() > 5) {
                cant++;
            }

        }
        return cant;
    }

    //2. Sumatoria del Stock
    public int puntoDos() {
        int sumatoria = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null) {
                sumatoria += ofertas[i].getStock();
            }

        }
        return sumatoria;
    }

    //descuento mayor a 20$
    public int puntoTres() {
        int cant = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && ofertas[i].getPrec() - ofertas[i].getOfert() > 20) {
                cant++;
            }
        }
        return cant;

    }

    //4. total a recaudar por codigo de articulo suponiendo que se vendan todos
    public double puntoCuatro(int cod) {
        double tot = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && ofertas[i].getNumProducto() == cod) {
                tot+=ofertas[i].getOfert();
            }

        }
        return tot;

    }

}
