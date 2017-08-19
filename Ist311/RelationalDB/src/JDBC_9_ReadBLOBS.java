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

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_9_ReadBLOBS
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
		
		String url ="jdbc:mysql://localhost:3306/megaMindsDBBLOB";
		String user = "root";
		String password = "1234";
		InputStream input = null;
		FileOutputStream output = null;
		
		try
		{
		
			
			//1. Get Connection to database
			myConn = DriverManager.getConnection(url,user,password);
			
			
			//2. Execute Statement
			
			myStmt = myConn.createStatement();
			String sql = "select resume from employees where email='john.doe@foo.com'";
			String sqlPicute = "select resume from employees where email='mary.public@foo.com'";
			myRs = myStmt.executeQuery(sql);
			
			myRs = myStmt.executeQuery(sqlPicute);
		
			//3.Set a handle to the file
			File theFile = new File("syllabus_from_db.pdf");
			File thePicture = new File("photo_from_db.jpg");
			output = new FileOutputStream(theFile);
			output = new FileOutputStream(thePicture);
			
			if (myRs.next())
			{
				input =  myRs.getBinaryStream("resume");
				System.out.println("Reading resume from database");
				System.out.println("sql");
				
				byte[] buffer = new byte[1024];
				
				while(input.read(buffer) > 0 )
				{
					output.write(buffer);
				}
				
				System.out.println("\n Saved to file" +theFile.getAbsolutePath());
				
				System.out.println("Completed successfully");
				
			}
			
			
					
			
			
	
			
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
			if(output != null)
			{
				 output.close();
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
