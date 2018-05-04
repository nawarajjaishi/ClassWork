package AWT;

import java.awt.*;
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class SignupFrame extends Frame {

    private Label username, email, role, gender, faculty;
    private TextField usernametxt, emailtxt;
    private Choice rolechoice;
    private Checkbox malecb, femalecb, othercb, bimcb, bitcb;
    private CheckboxGroup gendercbgroup;
    private Button save, cancel;

    public SignupFrame() {
        setSize(400, 500);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //add label for show the text label 
        username = new Label("Username:");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(username, gbc);

        //add texe field for input
        usernametxt = new TextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(usernametxt, gbc);

        //add label for show the text label      
        email = new Label("Email:");
                
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(email, gbc);

        //add texe field for input
        emailtxt = new TextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(emailtxt, gbc);

        // Role choice support choice selection option idems
        role = new Label("Role:");
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(role, gbc);

        rolechoice = new Choice();
        rolechoice.add("Options");
        rolechoice.add("Student");
        rolechoice.add("Teacher");
        rolechoice.add("Parents");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(rolechoice, gbc);

        gender = new Label("Gender:");
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(gender, gbc);

        //Radiobuttons
        gendercbgroup = new CheckboxGroup();
        malecb = new Checkbox("Male", gendercbgroup, true);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(malecb, gbc);

        femalecb = new Checkbox("Female", gendercbgroup, false);
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(femalecb, gbc);

        othercb = new Checkbox("Other", gendercbgroup, false);
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(othercb, gbc);

        //faculty and its choice 
        faculty = new Label("Faculty:");
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(faculty, gbc);

        //Checkboxes
        bimcb = new Checkbox("BIM",true);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(bimcb, gbc);

        bitcb = new Checkbox("BIT");
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(bitcb, gbc);

        save = new Button("Save");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(save, gbc);

        cancel = new Button("Cancle");
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(cancel, gbc);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SignupFrame sup = new SignupFrame();

    }

}
