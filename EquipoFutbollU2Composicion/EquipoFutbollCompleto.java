/*
los  equipos contendientes y atributos necesarios para indicar el resultado del mismo.
 */
package equipofutbollcompleto;

import java.util.Scanner;

/**
 *
 * @author 106416 2w1 Avendaño Mario
 */
public class EquipoFutbollCompleto {

    Partido part;

    Jugador j;
    protected Scanner sc;

    public void cargaDatosPartido() {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Equipo[] equipos = new Equipo[2];
        for (int i = 0; i < equipos.length; i++) {
            System.out.println("Ingrese datos del equipo ");
            System.out.println("Ingrese nombre ");
            String nom = sc.nextLine();
            System.out.println("Ingrese puntos ");
            int pts = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese posicion");
            int pos = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese goles ");
            int goles = sc.nextInt();
            sc.nextLine();
            equipos[i] = new Equipo(nom, pts, pos, goles, 1);
            System.out.println("Ingrese cantidad de jugadores a cargar ");
            int cantJug = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < cantJug; j++) {
                System.out.println("Ingrese nom");
                String n = sc.nextLine();
                System.out.println("Ingrese camiseta ");
                int nu = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese posicion ");
                int po = sc.nextInt();
                sc.nextLine();
                System.out.println(" ingrese partidos jugados ");
                int cantPartJug = sc.nextInt();
                sc.nextLine();
                System.out.println("ingrese estado ");
                int est2 = sc.nextInt();
                sc.nextLine();
                Jugador jug = new Jugador(n, nu, po, cantPartJug, est2);
                equipos[i].agregarJugador(jug);
            }
        }
        Partido parti2 = new Partido("Kempes", " 11-2-2020 ");
        parti2.cargarEquipos(equipos);
        parti2.verResultado();
        System.out.println("equipo local :");

        equipos[0].mostrarListaJugadores();
        System.out.println(equipos[0].puntoUno());
        System.out.println(equipos[0].estadoFisicoJugador(10));
        System.out.println(equipos[0].jugadorMasPartidos());
        System.out.println(equipos[0].promEstado());
        System.out.println(equipos[0].promPartJugadosCadaPosicion());

        System.out.println("equipo visitante :");

        equipos[1].mostrarListaJugadores();
        System.out.println(equipos[1].puntoUno());
        System.out.println(equipos[1].estadoFisicoJugador(10));
        System.out.println(equipos[1].jugadorMasPartidos());
        System.out.println(equipos[1].promEstado());
        System.out.println(equipos[1].promPartJugadosCadaPosicion());

    }

}
