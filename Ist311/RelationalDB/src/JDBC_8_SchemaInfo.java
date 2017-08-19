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
public class JDBC_8_SchemaInfo
{

	/**
	 * @param args
	 */
	public static void mainREmoveMEEEEEEE(String[] args) throws SQLException
	{
		Connection myConn = null;
		ResultSet myRs = null;
		
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDBTran";
		String user = "root";
		String password = "1234";
			
		
		String catalog = null;
		String schemaPattern = null;
		String tableNamePattern = null;
		String columnNamePattern = null;
		String[] types = null;
		
		
		try
		{
		
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url,user,password);
			
			//2. Get metadata
			DatabaseMetaData databaseMetaData = myConn.getMetaData();
			
			//3. get list of tables
			System.out.println("List of Tables ");
			System.out.println("-------------- ");
			
			myRs = databaseMetaData.getTables(catalog, schemaPattern, tableNamePattern, types);
			
			while (myRs.next())
			{
				System.out.println(myRs.getString("TABLE_NAME"));		
				
			}
			
			//4. Get list of columns
			System.out.println("\n\nList of Columns ");
			System.out.println("-------------- ");
			
			
			myRs = databaseMetaData.getColumns(catalog, schemaPattern, "employees", columnNamePattern);
			
			while (myRs.next())
			{
				System.out.println(myRs.getString("COLUMN_NAME"));
				
			}
			
			
			
			
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			close(myConn,myRs);
		}

	}
	
	private static void close(Connection myConn, ResultSet myRs) throws SQLException
	{
		
		if( myRs!= null)
		{
			myRs.close();
		}
		
		if (myConn != null)
		{
			myConn.close();
		}
	}
	
	

}
