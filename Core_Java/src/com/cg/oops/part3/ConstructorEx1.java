package com.cg.oops.part3;

public class ConstructorEx1 {
	public static void main(String[] args) {
		new Employee();
		new person();
		new Customer("Hari Priyanka");
		new Cust();
		new Cust("Harry");
		
	}
	

}
class Employee{
	
}
class person{
	person(){
		System.out.println("person class default constructor");
	}
}
class Customer{
	Customer(String name){
		System.out.println("Customer instalised:"+name);
	
	}
}
class Cust{
	Cust(){
		System.out.println("Default constuctor of cust");
	}
	Cust(String name){
		System.out.println("paramerterized constructor "+name);
	}
}