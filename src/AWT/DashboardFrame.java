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

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DashboardFrame extends Frame {

    private MenuBar dashboardMenuBar;
    private Menu fileMenu;
    private MenuItem openCalculator,openProject;

    public DashboardFrame() {
        setSize(500, 500);
        dashboardMenuBar = new MenuBar();

        fileMenu = new Menu("File");
        
        openCalculator = new MenuItem("Open Calculator");
        openCalculator.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                openCalculator();
            }
        });
        openProject = new MenuItem("Open Project");
        
        fileMenu.add(openCalculator);
        fileMenu.add(openProject);
        
        dashboardMenuBar.add(fileMenu);
        setMenuBar(dashboardMenuBar);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    
    private void openCalculator(){
        
    }
}

