/**
 * Development Process
 * 
 * 1. Get a connection to the database
 * 2. Create a Statement object
 * 3. Execute SQL query
 * 4. Process the result Set
 * 
 * Get the JDBC connector
 * Google and download mySql jdbc connector 
 *
 * Part 1: Getting Connection
 * Need a connection string in a form of JDBC URL
 * 
 * Basic Syntax
 *  ** jdbc:<driver protocol>:driver connection details
 *  
 *  
 *  Examples
 *  **MS SQL Server     jdbc:odbc:DemoDSN
 *  **Oracle 			jdbc:thin@myserver:1521:demoDB
 *  MySQL				jdbc:mysql://loclahost:3306/megaMindsDB
 *  
 *  
 *  
 *  Cofigure JDBC
 *  Add JDBC driver to classpath
 *  
 *  
 *  
 *  CRUD
 *  C: Create
 *  R: Read
 *  U: Update
 *  D: Delete
 *  
 *  
 *  
 *  Write vrs Read operations
 *  
 * Read Operations: Viewing, retrieval, fetching data state in not affected. 
 * State Change means the data/database is not modified in anyway
 * 
 *  Within CRUD only R performs a read operation
 *   
 * Write operations: when performed, will modify the state of the data/database.
 * Create- Insert Operation
 * Update- Modify existing data
 * Delete- Remove existing data
 * 
 * 
 * Nullipotent- calling the operation multiple time have no side-effects e.g Read
 * 
 * Idemopotent- the sate of the system is unchanged no matter how many times the same request is repeated. 
 * eg. Update, Delete, 
 * 
 * 
 * 
 * 
 *  
 *  
 *  
 *  
 *  
 * 
 */





/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
public class JDBC_1_GettingStarted 
{


}
