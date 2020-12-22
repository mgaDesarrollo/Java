/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomunirepaso;

/**
 *
 * @author hogar
 */
public class Municipalidad {

    private Plan[] planes;

    public Municipalidad() {
    }
    
    public Municipalidad(int cant) {
        this.planes = new Plan[cant];
    }

    public void agregarPlan(Plan p) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                planes[i] = p;
                break;
            }

        }
    }

    public int cantidadPlanesPagados() {
        int contador = 0;

        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null && planes[i].estaPagoTotalmete() == true) {

                contador++;
            }

        }
        return contador;
    }

    public float promedioIntereses() {
        float acumulador = 0;
        int cant = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                acumulador += planes[i].sumaInteresesCobrados();
                cant++;
            }

        }
        return acumulador / cant;

    }

    public String listadoPagosContribuyente(String nom) {
        String cadena="";
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null&&planes[i].getNombreDeudor().equals(nom)) {
                cadena= planes[i].listadoDePagos();
            }else{ cadena= "error ";}
        }
        return cadena;

    }

}
