package com.student.management.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
 
	static Connection con;
	public static Connection CreateCon() {
		try {
			
		//	Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","MySQL@priya123");
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		return con;
	}
	
	
}
