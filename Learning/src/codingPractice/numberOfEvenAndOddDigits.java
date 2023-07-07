package codingPractice;

import java.util.Scanner;

public class numberOfEvenAndOddDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num:");
	int num=sc.nextInt();
	int eCou=0;
	int oCou=0;
	while(num>0) {
		 int re=num%10;
		if(re%2==0) {
			eCou++;
		}else {
			oCou++;
		}
		num=num/10;
	}
	System.out.println("even numbers"+eCou);
	System.out.println("odd numbers"+oCou);
}
}
