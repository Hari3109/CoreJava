package com.cg.oops.part7;

public class TypeCastingEx {
public static void main(String[] args) {
	Person p=new Employee();
	p.info();
	//p.getEmpDetails();
	//A child reference is to refer parent class ref need type casting
	Employee e =(Employee)p;
	e.info();
	e.getEmpDetails();
}
}
class Person{
	void info() {
		System.out.println("Person info");
	}
}
class Employee extends Person{
	void info() {
		System.out.println("Employee info");
	}
	void getEmpDetails() {
		System.out.println("Getting all details of emp....");
	}
}