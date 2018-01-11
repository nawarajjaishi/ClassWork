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
public class TextEventHandling {
    
    private Frame f;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private TextField textField;
    
    public TextEventHandling() {
        f = new Frame("Java TextEvent Handling Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));
        headerLabel = new Label("TextListener in Action", Label.CENTER);
        statusLabel = new Label("", Label.CENTER);
        
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        
        f.add(headerLabel);
        f.add(controlPanel);
        f.add(statusLabel);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        f.setVisible(true);
        
        textField = new TextField(10);
        textField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                statusLabel.setText("Entered text: " + textField.getText());
            }
        });
        controlPanel.add(textField);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TextEventHandling();
    }
    
}
