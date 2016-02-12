package com.mata.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/data";

	private static  Connection conn = null;
	private static Statement stmt = null;
	private static final String USER = "root";
	private static final String PASS = "root";
	
	public static Connection getConnection() throws ClassNotFoundException{
		
	      try {
	    	  Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	      
	      return conn;
	}
	
	public static void closeConnection(Connection con){
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			}
		
		
		
	}
	
	
	
	
}
