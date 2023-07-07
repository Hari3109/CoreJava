//to attain loose coupling
 abstract class Computer1{
	public abstract void code();
	//we can generalise the things instead of making them complex
//	if we make the class as inteface there is no need of abstract keyword instead of extends we can make that as implements
	}
//since we have nothing in the class we can instead of declaring it we can define that
class LaptopH extends Computer1{
  public void code() {
	  System.out.println("code,compile,run");
  }
}
class desktop extends Computer1{
	public void code() {
		System.out.println("code, compile,run, faster");
	}
}
class Developer {
	public void devApp(Computer1 desk) {
		desk.code();
	}
}
//here passing the object of laptop is not a suitable idea so that in future if it changes to desktop we will gain error so we need to attain loose coupling over there
public class NeedOfInterface {
public static void main(String[] args) {
	Computer1 lap=new LaptopH();
	Computer1 desk=new desktop();
	Developer dev=new Developer();
	dev.devApp(desk);
	dev.devApp(lap);
}
}
