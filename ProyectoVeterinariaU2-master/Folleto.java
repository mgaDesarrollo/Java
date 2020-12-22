/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsial;

import java.util.*;

/**
 *
 * @author hogar
 */
class Folleto {

    private Date fecha = new Date(2020, 2, 3);
    private Oferta[] ofertas;

    public Folleto(int cant) {

        this.ofertas = new Oferta[cant];
    }

    public void agregarOferta(Oferta of) {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] == null) {
                ofertas[i] = of;
                break;
            }

        }
    }
//1Cantidad de artículos ofertados por más de 5 días.

    public int puntoUno() {
        int cant = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && ofertas[i].getDiasDispo() > 5) {
                cant++;
            }

        }
        return cant;
    }

//2 Total de unidades que hay a la venta (sumatoria del stock). 
    public int puntoDos() {
        int cant = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null) {
                cant += ofertas[i].getStk();
            }

        }
        return cant;
    }

//3Cantidad de artículos ofrecidos con un descuento superior a $20.
    public int puntoTres() {
        int cant = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && (ofertas[i].getPrec() - ofertas[i].getPrecOfert()) > 20) {
                cant++;
            }
        }
        return cant;
    }
//4Totalarecaudarporunartículoenparticularindicadoporsucódigo,suponiendoquesevendantodas las unidades disponibles.

    public float puntoCuatro(int cod) {
        float total = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && ofertas[i].getCod() == cod) {
                total += ofertas[i].getPrecOfert() * ofertas[i].getStk();
            }
        }
        return total;
    }
    
    
    
    
    
}
