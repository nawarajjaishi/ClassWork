/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;

/**
 *
 * @author Jaction76
 */
public class Table {

    String dbUrl = "jdbc:mysql://localhost:3306/college";
    String dbUsername = "root";
    String dbPassword = "";
    Connection con;
    Statement stmt;
    ResultSet rs;
    

    public static void main(String[] args) {
        Table tb = new Table();
        tb.createTable();

    }

    private void createTable() {  
        String query=" CREATE TABLE consumer"
                + "(id int(5) AUTO_INCREMENT PRIMARY KEY,"
                + "firstName varchar(30),"
                + "lastName varchar(30),"
                + "userName varchar(30),"
                + "password varchar(30),"
                + "address varchar(50),"
                + "phoneNo varchar(30)"
                + ")";        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            stmt= con.createStatement();
            int result = stmt.executeUpdate(query);
            if(result!=-1){
                System.out.println("Table Create sucessful");
            }else{
                System.out.println("Syntex Error!!!");
            }
            con.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
