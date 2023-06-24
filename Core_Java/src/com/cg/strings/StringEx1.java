package com.cg.strings;

public class StringEx1 {
	public static void main(String[] args) {
		String msg1="hello";
		String msg2="hello";//it wont create new String obj,instead it refers the existing obj
		
		//how to prove only one object is created?/?
		System.out.println(msg1==msg2);//chks memory location not the content...
		String msg3=new String("h");
		System.out.println(msg1==msg3);//false
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equals(msg2));
	}
	//Dummy 

}
class Dummy{
	Dummy(int a){
		
	}
}
