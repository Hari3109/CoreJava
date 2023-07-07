package codingPractice;

import java.util.Scanner;

public class ReverseANumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
//	logic using algorithm
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
//		System.out.println("Reverse number is:"+rev);
	}
	System.out.println("Reverse number is:"+rev);
//	using stringbuffer class method
	StringBuffer s=new StringBuffer(String.valueOf(num));
	StringBuffer re=s.reverse();
	System.out.println(re);
	
	
}
}
