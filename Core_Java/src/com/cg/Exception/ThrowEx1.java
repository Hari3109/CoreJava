package com.cg.Exception;

import java.util.Scanner;

public class ThrowEx1 {
public static void main(String[] args) {
	float balance=1000;
	//Scanner class used to take input from user
	Scanner scanner =new Scanner(System.in);
	System.out.println("*** welcome to canara bank***");
	System.out.println("Enter the amt");
	float amt=scanner.nextFloat();
	if(amt>balance) {
		//throw new ArithmeticException();
		try {
		throw new InSufficientException();
		}
		catch(Exception e) {
			System.out.println("insufficient balance");
			e.printStackTrace();
		}
	}
	else
	{
		balance=balance-amt;
		System.out.println("transaction Success");
		System.out.println("your available balance is"+balance);
	}
}
}
