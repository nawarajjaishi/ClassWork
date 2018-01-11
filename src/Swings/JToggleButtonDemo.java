/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swings;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author Jaction76
 */
public class JToggleButtonDemo {

    public JToggleButtonDemo() {
        JFrame frame = new JFrame("JToggleButton DEMO");
        frame.setSize(200, 200);

        frame.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Button is off");
        JToggleButton jtbtn = new JToggleButton("on/off");
        jtbtn.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (jtbtn.isSelected()) {
                    l1.setText("button is on");
                } else {
                    l1.setText("button is off");
                }
            }
        });
        frame.add(jtbtn);
        frame.add(l1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JToggleButtonDemo jbt = new JToggleButtonDemo();
    }

}
