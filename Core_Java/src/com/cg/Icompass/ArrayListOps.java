package com.cg.Icompass;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOps {
public ArrayList<Integer>makeArrayListInt(int n){
	ArrayList<Integer>list=new ArrayList<>();
	for(int i=0;i<n;i++) {
		list.add(0);
	}
	return list;
}
public ArrayList<Integer>reverseList(ArrayList<Integer>list){
	Collections.reverse(list);
	return list;
}
public ArrayList<Integer>changeList(ArrayList<Integer>list,int m,int n){
	ArrayList<Integer>list1=new ArrayList<Integer>();
	for(Integer i:list) {
		if(i==m) {
			list1.add(n);
		}
		else {
			list1.add(i);
		}
		return list1;
	}
}
}
