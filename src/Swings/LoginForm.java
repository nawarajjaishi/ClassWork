/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

import static java.awt.Label.LEFT;
import javax.swing.*;

/**
 *
 * @author Jaction76
 */
public class LoginForm {

    private JComboBox comboBox;
    private JFrame jf;
    private JDialog jdialog;
    private JLabel userNameLbl, emailLbl, wc;
    private JTextField userNameTxt, emailTxt;

    public LoginForm() {
        jf = new JFrame("LoginForm");
        jf.setSize(400, 500);
        jf.setLayout(null);
        jf.setVisible(true);
        

        ImageIcon image = new ImageIcon("image.jpg");
        wc = new JLabel("Picture", image, LEFT);
        wc.setBounds(50, 100, 100, 40);
        jf.add(wc);

        userNameLbl = new JLabel("UserName:");
        userNameLbl.setBounds(50, 150, 100, 10);
        jf.add(userNameLbl);

        emailLbl = new JLabel("Email: ");
        emailLbl.setBounds(200, 170, 100, 10);
        jf.add(emailLbl);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LoginForm lf = new LoginForm();

    }

}
