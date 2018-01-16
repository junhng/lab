import java.util.Date;

public class ProjectManager extends PermanentEmployee {
	
	public ProjectManager() {
		super();
	}

	public ProjectManager(int employeeId, String firstName, String lastName, double salary, String grade,
			Date joinDate) {
		super(employeeId, firstName, lastName, salary, grade, joinDate);
	}

	public double getCoverage() {
		return getSalary() * 12;
	}

	@Override
	public String toString() {
		return "ProjectManager [getCoverage()=" + getCoverage() + ", getSalaryDrawn()=" + getSalaryDrawn()
				+ ", getEmployeeId()=" + getEmployeeId() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade() + ", getJoinDate()="
				+ getJoinDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
