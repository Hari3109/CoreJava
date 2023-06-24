package LabBook4;

public class AutoGenerateEmpId {
public static void main(String[] args) {
	Employee e1= new Employee("A", "Bangalore");
 	Employee e2= new Employee("B", "Chennai");
	Employee e3= new Employee("C", "Hyderabad");
	Employee e4= new Employee("D", "Pune");
	Employee e5= new Employee();
	e5.setEmpName("E");
	e5.setAddress("Mumbai");
	System.out.println(e1.getEmpId()+"\t"+e1.getEmpName()+"\t"+e1.getAddress());
	System.out.println(e2.getEmpId()+"\t"+e2.getEmpName()+"\t"+e2.getAddress());
	System.out.println(e3.getEmpId()+"\t"+e3.getEmpName()+"\t"+e3.getAddress());
	System.out.println(e4.getEmpId()+"\t"+e4.getEmpName()+"\t"+e4.getAddress());
	System.out.println(e5.getEmpId()+"\t"+e5.getEmpName()+"\t"+e5.getAddress());

}
}
class Employee{
	private static int counter=0;
	private int empId;
	private String empName;
	private String Address;
	{//instance block-->goes to all constructors while compiling
		this.empId=++counter;
	}
	public Employee() {
		
	}
	
	public Employee(String empName, String address) {
		super();
		this.empName = empName;
		Address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	
}