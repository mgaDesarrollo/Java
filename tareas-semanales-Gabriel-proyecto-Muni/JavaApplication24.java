/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author hogar
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
       // System.out.print("Ingrese cantidad a cargar");
       // int tamaño = sc.nextInt();
        System.out.print("Ingrese nombree");
        String nom = sc.nextLine();
        System.out.print("Ingrese deuda");
        float deu = sc.nextFloat();
        System.out.print("Ingrese cuotas");
        int cuot = sc.nextInt();
        
        Municipalidad muni = new Municipalidad(2);

        Plan p = new Plan(nom, deu, cuot);
        muni.agregarPlan(p);
        
        System.out.println("Cantidad planes pagados "+ muni.CantPlanesPagados());
        System.out.println("promedio intereses pagados "+muni.promedioIntereses());

    }

}
