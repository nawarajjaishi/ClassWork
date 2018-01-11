/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

/*
    <applet code ="MouseEvents" width = 300 height = 100> </applet>
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {

    String msg = "Welcome Here";
    int mouseX = 0, mouseY = 0;//cordinates of a mouse in windows

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    //handle mouse clicked 
    @Override
    public void mouseClicked(MouseEvent me) {
        // save cordinates 
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Clicked ";
        repaint();
    }

    //handled mouse entered 
    @Override
    public void mouseEntered(MouseEvent me) {
        // save cordinates 
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Entered ";
        repaint();
    }

    //handled mouse Exited
    @Override
    public void mouseExited(MouseEvent me) {
        // save cordinates 
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse Exited";
        repaint();
    }

    //handled button pressed 
    @Override
    public void mousePressed(MouseEvent me) {
        //save cordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    //handled button released 
    @Override
    public void mouseReleased(MouseEvent me) {
        //save cordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    //handled mouse dragging 
    @Override
    public void mouseDragged(MouseEvent me) {
        //save cordinates
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging Mouse at  " + mouseX + ", " + mouseY);
        repaint();
    }

    //handled mouse moved
    @Override
    public void mouseMoved(MouseEvent me) {
        showStatus("Moving Mouse at  " + me.getX() + ", " + me.getY());
    }

    //displaying msg in applet window at current x,y location 
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}
