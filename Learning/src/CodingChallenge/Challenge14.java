package CodingChallenge;

public class Challenge14 {
	private int age;
	private String name;
	
public static void main(String[] args) {
//	private Access modifier: it can be applies only to the class members
	Challenge14 c=new Challenge14(12,"sam");
	System.out.println(c.getAge()+"\n"+c.name);
	
}

public Challenge14(int age, String name) {
	super();
	this.setAge(age);
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


}
