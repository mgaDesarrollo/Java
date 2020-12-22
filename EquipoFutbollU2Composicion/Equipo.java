/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbollcompleto;

/**
 *
 * @author hogar
 */
public class Equipo {

    private String nombre;
    private int puntos;
    private int posicion;
    private int goles;
    private Jugador jugadores[];

    public Equipo(String nombre, int puntos, int posicion, int goles, int cant) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.posicion = posicion;
        this.goles = goles;
        this.jugadores = new Jugador[cant];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void agregarJugador(Jugador j) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = j;
                break;
            }

        }
    }//agrega un jugador al arreglo

    public int puntoUno() {
        int contador = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getCantPartidosJugados() > 10) {
                contador++;
            }
        }
        return contador;
    }//cantidad de j con menos de 10 partidos

    public Jugador jugadorMasPartidos() {
        Jugador ju = new Jugador("", 0, 0, 0, 0);
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getCantPartidosJugados() > ju.getCantPartidosJugados()) {
                ju = jugadores[i];
            }

        }
        return ju;
    }//debuelve un objeto de un jugador con mas partidos

    public float promEstado() {
        float acu = 0;
        int conta = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                acu += jugadores[i].getEstado();
                conta++;
            }

        }
        return acu / conta;
    }//prom e.Fisico de todos los jugadores del equipo

    public int estadoFisicoJugador(int camiseta) {
        int retorno = 0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getNumeroCamiseta() == camiseta) {

                retorno = jugadores[i].getEstado();

            }
            break;

        }
        return retorno;
    }//estado por camiseta

    public float[] promPartJugadosCadaPosicion() {
        float[] promedios = new float[4];
        int arquero = 0, ca = 1;
        int defensor = 0, cd = 1;
        int mediocampista = 0, cm = 1;
        int delantero = 0, cdel = 1;

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null && jugadores[i].getPosicion() == 1) {
                arquero += jugadores[i].getCantPartidosJugados();
                ca++;
            } else if (jugadores[i] != null && jugadores[i].getPosicion() == 2) {
                defensor += jugadores[i].getCantPartidosJugados();
                cd++;
            } else if (jugadores[i] != null && jugadores[i].getPosicion() == 3) {
                mediocampista += jugadores[i].getCantPartidosJugados();
                cm++;
            } else if (jugadores[i] != null && jugadores[i].getPosicion() == 4) {
                delantero += jugadores[i].getCantPartidosJugados();
                cdel++;
            }

        }
        promedios[0] = arquero / ca;
        promedios[1] = defensor / cd;
        promedios[2] = mediocampista / cm;
        promedios[3] = delantero / cdel;
        return promedios;
    }// arreglo de resultado de promedios por posicion;
    
    public void mostrarListaJugadores(){
        for (int i = 0; i < jugadores.length; i++) {
            
            if(jugadores[i]!=null){
                System.out.println(" "+jugadores[i].toString()+" ");
            }
            
        }
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", puntos=" + puntos + ", posicion=" + posicion + ", goles=" + goles + '}';
    }

}
