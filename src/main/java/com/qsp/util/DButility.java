package com.qsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButility {
	static
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	}
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/logic","root","kumar$2406");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return con;
		
	}
	public static void closeconnection(Connection con)
	{
		if(con!=null)
		{
			try {
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
				
	}



}
