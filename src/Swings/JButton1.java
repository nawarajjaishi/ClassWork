/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jaction76
 */
public class JButton1 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
