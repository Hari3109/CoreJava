package Abstract;

public class AbstractEmp {
public static void main(String[] args) {
	perEmp e1=new perEmp(101,"A",5000,10000,40000);
	ContractEmp e2=new ContractEmp(102,"H",6000,6);
	Employee emps[]= {e1,e2};
	for(Employee e:emps) {
		e.calculateSal();
	}
}
}
