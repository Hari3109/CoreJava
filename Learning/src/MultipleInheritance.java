class H{
	public void show() {
		System.out.println("Hari");
	}
}
class R extends H{
	public void show() {
		System.out.println("priya");
	}
}
public class MultipleInheritance {
public static void main(String[] args) {
//	in multiple inheritance if the method has in both the parent class then child got confused to which method to be choose which is called as Ambigity
//	so in java multiple inheritance doesn't work
//	method overiding- the method with same name and parameter and the at the run time compiler will decide with method to invoke
	R e=new R();
	e.show();
	
}
}
