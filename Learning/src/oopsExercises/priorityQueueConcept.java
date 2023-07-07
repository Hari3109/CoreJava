package oopsExercises;
import java.util.*;
public class priorityQueueConcept {
public static void main(String[] args) {
	PriorityQueue<String>s=new PriorityQueue<String>();
	s.add("hehe");
	s.add("haha");
	s.add("hehehe");
	s.add("hahhahaa");
	System.out.println(s);
	s.offer("hari");
	System.out.println(s);
	System.out.println(s.size());
	 List<String> array_list = new ArrayList<String>(s);
	   System.out.println("Array containing all of the elements in the queue: "+array_list);
	    
}
}
