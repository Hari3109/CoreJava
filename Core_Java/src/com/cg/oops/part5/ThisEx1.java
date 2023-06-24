package com.cg.oops.part5;

public class ThisEx1 {
	public static void main(String[] args) {
		//new Derive();
		//System.out.println("-----");
		new Derive("Hello");
	}

}
class Base{
	public Base() {
		System.out.println("Base defualt constructor ");
	}
}
class Derive extends Base{
	Derive(){
		//this("Good Morning");
		System.out.println("Derive class is defualt");
	}
	Derive(String s){
		this();
		System.out.println("Derive class Paremeterized constructor "+s);
	}
}