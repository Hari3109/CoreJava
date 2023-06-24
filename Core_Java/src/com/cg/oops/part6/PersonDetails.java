package com.cg.oops.part6;

public class PersonDetails {
	public static void main(String[] args) {
		System.out.println("Person Details");
		
		System.out.println("-------------");
		Persondetils p=new Persondetils();
		p.setFirstName("Divya");
		p.setLastName("Bharathi");
		p.setGender("F");
		p.setAge(20);
		p.setWeight(85.55);
		System.out.println("First Name:"+p.getFirstName());
		System.out.println("Last Name:"+p.getLastName());
		System.out.println("Gender:"+p.getGender());
		System.out.println("Age:"+p.getAge());
		System.out.println("Weight:"+p.getAge());
	}

}
