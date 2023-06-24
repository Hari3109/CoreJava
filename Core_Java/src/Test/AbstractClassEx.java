package Test;

public class AbstractClassEx {
public static void main(String[] args) {
	Dog1 dog=new Dog1();
	Cat1 cat = new Cat1();
	Animal1 animal[]= {dog,cat};
	for(Animal1 a:animal) {
		a.eat();
	}
}
}
abstract class Animal1{
	abstract void eat();
	
}
class Dog1 extends Animal1{
	void eat() {
		System.out.println("dog eats pedigree");
	}
	
}
class Cat1 extends Animal1{
	void eat() {
		System.out.println("cat eats fish");
	}
}