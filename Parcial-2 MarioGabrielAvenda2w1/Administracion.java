/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.ArrayList;

/**
 *
 * @author 106416 avendaño
 */
public class Administracion {

    private ArrayList<Examen> examenes;

    public Administracion() {
        this.examenes = new ArrayList<Examen>();
    }

    public void agregarExamen(Examen examen) {
        examenes.add(examen);

    }

    public ArrayList<Examen> listaExamenes() {
        return examenes;
    }

    public float promedioGeneral() {
        float acu = 0f;
        int cont = 0;
        for (Examen examene : examenes) {
            acu += examene.getNota();
            cont++;
        }
        return acu / cont;

    }

    public int oralesMayorSiete() {
        int cant = 0;
        for (Examen examene : examenes) {
            if (examene.getNota() > 7 && examene.getTipoExamen() == 0) {
                cant++;

            }
        }
        return cant;

    }
}
