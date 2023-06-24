package com.cg.Exception;

public class FinallyEx1 extends Exception {
public static void main(String[] args) {
	try {
		System.out.println("in ");
		System.out.println(5/0);
		System.out.println("end");
	}
	finally {
		System.out.println("in finally");
	}
	System.out.println("end of main");
}
}
