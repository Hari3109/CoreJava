package CodingChallenge;

import java.util.Scanner;

public class Challenge3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int x=sc.nextInt();
	if(x%2!=0) {
		System.out.println("Hello");
	}else {
		if(x>=0&& x<=10) {
			System.out.println("hi");
		}if(x>=10&& x<=20 ) {
			System.out.println("hello");
		}else {
			System.out.println("Bye");
		}
	}
	
}
}
