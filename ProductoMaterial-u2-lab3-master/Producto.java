/*
 Desarrolle  la  clase  Producto  de  manera  que contenga  en  su  interior  
los atributos descripción (String) y Materiales (Material[]).
 */
package javaapplication32;

/**
 *
 * @author 106416 Avendaño
 */
public class Producto {

    private String descripcion;
    private Material[] materiales;

    //Desarrolle en la clase Producto un constructor que reciba por parámetro una cantidad de elementos
    // y dimensione el vector de materiales.
    public Producto(String descripcion, int cant) {
        this.descripcion = descripcion;
        materiales = new Material[cant];
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", materiales=" + materiales.toString() + '}';
    }//toString

    //Desarrolle en la clase Producto unmétodo que permita agregar un Material recibido por parámetro al vector.
    public void agregarMaterial(Material m) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = m;
                break;
            }

        }

    }

    //Desarrolle  en  Producto  un método que  retorne el  costo  total
    //sumando  todos  los  valores  unitarios  de  los  Materiales  que componen el Producto.
    public float costoTotal() {
        float costo = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                costo += materiales[i].getValorUnitario();

            }

        }
        return costo;
    }

    //Muestra materiales por producto cargado.
    public void mostrarVector() {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                System.out.println(materiales[i].toString() + "///////");
            }

        }
    }

    //Desarrolle en la clase Producto un método que reciba por parámetro un código de material
    //y retorne true si dicho material forma parte del Producto.
    public boolean formaParte(int codMat) {
        boolean bandera = false;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getCodigo() == codMat) {
                bandera = true;
            }

        }
        return bandera;
    }

    //Desarrolle en la clase producto un método que retorne un vector con todos los materiales
    //que tengan un valorunitario menor a un parámetro.
    public Material[] materialesMenorA(float valor) {
        Material[] mate = new Material[materiales.length];
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getValorUnitario() < valor) {
                mate[i] = materiales[i];
            }

        }

        return mate;
    }

    //Desarrolle en la clase producto un método que retorne un vector donde cada casillero contenga la cantidad
    //de materiales por precio, siguiendo las siguiente regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. 
    //Si 10 < precio ≤ 20 contarlo  en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer casillero.
    //Si precio > 30 contarlo en el cuarto casillero.
    public int[] vectorOrdenado() {
        int[] materialesOr = new int[3];
        materialesOr[0] = 0;
        materialesOr[1] = 0;
        materialesOr[2] = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                if (materiales[i].getValorUnitario() > 0 && materiales[i].getValorUnitario() <= 10) {
                    materialesOr[0]++;
                } else if (materiales[i].getValorUnitario() > 10 && materiales[i].getValorUnitario() <= 20) {
                    materialesOr[1]++;
                } else if (materiales[i].getValorUnitario() > 20 && materiales[i].getValorUnitario() <= 30) {
                    materialesOr[2]++;
                }
            }
        }
        return materialesOr;
    }

}
