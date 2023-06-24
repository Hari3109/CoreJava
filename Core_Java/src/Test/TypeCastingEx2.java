package Test;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.run();//@runtime it decides to invoke sub class method 
		//Animal a2=new Cat();
		//a2.run();
		//Dog a3=a1(); child ref cannot refer base obj directly
		Dog a3=(Dog)a1;
		a3.bark();
		a1=new Cat();
		//Dog a4=(Dog)a1(); obj a1 is referring cat obj compilation sucess but at run time it gives exception
	}

}
class Animal{
	
	void run() {
		System.out.println("animal is running");
	}
	
}
class Dog extends Animal{
	void run() {
		System.out.println("dog is running");
		super.run();
	}
	void bark() {
		System.out.println("dog is barking");
	}
	
}
class Cat extends Animal{
	void meow() {
		System.out.println("cat is meowing");
	}
}