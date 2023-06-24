package Abstract;

public class perEmp extends Employee {
private float pf;
private float hra;
private float basicSal;
private float totalSal;

	

public perEmp(int empId, String empName, float pf, float hra, float basicSal) {
	super(empId, empName);
	this.pf = pf;
	this.hra = hra;
	this.basicSal = basicSal;
}

void calculateSal(){
	totalSal=pf+hra+basicSal+totalSal; 
	System.out.println("Calculated peremp salary is:"+totalSal);
}
}
