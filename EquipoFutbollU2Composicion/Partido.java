/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbollcompleto;

import java.util.Date;

/**
 *
 * @author hogar
 */
public class Partido {

    private Equipo[] equipos;
    private String estadio;
    private String fecha;

    public Partido(String estadio, String fecha) {
        this.estadio = estadio;
        this.fecha = fecha;
        this.equipos = new Equipo[2];
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void cargarEquipos(Equipo[] arregloPartido) {

        equipos[0] = arregloPartido[0];
        equipos[1] = arregloPartido[1];
    }

    public void verResultado() {

        System.out.println("Resultado ");
        System.out.println("Equipo 1" + equipos[0].toString());
        System.out.println("Equipo 2" + equipos[1].toString());
        if (equipos[0].getGoles() == equipos[1].getGoles()) {
            System.out.println(" empate ");
        } else if (equipos[0].getGoles() > equipos[1].getGoles()) {
            System.out.println("Gana equipo 1 " + equipos[0].getNombre());
        }else if(equipos[0].getGoles() < equipos[1].getGoles()) {
            System.out.println("Gana equipo 2 "+equipos[1].getNombre());}
    }
    
    

}
