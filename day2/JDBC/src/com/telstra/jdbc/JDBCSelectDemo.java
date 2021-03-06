package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/telstra";
		
		String username = "root";
		String password = "Abhijeet";
		String selectCommand = "Select * from Employee";
		
		int i=0;
		
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			cn = DriverManager.getConnection(url, username, password);
			st = cn.createStatement();
			
			rs = st.executeQuery(selectCommand);
			
			System.out.println("Records: ");
			while(rs.next()) {
				int eid = rs.getInt("empid");
				String ename = rs.getString("empname");
				String des = rs.getString("designation");
				
				System.out.println(eid+"  "+ename+"  "+des);
			}
			
			
//			System.out.println(i+" Updated details.. !!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	

	}

}
