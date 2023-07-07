class Mobile1{
	 static String name;
	int price;
	String model;
	public void show() {
		System.out.println(name+ " "+price+" "+model);
	}
	public static void show1(Mobile1 m){
		System.out.println(name+ " "+m.price+" "+m.model);
	}
//	we can call static method directly using class name 
//	in the above case there is no problem with the name because static method has no issue with static variable but we cannot declare non static variable in static method
//	if we have  a object referance we can use that  
}
public class StaticMethod {
public static void main(String[] args) {
	Mobile1 m= new Mobile1();
	m.name="ipone";
	m.price=50000;
	m.model="iphone14";
	
	Mobile1 n=new Mobile1();
	n.name="Samsung";
	n.price=60000;
	n.model="samsung x6";
	Mobile1.show1(m);
	Mobile1.show1(n);
}
}
