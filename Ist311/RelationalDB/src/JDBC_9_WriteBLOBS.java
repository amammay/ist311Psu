/**
 *
 *
 * what is a BLOB?
 * A BLOB(binary large object) is basically binary data that we store in the database
 * You normally use BLOBs to keep track of documents, images, audio, or any other binary object that you have
 * Note that not all databases have support for BLOBs
 * In this example, we are goin to make use of MySQL and it has BLOB support 
 *
 *
 *
 *
 */
import java.sql.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_9_WriteBLOBS
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void removemain(String[] args) throws Exception
	{

		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDBBLOB";
		String user = "root";
		String password = "1234";
		FileInputStream input = null;
		
		try
		{
		
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url,user,password);
			
			
			//2. Prepared Statement
			
			String sql = "update employees set resume=? where email='john.doe@foo.com'";
			myStmt = myConn.prepareStatement(sql);
			
			
			String sqlImage = "update employees set resume=? where email='mary.public@foo.com'";
			myStmt = myConn.prepareStatement(sqlImage);
			
			
			//3.Set the parameters
			
			File theFile = new File("syllabus.pdf"); //handle the local file
			input = new FileInputStream(theFile);
			myStmt.setBinaryStream(1, input); // update the db with binary data
			System.out.println("Reading input file: " + theFile.getAbsolutePath());
			
			
			File theImage = new File("photo.jpg"); //handle the local file
			input = new FileInputStream(theImage);
			myStmt.setBinaryStream(1, input); // update the db with binary data
			
			System.out.println("Reading Image file: " + theImage.getAbsolutePath());
			
			//4. execute statement
			System.out.println("\n\n Storing resume in database: "+ theFile);
			System.out.println("sql");
			
			System.out.println("\n\n Storing resume in database: "+ theImage);
			
			myStmt.executeUpdate();
			System.out.println("\n Completed successfully");
			
	
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			
			if (input != null)
			{
				input.close();
			}
			
			close(myConn, myStmt);
			
			
			
		}

	}
	
	
	private static void close(Connection myConn, Statement myStmt) throws SQLException
	{
		
		if( myStmt!= null)
		{
			myStmt.close();
		}
		
		if (myConn != null)
		{
			myConn.close();
		}
	}

}
