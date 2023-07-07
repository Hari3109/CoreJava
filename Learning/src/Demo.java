import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	List<Integer> num=new ArrayList<Integer>();
	num.add(8);
	num.add(5);
	num.add(56);
	num.add(5);
	System.out.println(num.get(1));
	System.out.println(num.indexOf(5));
	System.out.println(num.isEmpty());
	
	for(int e:num) {
		System.out.println(e);
	}
}
}
