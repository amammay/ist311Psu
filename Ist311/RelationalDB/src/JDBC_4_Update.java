/**
 * 
 */
import java.sql.*;
/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_4_Update 
{	
	/**
	 * @param args
	 */
	public static void mainRemoveMeLater(String[] args) throws SQLException
	{
 
		Connection myConn = null;
		Statement myStmt = null;
		
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDB";
		String user = "root";
		String password = "1234";
		
		try
		{
			
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url, user, password );
		
	
			//2. Create A statement
			myStmt = myConn.createStatement();
			
			
			
			
			//Execute SQL query
			String sql = "update employees set email='b.brown@megaminds.com' where id=8";
			
			//update email of employee
			//update first name of employee
			//update department of employee
			
			
			String sqlEmail = "update employees set email='d.williams@foo.com' where id=4";
			String sqlFirstName = "update employees set first_name='John' where id=14";
			String sqlDepartment = "update employees set department='Janitor' where id=12";
			
			
			
			
			
			
			
			int rowsAffected = myStmt.executeUpdate(sqlEmail)+ myStmt.executeUpdate(sqlFirstName) + myStmt.executeUpdate(sqlDepartment);
			
			System.out.println("Rows affected: "+ rowsAffected);
			
			System.out.println("\nUpdate Complete");
			
			
			
			
			
		} 
		catch (Exception exc) 
		{
			exc.printStackTrace();
			
		}
		
		finally 
		{
			
			
			if(myStmt !=null)
			{
				myStmt.close();	
			}
			
			if(myConn !=null)
			{
				myConn.close();	
			}
			
			
		}
		
		
		

	}

}
