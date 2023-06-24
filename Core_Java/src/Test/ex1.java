package Test;

public class ex1 {
public static void main(String[] args) {
	try {
		int arr[]= {1,2,3,4};
		int x=5;
		arr[5]=x/0;//assignment operator works from right to left
		System.out.println(arr[5]);
	}catch(ArithmeticException e) {
		System.out.println("catch1");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("catch 2");
	}
}
}
