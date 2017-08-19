import java.sql.*;
import java.util.concurrent.ForkJoinPool;


/**What is a prepared Statement  **/
//Ans: A prepared Statement is precompiled SQL statement

/**Prepared Statements provide the following benefits **/
//1.: They make it easier to set SQL parameters
//2. They prevent against SQL dependency injection attack
//3. They may improve application performance since the SQL statement is precompiled


/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_6_PreparedStatement 
{


	
	/**
	 * @param args
	 */
	public static void meremovemain(String[] args) throws SQLException
	{
		
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		PreparedStatement myStmtRetrieve = null;
		PreparedStatement deleteStatement = null;
		ResultSet myRs = null;
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDB";
		String user = "root";
		String password = "1234";
		
		
		try 
		{
		
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url,user,password);
			
			//2. Prepare statement
			myStmt =  myConn.prepareStatement("select * from employees where salary > ? and department =?");
			
			myStmtRetrieve = myConn.prepareStatement("select * from employees where salary > ? and email=?");
			
			
			
			
			
			//use a question mark for the placeholder 
			
			//3. Set the parameters
			//The parameter values are set based on their data types and position
			myStmt.setDouble(1, 80000);
			myStmt.setString(2, "Legal");
			
			//4. Execute sql query
			myRs = myStmt.executeQuery();
			
			//5. Display the result set
			display(myRs);
			
			/**
			 * Reuse the prepared statement: salary > 250000, department = HR
			 * 
			 * 
			 */
			
			System.out.println("\n\nreuse the prepared statement: ");
			
			//6. Set the parameters
			myStmt.setDouble(1, 25000);
			myStmt.setString(2, "HR");
			
			//7. execute the SQL query
			myRs = myStmt.executeQuery();
			
			//8. display the result set
			display(myRs);
			
			
			System.out.println("\n\n resue the prepared statement");
			
			//set parameters
			myStmt.setDouble(1, 50000);
			myStmt.setString(2, "Janitor");
			
			//execute the sql quer
			myRs = myStmt.executeQuery();
			//display the result set
			display(myRs);
			
			
			//parameters based on salary and email address, retrieval based operation
			//parameters
			System.out.println("\n\nchaning things up");
			myStmtRetrieve.setDouble(1, 74000);
			myStmtRetrieve.setString(2, "mary.public@foo.com");
			//execute
			myRs = myStmtRetrieve.executeQuery();
			//display 
			display(myRs);
			
			//parameters
			myStmtRetrieve.setDouble(1, 74000);
			myStmtRetrieve.setString(2, "susan.queue@foo.com");
			//execute
			myRs = myStmtRetrieve.executeQuery();
			//display 
			display(myRs);
			
			
			
			/**
			 * use the prepared statement to delete a record
			 */
			System.out.println("\n\n use prepared statement for delete");
			
			
			//2. prepare statement
			deleteStatement =  myConn.prepareStatement("delete from employees " + "where salary > ? and department=?");
			
			//6. set parameters
			
			deleteStatement.setDouble(1, 80000);
			deleteStatement.setString(2, "Legal");
			
			//7. execute sql query
			int rowsAffected = deleteStatement.executeUpdate();
			
			//8. display result set
			System.out.println("Number of rows Affected:" + rowsAffected);
			
			
			
			
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(myRs !=null)
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
	
	public static void display(ResultSet myRs) throws SQLException
	{
		
		while (myRs.next()) 
		{
			String lastName = myRs.getString("last_name");
			String firstname = myRs.getString("first_name");
			double salary = myRs.getDouble("salary");
			String department = myRs.getString("department");
			String email = myRs.getString("email");
			
			System.out.printf("%s, %s, %.2f, %s, %s\n", lastName, firstname, salary, department, email);
			
			
		}
		
		
	}
	
	

}
