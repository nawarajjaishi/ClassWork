/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jaction76
 */
public class AppletDemo2 extends Applet {
    String name;
    int id;
    Integer i;
    public void init(){
        setBackground(Color.green);
        setForeground(Color.white);
        name=getParameter("Name");
        try {
            id=Integer.parseInt(getParameter("Id"));
            } 
        catch (NumberFormatException e) {}
        
    }
    public void start(){
        ++id;
        i=new Integer(id);
    }
        public void paint(Graphics g){
           g.drawString(name, 20, 30);
           g.drawString(i.toString(), 20, 30);
           
        }
}
