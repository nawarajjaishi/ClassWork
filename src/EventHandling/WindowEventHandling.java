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
public class WindowEventHandling {

    private Frame mainFrame, aboutFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public WindowEventHandling() {
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new Label("WindowListener",Label.CENTER);
        statusLabel = new Label("", Label.CENTER);
         controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

        aboutFrame = new Frame("WindowListener Demo");
        aboutFrame.setSize(300, 200);;
        aboutFrame.addWindowListener(new CustomWindowListener());
        Label msgLabel = new Label("Welcome.");
        msgLabel.setAlignment(Label.CENTER);
        msgLabel.setSize(100, 100);
        aboutFrame.add(msgLabel);
        aboutFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowEventHandling();
    }

    class CustomWindowListener implements WindowListener {

        public void windowOpened(WindowEvent e) {
            statusLabel.setText("Window Opened");
        }

        public void windowClosing(WindowEvent e) {
            aboutFrame.dispose();
        }

        public void windowClosed(WindowEvent e) {
            statusLabel.setText("Window closed");
        }

        public void windowIconified(WindowEvent e) {
            mainFrame.setIconImage(null);
        }

        public void windowDeiconified(WindowEvent e) {
            statusLabel.setText("Window deiconified");
        }

        public void windowActivated(WindowEvent e) {
            statusLabel.setText("Window activated");
        }

        public void windowDeactivated(WindowEvent e) {
            statusLabel.setText("Window deactivated");
        }
    }

}
