package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entities.Student;

public class Studentdao {

	public void insertData(Student s) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into Student(id,name,city)values(?,?,?);");
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setString(3, s.getCity());

		int check = ps.executeUpdate();
		if (check > 0) {
			System.out.println("Data is inserted...");
		} else {
			System.err.println("Data is NOT inserted...");
		}

		c.close();
	}
	
	public void getallrecord() throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran?UseSSL=false","root","root");
		PreparedStatement s = c.prepareStatement("Select * from student;");
		 ResultSet rs=s.executeQuery();
		 
		 while(rs.next())
		 {
			 System.out.println("Student ID:"+rs.getInt(1)+"Student Nme:"+rs.getString(2)+"Student City:"+rs.getString(3));
			
			 
		 }
		 
		 c.close();	
		
			}
	
	
	public void updaterecord() throws Exception
	
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran?UseSSL=false","root","root");
		PreparedStatement s = c.prepareStatement("update from student set Name='aniket' where id=2;");
		s.executeUpdate();
		  
		System.out.println("Query executed");
		 
		 
		 c.close();
		 
	}
	
	public void deleterecord() throws Exception 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran?UseSSL=false","root","root");
		PreparedStatement s = c.prepareStatement("delete from student where id=3;");
		s.executeUpdate();
		  
		System.out.println("Query executed");
		 
		 
		 c.close();
	}
	

}