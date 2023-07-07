
class mobile{
	String brand;
	int price;
	String Network;
	static String model;
	static{
		model="phone";
		System.out.println("in static block");
	}

	
	public mobile() {
		super();
        brand="";
        price=200;
		System.out.println("in constructor");
	}

	public void Show() {
		System.out.println(brand+" "+price+" "+model);
	}
}
public class StaticKeywordConcept {
public static void main(String[] args) throws ClassNotFoundException {
//	mobile m= new mobile();
//	m.brand = "IPhone";
//	m.price = 1500;
//	m.model="Smart Phone";
//	mobile n= new mobile();
//	n.brand = "Samsung";
//	n.price = 1700;
//	mobile.model="Smart Phone";
//	m.Show();
//    n.Show();
//    Static variables can be called with the help of class name we can call with obj also but it gives warning in the above case
//    static variables are common things like in above case model is same for both so we can declare that as static variable
//    to initialise the obj directly in the obj creation we have to mention constructor every time we have to give values for each object when ever constructor is call but in that case we can have a static block which was called only once
//    static{
//      model="phone";
//    }
//	without creating an obj we cannot load the constructor and static block
     Class.forName("mobile");
     //after writing this line since there is no contructor calling over there because of no obj creation only class is loading so the class loader loads the static block
}
}
