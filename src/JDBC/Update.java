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
    Statement stmt;

    public static void main(String[] args) {
        new Update();

    }

    public Update() {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String Fname = sn.next();

        System.out.println("Enter your First Name");
        String Lname = sn.next();

        String query = "UPDATE consumer "
                + "SET firstName='" + Fname + "',"
                      + "lastName='" + Lname + "'"
                + " WHERE id = 2";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            stmt = con.createStatement();
            if (stmt.executeUpdate(query) != -1) {
                System.out.println("Update Successfuly");
            } else {
                System.out.println("Error Occured While Updating Changes");
            }

            con.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
