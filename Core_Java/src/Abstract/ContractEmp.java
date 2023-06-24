package Abstract;

public class ContractEmp extends Employee{
private float wages;
private float noOfWorkingDays;
private float totalSal;

public ContractEmp(int empId, String empName, float wages, float noOfWorkingDays) {
	super(empId, empName);
	this.wages = wages;
	this.noOfWorkingDays = noOfWorkingDays;
}

void calculateSal() {
	totalSal=wages*noOfWorkingDays;
	System.out.println("contract emp salary is:"+totalSal);
}

}
