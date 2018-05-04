/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applet;

/**
 *
 * @author Jaction76
 */
import java.awt.*;
import java.applet.*;

public class ParamDemo extends Applet {

    String fontName;
    int fontSize;
    float leading;
    boolean active;
// Initialize the string to be displayed.

    public void start() {
        String param;
        fontName = getParameter("fontName");
        if (fontName == null) {
            fontName = "Not Found";
        }

        param = getParameter("fontSize");
        try {
            if (param != null) // if not found
            {
                fontSize = Integer.parseInt(param);
            }
            else fontSize = 0;
        } catch (NumberFormatException e) {
            fontSize = -1;
        }
        param = getParameter("leading");
        try {
            if (param != null) // if not found
            {
                leading = Float.valueOf(param).floatValue();
            } else {
                leading = 0;
            }
        } catch (NumberFormatException e) {
            leading = -1;
        }
        param = getParameter("accountEnabled");
        if (param != null) {
            active = Boolean.valueOf(param).booleanValue();
        }
    }
// Display parameters.

    public void paint(Graphics g) {
        g.drawString("Font name: " + fontName, 20, 50);
        g.drawString("Font size: " + fontSize, 20, 70);
        g.drawString("Leading: " + leading, 20, 90);
        g.drawString("Account Active: " + active, 20, 110);
    }
}
