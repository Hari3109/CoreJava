class Human{
	private int age; //only this variable can be accesed by only this class itself by making private 
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
//		here we are equalling the instance variable to the local variable
//		so to get the value we are using this key word which refers to the current object
		
	}
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
//	A constructor looks like method itself 
//	to assign values directly at the time of creation of object itself we can use the constructor
	
}
public class EncapsulationConcept {
public static void main(String[] args) {
// Encapsulation-keeping it close so that no one from outside can use this
//	encapulising data in methods that is wher the concept work
	Human h=new Human(18,"Santhu");
//	h.setAge(22);
//	h.setName("Hari Priyanka");
//	System.out.println(h);
	
	System.out.println(h.getName()+" : "+h.getAge());
}
}
