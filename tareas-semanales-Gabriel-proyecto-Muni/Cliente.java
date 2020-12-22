/*
 De cada cliente se conoce su número, nombre y teléfono
 */
package javaapplicationherencia1;

/**
 *
 * @author hogar
 */
public class Cliente {
    protected int id;
    protected long tel;
    protected String nom;

    public Cliente(int id, long tel, String nom) {
        this.id = id;
        this.tel = tel;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public long getTel() {
        return tel;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", tel=" + tel + ", nom=" + nom + '}';
    }
    
    
    
    
}
