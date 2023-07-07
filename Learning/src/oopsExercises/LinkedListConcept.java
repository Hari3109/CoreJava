package oopsExercises;
import java.util.*;
public class LinkedListConcept {
public static void main(String[] args) {
	LinkedList<Integer>l=new LinkedList<Integer>();
	l.add(23);
	l.add(76);
	l.add(87);
	l.add(76);
	System.out.println(l);
	ListIterator<Integer> p=l.listIterator();
	while(p.hasNext()) {
		System.out.println(p.next());
	}
	Iterator<Integer> e=l.descendingIterator();
	while(e.hasNext()) {
		System.out.println(e.next());
	}
	for(int i=0;i<l.size();i++) {
		System.out.println("elements at index"+i+":"+l.get(i));
		l.removeFirst();
		l.removeLast();
		
	}
}

}
