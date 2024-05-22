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
public abstract class Casilla {
    private int posicion;
    private String nombre;

    public Casilla(int posicion, String nombre) {
        this.posicion = posicion;
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
