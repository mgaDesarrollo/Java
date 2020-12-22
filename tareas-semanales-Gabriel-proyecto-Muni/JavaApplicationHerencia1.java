/*
Laboratorio de Computación III–Guía de EstudioU3–Pág.
1Herencia y Polimorfismo1. 

En  un  comercio  se  mantienen  los  datos  de  sus  clientes,  algunos  de  los cuales  son  de  confianza
suficiente  para  comprar  al  fiado.  Programar  dos  clases llamadas   Cliente 
y ClientePreferencial   respectivamente   aplicando   herencia.

Sobreescribir el método toString e incluir constructores con parámetros en cada una de ellas.
De cada cliente se conoce su número, nombre y teléfono, mientras que de los clientes preferenciales se conoce adicionalmente su saldo,
límite (saldo máximo) y su domicilio.
 */
package javaapplicationherencia1;

import java.util.Scanner;

/**
 *
 * @author hogar
 */
public class JavaApplicationHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner slipknot=new Scanner(System.in);
        
        System.out.println("Ingrese id Cliente :");
        int id=slipknot.nextInt();
        slipknot.hasNextLine();
        System.out.println("Ingrese telefono Cliente :");
        long tel=slipknot.nextLong();
        slipknot.hasNextLine();
        System.out.println("Ingrese nombre Cliente :");
        String nom=slipknot.nextLine();
        Cliente c=new Cliente(id,tel,nom);
        ClientePreferencial cp=new ClientePreferencial(id,tel,nom);
        cp.setSaldoMax(10000);
        cp.setSaldo(140);
        cp.setTel(0000000);
    }
    
}
