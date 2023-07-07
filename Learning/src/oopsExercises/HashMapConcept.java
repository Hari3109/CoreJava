package oopsExercises;
import java.util.*;
public class HashMapConcept {
public static void main(String[] args) {
	HashMap<Integer,String>h=new HashMap<Integer,String>();
	h.put(1, "red");
	h.put(2, "blue");
	h.put(3," black");
	System.out.println(h);
	for(Map.Entry x:h.entrySet()) {
		System.out.println(x);
	}
	System.out.println(h.size());
	 HashMap <Integer,String> h2 = new HashMap <Integer,String> ();
	h2.put(4, "White");
	  h2.put(5, "Blue");
	  h2.put(6, "Orange");
	  h2.putAll(h);
	  System.out.println(h2);
	  h.remove(3);
	  System.out.println(h);
	  HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
	   new_hash_map = (HashMap)h.clone();     
	   System.out.println("Cloned map: " + new_hash_map);        
	     
	  
}
}
