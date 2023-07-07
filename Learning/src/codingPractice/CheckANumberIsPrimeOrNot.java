package codingPractice;

import java.util.Scanner;

public class CheckANumberIsPrimeOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num");
	int num=sc.nextInt();
	int count=0;
	if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%1==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime");
		}
	}else {
		System.out.println("not a palindrome");
	}
}
}
