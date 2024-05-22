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

    public class Salida extends Casilla {
    public Salida(int posicion, String nombre) {
        super(posicion, nombre);
    }

    public void efectoPasarPorSalida(Jugador jugador) {
       
        jugador.ajustarDinero(200);
    }
}

