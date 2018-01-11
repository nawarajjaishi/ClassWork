/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaction76
 */
public class DialogBox {

    private String userName, userPsaaword;   //for authencation user to access the main window     
    private JFrame jf;
    private JLabel uNameLbl,uPasswordLbl,uEmailLbl;

    public static void main(String[] args) {
        DialogBox db = new DialogBox();
        db.mainWindow();
    }

    public DialogBox() {
        JOptionPane jop=new JOptionPane();
        jop.setSize(400,400);
        jop.showConfirmDialog(jf, "User Name");
    }
   public void  mainWindow(){       
        jf = new JFrame("About");
        jf.setSize(400, 500);
        jf.setLayout(null);
        jf.setVisible(true);
        
        uNameLbl = new JLabel("UserName:");
        uNameLbl.setBounds(50, 150, 100, 10);
        jf.add(uNameLbl);

        uEmailLbl = new JLabel("Email: ");
        uEmailLbl.setBounds(50, 170, 100, 10);
        jf.add(uEmailLbl);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
}
