/*f
posición  (1:  arquero,  2:  defensor,  3: mediocampo,  4: delantero)  número  de  camiseta,
cantidad  de  partidos  jugados  y porcentaje de estado físico
(100 equivale a un jugador sano y 0 a uno imposibilitado de jugar por lesiones).
 */
package equipofutbollcompleto;

public class Jugador {

    private String nombreJ;
    private int numeroCamiseta;
    private int posicion;
    private int cantPartidosJugados;
    private int estado;

    public Jugador(String nombreJ, int numeroCamiseta, int posicion, int cantPartidosJugados, int estado) {
        this.nombreJ = nombreJ;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.cantPartidosJugados = cantPartidosJugados;
        this.estado = estado;
    }

    public String getNombreJ() {
        return nombreJ;
    }

    public void setNombreJ(String nombreJ) {
        this.nombreJ = nombreJ;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getCantPartidosJugados() {
        return cantPartidosJugados;
    }

    public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidosJugados = cantPartidosJugados;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombreJ=" + nombreJ + ", numeroCamiseta=" + numeroCamiseta + ", posicion=" + posicion + ", cantPartidosJugados=" + cantPartidosJugados + ", estado=" + estado + '}';
    }

}
