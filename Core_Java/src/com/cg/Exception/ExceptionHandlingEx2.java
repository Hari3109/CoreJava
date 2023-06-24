package com.cg.Exception;

public class ExceptionHandlingEx2 {
public static void main(String[] args) {
	System.out.println("Welcome");
	int x=5;
	int y=2;
	int z=3;
	try {
		int nums[]= {1,2,3,4,5};
		System.out.println(nums[4]);
	int result=(x*y)/(x-y-z);
	System.out.println("Result:"+result);
	System.out.println("End----"); 
	}
	/*catch(RuntimeException e) {
		System.out.println("catch 3");
	}*/
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("in catch---"+e.getMessage());
		e.printStackTrace();
	}
	catch(ArithmeticException e) {
		System.out.println("in catch 2");
	}
	catch(RuntimeException e) {
		System.out.println("catch 3");
	}
	System.out.println("ended----");
}
}
