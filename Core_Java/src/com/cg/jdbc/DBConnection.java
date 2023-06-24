package com.cg.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	public static void main(String[] args) {
		getConnection();
	}

	static Connection getConnection() {
		Connection con=null;
		try {
			//Loading the Driver..
			Class.forName("com.mysql.jdbc.Driver");
			//sample url:http://google.com:80
			//jdbc->protocal
			//postgresql->sub protocol
			
			String url="jdbc:mysql://localhost:3306/cg_aws_jan";
			String uname="root";
			String pwd="Hari@1309";
			con=DriverManager.getConnection(url,uname,pwd);
			System.out.println("Connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	}


