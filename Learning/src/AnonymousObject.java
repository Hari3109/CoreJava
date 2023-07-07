class A1{
	public A1() {
		System.out.println("obj created");
	}
	public void show() {
		System.out.println("show created");
	}
}
public class AnonymousObject {
public static void main(String[] args) {
//	A obj=new A();
//	we thought the above line itself creates an object
//	but the value new A();
//	this itself create an object without any reference
	new A1().show();// anonymous object
}
}
