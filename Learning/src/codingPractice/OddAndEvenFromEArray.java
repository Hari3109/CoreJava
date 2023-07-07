package codingPractice;

public class OddAndEvenFromEArray {
public static void main(String[] args) {
	int a[]= {1,3,5,6};
	for(int ele:a) {
		if(ele%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
}
