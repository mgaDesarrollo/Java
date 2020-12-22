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
public class Plan {
    private String nombre;
    private float deuda;
    private int cuotas;
    private Pago[]pagos;

    public Plan(String nombre, float deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos=new Pago[cuotas];
    }

    public String getNombre() {
        return nombre;
    }

    public float getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }
    
    public void agregarPago(Pago p){
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i]==null){
                pagos[i]=p;
                break;
            }
            
        }
    }
    
    public boolean estaPago(){
        boolean estaPago=true;
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i]==null){
                estaPago=false;
                break;
            }
                
            
        }
        return estaPago;
    }
    public float sumaInteresesCobrados(){
        float intereses=0;
        for (int i = 0; i < pagos.length; i++) {
            if(pagos[i]!=null){
                if(pagos[i].getDemoras()>0){
                    intereses+=pagos[i].getDemoras()*pagos[i].getIntereses()*pagos[i].getImporte();
                }
            }
            
        }
        return intereses; 
    }
    
    
}
