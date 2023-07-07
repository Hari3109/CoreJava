class U1{
	public void show() {
		System.out.println("in U Show");
		
	}
}
class I extends U1{
	public void show() {
		System.out.println("in I Show");
		
	}
}
class W extends U1{
	public void show() {
		System.out.println("in W Show");
		
	}
}
public class DynamicMethodDespatch {
	public static void main(String[] args) {
      U1 re=new U1();
   re.show();
    re =new I();
    re.show();
    re =new W();
    re.show();
//    in this we doesn't know which method it will call at the time of run time
//    this will only work when we have inheritance
}
}