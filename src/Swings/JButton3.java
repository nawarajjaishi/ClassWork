/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author Jaction76
 */
public class JButton3 {

    private JButton loginbtn, cancelbtn;
    private ImageIcon imgIcone1, imgIcone2;
    private Image image1, image2, newimg1, newimg2;
    private JLabel userNamelbl, emaillbl, passwordlbl;
    private JTextField usertxt,emailtxt,passtxt;

    JButton3() {
        JFrame f = new JFrame("Button Example");

        userNamelbl = new JLabel("User Name :");
        userNamelbl.setBounds(50, 100, 100, 30);
        f.add(userNamelbl);
        
        usertxt = new JTextField();
        usertxt.setBounds(170, 100, 200, 30);
        f.add(usertxt);
        
        emaillbl = new JLabel("Email :");
        emaillbl.setBounds(50, 140, 100, 30);
        f.add(emaillbl);
        
        emailtxt = new JTextField();
        emailtxt.setBounds(170, 140, 200, 30);
        f.add(emailtxt);
        
        passwordlbl = new JLabel("Password :");
        passwordlbl.setBounds(50, 190, 100, 30);
        f.add(passwordlbl); 
        
        passtxt = new JTextField();
        passtxt.setBounds(170, 190, 200, 30);
        f.add(passtxt);

        imgIcone1 = new ImageIcon("F:\\MY Documents\\login2.jpg");
        image1 = imgIcone1.getImage();
        Image newimg = image1.getScaledInstance(70, 50, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
        imgIcone1 = new ImageIcon(newimg);  // transform it back

        imgIcone2 = new ImageIcon("F:\\MY Documents\\cancel.jpg");
        image2 = imgIcone2.getImage();
        newimg2 = image2.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way 
        imgIcone2 = new ImageIcon(newimg2);  // transform it back

        loginbtn = new JButton();
        f.add(loginbtn);
        loginbtn.setIcon(imgIcone1);
        loginbtn.setBounds(90, 250, 70, 40);
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                authenticate();
            }
        });

        JButton cancelbtn = new JButton();
        f.add(cancelbtn);
        cancelbtn.setIcon(imgIcone2);
        cancelbtn.setBounds(220, 250, 70, 40);
        cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.setSize(400,600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void authenticate(){
        
    }

    public static void main(String[] args) {
        new JButton3();
    }

}
