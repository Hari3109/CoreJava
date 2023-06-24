package com.cg.Exception;

public class FinallyEx2 {
public static void main(String[] args) {
	try {
		System.out.println("in ");
		System.out.println(5/0);
		System.out.println("end");
	}
	catch(NullPointerException e) {
		System.out.println("in catch");
	}
	finally {
		System.out.println("in finally");
	}
	System.out.println("end of main");
}
}

