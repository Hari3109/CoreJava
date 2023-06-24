package com.cg.Collections;
import java.util.ArrayList;
public class ListEx1 {
public static void main(String[] args) {
	ArrayList<String>list1=new ArrayList<String>();
	list1.add("Biryani");
	list1.add("ice cream");
	System.out.println(list1);
	
	list1.add(0,"Maggie");
	System.out.println(list1);
	
	list1.remove(0);
	System.out.println(list1);
	
	String item=list1.get(1);
	System.out.println(item);
	//searching a item in the list
	
	boolean isFound=list1.contains("Biryani");
	System.out.println(isFound);
	
	isFound=list1.contains("Maggie");
	System.out.println(isFound);
	
	
	
}
}
