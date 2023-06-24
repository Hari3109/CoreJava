package com.cg.oops.part5;

public class Task1 {
	public static void main(String[] args) {
		Student s1=new Student(101,"aaa",90,89,78,80);
		System.out.println(s1.getStudentId() +"student name is:"  +s1.getStudentName());
		s1.calculateTotal();
		s1.calculateAverage();
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());
		
		}
}
