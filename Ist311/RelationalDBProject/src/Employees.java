import java.math.BigDecimal;

public class Employees 
{

	private int id;
	private String lastName, firstName, email;
	private BigDecimal salary;
	
	
	public Employees()
	{
		
	}
	
	
	public Employees(int id, String lastName, String firstName, String email, BigDecimal salary)
	{
		super();
		
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.salary = salary;
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the salary
	 */
	public BigDecimal getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	
	public String toString()
	{
		return String
				.format("Employees [id=%s, lastName=%s, firstName=%s, email=%s, salary=%s]", id, lastName, firstName, email, salary);
	}
	
	
	
	
	
}
