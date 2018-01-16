import java.util.Date;
public class Entry {
	public static void main(String[] args) {
		System.out.println(Employee.getNumberOfEmployees());
		Employee contract = new ContractEmployee(Employee.getNumberOfEmployees(), "a", "b", 10.5, "B", new Date(), 15.5);
		Employee projectMgr = new ProjectManager(Employee.getNumberOfEmployees(), "c", "d", 3000, "C", new Date());
		Employee technicalAssociate = new TechnicalAssociate(Employee.getNumberOfEmployees(), "e", "f", 3000, "D", new Date());
		System.out.println(Employee.getNumberOfEmployees());
		System.out.println(contract.toString());
		System.out.println(projectMgr.toString());
		System.out.println(technicalAssociate.toString());
	}
}
