/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * 
 * @author casa4
 */
import java.util.*;

public class CPaquetes {
    
    private ArrayList Paquete = null; //declaro que el paquete es de tipo arraylist.
    
    public CPaquetes()  
    {
        Paquete = new ArrayList();//creo un arraylist y se lo asigno a paquete.
    }
    
    public void agregar(PaqueteDato P) 
    {
        Paquete.add(P);//agrego un nuevo paquete de datos 
    }
    
    //4a Listar los paquetes de datos cuyo tamaño no supere un valor asignado por el usuario
    public String NoSuperior(int ns) 
            //
    { //declaro una variable auxiliar de tipo string para que luego retorne y muestre ese mensaje
        String aux = "";
        for(int i = 0; i < Paquete.size(); i++) //carga en la variable P del tipo paquete de datos 
            
        {
            PaqueteDato P = (PaqueteDato) Paquete.get(i);  // comprueba si el tamaño del objeto P es 
            //menor al tamaño de la vriable pasada por parametro (ns)no superior
            if(P.getTamano() < ns) //Si es menor acumula la informacion del objeto (tamaño del paquete de datos) 
//en la variale auxiliar, si no, contunua con el ciclo.
                
            {
                aux += P.toString() + '\n';
            }
           
            if(aux.equalsIgnoreCase(""))//si no encuentra paquetes, muestra un aviso que no hay paquetes
            {
                aux = "No hay paquetes de datos con tamaño menor al ingresado ";
            }
                    
        }
        return aux;
    }
    
    //4-B)Listar la informacion de los paquetes que tengan un numero de secuencia 
    //comprendido entre dos valores ingresado por el usuario.
    public String NroDosValores(double PrimerValor, double SegundoValor) 
    {
        String aux = "Los paquetes registrados son:";
        for(int i = 0;i<Paquete.size();i++)
        {
            PaqueteDato P = (PaqueteDato) Paquete.get(i);              
        
            if(P instanceof PaqueteTCP)//si p es una instancia de la clase de paquete tcp entonces, se castea e objeto p 
//y se asigna a pt 
            {
             PaqueteTCP PT = (PaqueteTCP) P;
             if(PT.getNroSecuencia() > PrimerValor && PT.getNroSecuencia() < SegundoValor) //compara el numero de secuencia 
                 //verifica si es mayor al primer valor ingresadi y menor al segundo valor ingresado por el usuariio
                 //Si cumple se asigna la informacion a la variable auxiliar
                {
                    aux+= PT.toString() + '\n';
                }
            }
        }
        return aux;
    }
    
    //4-C)Indicar cual de los tipos de paquetes presento menor trafico de paquetes de datos
    public String TraficoMenor() //4C
    {
        String varMenorTrafico = "No hay paquetes guardados";
        double acuTCP = 0;
        double acuUDP = 0;
        //Declaramos variables
        
        for(int i = 0;i<Paquete.size();i++) 
        {
            PaqueteDato P = (PaqueteDato) Paquete.get(i); //asigna el paquete 
            if(P instanceof PaqueteTCP) //verifica si P es una instancia TCP
            {
                PaqueteTCP PT = (PaqueteTCP) P; //castea 
                acuTCP += PT.getTamano();//acumula el tamaño del paquete
            }
            if(P instanceof PaqueteUDP)//
            {
                PaqueteUDP PU = (PaqueteUDP) P;
                acuUDP += PU.getTamano();
            }
        }
        if(acuUDP>acuTCP) //si el total de UDP es mayor al total de TCP entonces 
            //se le asigna el resultado de esa variable y retorna el resultado de la condicion
        {
            varMenorTrafico = "El menor paquete fue el TCP";
        }
        else
        {
            varMenorTrafico = "El menor paquete fue el UDP";
        }
        
        return varMenorTrafico;
    }
    
    //4-D)Listar todos los paquetes de datos de longitud par
    //primero declaro variables
    //segundo comprueba que el paquete (coleccion) sea mayor a cero
    //recorre
    //asigna el valor ingresado a la variable 
    public String LongitudPar()
    {
        String aux = "";
        Iterator I = Paquete.iterator();
        int a = 0;
        while(I.hasNext())
         {
            PaqueteDato P = (PaqueteDato) I.next();
             if( P.getTamano() % 2 == 0)
             {
                 aux += P.toString() + '\n';
             }
         }
         if(aux.equalsIgnoreCase(""))
        {
            aux = "No hay paquetes de longitud par";
        }
         return aux;
    }
    
    //4-E)Porcentajes de paquetes UDP y TCP
    //primero definimos variables
    // si el tamaño que contiene la lista es mayor a cero
    //entonces recorre y asigna el paquete de dato ingresado a PD (vriable tipo paquetedato)
    public String Porcentajes()
    {
        String aux = "No se guardaron paquetes";
        PaqueteDato PD;
        int conTCP = 0;
        int conUDP = 0;
        int conTotal = 0;
        
        if(Paquete.size() > 0)
        {
            for(int i = 0;i<Paquete.size();i++)
            {
                PD = (PaqueteDato)Paquete.get(i);
                if(PD instanceof PaqueteTCP) //si el tipo de paquete corresponde a tcp entonces suma en uno el contador                                       
                {
                    conTCP++;
                }
                if(PD instanceof PaqueteUDP)//lo mismo con udp 
                {
                    conUDP++;
                }
                conTotal++; //cuenta los totales de los dos paquetes
                aux = "Porcentaje Paquetes TCP:" + conTCP*100/conTotal + "%" + "\n" + "Porcentaje de Paquetes UDP:" + conUDP*100/conTotal + "%";
            }//se calcula el porcentaje de cada paquete y se retorna el porcentaje en cada caso.
           
        }
        return aux; 
        
    }
    
    //4-F)Informar la cantidad de paquetes que recibio una determinada maquina.Para lograr esto se debe ingresar la direccion ip de una determinada maquina.
    public String PaquetesRecibidos(String DireccionIP)//parametro que se ingresa pr teclado para comparar 
    {
        String aux = "No se recibieron paquetes";
        int cont = 0;
        
        for(int i = 0;i<Paquete.size();i++)
        {
            PaqueteDato PD = (PaqueteDato) Paquete.get(i);//Se castea el paquete ingresado y va a ser asignado a PD
            if(PD.getDireccionIP().equalsIgnoreCase(DireccionIP))//si la direccion
                //ingresada es la misma que la direccion ip del paquete se incrementa el valor del contador 
                //y se informan sobre esa direccion ip cuantos paquetes de datos se asignaron 
            {
                cont++;
            }
        }
        aux = "La direccion IP: " + DireccionIP + " recibio " + cont + " paquete/s.";
        return aux;
    }
    
    
    
    
    
    
    
    
}
