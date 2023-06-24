package com.cg.Collections;

import java.util.Vector;

public class VectorEx1 {
public static void main(String[] args) {
	//Vector-->provides dynamic Array
	Vector<String> v1=new Vector<String>();
	System.out.println("Initial capacity is "+v1.capacity());
	//From jdk 1.7 no need to give Generic type in right side
	//instead use <> (diamond operator)
	//it creates a array of size4
	Vector<String>v2=new Vector<>(5);
	System.out.println("Initial capacity is "+v2.capacity());
	v2.add("Bangalore");
	v2.add("pune");
	System.out.println("no of ele "+v2.size());
	System.out.println(v2);
	v2.add("hari");
	v2.add("Chennai");
	v2.add("mumbai");
	v2.add("mysore");//creates a new array with the size of double &copy the content from old to new
	System.out.println(v2);
	System.out.println(v2.capacity());
	System.out.println(v2.size());
	for(String city:v2) {
		System.out.println("------"+city+"----");
	}
}
}
