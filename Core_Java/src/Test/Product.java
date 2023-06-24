package Test;

public class Product {
private int prodId;
private String prodName;
private float price;
public Product(int prodId, String prodName, float price) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
}
void print() {
	System.out.println("product id is"+prodId);
	System.out.println("Product name is "+prodName);
	System.out.println("Product price is "+price);
}
}
