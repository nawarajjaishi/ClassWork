/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Jaction76
 */
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class Demo1 extends Frame {
    
Demo1(){
   Button b=new Button("ok"); 
   b.setBounds(30,100,80,30);//setting button position
   add(b);//adding button into frame
   setSize(300,300);//frame size 300 width and 300 hight
   setLayout(null);//no layout manager
   setVisible(true);//now frame will be visiable ,by default not visiable 
   
   addMouseListener(new MouseListener() {
       @Override
       public void mouseClicked(MouseEvent e) {
           System.out.println("You Just Click Me?");
           
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
    addWindowListener(new WindowListener() {
       @Override
       public void windowOpened(WindowEvent e) {
       }

       @Override
       public void windowClosing(WindowEvent e) {
           System.exit(0);
       }

       @Override
       public void windowClosed(WindowEvent e) {
       }

       @Override
       public void windowIconified(WindowEvent e) {
       }

       @Override
       public void windowDeiconified(WindowEvent e) {
       }

       @Override
       public void windowActivated(WindowEvent e) {
       }

       @Override
       public void windowDeactivated(WindowEvent e) {
       }
   });
    
}
    public static void main(String[] args) {
        Demo1 d=new Demo1();
    }
}

