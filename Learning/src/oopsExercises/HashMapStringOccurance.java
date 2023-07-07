package oopsExercises;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapStringOccurance {
public static void main(String[] args) {
	HashMap<Integer,String>s=new HashMap<Integer,String>();
	s.put(1, "today");
	s.put(2, "is");
	s.put(3, "4th");
	s.put(4, "day");
	s.put(5, "of");
	s.put(6, "the ");
	s.put(7, "week");
	s.put(8, "today");
	s.put(9, "is");
	s.put(10, "wonderful");
	s.put(11, "day");
	System.out.println(s);
	for(Entry<Integer,String>ele:s.entrySet()) {
		String word=ele.getValue();
		if(s.containsValue(word)) {
			int count=ele.getKey();
			count++;
			System.out.println(word+"  "+count);
		}
	}
}
}
