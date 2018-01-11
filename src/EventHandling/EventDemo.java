/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

/**
 *
 * @author Jaction76
 */
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.*;

public class EventDemo {

    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(new GridLayout(3, 1));

        TextField t = new TextField();
        f.setSize(200, 200);
        f.add(t);
        f.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                System.out.println("COmponent added");
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                System.out.println("Component removed");
            }
        });

        f.add(new Button());
        f.remove(t);
        f.setVisible(true);

    }
}
