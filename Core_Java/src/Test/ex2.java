package Test;

public class ex2 {
public static void main(String[] args) {
	try {
	int arr[]=new int[5];
	//int x=5;
	int r=arr[5]/arr[4];
	System.out.println(r);
	}catch(ArithmeticException e) {
		System.out.println("cat1");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("cat2");
	}
}
}
