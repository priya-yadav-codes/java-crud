package com.student.management.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
 
	
	public static boolean insertStudent(Student st) throws SQLException {
		
		boolean f = false;
		
		Connection con = CP.CreateCon();
		
		String sql = "insert into students(sname,sphone,scity) values(?,?,?);";
		
		
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1,st.getName());
		pstm.setString(2,st.getPhone());
		pstm.setString(3,st.getCity());
		
		
		pstm.executeUpdate();
		f=true;
		
		return f;
	}
	
	
	public static boolean deleteStudent(int sid) throws SQLException {
		
		boolean f = false;
		
		Connection con = CP.CreateCon();
		
		String sql = "delete from students where sid=?";
		
		
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1,sid);
		 
		
		pstm.executeUpdate();
		f=true;
		
		return f;
	}
	
	
	public static boolean  displayAll() throws SQLException {
		
		boolean f = false;
		
		Connection con = CP.CreateCon();
		
		String sql = "select * from students";
		
		
		Statement stm = con.createStatement();
		 
		ResultSet res = stm.executeQuery(sql);
		
		while(res.next()) {
			 
			int id = res.getInt(1);
			String name = res.getString(2);
			String phone = res.getString(3);
			String city =  res.getString(4);
			
			System.out.println("Id:"+id+" Name:"+name+" Phone:"+phone+" City:"+city);
			System.out.println("-------------------------------------------------");
		}
		
		 
		f=true;
		
		return f;
	}
	
	
	public static boolean updateStudent(Student st) throws SQLException {
		
		boolean f = false;
		 
		Connection con = CP.CreateCon();
		
		String sql = "update students set sname=? , sphone=? , scity=? where sid=?";
		
		
		PreparedStatement pstm = con.prepareStatement(sql);
	     
		 pstm.setString(1, st.getName());
		 pstm.setString(2, st.getPhone());
		 pstm.setString(3, st.getCity());
		 pstm.setInt(4, st.getId());
		
		
		pstm.executeUpdate();
		f=true;
		
		return f;
	}
	
	
}
