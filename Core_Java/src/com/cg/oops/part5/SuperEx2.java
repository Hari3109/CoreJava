package com.cg.oops.part5;

public class SuperEx2 {
	public static void main(String[] args) {
		new Child();
	}

}
class Parent{
	Parent(String s){
		System.out.println("i'm parent"+ s);
	}
	Parent(){
		System.out.println("i'm parent");
	}
}
class Child extends Parent{
	Child(){
		//super("Hari");
		// to make this work 
		//1. to create a super("") explicilty
		//2.we can create a default constructor in parent
		
		
	}
	
}
