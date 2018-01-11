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
public class MouseEventHandling {

    private Frame f;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public MouseEventHandling() {
        f = new Frame("Java MouseEvent Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(3, 1));
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
      
        headerLabel = new Label("MouseListener", Label.CENTER);
        statusLabel = new Label("", Label.CENTER);
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());
        f.add(headerLabel);
        f.add(controlPanel);
        f.add(statusLabel);
        Panel panel = new Panel();
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        Label msglabel = new Label();
        msglabel.setAlignment(Label.CENTER);
        msglabel.setText("Welcome to MouseEvent Demo");
        msglabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        panel.add(msglabel);
        controlPanel.add(panel);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventHandling();
    }
}
