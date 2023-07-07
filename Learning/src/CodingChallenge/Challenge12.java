package CodingChallenge;
class Animal{
	public void Show() {
		System.out.println("in animal");
	}
}
class Dog extends Animal{
	public Dog() {
		super();
//		Show();
	}
	public void Show() {
		super.Show();
		System.out.println("in dog");
	}
}
public class Challenge12 {
public static void main(String[] args) {
//	Inheritance-In the process of child obj creation, jvm construcs Parent obj first.
//	And then it extends the behaviour of parent object into child
	Dog d=new Dog();
	d.Show();
}
}
