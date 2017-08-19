import java.util.*;
import java.sql.*;
import java.io.*;
import java.math.BigDecimal;

public class EmployeeDAO 
{

	private Connection myConn;
	
	public EmployeeDAO() throws Exception
	{
		//get db properties
		Properties props = new Properties();
		props.load(new FileInputStream("demo.properties"));
		
		//2. Read the props
		String theUser = props.getProperty("user");
		String thePass = props.getProperty("password");
		String theUrl = props.getProperty("dburl");
		
		
		//3. get a connection
		myConn = DriverManager.getConnection(theUrl, theUser, thePass);
		
		System.out.println("DB Connection successful to:" + theUrl);
		
			
	}
	
	public List<Employees> getAllEmployees() throws Exception
	{
		List<Employees> list = new ArrayList<>();
		
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
		try{
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery("select * from employees");
			
			
			while(myRs.next())
			{
				Employees tempEmployee = convertRowToEmployees(myRs);
				list.add(tempEmployee);
				
			}
			return list;
			
			
					
		}
		finally
		{
			close(myStmt, myRs);
		}
				
		
		
	}
	
	
	
	public List<Employees> searchEmployees(String lastName) throws Exception
	{
		List<Employees> list = new ArrayList<>();
		
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		
		try
		{
			lastName += "%";
			myStmt = myConn.prepareStatement("select * from employees where last_name like ?");
			
			myStmt.setString(1, lastName);
			myRs = myStmt.executeQuery();
			
			while(myRs.next())
			{
				Employees tempEmployee = convertRowToEmployees(myRs);
				list.add(tempEmployee);
			}
			return list;
			
		}
		finally
		{
			close (myStmt, myRs);
		}
		
				
	}
	
	
	

	private Employees convertRowToEmployees(ResultSet myRs) throws SQLException
	{
		int id = myRs.getInt("id");
		String lastName = myRs.getString("last_name");
		String firstName = myRs.getString("first_name");
		String email = myRs.getString("email");
		BigDecimal salary = myRs.getBigDecimal("salary");
		
		Employees tempEmployee = new Employees(id, lastName, firstName, email, salary);
		
		
		
		
		
		return tempEmployee;
		
		
	}
	
	
	private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException
	{
		
		if(myRs != null)
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
	
	public static void main (String[] args) throws Exception
	{
		EmployeeDAO dao = new EmployeeDAO();
		System.out.println(dao.searchEmployees("thom"));
		System.out.println(dao.getAllEmployees());
	}
	
	
	
	
}
