/*
 En un supermercado publican periódicamente un folleto con ofertas.
El mismo contiene un conjunto de ofertas para algunos de los productos que tienen a la venta y una fecha de inicio.
Por cada oferta se conoce el número del producto, nombre del producto, 
el precio regular al que se lo vende cuando no está en oferta, el precio de la oferta,
la cantidad de días de vigencia de la misma y la cantidad de unidades que se poseen para la venta, es decir, el stock
 */
package practicaparsial;

import java.util.Scanner;

public class PracticaParsial {

    static Folleto f;

    public void cargaDeDatos() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad");

        int cant = sc.nextInt();

        f = new Folleto(cant);//nueva de instancia de folleto para usar metodo cargarVector()

        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese oferta " + (i + 1) + ">>");
            System.out.print("Ingrese codigo");
            int cod = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese descripcion");

            String desc = sc.next();

            System.out.print("Ingrese precio");
            float prec = sc.nextFloat();

            System.out.print("Ingrese oferta");
            float precOfert = sc.nextFloat();

            System.out.print("Ingrese stock");
            int stock = sc.nextInt();

            System.out.print("Ingrese dias vigencia");
            int dias = sc.nextInt();

            Oferta of = new Oferta(cod, desc, prec, precOfert, stock, dias);
            f.agregarOferta(of);
        }

    }

    public void mostrarDatos() {
        Scanner scan=new Scanner(System.in);
        f.verOfertas();
        System.out.println("articulos por mas de 5 dias :" + f.puntoUno());//1. Cantidad de artículos ofertados por más de 5 días. 
        System.out.println("unidades a la venta :" + f.puntoDos());//2. Total de unidades que hay a la venta (sumatoria del stock). 
        System.out.println("descuento superior a 20$ :" + f.punto3());//3. Cantidad de artículos ofrecidos con un descuento superior a $20.
        System.out.println("ingrese codigo de articulo a buscar ");
        int codig=scan.nextInt();
        scan.nextLine();
        System.out.println("//4-Total a recaudar por un artículo  indicado por código,suponiendo que se vendan todas las unidades disponibles."+f.punto4(codig));
    }

    public static void main(String[] args) {
        PracticaParsial pp = new PracticaParsial(); //instancia clase principal para usar sus metodos
        System.out.println("Ingrese ");
        pp.cargaDeDatos();
        System.out.println("datos cargados ");
        pp.mostrarDatos();

    }

}
