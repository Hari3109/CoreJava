package com.cg.Lamdas;

import java.util.ArrayList;

import com.cg.Collections.Product;

public class StreamEx1 {
	public static void main(String[] args) {
		Product p1 = new Product(104,"Mobile",15000.99f,4.2f);
		Product p2 = new Product(105,"Laptop",60000,4.4f);
		Product p3 = new Product(103,"Smart Watch",4500.99f,4.6f);
		Product p4 =  new Product(101,"T Shirt",999.99f,4.5f);
		Product p5 =  new Product(102,"Head phones",3999.99f,4.1f);
		ArrayList<Product> prodList= new ArrayList<Product>();
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		prodList.stream().filter(p->p.getRatings()>=4.1)
		.forEach(p->System.out.println(p.getProductName()));
		prodList.stream().filter(p->p.getPrice()>=4000)
		.forEach(p->System.out.println(p.getPrice()));
		Product costliestProduct=prodList.stream().max( (p1,p2)->p1.getPrice()<p2.getPrice()?-1:1);
		System.out.println();
}
}