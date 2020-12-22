

package javaapplication50;

/**
 *
 * @author 106416 avendaño
 */
public class Examen {

    private int legajo;
    private String apellido;
    private int nota;
    private int tipoExamen;

    public Examen(int legajo, String apellido, int nota, int tipoExamen) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nota = nota;
        this.tipoExamen = tipoExamen;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(int tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String tipoExamen() {
        String tipo = "oral";
        if (this.tipoExamen == 0) {
            tipo = "Oral";
        } else if (this.tipoExamen == 1) {
            tipo = "Escrito";
        } else {
            tipo = "Ambas";
        }
        return tipo;
    }

    @Override
    public String toString() {
        return "Examen{" + "legajo=" + legajo + ", apellido=" + apellido + ", nota=" + nota + ", tipoExamen=" + tipoExamen() + '}';
    }

}
