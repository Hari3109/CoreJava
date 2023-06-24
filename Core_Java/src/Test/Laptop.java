package Test;

public class Laptop extends Product {
	private String os;
	private String ram;
	public Laptop(int prodId, String prodName, float price, String os, String ram) {
		super(prodId, prodName, price);
		this.os = os;
		this.ram = ram;
	}
void print() {
	super.print();
	System.out.println(os);
	System.out.println(ram);
}
	

}
