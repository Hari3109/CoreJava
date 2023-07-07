package oopsExercises;
import java.util.*;

public class HashSetConcept {
public static void main(String[] args) {
	HashSet<String>h=new HashSet<String>();
	h.add("king");
	h.add("queen");
	h.add("hari");
	System.out.println(h);
	
	System.out.println(h.isEmpty());
	String[] arr=new String[h.size()];
	h.toArray(arr);
	for(String ele:arr) {
	System.out.println(ele);
	}
}
}
