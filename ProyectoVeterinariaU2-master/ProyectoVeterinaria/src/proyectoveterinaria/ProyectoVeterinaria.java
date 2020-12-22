/*
 proyecto veterinaria resuelto 100%
 */
package proyectoveterinaria;

import java.util.Scanner;

/**
 *
 * @author 106416 2w1 Avendaño Mario Gabriel
 */
public class ProyectoVeterinaria {

    Scanner sc = new Scanner(System.in);

    private Cliente clientes[];

    public void cargarCl(int cant) {

        Mascota m;
        clientes = new Cliente[cant];//se inecializa un vector de la clase cliente con tamaño pasado por parametro
        for (int i = 0; i < clientes.length; i++) {

            System.out.print("Ingrese numero cliente ");
            int n = sc.nextInt();
            System.out.print("Ingrese nombre cliente ");
            String nom = sc.next();
            System.out.print("Ingrese antiguedad cliente ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese nombre mascota ");
            String nm = sc.nextLine();
            System.out.print("Ingrese antiguedad Mascota ");
            int em = sc.nextInt();

            m = new Mascota(nm, em);

            clientes[i] = new Cliente(n, nom, a, m);

        }

    }

//  muestra toString de todos los clientes
    public void mostrar() {
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(" ");
            System.out.println(clientes[i].toString());

        }
    }

//Mostrar la cantidad de clientes.
    public void cantidadClientes() {
        int cont = 0;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                cont++;
            }

        }
        System.out.println("cantidad de clientes : " + cont);

    }

//Mostrar el promedio de edad de las mascotas.
    public void promEdadMascotas() {
        int contador = 0;
        int acumulador = 0;
        float resultado = 0;

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                contador++;
                acumulador += clientes[i].getMascota().getEdad();

            }

        }
        resultado = acumulador / contador;
        System.out.println("Promedio edad mascotas : " + resultado);

    }

    //Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
    public void cantClientesMayor5años() {
        int contador = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null && cliente.getAntiguedad() > 5) {
                contador++;
            }
        }
        System.out.println("Cantidad de clientes cargados " + contador);
    }

    public static void main(String[] args) {
        ProyectoVeterinaria pv = new ProyectoVeterinaria();
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese cantidad clientes a cargar :");
        int cant = sc.nextInt();
        sc.nextLine();
        pv.cargarCl(cant);//Carga clientes al arreglo, se le indica la cantidad a cargar por parametro
        pv.mostrar();//Mostrar arreglo clientes
        sc.nextLine();
        pv.cantidadClientes();//Mostrar la cantidad de clientes.
        pv.promEdadMascotas();//Mostrar el promedio de edad de las mascotas.
        pv.cantClientesMayor5años();//Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
        System.out.println("fin");

    }

}
