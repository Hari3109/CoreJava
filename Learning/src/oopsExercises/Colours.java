package oopsExercises;
import java.util.ArrayList;
import java.util.Iterator;

public class Colours {
public static void main(String[] args) {
	ArrayList<String>colour=new ArrayList<>();
	colour.add("red");
	colour.add("blue");
	System.out.println(colour);
	
//	for(String ele:colour) {
//		System.out.println(ele);
//	}
	Iterator<String> u=colour.iterator();
	 while (u.hasNext()) {
         String ele = u.next();
         System.out.println(ele);
     }
}
}
