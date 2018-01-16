import java.util.Date;

public class TechnicalAssociate extends PermanentEmployee {
	public TechnicalAssociate() {
		super();
	}

	public TechnicalAssociate(int employeeId, String firstName, String lastName, double salary, String grade,
			Date joinDate) {
		super(employeeId, firstName, lastName, salary, grade, joinDate);
	}

	public double getCoverage() {
		return 2 * getSalary() * 12;
	}

	@Override
	public String toString() {
		return "TechnicalAssociate [getCoverage()=" + getCoverage() + ", getSalaryDrawn()=" + getSalaryDrawn()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade() + ", getJoinDate()="
				+ getJoinDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
