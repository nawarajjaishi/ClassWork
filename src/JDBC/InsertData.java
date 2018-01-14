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
public class InsertData {

    String dbUrl = "jdbc:mysql://localhost:3306/college";
    String dbUsername = "root";
    String dbPassword = "";
    Connection con;
    PreparedStatement pstmt;

    public static void main(String[] args) {
        new InsertData();
    }

    public InsertData() {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter Your First Name :");
        String firstName = sn.nextLine();
        System.out.println("Enter Your Last Name :");
        String lastName = sn.next();
        System.out.println("Enter User Name :");
        String userName = sn.next();
        System.out.println("Enter Password :");
        String password = sn.next();
        System.out.println("Enter Your Address :");
        String address = sn.next();
        System.out.println("Enter Your Phone Number :");
        String phoneNo = sn.next();
        
       String query = "INSERT INTO consumer values(?,?,?,?,?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);  
            pstmt = con.prepareStatement(query);
            
            pstmt.setInt(1,0);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setString(4, userName);            
            pstmt.setString(5, password);
            pstmt.setString(6, address);
            pstmt.setString(7, phoneNo);
            
            if(pstmt.executeUpdate()!=-1){
                System.out.println("Your Record Entered Into Database Successfuly");
            }else{
                System.out.println("Error Occured While Date Inserting Into Database !!!");
            }
             con.close();
            pstmt.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
