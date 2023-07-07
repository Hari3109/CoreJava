package codingPractice;

public class Swaping2numberwithoutThirdvariable {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("before swaping a is"+a+"b is "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping a is"+a+ "b is "+b);
}
}
