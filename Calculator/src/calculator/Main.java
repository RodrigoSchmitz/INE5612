/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JFrame;

/**
 *
 * @author rodrigo
 */
public class Main {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        Calc c = new Calc();
        tela.setSize(500, 400);
        tela.add(c);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
}
