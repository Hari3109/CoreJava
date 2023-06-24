package Practice;

public class Employee {
String empName;
String empId;
int salary;
public Employee(String empName,String empId,int salary) {
	super();
	this.empName=empName;
	this.empId=empId;
	this.salary=salary;
}
}
class EmployeeDetails{
	public Employee getEmployeeInfo(String str) {
		String empName=str.substring(0,str.indexOf("ID"));
		String empId=str.substring(str.indexOf("ID")+2,str.indexOf("DT"));
		String strSal=str.substring(str.indexOf("CTC")+3,str.indexOf("L"));
		int sal=Integer.parseInt(strSal)*100000;
		return new Employee(empName,empId,sal);
	}
	public Employee getEmployeeTaxSlab(Employee e) {
		String rtnValue="None";
		if(e.salary>1000000) {
			rtnValue="High";
		}else if(e.salary>800000&&e.salary<1000000) {
			rtnValue="mediun";
		}else(e.salary>500000&&e.salary<800000){
			rtnValue="low";
		}
		return rtnValue;	
	}
}
