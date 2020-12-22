/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomunirepaso;

/**
 *
 * @author hogar
 */
public class Plan {

    private String nombreDeudor;
    private float deuda;
    private int cuotas;
    private Pago[] pagos;

    public Plan(String nombreDeudor, float deuda, int cuotas) {
        this.nombreDeudor = nombreDeudor;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos = new Pago[cuotas];
    }

    public String getNombreDeudor() {
        return nombreDeudor;
    }

    public float getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setNombreDeudor(String nombreDeudor) {
        this.nombreDeudor = nombreDeudor;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Plan{" + "nombreDeudor=" + nombreDeudor + ", deuda=" + deuda + ", cuotas=" + cuotas + ", pagos=" +listadoDePagos() + '}';
    }

    public void agregarPago(Pago p) {
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = p;
                break;
            }

        }
    }

    public boolean estaPagoTotalmete() {
        boolean bandera = true;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                bandera = false;
                break;
            }
        }
        return bandera;
    }

    public String listadoDePagos() {
        String cadena = "";
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null) {
                cadena += pagos[i].toString() + "    ";
            }

        }
        return cadena;
    }

    public float sumaInteresesCobrados() {
        float sumaIntereses = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null && pagos[i].getDemora() < 0) {
                sumaIntereses+=pagos[i].getDemora()*0.5*pagos[i].getImporte();
                
            }
        }return sumaIntereses;

    }
}
