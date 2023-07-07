
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {
//it supports unique values
	public static void main(String[] args) {
		Set<Integer> num=new HashSet<Integer>();
		num.add(5);
		num.add(5);
		num.add(3);
		num.add(6);
		Iterator<Integer> values=num.iterator();
//		it does not follow the sequence it doesn't give the value in sorted format
		while(values.hasNext())
		System.out.println(values.next());
//		in treeset we will get the sorted values
	}
}
