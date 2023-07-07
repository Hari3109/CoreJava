import java.util.Scanner;

public class prime {
 public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=scanner.nextInt();
	boolean isprime=isNumberPrime(number);
	if(isprime) {
		System.out.println(number+ "Number is prime");
	}else {
		System.out.println(number+ "Number is not prime");
	}
	scanner.close();
}

private static boolean isNumberPrime(int number) {
	if(number<1) {
		return false;
	}
	for(int i=2;i<number;i++) {
		if(number%i==0) {
			return false;
		}
//		}else {
//			return true;
//		}
		
	}
	return true;
}
 
}
