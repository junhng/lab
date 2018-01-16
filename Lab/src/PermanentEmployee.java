import java.util.Date;

public abstract class PermanentEmployee extends Employee {
	
	public PermanentEmployee() {
		super();
	}
	public PermanentEmployee(int employeeId, String firstName, String lastName, double salary, String grade,
			Date joinDate) {
		super(employeeId, firstName, lastName, salary, grade, joinDate);
	}
	public double getSalaryDrawn() {
		return getSalary();
	}
	public abstract double getCoverage();
}
