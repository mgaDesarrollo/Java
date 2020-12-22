/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsial;

import java.util.Scanner;

/**
 *
 * @author 106416 Avendaño 2w1 *4:20*
 */
public class Parsial {

    static Folleto f;

    static public void crearFolleto(int cantid) {
        Scanner sc = new Scanner(System.in);
        f = new Folleto(cantid);
        for (int i = 0; i < cantid; i++) {
            System.out.println("Ingrese descripcion ");
            String d = sc.nextLine();
            System.out.println("Ingrese codigo ");
            int c = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese stock ");
            int s = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese precio ");
            float p = sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese prec Oferta ");
            float po = sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese dias disponible ");
            int ds = sc.nextInt();
            sc.nextLine();
            Oferta o = new Oferta(d, c, s, p, po, ds);
            f.agregarOferta(o);
        }
    }

    static public void menue(int opcion) {
        Scanner sc = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("1Cantidad de artículos ofertados por más de 5 días." + f.puntoUno());
                break;
            case 2:
                System.out.println("2 Total de unidades que hay a la venta (sumatoria del stock).  " + f.puntoDos());
                break;
            case 3:
                System.out.println("3Cantidad de artículos ofrecidos con un descuento superior a $20.  " + f.puntoTres());
                break;
            case 4:
                System.out.println("Ingrese codigo a buscar ");
                int codig = sc.nextInt();
                sc.nextLine();
                System.out.println(f.puntoCuatro(codig));
                break;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de ofertas a cargar ");
        int cant = sc.nextInt();
        sc.nextLine();
        Parsial.crearFolleto(cant);

        System.out.println(" Bienvenido , Ingrese uno , dos , tres o cuatro, 0 para salir");
        int opcion = sc.nextInt();
        while (opcion != 0) {
            Parsial.menue(opcion);
            return;
        }
    }

}
