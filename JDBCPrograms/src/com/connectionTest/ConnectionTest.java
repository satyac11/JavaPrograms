package com.connectionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver ="sun.jdbc.odbc.JdbcOdbcDriver";
		String url ="jdbc:odbc:odsn";
		String userName ="SYSTEM";
		String password="admin";
		//odsn is user data source name
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, userName, password);
			//Statement statementObj = connection.createStatement();
			if(connection == null)
				System.out.println("Connection not established..........");
			else
				System.out.println("Connection established successfully.........");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
