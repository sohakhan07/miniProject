package com.miniProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
static Connection con = null;
	
	public static Connection getConnectionDetails() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newmini","root","root");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			return con;
}
}
