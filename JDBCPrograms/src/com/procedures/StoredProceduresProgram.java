package com.procedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProceduresProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con= null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String userName="SYSTEM";
		String password ="admin";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userName, password);
			CallableStatement cstmt = con.prepareCall("{call emp_pro(?,?,?)}");
			cstmt.registerOutParameter(2, Types.NUMERIC);
			cstmt.registerOutParameter(3, Types.FLOAT);
			
			cstmt.setString(1, "satya");			
			cstmt.executeQuery();
			
			System.out.println("emp name is : satya and emp age is:"+cstmt.getInt(2)+" and salaray is: "+cstmt.getFloat(3));
			cstmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
