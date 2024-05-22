/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author diego
 */
public class Carcel extends Casilla {
    public Carcel(int posicion, String nombre) {
        super(posicion, nombre);
    }

    public void efectoCarceldelJugador(Jugador jugador) {
        // El jugador pierde 2 turnos
        jugador.pierdeTurnos(2);
    }
}
