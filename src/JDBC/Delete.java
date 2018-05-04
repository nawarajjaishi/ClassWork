/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Jaction76
 */
public class Delete {

    String dbUrl = "jdbc:mysql://localhost:3306/college";
    String dbUsername = "root";
    String dbPassword = "";
    Connection con;
    Statement stmt;

    public static void main(String[] args) {
        new Delete();

    }

    public Delete() {
        Scanner sn = new Scanner(System.in);

        System.out.println("From Which ID You Want To Delete Record");
        int id = sn.nextInt();
        
        String query = "DELETE FROM consumer "                
                + "WHERE id = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//            stmt = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            if (pstmt.executeUpdate() != -1) {
                System.out.println("Delete Successfuly");
            } else {
                System.out.println("Error Occured While Deleting Data");
            }

            con.close();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
