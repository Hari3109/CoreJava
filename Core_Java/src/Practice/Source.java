package Practice;

public class Source {
public static void main(String args[]) {
	Age a=new Age();
	ExceptionCheck obj=new ExceptionCheck();
	try {
		obj.validateAgeToDrink(a,21);
		obj.validateStringAgeTODrink(a,"20");
	}catch(IllegalAgeException e) {
		a.drink="illegal";
	}
	System.out.println(a.drink);
}
}
class Age{
	String drink;
}
class ExceptionCheck{
	String validateAgeToDrink(Age a,int age)throws IllegalAgeException{
		if(age<21) {
			throw new IllegalAgeException("illegal drinking age");
		}else {
			a.drink="legal";
		}
		return a.drink;
	}
	public void validateStringAgeTODrink(Age a, String string) {
		// TODO Auto-generated method stub
		
	}
	String validateAgeToDrink(Age a,String age)throws IllegalAgeException{
		if((age.length()<2)||Integer.parseInt(age)<21) {
			throw new IllegalAgeException("Illegal age details or drinking age");
		}else {
			a.drink="legal";
		}
		return a.drink;
	}
}
class IllegalAgeException extends Exception{
	public IllegalAgeException(String str) {
		super(str);
	}
}