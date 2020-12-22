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
public class PaqueteTCP extends PaqueteDato
{

    private int NroSecuencia;
    private int CodVerificacionError;
       
    
    public PaqueteTCP(int Dato, String DireccionIP, int NroSecuencia, int CodVerificacionError) 
    {
        super(Dato, DireccionIP);
        this.NroSecuencia=NroSecuencia;
        this.CodVerificacionError=CodVerificacionError;
              
    }

    public void setNroSecuencia(int NroSecuencia) 
    {
        this.NroSecuencia = NroSecuencia;
    }

    public void setCodVerificacionError(int CodVerificacionError) 
    {
        this.CodVerificacionError = CodVerificacionError;
    }

    public int getNroSecuencia() 
    {
        return NroSecuencia;
    }

    public int getCodVerificacionError() 
    {
        return CodVerificacionError;
    }
    
    @Override
    public int getTamano()
    {
        int suma;
        suma = (super.getDato()+20);
        return suma;
    }
    
    public String toString() 
    {	
	return super.toString()+"Numero de Secuencia: "+NroSecuencia+" Codigo verificacion error: "+CodVerificacionError;
    }
}
