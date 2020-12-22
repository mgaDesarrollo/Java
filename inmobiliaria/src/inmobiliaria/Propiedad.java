
package inmobiliaria;


public abstract class Propiedad {
    private String direccion;
    private int cantHabitaciones;
    private float precioBase;
    private boolean usoComercial;
    private int cantInqui;

    public Propiedad(String direccion, int cantHabitaciones, float precioBase, boolean usoComercial, int cantInqui) {
        this.direccion = direccion;
        this.cantHabitaciones = cantHabitaciones;
        this.precioBase = precioBase;
        this.usoComercial = usoComercial;
        this.cantInqui = cantInqui;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isUsoComercial() {
        return usoComercial;
    }

    public void setUsoComercial(boolean usoComercial) {
        this.usoComercial = usoComercial;
    }

    public int getCantInqui() {
        return cantInqui;
    }

    public void setCantInqui(int cantInqui) {
        this.cantInqui = cantInqui;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "direccion=" + direccion + ", cantHabitaciones=" + cantHabitaciones + ", precioBase=" + precioBase + ", usoComercial=" + usoComercial + ", cantInqui=" + cantInqui + '}';
    }
    
    public abstract float calcAlquiler();
    
    
}
