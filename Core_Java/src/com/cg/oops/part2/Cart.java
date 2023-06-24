package com.cg.oops.part2;

public class Cart {
private int cartId;
private Product products[];
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public Product[] getProducts() {
	return products;
}
public void setProducts(Product[] products) {
	this.products = products;
}
}