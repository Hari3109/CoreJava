package com.cg.oops.part4;

public class PolymorphismEx1 {
	public static void main(String[] args) {
		/*Person p1=new Customer();
		Person p2=new Student();
		p1.info();
		p2.info();*/
		Customer c1=new Customer();
		Student s1=new Student();
		Person persons[]= {c1,s1};
		
		for(int i=0;i<persons.length;i++) {
			persons[i].info();
			System.out.println("----------");
		}
		System.out.println("-----for each loop--------");
		String names[]= {"Divya","Kiranmayi","Ramya","Mounika","Akshita"};
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println("----------------------------");
		for(Person p:persons) {
			p.info();
		}
	}
		
	}
class Person{
	void info() {
		System.out.println("i'm Person");
	}
}
class Customer extends Person{
	void info() {
		System.out.println("i'm customer");
	}
}
class Student extends Person{
	void info() {
		System.out.println("i'm Student");
	}
}
	
