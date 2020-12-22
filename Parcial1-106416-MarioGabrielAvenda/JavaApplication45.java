
package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author 2w1 Avendaño Mario Gabriel 106416
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Venta vnt;
        System.out.println("Bienvenido al programa de ventas ");
        System.out.println("Ingrese cantidad de ventas a cargar ");
        int ca=sc.nextInt();
        sc.nextLine();
        
        ControlVentas cv=new ControlVentas(ca);
        for (int i = 0; i < ca; i++) {
            System.out.println("Ingrese nombre cl");
            String n=sc.nextLine();
            System.out.println("Ingrese tel cl");
            int tl=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese cantidad productos");
            int cp=sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese importe");
            float imp=sc.nextFloat();
            sc.nextLine();
            System.out.println("Ingrese deuda");
            float deud=sc.nextFloat();
            sc.nextLine();
            vnt=new Venta(n,tl,cp,imp,deud);
            cv.agregarVenta(vnt);
        }
        cv.prueba();
        System.out.println("1Promedio general de importes de todas las ventas "+cv.puntoUno());
        System.out.println("2Sumatoria total de deuda, que acumule los saldos adeudados en todas las ventas "+cv.puntoDos());
        
        System.out.println("//3Cantidad de ventas con importe superior a uno indicado por el usuario.");
        System.out.println("Ingrese un importe para calcular el resultado ");
        int opcion=sc.nextInt();
        sc.nextLine();
        System.out.println(cv.puntoTres(opcion)+" el resultado");
    }
    
}
