class Animal{
	public void bark1() {
		System.out.println("barking");
	}
}
class Dog{
	public void bark() {
		System.out.println("bow");
	}
	public void eat() {
		System.out.println("Dog eating");
	}
}
public class UpcastingAndDowncasting {
//converting the type of value
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.bark();d.eat();
//		Dog d1=(Animal) new Dog();
//		Dog d1=(Animal)Dog;
		}
}
