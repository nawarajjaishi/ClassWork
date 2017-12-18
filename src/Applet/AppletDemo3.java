/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jaction76
 */
public class AppletDemo3 extends Applet {
   String name;
    public void init(){
        String name;
        name=getParameter("Name"); 
        
    } 
    
        public void paint(Graphics g){
           g.drawString(name, 20, 30);
                     
        }
    
}
