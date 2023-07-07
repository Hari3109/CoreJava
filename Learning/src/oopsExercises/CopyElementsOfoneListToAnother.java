package oopsExercises;
import java.util.*;
public class CopyElementsOfoneListToAnother {
public static void main(String[] args) {
	ArrayList<Integer>l1=new ArrayList<Integer>();
	
	l1.add(8);
	l1.add(6);
	l1.add(7);
	System.out.println("List 1:"+l1);
List<Integer>l2=new ArrayList<Integer>();
	
	l2.add(6);
	l2.add(5);
	l2.add(2);
	System.out.println("List 2:"+l2);
	Collections.copy(l1,l2);
	System.out.println("Copy List to List2,\n After copy:");
	System.out.println("List1"+l1);
	System.out.println("list2"+l2);
	Collections.shuffle(l2);
	Collections.reverse(l1);
	List<Integer> sublist=l1.subList(0, 1);
	System.out.println(sublist);
	 ArrayList<Integer> l3 = new ArrayList<Integer>();
//	 for(int e:l1) {
//		 l3.add(l2.contains(e)? "yes":"no");
//		 
//	 }
//	
	 l1.trimToSize();
     System.out.println(l1);
}
}
