package Test;

public class Parent {
	public static void main(String[] args) {
	Parent2 p=new Child2();
	System.out.println(p.x);
	System.out.println(p.getX());
	}
	
	}
	class Parent2{
	int x=99;
	int getX() {
	return x;
	}
	}
	class Child2 extends Parent2{
	int x=100;
	int getX() {//overriding
	return x;
	}
	}

	