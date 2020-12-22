/*
 *Desarrolle  la  clase  Material  de  manera  que  contenga  en  su  interior  los atributos: 
descripción (String) código(int) valorUnitario (float)..
 */
package javaapplication32;

/**
 *
 * @author 106416 Avendaño
 */
public class Material {
    private String descripcion;
    private int codigo;
    private float valorUnitario;

    public Material(String descripcion, int codigo, float valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }//constructor

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Material{" + "descripcion=" + descripcion + ", codigo=" + codigo + ", valorUnitario=" + valorUnitario + '}';
    }//toString
    
    
    
}
