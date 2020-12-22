/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercadoparcial;

import java.util.Scanner;

/**
 *
 * @author hogar
 */
public class SupermercadoParcial {

    Scanner sc;
    protected Folleto fo;
    protected Oferta o;

    public void cargaDatos() {
        sc = new Scanner(System.in);
        System.out.println("Ingrese fecha ");
        int fecha = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese cantidad de ofertas a cargar ");
        int cant = sc.nextInt();
        sc.nextLine();

        fo = new Folleto(fecha, cant);
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese numero producto " + i + 1);
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese descripcion ");
            String desc = sc.nextLine();
            System.out.println("Ingrese precio normal ");
            double prec = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese precio oferta ");
            double precO = sc.nextDouble();
            System.out.println("Ingrese dias disponible ");
            int dias = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese stock ");
            int stck = sc.nextInt();
            sc.nextLine();

            o = new Oferta(num, desc, prec, precO, dias, stck);

            fo.agregarOferta(o);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SupermercadoParcial sp = new SupermercadoParcial();
        Folleto fol = new Folleto();
        System.out.println("Ingrese 1 para cargar , 2 para mostrar, 3 para salir ");
        int opcion = sc.nextInt();
        sc.nextLine();
        while (opcion == 1) {
            sp.cargaDatos();
            System.out.println("Ingrese 1 para cargar , 2 para mostrar, 3 para salir ");
            opcion = sc.nextInt();
        }
        while (opcion == 2) {
            System.out.println("1. Cantidad de artículos ofertados por más de 5 días.");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(sp.fo.putoUno());//1. ofertados por mas de 5 dias

                case 2:
                    System.out.println(sp.fo.puntoDos());//2. Sumatoria del Stock

                case 3:
                    System.out.println(sp.fo.puntoTres());//3. ofertados con descuento mayor a 20$
                case 4:
                    System.out.println("ingrese codigo articulo ");
                    int codiArti=sc.nextInt();
                    sc.nextLine();
                    System.out.println(sp.fo.puntoCuatro(codiArti));
            }
        }

    }

}
