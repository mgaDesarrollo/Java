/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsial;

/**
 *
 * @author hogar
 */
class Oferta {
    private String descripcion;
    private int cod;
    private int stk;
    private float prec;
    private float precOfert;
    private int diasDispo;

    public Oferta(String descripcion, int cod, int stk, float prec, float precOfert, int diasDispo) {
        this.descripcion = descripcion;
        this.cod = cod;
        this.stk = stk;
        this.prec = prec;
        this.precOfert = precOfert;
        this.diasDispo = diasDispo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getStk() {
        return stk;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }

    public float getPrec() {
        return prec;
    }

    public void setPrec(float prec) {
        this.prec = prec;
    }

    public float getPrecOfert() {
        return precOfert;
    }

    public void setPrecOfert(float precOfert) {
        this.precOfert = precOfert;
    }

    public int getDiasDispo() {
        return diasDispo;
    }

    public void setDiasDispo(int diasDispo) {
        this.diasDispo = diasDispo;
    }

    @Override
    public String toString() {
        return "Oferta{" + "descripcion=" + descripcion + ", cod=" + cod + ", stk=" + stk + ", prec=" + prec + ", precOfert=" + precOfert + ", diasDispo=" + diasDispo + '}';
    }
    
    
}
