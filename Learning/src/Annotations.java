class We{
	public void showaretheDynamic() {
		System.out.println(" we are in sys method");

	}
}
class u extends We{
	@Override
	public void showaretheDynamic() {
		System.out.println(" u are in sys method");

	}
}
public class Annotations {
//sometimes we need to say the compiler explicitily to read that 
//	without this it doesn't mean code does n't work
	// we will gain bugs in programming language bugs are generally logical errors in the programming language
//	u can show the intension withn the help of Annotation to the compiler
	
	public static void main(String[] args) {
		u obj=new u();
		obj.showaretheDynamic();
	}
}
