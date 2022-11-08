package com.miniProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreInDatabase {
	static PreparedStatement ps = null;
	static Connection connection1 = null;
	
	
	public static void storeMarks(int marks) {
		
		connection1 = ConnectionTest.getConnectionDetails();
		try {
			ps = connection1.prepareStatement("insert into score(score) values(?)");
		
			ps.setInt(1, marks);
			ps.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void storeUserName(String name) {
		
		try {
			connection1 = ConnectionTest.getConnectionDetails();
			
			ps = connection1.prepareStatement("insert into student(studentname) values(?)");
			
			ps.setString(1, name);
			
			ps.execute();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	
		
	}


}
