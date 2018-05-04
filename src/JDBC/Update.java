/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Jaction76
 */
public class Update {

    String dbUrl = "jdbc:mysql://localhost:3306/college";
    String dbUsername = "root";
    String dbPassword = "";
    Connection con;
    PreparedStatement pstmt;

    public static void main(String[] args) {
        new Update();

    }

    public Update() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String Fname = sn.next();

        System.out.println("Enter your Last Name");
        String Lname = sn.next();
        
        
        System.out.println("Provide the Id of the user to update:");
        int id = sn.nextInt();

        String query = "UPDATE consumer "
                + "SET firstName=?,"
                      + "lastName=?"
                + " WHERE id = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, Fname);
            pstmt.setString(2, Lname);
            pstmt.setInt(3, id);
            if (pstmt.executeUpdate(query) != -1) {
                System.out.println("Update Successfuly");
            } else {
                System.out.println("Error Occured While Updating Changes");
            }

            con.close();
            pstmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
