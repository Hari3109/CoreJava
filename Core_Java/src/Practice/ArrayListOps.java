package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOps {
public ArrayList<Integer>makeArrayList(int n){
	ArrayList<Integer>list=new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		list.add(0);
	}
	return list;
	
}
public ArrayList<Integer> reverseList(ArrayList<Integer> list){
	Collections.reverse(list);
	return list;
}
public ArrayList<Integer>changeList(ArrayList<Integer> list,int m, int n){
	ArrayList<Integer>list1=new ArrayList<Integer>();
	for(Integer i: list) {
		if(i==m) {
			list1.add(n);
		}else {
			list.add(i);
		}
	}
	return list1;
}


}
