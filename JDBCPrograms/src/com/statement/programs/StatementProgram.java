package com.statement.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementProgram {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stm = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "system";
		String password = "admin";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userName, password);
			stm = con.createStatement();
			//Inserting Records
			/*String insertQuery = "insert into Employee values('ravi',26,40000)";
			int records = stm.executeUpdate(insertQuery);
			System.out.println("No of records inserted: "+records);*/
			
			//Updating data 
			String updateQuery = "update Employee set esal=41000 where ename='ravi'";
			int recordsupdated = stm.executeUpdate(updateQuery);
			System.out.println("No of records updated: "+recordsupdated);
			
			//Delete records 
			String deleteQuery ="delete from Employee where ename='ravi'";
			int deletedRecords = stm.executeUpdate(deleteQuery);
			System.out.println("No of records deleted: "+deletedRecords);
			
			ResultSet resultset = stm.executeQuery("select * from Employee");
			ResultSetMetaData rsmdata = resultset.getMetaData();
			rsmdata.getColumnCount();
			while (resultset.next()) {
				System.out.println("Employee Name: " + resultset.getString(1) + " Employee Age:" + resultset.getInt(2)
						+ " Employee Sal: " + resultset.getFloat(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.close();
			stm.close();
		}

	}

}
