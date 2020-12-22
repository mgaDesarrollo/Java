/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

import java.util.ArrayList;

/**
 *
 * @author hogar
 */
public class Sucursal {

    private ArrayList<Propiedad> propiedades;

    public Sucursal() {
        
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Propiedad prop) {
        propiedades.add(prop);

    }

    public double promedioAlquileres() {
        double acu = 0;
        int cont = 0;
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getCantInqui() == 2) {
                acu += propiedad.calcAlquiler();
                cont++;
            }
        }
        return acu / cont;
    }

    public int cantCasas3Habit() {
        int cant = 0;
        for (Propiedad propiedade : propiedades) {
            if (propiedade instanceof Casa) {
                if (propiedade.getCantHabitaciones() >= 3 && ((Casa) propiedade).isCochera()) {
                    cant++;
                }
            }
        }
        return cant;

    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

}
