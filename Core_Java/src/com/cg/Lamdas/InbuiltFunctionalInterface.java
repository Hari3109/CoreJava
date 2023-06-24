package com.cg.Lamdas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.cg.Collections.Product;
public class InbuiltFunctionalInterface {
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
		System.out.println(prodList);
		prodList.removeIf(new PredicateImpl());
		System.out.println("----after removing-------");
		System.out.println(prodList);
		prodList.removeIf((Product p)->p.getPrice()>50000);
		/*for(Product p:prodList) {
			System.out.println("----"+p+"----");
		}*/
		//prodList.forEach(new ConsumerImp1());
		prodList.forEach((Product p)->System.out.println(p));
		//Collections.sort(prodList,(pr1,pr2)->pr1.getRatings<pr2.getRatings()?1:-1);
	}
	}
class CcnsumerImp1 implements Consumer<Product>{
	public void accept(Product p) {
		System.out.println(p);
	}
}
class PredicateImpl implements Predicate<Product>{
public boolean test(Product p) {
	//System.out.println(p);
		return p.getPrice()>50000;
	}
}