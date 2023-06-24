package com.cg;

public class DataTypeEx1 {
	
	public static void main(String[] args) {
		
		byte rollNo=127;
		System.out.println("RollNo is "+rollNo);
		
		final int x=99;
		System.out.println("X is"+x);
		
		byte y=x;
		System.out.println(y);
		
		float price=100;
		System.out.println(price);
		float totalPrice=100.0f;
		System.out.println(totalPrice);
		
		int i=10;
		int j=10;
		System.out.println(i==j);
		System.out.println(i>j);
		
		boolean s= i!=j;
		System.out.println(i!=j);
		
		
	}

}
