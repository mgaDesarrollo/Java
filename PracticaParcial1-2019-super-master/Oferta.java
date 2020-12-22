/*

Por cada oferta se conoce el número del producto, nombre del producto, 
el precio regular al que se lo vende cuando no está en oferta, el precio de la oferta,
la cantidad de días de vigencia de la misma y la cantidad de unidades que se poseen para la venta, es decir, el stock
 */
package practicaparsial;


public class Oferta {
    private int codigoProducto;
    private String descripcion;
    private float precio;
    private float precioOferta;
    private int stock;
    private int diasVigencia;

    public Oferta(int codigoProducto, String descripcion, float precio, float precioOferta, int stock,int dias) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.precioOferta = precioOferta;
        this.stock = stock;
        this.diasVigencia=dias;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPrecioOferta() {
        return precioOferta;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setPrecioOferta(float precioOferta) {
        this.precioOferta = precioOferta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDiasVigencia() {
        return diasVigencia;
    }

    public void setDiasVigencia(int diasVigencia) {
        this.diasVigencia = diasVigencia;
    }

    @Override
    public String toString() {
        return "Oferta{" + "codigoProducto=" + codigoProducto + ", descripcion=" + descripcion + ", precio=" + precio + ", precioOferta=" + precioOferta + ", stock=" + stock + ", diasVigencia=" + diasVigencia + '}';
    }

   
    
    
}
