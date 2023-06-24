package com.cg.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortEx2 {
public static void main(String[] args) {
	Product p1 =new Product(101,"T Shirt",999.9f,4.5f);
	Product p2 =new Product(102,"Headset",1999.9f,4.2f);
    Product p3 =new Product(103,"Mobile",9999.4f,4.3f);
	Product p4 =new Product(104,"Smart watch",2999.9f,4.9f);
	ArrayList<Product> prodList= new ArrayList<Product>();
	prodList.add(p1);
	prodList.add(p2);
	prodList.add(p3);
	prodList.add(p4);
	for(Product p:prodList) {
		System.out.println(p);
	}
	 Collections.sort(prodList,new SortByRatings());
     System.out.println("----after sorting--");
     for(Product p:prodList) {
    	 System.out.println(p);
     }
     
     
}
}
