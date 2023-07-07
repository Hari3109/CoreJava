package codingPractice;

public class MaxAndMinofArray {
public static void main(String[] args) {
	int a[]= {50,80,70,90};
	int max=a[0];
	for(int ele :a) {
		if(ele>max) {
			max=ele;
		}
	}
	System.out.println(max);
	int min=a[0];
	for(int k:a) {
		if(k<min) {
			min=k;
		}
	}
	System.out.println(min);
}
}
