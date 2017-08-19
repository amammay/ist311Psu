
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
public class JDBC_5_DeleteData 
{

	/**
	 * @param args
	 */
	public static void RemoveMemain(String[] args) throws SQLException
	{
	
		
		Connection myConn = null;
		Statement myStmt = null;
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDB";
		String user = "root";
		String password = "1234";
		
		try 
		{
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			
			myStmt = myConn.createStatement();
			
			
			//3. execute sql 
			
			
			//add
//			String query = "insert into employees " 
//					+ " (last_name, first_name, email, department, salary)"
//					+ "values ('Brown', 'Ashu', 'ashu.kumar@megaminds.com', 'MIS', '200000.05')";
//			
//			String query2 = "insert into employees " 
//					+ " (last_name, first_name, email, department, salary)"
//					+ "values ('Brown', 'Alex', 'alex.mammay@megaminds.com', 'Engineer', '123456.15')";
//			String query3 = "insert into employees " 
//					+ " (last_name, first_name, email, department, salary)"
//					+ "values ('Brown', 'Evan', 'evan.mcstay@megaminds.com', 'janitor', '654321.15')";
//			
//			
//			
//			
//			myStmt.executeUpdate(query);
//			System.out.println("Update Complete");
//			
//			myStmt.executeUpdate(query2);
//			System.out.println("Update Complete");
//			
//			myStmt.executeUpdate(query3);
//			System.out.println("Update Complete");
	
			
			//delete 
			String sql = "delete from employees where id='27'";
			int rowsAffected = myStmt.executeUpdate(sql);
			
			System.out.println("Rows affected: "+ rowsAffected);
			System.out.println("\n Delete Complete");
			
			
			
			
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			
			
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
