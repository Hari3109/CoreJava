package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterOutEvenOdd {
public static void main(String[] args) {
	List<Integer>num=Arrays.asList(23,67,45,78,90,78);
	System.out.println("numbers");
	for(int n:num) {
		System.out.println(n+ " ");
	}
	List<Integer> evenNumbers=num.stream()
			.filter(n->n%2==0)
			.collect(Collectors.toList());
	System.out.println("\nEvenNumbers");
	for(int i:evenNumbers) {
		System.out.println(i+ " ");
	}
}
}
