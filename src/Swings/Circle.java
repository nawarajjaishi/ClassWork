/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

/**
 *
 * @author Jaction76
 */
import java.awt.*;
import javax.swing.*;

public class Circle extends JFrame {

    CirclePanel drawing = new CirclePanel();

    Circle() {
//--- Get content pane, set layout, add components
        Container content = this.getContentPane();
        content.setLayout(new BorderLayout());
        content.add(drawing, BorderLayout.CENTER); // Note 2
        this.setTitle("Circles");
        this.pack(); // finalize the layout
    }//

    public static void main(String[] args) {
        JFrame myWindow = new Circle();
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }
}

class CirclePanel extends JPanel {
//=========================================== constructor

    public CirclePanel() {
        setPreferredSize(new Dimension(100, 100));
        setBackground(Color.white);
    }//end constructor
//=========================================== paintComponent

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCircle(g, 30, 30, 20); // center (30,30) r=20
    }
// Convenience method to draw from center with radius

    public void drawCircle(Graphics cg, int xCenter, int yCenter, int r) {
        cg.drawOval(xCenter - r, yCenter - r, 3 * r, 3 * r);
    }//end drawCircle
}
