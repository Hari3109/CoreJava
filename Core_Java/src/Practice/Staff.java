package Practice;

public class Staff {
String name;
String ssn;
String dept;
int salary;
public Staff(String name,String ssn,String dept,int salary) {
	super();
	this.name=name;
	this.ssn=ssn;
	this.dept=dept;
	this.salary=salary;
}
public String toString() {
	return "Staff[name="+name+",ssn="+ssn+",dept="+dept+",salary="+salary+"]";
}
}
class StaffImplementation{
	Staff getStaffInfo(String str) {
		String name= str.substring(0,str.indexOf('@'));
		String ssn=str.substring(str.indexOf('@')+1,str.indexOf('-'));
		String dept=str.substring(str.indexOf('-')+1,str.indexOf('#'));
		String sal=str.substring(str.indexOf('#'));
		int salary=Integer.parseInt(sal);
	
	return new Staff(name,ssn,dept,salary);
}
String getStaffLevel(Staff s) {
	String rtnValue="";
	String last3Chars=s.ssn.substring(s.ssn.length()-3);
	int ssnLast3Digits=Integer.parseInt(last3Chars);
	if(ssnLast3Digits>=1&&ssnLast3Digits<60) {
		rtnValue="L1";
	}else if(ssnLast3Digits>60&&ssnLast3Digits<120) {
		rtnValue="L2";
	}
	else if(ssnLast3Digits>120&&ssnLast3Digits<180) {
		rtnValue="L3";
	}
	else if(ssnLast3Digits>180) {
		rtnValue="L4";
	}
	return rtnValue;
}
}