class F{
	public void show() {
		System.out.println("in show");
	}
}
public class AnonymousInnerClass {
public static void main(String[] args) {
	F obj=new F() {
		public void show()
		{
			System.out.println("in Obj show");
		}
	};
	obj.show();
//	here to change the behaviour we need to inheriate other class with F over there instead of that we can use the concept of Anonymous class
}
}
 