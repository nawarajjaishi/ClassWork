/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

/**
 *
 * @author Jaction76
 */

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.skin.SubstanceGreenMagicLookAndFeel;



public class Swing extends JFrame {

    private JLabel username, email, role, gender, faculty, errorLabel;
    private JTextField usernametext, emailtext;
    // private JComboBox rolechoice;
    private JButton save, cancel;
    private JCheckBox bim, bit;
    private JRadioButton male, female, other, teacher, student;
    private ButtonGroup newgen, newrole;
    private GridBagConstraints gbc;

    private Insets insets;

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public Swing() {
        openFrame();

    }

    private void openFrame() {

        errorLabel = new JLabel();
        errorLabel.setForeground(Color.red);

        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.weightx = 0;
        gbc.weighty = 0;

        //Labels
        username = new JLabel("Username");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(username, gbc);

        email = new JLabel("Email");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(email, gbc);

        role = new JLabel("Role");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(role, gbc);

        gender = new JLabel("Gender");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(gender, gbc);

        faculty = new JLabel("Faculty");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(faculty, gbc);

        //TextFields
        usernametext = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(usernametext, gbc);

        emailtext = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(emailtext, gbc);
        
        teacher = new JRadioButton("Teacher");
        teacher.setActionCommand("Teacher");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(teacher, gbc);

        student = new JRadioButton("Student");
        student.setActionCommand("Student");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(student, gbc);

        newrole = new ButtonGroup();
        newrole.add(teacher);
        newrole.add(student);

        male = new JRadioButton("Male");
        male.setActionCommand("Male");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(male, gbc);

        female = new JRadioButton("Female");
        female.setActionCommand("Female");
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(female, gbc);

        other = new JRadioButton("Other");
        other.setActionCommand("Other");
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(other, gbc);

        newgen = new ButtonGroup();
        newgen.add(male);
        newgen.add(female);
        newgen.add(other);

        //CheckBox
        bim = new JCheckBox("BIM", false);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(bim, gbc);

        bit = new JCheckBox("BIT", false);
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(bit, gbc);

        //Buttons
        save = new JButton("Save");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.insets = new Insets(10, 5, 5, 5);
        add(save, gbc);

        cancel = new JButton("Reset");
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(cancel, gbc);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                //saveData();
                save();

            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void save() {

        String un = usernametext.getText();
        String em = emailtext.getText();

        if (rujuGarne(username.getText(), username.getText())) {
            gbc.gridx = 2;
            gbc.gridy = 0;
            add(errorLabel, gbc);
            return;
        }

        if (rujuGarne(email.getText(), emailtext.getText())) {
            gbc.gridx = 2;
            gbc.gridy = 1;
            add(errorLabel, gbc);
            return;
        }

//        String gender = newgen.getSelection().getActionCommand();
//        String role = newrole.getSelection().getActionCommand();
    }

    public boolean rujuGarne(String field, String value) {
        boolean hasError = false;
        errorLabel.setText("");
        if (value.isEmpty()) {
            errorLabel.setText(field + " can not be empty!");
            hasError = true;
            return hasError;
        }

        if (email.getText().equalsIgnoreCase(field)) {
            Matcher m = VALID_EMAIL_ADDRESS_REGEX.matcher(value);
            if (m.find()) {
                return false;
            } else {
                errorLabel.setText("Invalid email format!");
                hasError = true;
                return hasError;
            }
        }

        if (value.length() < 6) {
            errorLabel.setText(field + " can not be less than 6!");
            hasError = true;
            return hasError;
        }

        if (value.length() > 30) {
            errorLabel.setText("Username can not be greater than 30!");
            hasError = true;
            return hasError;
        }
        return hasError;
    }
    
    public void changeLNF(LookAndFeel l){
        try {
            UIManager.setLookAndFeel(l);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Swing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Swing sw = new Swing();
        try {
            UIManager.setLookAndFeel(new  SubstanceGreenMagicLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
            Logger.getLogger(Swing.class.getName()).log(Level.SEVERE, null, ex);
        }
        sw.setSize(700, 500);
        sw.setVisible(true);

    }

}

