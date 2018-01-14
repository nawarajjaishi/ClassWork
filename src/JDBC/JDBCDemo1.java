/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo1 {

    String url = "jdbc:mysql://localhost:3306/college";
    String uname = "root";
    String password = "";
    ResultSet rs;
    Connection con;
    Statement stmt;
    PreparedStatement pstmt = null;
    Scanner sn = new Scanner(System.in);
    int choice;
    //here college  is database name, root is username and password 

    public static void main(String[] args) throws SQLException {
        JDBCDemo1 jdbcDemo = new JDBCDemo1();
        jdbcDemo.check();
    }

    public void check() throws SQLException {
        System.out.println("What do you Want ?\n" + "Options : \n" + "1.Insery Data Into Student Table "
                + "\t 2.View Student Data \n" + "Enter Your Choice : ");
        Scanner sn = new Scanner(System.in);
        choice = sn.nextInt();

        if (choice == 1) {
            insertData();

        } else {
            displayData();
        }

    }

    private void connection(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, uname, password);

            if (choice == 1) {
                if (pstmt.executeUpdate() >= 0) {
                    System.out.println("Your Data Update Successfully");
                } else {
                    System.out.println("Error Occured During Inserting Data ");
                }
            } else {
                rs = stmt.executeQuery(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void connectionTerminate(Connection con, Statement stmt) throws SQLException {
        stmt.close();
        con.close();
    }

    public void displayData() throws SQLException {
        String query = "select * from student";
        connection(query);
        String userData = "";
        System.out.println("\t " + "\t\t Student Table ");
        System.out.println("\t \t\t" + "******************");
        System.out.println("SID" + "\t" + "SName" + " \t" + "SRollNO." + "      " + "SSection" + "\t" + "SCollege" + "\t" + "SAddress");
        System.out.println("--------------------------------------------------------------------------");
        while (rs.next()) {
            userData = (rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6));
            System.out.println(userData);
        }
        connectionTerminate(con, stmt);
    }

    private void insertData() throws SQLException {
        System.out.println("Enter Your Name :");
        String sName = sn.nextLine();
        System.out.println("Enter Your Roll NO. :");
        String sRollNO = sn.next();
        System.out.println("Enter Your Section :");
        String sSection = sn.next();
        System.out.println("Enter Your College Name :");
        String sCLZName = sn.next();
        System.out.println("Enter Your Address :");
        String sAddress = sn.next();
        String query = "INSERT INTO student VALUES(?,?,?,?,?)";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, sName);
        pstmt.setString(2, sRollNO);
        pstmt.setString(3, sSection);
        pstmt.setString(4, sCLZName);
        pstmt.setString(5, sAddress);
        connection(query);
        connectionTerminate(con, stmt);
    }

}
