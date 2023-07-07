abstract class Car1{
	public abstract void drive();
//		here  in this method we didn't implemented any logic over in this method  instead of declaration of method we can declare that as in single line
//	for that we need that as abstract method
//	here we are declaring the method
//	abstract method can only be in abstract class itself
//	abstract methods must be overide
//	there is no compulsory to have abstract method in abstract classes
	public void playMusic() {
		System.out.println("play music");
	}
}
class BMW extends Car1{// concrete classes
	//we can create object of concrete class

	@Override
	public void drive() {
		System.out.println("drive BMW");
//		here we are defining the method
	}
	
}
public class AbstractKeyWord {
public static void main(String[] args) {
	BMW obj=new BMW();
	obj.drive();
	obj.playMusic();
}

}
