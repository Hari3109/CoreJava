package Test;

public class One {
public One(int x) {
	System.out.println("int ");
}
public One(long l) {
	System.out.println("lomg");
}
public static void main(String[] args) {
	long l=20l;
	One one=new One(l);
}
}
