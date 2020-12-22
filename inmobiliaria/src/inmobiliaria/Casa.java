/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author hogar
 */
public class Casa extends Propiedad {

    private boolean cochera;

    public boolean isCochera() {
        return cochera;
    }

    public void setCochera(boolean cochera) {
        this.cochera = cochera;
    }

    @Override
    public String toString() {
        return "Casa{" + "cochera=" + cochera + '}';
    }

    public Casa(boolean cochera, String direccion, int cantHabitaciones, float precioBase, boolean usoComercial, int cantInqui) {
        super(direccion, cantHabitaciones, precioBase, usoComercial, cantInqui);
        this.cochera = cochera;
    }
    
    @Override
    public float calcAlquiler() {
        float tot = getPrecioBase();
        if (isUsoComercial()) {
            tot += 1000;
        }

        return tot;
    }

}
