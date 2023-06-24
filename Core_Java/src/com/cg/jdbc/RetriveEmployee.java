package com.cg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveEmployee {
public static void main(String[] args) {
	Connection c=DBConnection.getConnection();
	String sql="select * from employee";
	try {
		PreparedStatement pstm=c.prepareStatement(sql);
		ResultSet rs=pstm.executeQuery();
		while(rs.next()) {
		int eid=rs.getInt("empId");
		String name=rs.getString("empname");
		String email=rs.getString("email");
		int deptid=rs.getInt("deptid");
		System.out.println(eid+"\t"+name+"\t"+email+" "+deptid);
		}
	}
		catch(SQLException e){
			e.printStackTrace();
			
		}
		/*finally {
			try {
			//	c.close();
			
		}
			catch(SQLException e) {
			e.printStackTrace();
		}*/
	}
}


