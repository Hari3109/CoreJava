package Test;

public class ShoppingCartApp {
	public static void main(String[] args) {
		Book book=new Book(101,"Two States",499.99f,"Chetan Bhagat","Love Story");
		Laptop laptop= new Laptop(102,"Dell Laptop",65000,"windows11","16GB");
		Product myCart[]= {book,laptop};
		for(Product p:myCart) {
			p.print();
			System.out.println("--------");
		}
		}

}
