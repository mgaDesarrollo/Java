/*
Laboratorio de Computación III–Guía de EstudioU2–Pág. 35. 
En una municipalidad otorgan planes de pagos a los contribuyentes que adeudan impuestos.
De cada plan se conoce el nombre del contribuyente,
el total de la deuda, la cantidad de cuotas y una lista de las cuotas pagadas.
 */
package proyectomunirepaso;

import java.util.Scanner;

/**
 *
 * @author hogar
 */
public class ProyectoMuniRepaso {

    protected Municipalidad muni;

    public void cargarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tamaño de planes ");
        int cant = sc.nextInt();
        sc.nextLine();

        muni = new Municipalidad(cant);

        for (int i = 0; i < cant; i++) {

            System.out.println("Ingrese nombre ");
            String nom = sc.nextLine();
            System.out.println("Igrese deuda ");
            float deuda = sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese cuotas ");
            int cuotas = sc.nextInt();
            Plan p = new Plan(nom, deuda, cuotas);

            muni.agregarPlan(p);
            for (int j = 0; j < cuotas; j++) {
                System.out.println("Ingrese demora ");
                int demora = sc.nextInt();
                sc.nextLine();
                System.out.println("ingrese importe ");
                float importe = sc.nextFloat();
                sc.nextLine();

                Pago pa = new Pago(demora, importe);
                p.agregarPago(pa);

            }

            System.out.println("listo");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ProyectoMuniRepaso pmr = new ProyectoMuniRepaso();

        System.out.println("ingrese 1 para cargar planes y 2 para salir : ");
        int carga = entrada.nextInt();
        entrada.nextLine();
        while (carga == 1) {
            pmr.cargarDatos();

            System.out.println("ingrese 1 para otra carga y 2 para salir : ");
            carga = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println(pmr.muni.cantidadPlanesPagados());
        System.out.println(pmr.muni.listadoPagosContribuyente("carlos"));
        System.out.println(pmr.muni.promedioIntereses());
        System.out.println(pmr.muni.toString());

    }

}
