/**
 * 
 * What is a transaction?
 * 
 * A transaction is a unit of work
 * 
 * One or more sql statements executed together
 * 
 * - Either all of the statements are executed -- Commit
 * - Or None of the statements are executed  -- Rollback
 * 
 * The workflow
 * Start transaction(SQL INSERT, SQL UPDATE, SQL DELETEM SQL ....)
 * OK to SAVE?
 * Yes -- Commit to database
 * No -- Rollback to Trash
 * 
 * 
 * By default, the database connection is set to auto-commit 
 * - need to explicitly turn off auto-commit 
 * - myConn.setAutoCommit(false);
 * 
 * - in this case, the developer controls the commit and rollback
 * 
 * In today's class, we shall do the following transaction
 * 1. Delete all employess in HR
 * 2. Set the salaries to $300,000 for engineering
 * 
 * 
 * 
 */

import java.sql.*;
import java.util.Scanner;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_7_Transactions {

	/**
	 * @param args
	 */
	public static void MeRemoveMain(String[] args) throws SQLException 
	{
		

		Connection myConn = null;
		Statement myStmt = null;
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDBTran";
		String user = "root";
		String password = "1234";
		
		
		
		try
		{
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			myConn.setAutoCommit(false);
			
			//show salaries before
			System.out.println("salaries before \n");
			displaySalaires(myConn, "HR");
			displaySalaires(myConn, "Engineering");
			
			
			//Transaction Step 1: delete all HR Employees
			myStmt = myConn.createStatement();
			myStmt.executeUpdate("Delete from employees where department='HR'");
			
			
			//Transaction step 2: Set Salaries to 300000 for all engineering
			myStmt.executeUpdate("update employees set salary=300000 where department='Enginerring'");
			
			System.out.println("\n>> Transaction steps are ready. \n");
			
			//ask the user if it is OK to save
			boolean ok = askUserIfOkToSave(); //helper method
			
			
			if (ok)
			{
				//store in database
				myConn.commit();
				System.out.println("\n Transaction Commited ");
			}
			else
			{
				myConn.rollback();
				System.out.println("\n Transaction Rollbacked");
			}
			
			
			//Show salary after
			System.out.println("salaries before \n");
			displaySalaires(myConn, "HR");
			displaySalaires(myConn, "Engineering");
			
			
			
			
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		finally
		{
			close(myConn, myStmt, null);
		}
		
		
	}

	///Prompts the user. return true if they enter "yes" m false otherwise
	

	private static boolean askUserIfOkToSave() 
	{
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println(" is it ok to save? yes/no: ");
		String input = scanner.nextLine();
		
		scanner.close();
		
		return input.equalsIgnoreCase("yes");
		
	}

	
	

	private static void displaySalaires(Connection myConn, String department) throws SQLException
	{
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		System.out.println("Show Salaries for department: " + department);
		
		try
		{
			//Prepare Statement
			
			myStmt = myConn.prepareStatement("select * from employees where department=?");
			
			myStmt.setString(1, department);
			
			//Execute SQL query
			myRs = myStmt.executeQuery();
			
			//Process the result set
			while (myRs.next())
			{
				String lastName = myRs.getString("last_name");
				String firstName = myRs.getString("first_name");
				double salary = myRs.getDouble("salary");
				String myDepartment = myRs.getString("department");
				
				System.out.printf("%s, %s, %s, %.2f", lastName, firstName, myDepartment, salary );
				
				
				
			}
			
			System.out.println();
			
			
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			close(myStmt, myRs);
		}
		
		
	}
	
	private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException
	{
		
		if (myRs != null) 
		{
			
			myRs.close();
		}
		if (myStmt != null) 
		{
			
			myStmt.close();
		}
		if (myConn != null) 
		{
			
			myConn.close();
		}
		
		
		
	}
	
	private static void close(Statement myStmt, ResultSet myRs) throws SQLException
	{
		close(null, myStmt,myRs);
		
		
		
	}
	
	

}
