package codingPractice;

public class fibonacciSeries {
public static void main(String[] args) {
//	a series of numbers in which each number is sum of two precedding numbers
//	int num[]= {1,4,9,8,9};
//	int sum=0;
//	for(int element:num) {
//		sum+=element;
//		
//	}
	int n1=1,n2=2,sum=0;
	System.out.println(n1+" "+n2);
	for(int i=2;i<10;i++) {
		sum=n1+n2;
		System.out.println(" " +sum);
		n1=n2;
		n2=sum;
		
	}
	
}
}
