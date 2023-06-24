package com.cg.oops.part6;

public class OverridingEx4 {
	public static void main(String[] args) {
		Parent3 p=new Child3();
		p.hello();
		p.wish();//it replace 'p' with the class name internally
	}
}
class Parent3{
	void hello() {
		System.out.println("Have a great day");
		
	}
	static void wish() {
		System.out.println("happy");
		
	}
}
class Child3 extends Parent3{
	public void hello() {
		System.out.println("wonderful");
		
	}
	//it is not a overriding..
	// it is method hiding!!!
	 static void wish() {
		System.out.println("year");
		
	}
}

