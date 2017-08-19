/**
 * 
 */

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */

import java.sql.*;


public class JDBC_2_Connection 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException
	{
		
		
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try
		{
			
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/megaMindsDBtran","root" ,"1234" );
		
	
			//2. Create A statement
			myStmt = myConn.createStatement();
			
			//3. execute SQL Query
			myRs = myStmt.executeQuery("select * from employees");
			
			//4. process the result set
			while (myRs.next())
			{
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name") + ",  " +myRs.getString("email") + ", $" + myRs.getString("salary") );
			}
			
			
			
			
			
		} 
		catch (Exception exc) 
		{
			exc.printStackTrace();
			
		}
		
		finally 
		{
			
			if (myRs != null) 
			{
				myRs.close();
			}
			
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
