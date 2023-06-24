package com.cg.oops.part5;

public class StaticEx3 {
	public static void main(String[] args) {
		new GrandChild1();
	}

}
class GrandParent1{
	public GrandParent1() {
		System.out.println("i'm grand parent");
		
	}
}
class Parent1 extends GrandParent1{
	public Parent1() {
		System.out.println("i'm Parent");
	}
}
class Child1 extends Parent1{
	public Child1() {
		System.out.println("i'm Child1");
	
	}
}
class GrandChild1 extends Child1{
	public GrandChild1() {
		System.out.println("i'm GrandChild1");
	}
}