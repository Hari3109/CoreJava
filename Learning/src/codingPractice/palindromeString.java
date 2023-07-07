package codingPractice;

import java.util.Scanner;

public class palindromeString {
public static void main(String[] args) {
	Scanner c=new Scanner(System.in);
	System.out.println("enter String:");
	String str=c.next();
	String orstr=str;
	String rev="";
	for(int i=str.length()-1; i>=0; i--) {
		rev =rev+str.charAt(i);
	}
	if (orstr.equals(rev)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}
