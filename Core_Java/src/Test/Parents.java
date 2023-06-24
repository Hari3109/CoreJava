package Test;

public class Parents {
int x=99;
int getX() {
	return x;
}
}
class childs extends Parents{
	int x=100;
	int getX() {
		return x;
	}
	public static void main(String[] args) {
		Parents p=new Parents();
		System.out.println(p.x);
		System.out.println(p.getX());
	}
	
}
