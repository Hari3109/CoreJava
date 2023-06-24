package Test;

public class Book extends Product {
private String authour;
private String genre;
public Book(int prodId, String prodName, float price, String authour, String genre) {
	super(prodId, prodName,price);
	this.authour = authour;
	this.genre = genre;

}
void print(){
super.print();
System.out.println(authour);
System.out.println(genre);
System.out.println("==========");
}

}
