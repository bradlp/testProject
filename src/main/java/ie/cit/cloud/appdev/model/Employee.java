package ie.cit.cloud.appdev.model;
/**
 * EmployeeContoller
 * 
 * @author paul bradley
 */
public class Employee {

	private String firstName;
	private String lastName;

	private int employeeId;
	private String department;

	private int phoneExtn;
	private int salary;
	private String jobTitle;
	
	public Employee() {
		// empty constructor to enable instantiation via reflection API
	}

	public Employee(String firstName, String lastName, int id) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmployeeId(id);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getPhoneExtn() {
		return phoneExtn;
	}

	public void setPhoneExtn(int phoneExtn) {
		this.phoneExtn = phoneExtn;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
}
