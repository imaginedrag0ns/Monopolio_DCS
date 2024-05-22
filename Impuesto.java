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
public class Impuesto extends Casilla {
    private int monto;

    public Impuesto(int posicion, String nombre, int monto) {
        super(posicion, nombre);
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return super.toString() + "(Impuesto) - Monto: " + monto;
    }
}
