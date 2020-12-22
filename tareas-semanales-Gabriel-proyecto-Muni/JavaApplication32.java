/*
  Una empresa  que fabrica  caños  de  diferentes  tipos,
materiales  y  medidas está desarrollando  un  sistema  para  automatizar  la  planificación  y  control  de  su  circuito productivo.
Suponga  que  usted  es  parte  del  equipo  de  desarrollo  y  le  asignan  la siguiente tarea:
Laboratorio de Computación III–Guía de EstudioU2–Pág. 2Desarrolle  la  clase  

 */
package javaapplication32;

import java.util.Scanner;

/**
 *
 * @author 106416 Avendaño
 */
public class JavaApplication32 {

    JavaApplication32 jav = new JavaApplication32();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de materiales del producto");
        int cant = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese descripcion");
        String desc = sc.nextLine();

        Producto p = new Producto(desc, cant);
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese descripcion material ");
            String descMat = sc.nextLine();
            System.out.print("Ingrese codigo material ");
            int codMat = sc.nextInt();
            System.out.print("Ingrese precio unitario ");
            float valor = sc.nextFloat();
            sc.nextLine();

            Material m = new Material(descMat, codMat, valor);
            p.agregarMaterial(m);
        }
        p.mostrarVector();

        //costo por producto
        p.costoTotal();

        //ingreseun código de material y retorne true
        // si dicho material forma parte del Producto
        System.out.println("Ingrese codigo Material para saber si forma parte :");
        int codMat = sc.nextInt();
        sc.nextLine();
        System.out.println(p.formaParte(codMat));

        //materiales menor a valor ingresado por teclado
        System.out.println(" materiales menor a valor ingresado por teclado :");
        float valor=sc.nextFloat();
        
        for (int i = 0; i < p.materialesMenorA(valor).length; i++) {
            if(p.materialesMenorA(valor)[i]!=null){
                System.out.println(p.materialesMenorA(valor)[i].toString());
            }
            
        }
                
                
        System.out.println(p.materialesMenorA(valor).toString());
        System.out.println("cantidad de materiales ordenados por precio");
        for (int i = 0; i < 3; i++) {
            System.out.println("casilla "+i+"contiene :"+p.vectorOrdenado()[i]+" elementos");
        }
    }
    

}
