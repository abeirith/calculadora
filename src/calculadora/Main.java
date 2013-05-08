/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JFrame;

/**
 *
 * @author beirith
 */
public class Main {

    public static void main(String args[]) {
        javax.swing.JFrame frame = new javax.swing.JFrame();  
        Calculadora calc = new Calculadora();
        frame.add(calc);  
        frame.setSize(225,230);
        frame.setResizable(false);
        frame.setVisible(true);  
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
