/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Jaction76
 */
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends Frame {

    String[] buttons = {
        "Cls", "Bck", "", "Close", "7", "8", "9", "/", "4", "5",
        "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"
    };
    TextField displayField;
    Panel buttonPanel, displayPanel;

    public Calculator() {
        initComponent();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    private void initComponent() {
        setLayout(null);

        displayPanel = new Panel();
        displayPanel.setBounds(5, 5, 290, 100);
        displayField = new TextField();
        displayPanel.add(displayField);

        buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        buttonPanel.setBounds(5, 105, 290, 290);
        for (int i = 0; i < buttons.length; i++) {
            if (i == 2) {
                Label l = new Label();
                buttonPanel.add(l);
            } else {
                Button b = new Button(buttons[i]);
                buttonPanel.add(b);
            }
        }
        add(displayPanel);
        add(buttonPanel);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.setSize(300, 400);
        cal.setVisible(true);

    }
}
