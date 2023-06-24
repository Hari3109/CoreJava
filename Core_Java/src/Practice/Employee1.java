package Practice;

public class Employee1 {
String name;
int takenLeave;
int totalLeave;
public Employee1(String name,int takenLeave,int totalLeave) {
	super();
	this.name=name;
	this.takenLeave=takenLeave;
	this.totalLeave=totalLeave;
}
}
class Portal{
	public String submitLeave(Employee1 data,int days)throws Exception{
		if(days>5) {
			throw new MaximumLimitException("max 5 days are allowed ");
		}else if((days+data.takenLeave)>=data.totalLeave) {
			throw new MaximumLimitException("no Leaves are left ");
		}else {
			data.takenLeave=data.takenLeave+days;
			return "leave Submitted succesfully";
		}
	}
}
class MaximumLimitException extends Exception{
	public MaximumLimitException(String s) {
		super(s);
	}
}
