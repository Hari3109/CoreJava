package com.cg.oops.part1;

public class Product {
private int productId;
private String productName;
private float price;

	public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public String getProductName() {
	return productName;
}


public void setProductName(String productName) {
	this.productName = productName;
}


public float getPrice() {
	return price;
}


public void setPrice(float price) {
	this.price = price;
}


//instance method/ behavior
void discount(int offerCode) {
	if(offerCode==2345)
		this.price=this.price-1000;
	}

}
