package codingPractice;

import java.util.Arrays;

public class EqualityofTwoarrays {
public static void main(String[] args) {
	int a1[]= {3,5,67};
	int a2[]= {5,6,7};
	boolean status=Arrays.equals(a1,a2);
	if(status==true) {
		System.out.println("Arrays are equal");
	}
	else {
		System.out.println("not equal");
	}
	}
}
