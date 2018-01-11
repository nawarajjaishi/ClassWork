/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Jaction76
 */
public class KeyAdapterDemo extends KeyAdapter {

    private Frame f;
    private Label headerLabel;
    private Label statusLabel;
    private Panel panel;
    private TextField textField;

    public KeyAdapterDemo() {
        f = new Frame("Java AWT Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new Label("Key Event Program", Label.CENTER);
        statusLabel = new Label("", Label.CENTER);
        panel = new Panel();
        panel.setLayout(new FlowLayout());
        f.add(headerLabel);
        f.add(panel);
        f.add(statusLabel);
        TextField textField = new TextField(10);
        textField.addKeyListener(this);

        panel.add(textField);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("hello");
        //
    }

    public static void main(String[] args) {
        new KeyAdapterDemo();
    }
}
