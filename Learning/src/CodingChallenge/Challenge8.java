package CodingChallenge;

public class Challenge8 {
public static void main(String[] args) {
//	this keyword
//	this is used to access both static functionality and non static functionaloity of object
//	it must be used only in non static context
	Challenge8 c=new Challenge8();
	c.Access();
}
public void Access() {
	this.m1();
    this.m2();
}
static void m1() {
	System.out.println("in m1");
}
void m2() {
	System.out.println("in m2");
}
}
//this keyword is use to access both static and non static methods of a class