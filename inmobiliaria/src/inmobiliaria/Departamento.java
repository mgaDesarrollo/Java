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
public class Departamento extends Propiedad {

    private float Expensas;

    public Departamento(float Expensas, String direccion, int cantHabitaciones, float precioBase, boolean usoComercial, int cantInqui) {
        super(direccion, cantHabitaciones, precioBase, usoComercial, cantInqui);
        this.Expensas = Expensas;
    }

    public float getExpensas() {
        return Expensas;
    }

    public void setExpensas(float Expensas) {
        this.Expensas = Expensas;
    }

    @Override
    public String toString() {
        return "Departamento{" + "Expensas=" + Expensas;
    }

    @Override
    public float calcAlquiler() {
        float tot = getPrecioBase() + Expensas;
        if (isUsoComercial() == true) {
            tot += 500;
        }

        return tot;
    }

}
