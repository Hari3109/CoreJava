package Abstract;

public abstract class Employee {
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
abstract void calculateSal();
}
