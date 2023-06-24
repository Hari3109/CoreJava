package com.cg.oops.part6;

public class OverridingEx2 {
public static void main(String[] args) {
	Parent1 p= new Parent1();
	p.f1();
	Child1 c= new Child1();
	c.f1();
	c.f2();

	System.out.println("------");
	p.f1();
}
}
class Parent1{
	void f1(){
		System.out.println("i'm f1 from parent");
	}
}
class Child1 {
	void f1() {
		System.out.println("i'm f1 from Child1");
	}
	void f2() {
		System.out.println("i'm f2 from Child1");
	}
}