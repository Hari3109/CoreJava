abstract class O{
	public abstract void show();
}
public class AbstractClassAndAnnonymous {
public static void main(String[] args) {
	O obj=new O() {
      
		public void show() {
			System.out.println("Show");
		}
		
	};
	obj.show();
}
}
