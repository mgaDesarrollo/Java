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
public class PaqueteUDP extends PaqueteDato
{
    private int Longitud;

    public void setLongitud(int Longitud) 
    {
        this.Longitud = Longitud;
    }

    public int getLongitud() 
    {
        return Longitud;
    }

    
    public PaqueteUDP(int Dato, String DireccionIP, int Longitud) 
    {
        super(Dato, DireccionIP);
        this.Longitud=Longitud;
    }
    
    @Override
    public int getTamano()
    {
        return Longitud;
    }
    
    public String toString() 
    {
	return super.toString()+" Longitud: "+Longitud;
    }
    
    
}
