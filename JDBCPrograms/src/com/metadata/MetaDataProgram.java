package com.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MetaDataProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			DatabaseMetaData dbData = con.getMetaData();
			
			System.out.println(dbData.getDatabaseProductName());
			System.out.println(dbData.getDatabaseProductVersion());
			System.out.println(dbData.getDriverName());
			System.out.println(dbData.getURL());
			System.out.println(dbData.getUserName());
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
