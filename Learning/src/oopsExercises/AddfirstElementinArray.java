package oopsExercises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AddfirstElementinArray {
public static void main(String[] args) {
	ArrayList<Integer>arr=new ArrayList<>();
	arr.add(34);
	arr.add(80);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element");
	int num=sc.nextInt();
	arr.add(0,num);
	System.out.println("updated ArrayList:"+arr);
	
	System.out.println(arr.indexOf(80));
	Collections.sort(arr);
	System.out.println("sorted array:"+arr);
	
}
}
