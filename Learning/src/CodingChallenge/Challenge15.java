package CodingChallenge;
class A{
	void m() {
		System.out.println("rain");
	}
}
class be extends A{
	void m() {
		System.out.println("cry");
	}
}

public class Challenge15 {
public static void main(String[] args) {
//	method overriding-Defining a method in the child class of same name and same signature as the same as parent class
	be n=new be();
	n.m();
	
}
}
