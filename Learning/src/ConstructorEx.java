class d{
	int num=5;
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public double add(double n1, int n2, int n3) {
		return n1+n2+n3;
	}
}
public class ConstructorEx {
// method overloading - it is the when two method having same names but having different parameters
//which gives the concept of constructor comes over
	public static void main(String[] args) {
	d o=new d();
//	System.out.println(o.add(2.9,3,7));
	System.out.println(o.num=65);
	d obj= new d();
	System.out.println(obj.num=8);
	
	}
}
// data area: it is the memory or an area where our variable got store usually there are two types of data areas 
// 1: stack- it is place where varables under methods got store usually stack had key nd its value which are stored in rows and columns 
// 2: heap- it is the place where instance variables got stored which are declared in class level
// see in the above the value of num keep on changing according to obj variable