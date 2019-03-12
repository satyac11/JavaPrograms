package com.statement.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementProgram {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		PreparedStatement prestm = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "admin";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userName, password);
			
			/*//Inserting Records
			String insertQuery = "insert into Employee values(?,?,?)";
			prestm = con.prepareStatement(insertQuery);
			prestm.setString(1, "ravi");
			prestm.setInt(2, 26);
			prestm.setFloat(3, 41000);
			int records = prestm.executeUpdate();
			System.out.println("No of records inserted: "+records);*/
			
			/*String insertQuery = "insert into Employee values('ravi',26,40000)";
			int records = stm.executeUpdate(insertQuery);
			System.out.println("No of records inserted: "+records);*/
			
			//Updating data 
			String updateQuery = "update Employee set esal=? where ename=?";
			prestm = con.prepareStatement(updateQuery);
			ParameterMetaData parData = prestm.getParameterMetaData();
			prestm.setFloat(1, 42000);
			prestm.setString(2, "ravi");
			int recordsupdated = prestm.executeUpdate();
			System.out.println("No of records updated: "+recordsupdated);
			
			/*//Delete records 
			String deleteQuery ="delete from Employee where ename='ravi'";
			int deletedRecords = stm.executeUpdate(deleteQuery);
			System.out.println("No of records deleted: "+deletedRecords);*/
			/*String sql = "select * from Employee";
			prestm = con.prepareStatement(sql);
			ResultSet resultset = prestm.executeQuery();
			while (resultset.next()) {
				System.out.println("Employee Name: " + resultset.getString(1) + " Employee Age:" + resultset.getInt(2)
						+ " Employee Sal: " + resultset.getFloat(3));
			}*/
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.close();
			prestm.close();
		}

	
	}

}
