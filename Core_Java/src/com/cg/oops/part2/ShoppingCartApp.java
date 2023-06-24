package com.cg.oops.part2;

public class ShoppingCartApp {
public static void main(String[] args) {
	Product p1=new Product();
	p1.setProdId(10001);
	p1.setProdName("Lunch Box");
	
	Product p2=new Product();
	p2.setProdId(1002);
	p2.setProdName("Realme Mobile");
	
	
	Product products[]= {p1,p2};
	Cart myCart= new Cart();
	myCart.setCartId(1);
	myCart.setProducts(products);
	
	Customer c1= new Customer();
	c1.setCustId(101);
	c1.setCustName("Arun");
	c1.setEmail("arun@xyz.com");
	c1.setCart(myCart);
	
	System.out.println("Customer name is "+c1.getCustName());
	System.out.println("Email is "+c1.getEmail());
	System.out.println("Products : "+c1.getCart());
	Cart cart=c1.getCart();
	System.out.println(cart.getCartId());
	System.out.println(cart.getProducts());
	Product myProducts[]=cart.getProducts();
	System.out.println("My Cart items ");
	for(int i=0;i<myProducts.length;i++) {
		System.out.println(myProducts[i].getProdName());
	}
}
}

