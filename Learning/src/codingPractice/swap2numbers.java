package codingPractice;

public class swap2numbers {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	//logic 1- third variable
		int temp=a;
		a=b;
		b=temp;
	System.out.println("After swapping  "+a+" "+b);
	//logic 2-using +and -
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("  "+a+" "+b );
	//logic 3 - multiplication and division values
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("+"+a+" "+b);
	//logic 4-bitwise xor(^)
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("+"+a+" "+b);
//	logic 5-by using single statement
	b=a+b-(a=b);
	System.out.println("+"+a+" "+b);
}
}
