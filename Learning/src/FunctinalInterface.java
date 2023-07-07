interface R1{
	void show();
}
public class FunctinalInterface {
//if we write the @FuntionalInterface that means we should have only one method in the Interface
	public static void main(String[] args) {
		R1 obj=new R1() 
		{
			public void show() {
				System.out.println("In show");
			}
		};
		obj.show();
	}
}
