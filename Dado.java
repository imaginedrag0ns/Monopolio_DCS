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
import java.util.Random;

public class Dado {
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int lanzar() {
        return random.nextInt(12) + 1; 
    }
}

