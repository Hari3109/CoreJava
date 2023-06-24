package com.cg.oops.part3;

public class StaticEx1 {
	public static void main(String[] args) {
		Student.setCourseName("java");
		
		Student s1=new Student();
		s1.setStudId(101);
		s1.setStudName("Hari Priyanka");
		s1.setGrade(99.5f);
		
		Student s2=new Student();
		s2.setStudId(102);
		s2.setStudName("Harry");
		s2.setGrade(99.2f);
		
		System.out.println(s1.getStudName() + "scored" + s1.getGrade() + s1.getCourseName());
		System.out.println(s2.getStudName() + "scored" + s2.getGrade() + s2.getCourseName());
		s2.setCourseName("Cloud");
		System.out.println(s1.getCourseName());
	}

}
