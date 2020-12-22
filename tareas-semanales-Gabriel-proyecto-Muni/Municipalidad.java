/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author hogar
 */
public class Municipalidad {
    private Plan[] planes;
    
    public Municipalidad(int tamaño){
        planes=new Plan[tamaño];
    }
    public void agregarPlan(Plan p){
        for (int i = 0; i < planes.length; i++) {
            if(planes[i]==null){
                planes[i]=p;
                break;
            }
            
        }
    }
    public int CantPlanesPagados(){
    int cant=0;
        for (int i = 0; i < planes.length; i++) {
            if(planes[i]!=null){
                if(planes[i].estaPago()==true){
                    cant++;
                }
            }
            
        }
    return cant;
        
    }
    public float promedioIntereses(){
        float totalIntereses=0;
        int contadorPlanes=0;
        for (int i = 0; i < planes.length; i++) {
            if(planes[i]!=null){
                totalIntereses+=planes[i].sumaInteresesCobrados();
                contadorPlanes++;
            }
            
        }
        return totalIntereses/contadorPlanes;
    }
    
}
