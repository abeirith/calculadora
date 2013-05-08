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
        javax.swing.JFrame frame = new javax.swing.JFrame();  // Cria frame
        Calculadora calc = new Calculadora();
        // Alterar as propriedades que julgar necessárias aqui!
        frame.add(calc);  // Adiciona bean ao frame
        frame.setSize(225,220);
        frame.setResizable(false);
        frame.setVisible(true);  // Exibe o frame
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
