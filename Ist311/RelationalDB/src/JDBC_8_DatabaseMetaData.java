/**
 * 
 */
import java.sql.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_8_DatabaseMetaData
{

	/**
	 * @param args
	 */
	public static void removemain(String[] args) throws SQLException
	{
		
		Connection myConn = null;
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDBTran";
		String user = "root";
		String password = "1234";
			
		
		try
		{
		
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url,user,password);
			
			//2. Get metadata
			DatabaseMetaData databaseMetaData = myConn.getMetaData();
			
			//3. display info about database
			
			System.out.println("Product name: " + databaseMetaData.getDatabaseProductName());
			System.out.println("Product version: " + databaseMetaData.getDatabaseProductVersion());
			
			//display info about JDBC driver version
			System.out.println("JDBC driver name: " + databaseMetaData.getDriverName());
			System.out.println("JDBC driver version: " + databaseMetaData.getDriverVersion());
	
			
			
			
			
			
			
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			close(myConn);
		}

	}
	
	private static void close(Connection myConn) throws SQLException
	{
		if (myConn != null)
		{
			myConn.close();
		}
	}
	

}
