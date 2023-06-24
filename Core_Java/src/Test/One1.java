package Test;

public class One1 {
int i=1;
public int getInt() {
	return i;
}
}
class Two extends One1{
	int i=2;
	public int getInt() {
		return i;
	}
	public static void main(String[] args) {
		One1 one=new One1();
		Two two= new Two();
		System.out.println(two.getInt());
	}
}