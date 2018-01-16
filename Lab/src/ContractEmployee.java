import java.util.Date;

public class ContractEmployee extends Employee {
	private double numOfHoursWorked;
	
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int employeeId, String firstName, String lastName, double salary, String grade,
			Date joinDate, double numOfHOursWorked) {
		super(employeeId, firstName, lastName, salary, grade, joinDate);
		setNumOfHoursWorked(numOfHOursWorked);
	}
	
	public double getNumOfHoursWorked() {
		return numOfHoursWorked;
	}
	public void setNumOfHoursWorked(double numOfHoursWorked) {
		this.numOfHoursWorked = numOfHoursWorked;
	}
	
	public double getSalaryDrawn() {
		return getSalary() * getNumOfHoursWorked();
	}
	@Override
	public String toString() {
		return "ContractEmployee [numOfHoursWorked=" + numOfHoursWorked + ", getNumOfHoursWorked()="
				+ getNumOfHoursWorked() + ", getSalaryDrawn()=" + getSalaryDrawn() + ", getEmployeeId()="
				+ getEmployeeId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade() + ", getJoinDate()=" + getJoinDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
