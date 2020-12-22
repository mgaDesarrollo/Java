/*
 un  numero  de  cliente,  un nombre,  una  antigüedad  (hace  cuánto  que  son  clientes  de  la  veterinaria)  y  una Mascota.
De la Mascota se dispone los siguientes datos: el nombre y la edad.
 */
package proyectoveterinaria;

/**
 *
 * @author hogar
 */
public class Cliente {

    private int numCliente;
    private String nombre;
    private int antiguedad;
    private Mascota mascota;

    public Cliente(int numCliente, String nombre, int antiguedad, Mascota mascota) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.mascota = mascota;
    }//constructor
//  Get y set
    public int getNumCliente() {
        return numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
//  Metodo toString
    @Override
    public String toString() {
        return "Cliente{" + "numCliente=" + numCliente + ", nombre=" + nombre + ", antiguedad=" + antiguedad + ", mascota=" + mascota + '}';
    }
    

}
