/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author casa4
 */
public abstract class PaqueteDato 
{
    private int Dato;
    private String DireccionIP;

    public void setDato(int Dato) 
    {
        this.Dato = Dato;
    }

    public void setDireccionIP(String DireccionIP) 
    {
        this.DireccionIP = DireccionIP;
    }

    public int getDato() 
    {
        return Dato;
    }

    public String getDireccionIP() 
    {
        return DireccionIP;
    }

    
    public PaqueteDato(int Dato, String DireccionIP) 
    {
        this.Dato = Dato;
        this.DireccionIP = DireccionIP;
    }
    
    public abstract int getTamano();
    
    public String toString() 
    {
        return "Dato: "+Dato+" DireccionIP: "+DireccionIP;
    }
    
    
    
}
