package com.miniProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Joining {
public static void getScore() {
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		
		
		
		 PreparedStatement ps = null;
		 PreparedStatement ps1 = null;
		 Connection connection1 = null;	
		connection1 = ConnectionTest.getConnectionDetails();
		try {
		
			String selectStatement = "select student.id, student.studentname, score.score, grade.grade from student Inner join score on student.id = score.id Inner join grade on student.id = grade.id where student.id ="+id+";";
			ps = connection1.prepareStatement(selectStatement);
			
			
			
			ResultSet rs1 = ps.executeQuery();
			ResultSetMetaData rsmd = rs1.getMetaData();
			
			int columnsNumber = rsmd.getColumnCount();
			
			boolean check = false;

		
            } catch (SQLException e) {
				
				e.printStackTrace();
			}
		}		
}
