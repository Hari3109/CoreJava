package com.cg.oops.part6;

public class SuperEx4 {
	public static void main(String[] args) {
		Parent p= new Parent();
		p.f1();
		Child c= new Child();
		c.f1();
		GrandChild g= new GrandChild();
		g.f1();
		System.out.println("------");
		p.f1();
		c.f1();
		g.f1();
	}
}
class Parent{
	void f1() {
		System.out.println("i'm parent");
	}
	
}
class Child{
	void f1() {
		System.out.println("i'm Child");
	}
	
}
class GrandChild{
	void f1() {
		System.out.println("i'm GrandChild");
	}
}