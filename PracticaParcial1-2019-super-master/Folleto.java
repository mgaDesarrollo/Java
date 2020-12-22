/*
 En un supermercado publican periódicamente un folleto con ofertas.
El mismo contiene un conjunto de ofertas para algunos de los productos que tienen a la venta y una fecha de inicio.


Por cada oferta se conoce el número del producto, nombre del producto, 
el precio regular al que se lo vende cuando no está en oferta, el precio de la oferta,
la cantidad de días de vigencia de la misma y la cantidad de unidades que se poseen para la venta, es decir, el stock
 */
package practicaparsial;

public class Folleto {

    private Oferta[] ofertas;
    private String fecha;

    public Folleto(int cant) {

        this.fecha = "dia de hoy";

        ofertas = new Oferta[cant];
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Folleto{" + "fecha=" + fecha + '}';
    }

    public void agregarOferta(Oferta ofrt) {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] == null) {
                ofertas[i] = ofrt;
                break;
            }

        }

    }

    public void verOfertas() {
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null) {
                System.out.println(ofertas[i].toString() + " ///// ");
            }

        }

    }

    //1. Cantidad de artículos ofertados por más de 5 días.
    public int puntoUno() {
        
        int c = 0;
        System.out.println("//1. Cantidad de artículos ofertados por más de 5 días . ");
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && ofertas[i].getDiasVigencia() > 5) {
                System.out.println(ofertas[i].toString());
                c++;

            }

        }
        return c;
    }

    //2. Total de unidades que hay a la venta (sumatoria del stock). 
    public int puntoDos() {
        int totalUnidades = 0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null) {
                totalUnidades += ofertas[i].getStock();
            }

        }
        return totalUnidades;

    }
    
    // 3. Cantidad de artículos ofrecidos con un descuento superior a $20. 

    public int punto3() {
        int canti = 0;
        System.out.println("    // 3. Cantidad de artículos ofrecidos con un descuento superior a $20.");

        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i] != null && (ofertas[i].getPrecio() - ofertas[i].getPrecioOferta()) > 20) {
                System.out.println(ofertas[i].toString());
                canti++;
            }
        }
        return canti;

    }
    
    //4-Total a recaudar por un artículo en particular indicado por su código,suponiendo que se vendan todas las unidades disponibles.
    public float punto4(int cod){
    float total=0;
        for (int i = 0; i < ofertas.length; i++) {
            if(ofertas[i]!=null&&ofertas[i].getCodigoProducto()==cod){
            total=ofertas[i].getPrecio()*ofertas[i].getStock();
            }
            
        }
    return total;
    }

}
