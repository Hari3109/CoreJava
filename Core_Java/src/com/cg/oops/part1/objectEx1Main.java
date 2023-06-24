package com.cg.oops.part1;

public class objectEx1Main {

	public static void main(String[] args) {
	Product p1=	new Product();
	p1.setProductId(101);
    p1.setProductName("T shirt");
    p1.setPrice(999.99f);
    
    System.out.println("Id is:" +p1.getProductId());
    System.out.println("P name is:" +p1.getProductName());
    System.out.println("Price is:" +p1.getPrice());
    p1.discount(1234);
    System.out.println("---after applying offer code---");
    System.out.println("price is:"+p1.getPrice());
    Product p2= new Product();
    p2.setProductId(102);
    p2.setProductName("mobile");
    p2.setPrice(10000);
    p2.discount(2345);
    System.out.println("---after applying offer code---");
    System.out.println("price is:"+p2.getPrice());
    

	}

}
