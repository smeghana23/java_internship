package com.pace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadData  {
	Connection conn;
	Statement stmt;
	ResultSet rset;
	PreparedStatement pstmt;
	Scanner scnr = new Scanner(System.in);
	
	public void registerDriver() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	
	public void getDetails() throws Exception {
		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306", "root","Charan@16");
		
		stmt  = conn.createStatement();//returns statement object and assigned to statement interface
		
//		int row = stmt.executeUpdate(
//				"insert into book values(2222, 'MyBook', 'MySelf', 543.23)");

		int id;
		String name, author;
		float price;
		System.out.println("Enter the book id");
		id = scnr.nextInt();
		System.out.println("Enter book name");
		name = scnr.next();
		System.out.println("Enter book author");
		author = scnr.next();
		System.out.println("Enter book price");
		price = scnr.nextFloat();
		
		//stmt = conn.createStatement();
		pstmt = conn.prepareStatement("insert into book values(?,?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, author);
		pstmt.setFloat(4, price);
		pstmt.executeUpdate();
		
//		int row2 = stmt.executeUpdate(
//				"insert into book values("+id+", '"+name+"', '"+author+"', "+price+")");

		rset = stmt.executeQuery(
				"select * from book");//returns resultset object and assigned to reference of resultset
		
		while (rset.next()) {
			
			System.out.print(rset.getInt(1));//to get the book id
			System.out.print("\t" + rset.getString(2));//to get the bookname
			System.out.println("\t" + rset.getString(3));//to get the author
			System.out.println("\t" + rset.getFloat(4));//to get the price
			
		}
		
		rset.close();
		stmt.close();
		conn.close();
		pstmt.close();
		
	}
	//result set object has next method it returns true if there are rows in the object 
	
	
	
}
