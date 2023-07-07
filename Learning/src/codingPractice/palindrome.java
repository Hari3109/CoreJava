package codingPractice;
import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a number:");
	int number=scanner.nextInt();
	
//	int number=12321;
	boolean ispalindrome=isNumberPalindrome(number);
	if(ispalindrome) {
		System.out.println(number+ " is palindrome");
	}else {
		System.out.println(number+ " is not a palindrome");
	}
	scanner.close();
}

private static boolean isNumberPalindrome(int number) {
	int originalnumber=number;
	int reversednumber=0;
	while(number!=0) {
		int digit=number%10;
		reversednumber=reversednumber*10+digit;
		number/=10;
	}
	
	return originalnumber==reversednumber;
}
}
