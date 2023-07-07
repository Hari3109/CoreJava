package CodingChallenge;

import java.util.ArrayList;
class array{
	protected static void removeRange(ArrayList<Integer>a,int fromIndex,int toindex) {
		a.subList(fromIndex, toindex).clear();
	}
}
public class Challenge18 extends array{
public static void main(String[] args) {
//	ArrayList- it allows duplicates
//	store the elements dynamically
//	add():it used to append an element to the arraylist
	ArrayList<Integer>a=new ArrayList<>();
	for(int i=1;i<=10;i++) {
		int x=i*10;
		a.add(x);
	}
	removeRange(a,2,6);
	int sum=0;
	for(int ele:a) {
		
		sum+=ele;
		
	}
	System.out.println("sum of ele:"+sum);
}

}
