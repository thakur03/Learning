package com.ei.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManage {
	
	private static String url = "jdbc:mysql://localhost:3306/emp_data";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "root";
    private static Connection con;
    
    //creating static method for connection
    public static Connection getConnection() {
    	//loading a driver
        try {
            Class.forName(driverName);
            //get connection from data base
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
           
            System.out.println("Driver not found."); 
        }
        return con;
    }
}
