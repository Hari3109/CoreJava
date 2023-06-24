package com.cg.oops.part5;

public class SuperEx1 {
	public static void main(String[] args) {
		new Employee();
		System.out.println("--------");
		new Book();
	}

}

class Person{
	Person(){
		System.out.println("I m coming from person class constructor");
		
	}
}
class Employee extends Person{
	
}
class Product{
	Product(){
		System.out.println(" This is product default constructor");
	}
}
class Book extends Product{
	public Book() {
		System.out.println("this is book class default constructor");
	}
}