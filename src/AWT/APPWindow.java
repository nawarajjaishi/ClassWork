/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import com.sun.awt.SecurityWarning;
import java.awt.Frame;
import java.applet.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Jaction76
 */
public class APPWindow {

    private String keymsg = "This is a Test";
    private String mousemsg = "";
    private int mouseX = 30, mouseY = 30;

    private Frame frm;

    public APPWindow() {
        frm = new Frame("This is Implementation of Mouse LIstner in Frame");

        frm.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                mouseX = 0;
                mouseY = 10;
                mousemsg = "Mouse Clicked ";
                frm.repaint();

            }

            @Override
            public void mousePressed(MouseEvent me) {
                //save cordinates
                mouseX = me.getX();
                mouseY = me.getY();
                mousemsg = "Down";
                frm.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //save cordinates
                mouseX = me.getX();
                mouseY = me.getY();
                mousemsg = "Up";
                frm.repaint();
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                // save cordinates 
                mouseX = 0;
                mouseY = 10;
                mousemsg = "Mouse Entered ";
                frm.repaint();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                // save cordinates 
                mouseX = 0;
                mouseY = 10;
                mousemsg = "Mouse Exited";

                frm.repaint();
            }
        });

        frm.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                keymsg += ke.getKeyChar();
                frm.repaint();
            }
        });

        frm.setSize(300, 200);
        frm.setVisible(true);
        frm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                frm.dispose();
            }
        });

    }

    public void paint(Graphics g) {
        g.drawString(keymsg, 10, 40);
        g.drawString(mousemsg, mouseX, mouseY);

    }

    public static void main(String[] args) {
        APPWindow apw = new APPWindow();

    }
}
