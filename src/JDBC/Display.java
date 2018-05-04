/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jaction76
 */
public class Display {
    
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    String[] colHead = {"id", "Name","Last Name", "UserName", "Password", "Address", "Phone No"};
    JTable table;
    
    public static void main(String[] args) {
        Display ds = new Display();
        ds.connection();
        //ds.dispalyTable();

    }
    
    public void connection() {
        JFrame jf = new JFrame("Display Table");
        jf.setSize(400, 400);
        jf.setVisible(true);
        
        String dbUrl = "jdbc:mysql://localhost:3306/college";
        String dbName = "root";
        String dbPassword = "";
        
        String query = "SELECT * FROM consumer";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbName, dbPassword);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            DefaultTableModel dtm = new DefaultTableModel(colHead, rs.getFetchSize());
            while (rs.next()) {
                ArrayList data = new ArrayList();
                data.add(rs.getInt(1));
                data.add(rs.getString(2));
                data.add(rs.getString(3));
                data.add(rs.getString(4));
                data.add(rs.getString(5));
                data.add(rs.getString(6));
                data.add(rs.getString(7));
                dtm.addRow(data.toArray());
                
            }
            table = new JTable();
            table.setModel(dtm);
            JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
            jScrollPane1.setViewportView(table);
            
            
            jf.add(table);
            jf.validate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }


    /*  private void dispalyTable() {
        System.out.println(counter);

        for (int i = 0; i < counter; i++) {

            System.out.println(cid);
            System.out.println(cName);
        }
    }
   JFrame jf = new JFrame("Display Table");

        String[] colHead = {"id", "Name", "UserName", "Password", "Address", "Phone No"};
        Object[][] data = {{cid, cName, cUserName, cPassword, cAddress, cPhone}};
        JTable table = new JTable(data, colHead);
        JScrollPane jsp = new JScrollPane(table);
        jf.add(jsp);

        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
     */
}
