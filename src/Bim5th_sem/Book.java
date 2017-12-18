/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bim5th_sem;

/**
 *
 * @author Jaction76
 */
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Book {

    private Frame myframe;
    private MenuBar menu;

    public Book() {
        framing();
    }

    public static void main(String[] args) {
        Book b1 = new Book();

    }

    private void framing() {
        myframe = new Frame("Book's Numerical Solution");
        myframe.setSize(900, 700);
        myframe.setLayout(null);
        myframe.setVisible(true);
        myframe.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent me) {
                System.exit(0);

            }
        });
        menubar();

    }
    private void menubar(){
        menu=new MenuBar();
        Menu Graphics=new Menu("Graphics");
        Menu Economic =new Menu("Economic");
        Menu Percentage=new Menu ("Percentage");
        Menu about=new Menu("About Me");
        
        menu.add(Graphics);
        menu.add(Economic);
        menu.add(about);
        myframe.setMenuBar(menu);
        
        MenuItem pixel=new MenuItem("Conversion Of Pixel");
        MenuItem DDA=new MenuItem("DDA");
        MenuItem BLA=new MenuItem("BLA");
        Graphics.add(pixel);
        Graphics.add(DDA);
        Graphics.add(BLA);
        
        
        
     }
   
}
