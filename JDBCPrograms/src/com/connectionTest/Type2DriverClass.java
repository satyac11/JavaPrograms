package com.connectionTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Type2DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@xe", "SYSTEM", "admin");
			if(con==null)
				System.out.println("Connection not established........");
			else
				System.out.println("Connection created successfully.............");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
