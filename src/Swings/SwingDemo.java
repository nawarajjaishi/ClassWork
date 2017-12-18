/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Jaction76
 */
public class SwingDemo {

    private JLabel userNameLbl, emailLbl;
    private JTextField userNameTxt, emailTxt;

    public static void main(String[] args) {
        SwingDemo s = new SwingDemo();
        s.frame();
    }

    public void frame() {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        userNameLbl = new JLabel("Username");
        jf.add(userNameLbl);
        
        userNameTxt = new JTextField(20);
        jf.add(userNameTxt);
        
        emailLbl  = new JLabel("Email");
        jf.add(emailLbl);
        
        emailTxt = new JTextField(20);
        jf.add(emailTxt);
        
        jf.setSize(600, 600);
        jf.setVisible(true);
        
    }

}
