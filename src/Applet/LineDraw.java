/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

import java.applet.*;
import java.awt.*;
import sun.java2d.loops.DrawLine;

/**
 *
 * @author Jaction76
 */
public class LineDraw extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(20, 20, 100, 20);
        g.drawString("-------------------", 20, 50);
    }

}
