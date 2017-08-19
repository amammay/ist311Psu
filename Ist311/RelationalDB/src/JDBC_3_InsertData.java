/**
 * 
 */

//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_3_InsertData 
{

	public static void RemoveMemain(String[] args) throws SQLException 
	{
		
		String url = "jdbc:mysql://localhost:3306/megaMindsDB";
		String user = "root";
		String password = "1234";
		String query = "insert into employees " 
				+ " (last_name, first_name, email, department, salary)"
				+ "values ('Kumar', 'Ashu', 'ashu.kumar@megaminds.com', 'Legal', '200000.05')";
		
		String query2 = "insert into employees " 
				+ " (last_name, first_name, email, department, salary)"
				+ "values ('Mammay', 'Alex', 'alex.mammay@megaminds.com', 'Legal', '123456.15')";
		String query3 = "insert into employees " 
				+ " (last_name, first_name, email, department, salary)"
				+ "values ('McStay', 'Evan', 'evan.mcstay@megaminds.com', 'Legal', '654321.15')";
		
		Connection myConn = null;
		Statement myStmt = null;
		
		
		
		try 
		{
			
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url, user, password);
			
			
			//2. Create a statement
			myStmt = myConn.createStatement();
			
			//3. Execute SQL query 
			myStmt.executeUpdate(query2);
			System.out.println("Insert complete");
			myStmt.executeUpdate(query3);
			System.out.println("Insert complete");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
		
			if(myStmt != null)
			{
				myStmt.close();
				
			}
			
			if(myConn != null)
			{
				myConn.close();
			}
			
			
		}
		
		
		
		

	}

}
