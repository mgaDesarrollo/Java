/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author hogar
 */
public class ControlVentas {

    private Venta[] ventas;

    public ControlVentas(int cant) {
        this.ventas = new Venta[cant];
    }

    public void agregarVenta(Venta v) {
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] == null) {
                ventas[i] = v;
                break;
            }

        }
    }

    //1Promedio general de importes de todas las ventas
    public float puntoUno() {
        int cont = 0;
        float acu = 0;
        float promGral = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                cont++;
                acu += ventas[i].getImporteTotal();

            }

        }
        promGral = acu / cont;
        return promGral;
    }

    //2Sumatoria total de deuda, que acumule los saldos adeudados en todas las ventas.
    public float puntoDos() {
        float sumatoria = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                sumatoria += ventas[i].getSaldoAdeudado();
            }
        }
        return sumatoria;
    }

    //3Cantidad de ventas con importe superior a uno indicado por el usuario. 
    //Es decir que se le debe preguntar al usuario el importe y deben contarse cuántas ventas tuvieron un importe superior al que indique.
    public int puntoTres(int importe) {
        int canti = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null && ventas[i].getImporteTotal() > importe) {
                canti++;
            }

        }
        return canti;
    }

   public void prueba() {
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] != null) {
                System.out.println(ventas[i].toString());
            }

        }
    }
}
