/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Jaction76
 */
public class AppletDemo extends Applet implements ActionListener {

    String num1, num2, sum, diff, mul;
    int c;
    
    Label numlb1 = new Label("Enter First Number : ");    
    Label anslb = new Label("Words have length 5?");
    
    TextField numtx1 = new TextField("",20);   
    TextField anstx= new TextField("",10);

    Button add = new Button("ADD");
   

    public void init() {
        add(numlb1);
        add(numtx1);        
        add(anslb);
        add(anstx);
        add(add);
        add.addActionListener(this);
        
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        num1 = (numtx1.getText());      
        c= num1.length();
        if(c>=5){
          anstx.setText("yes");
        }
        if(c<5){
         anstx.setText("NO");
        }
        repaint();
    }
}
