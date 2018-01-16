import java.util.Date;

public abstract class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	private Date joinDate;
	private static int numberOfEmployees = 0; {
		numberOfEmployees++;
	}
	
	public Employee() {
	}
	public Employee(int employeeId, String firstName, String lastName, double salary, String grade, Date joinDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.joinDate = joinDate;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public abstract double getSalaryDrawn();
	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}
}
