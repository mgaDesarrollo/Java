/*
 Una biblioteca necesita un software que le permita registrar los datos de los libros que posee y de sus préstamos.
De cadalibro conoce su título, precio de reposición (para  el  caso  de  extravíos  o  daños)  y  estado 
(1:  disponible,  2:  prestado,  3: extraviado).
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author hogar
 */
public class JavaApplication33 {

    Libro lib;
    Prestamo prest;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca bib;

        int cant = 0;
        System.out.println("Ingrese cantidad de libros ");

        cant = sc.nextInt();
        sc.nextLine();
        bib = new Biblioteca(cant);

        for (int i = 0; i < cant; i++) {
            System.out.print("ingrese titulo " + i);
            String tit = sc.nextLine();
            System.out.print("ingrese precio " + i);
            int prec = sc.nextInt();
            sc.nextLine();

            System.out.print("ingrese estado " + i);
            int est = sc.nextInt();
            sc.nextLine();

            System.out.print("ingrese cant prestamos " + i);
            int cantprest = sc.nextInt();
            sc.nextLine();
            Libro l = new Libro(tit, prec, est, cantprest);
            bib.agregarLibro(l);
            for (int j = 0; j < cantprest; j++) {
                System.out.print("Ingrese solicitante ");
                String solic = sc.nextLine();
                System.out.print("Ingrese dias ");
                int dias = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese debuelto o no ");
                boolean devuelto = sc.nextBoolean();
                sc.nextLine();
                Prestamo pr = new Prestamo(solic, dias, devuelto);
                l.agregarPrestamo(pr);

            }

        }
        System.out.println(" cantidad libros por estado ");
        System.out.println(" ingrese estado ");
        int est2=sc.nextInt();
        System.out.println(bib.cantidadLibrosEstado(est2));
        sc.nextLine();
        
        System.out.println("Ingrese titulo del libro para ver sus solicitantes.");
        String tit=sc.nextLine();
        System.out.println(bib.listadoSolicitantes(tit));

    }

}
