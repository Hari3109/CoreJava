package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmpRecord {
public static void main(String[] args) {
	System.out.println("******Adding new employee****");
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter emp Id");
	int eid=scanner.nextInt();
	System.out.println("Enter emp name");
	String empName=scanner.next();
	System.out.println("Enter emp email");
	String empEmail=scanner.next();
	System.out.println("Enter dept id");
	int deptId=scanner.nextInt();
	Connection c=DBConnection.getConnection();
	String sql="insert into employee values(?,?,?,?)";
	try {
		PreparedStatement pstmt=c.prepareStatement(sql);
		pstmt.setInt(1,eid);
		pstmt.setString(2,empName);
		pstmt.setString(3, empEmail);
		pstmt.setInt(4, deptId);
		int n=pstmt.executeUpdate(); //here the query is fired in DB....
		System.out.println(n+" no of rows affected ....");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
