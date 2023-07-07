class Calc{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int x,int y) {
		return x-y;
	}
}
class AdvCalc extends Calc{
	public int mul(int s,int t) {
		return s*t;
	}
	public int div(int d,int y) {
		return d/y;
	}
}
class ScientificCalc extends AdvCalc{
	public double power(int n1,int n2) {
		return Math.pow(n1, n2);
	}
}
public class OopsConcepts {
//Inheritence: the classes will have a is a relationship over here
//	inheritence is  a imp feature using which we can copy a features of super class
	public static void main(String[] args) {
		ScientificCalc c=new ScientificCalc();
		int r1=c.add(5, 8);
		int r2=c.sub(6, 9);
		System.out.println("Add:"+r1);
		System.out.println("Sub:"+r2);
		int e1=c.mul(8,6);
		int e2=c.div(10, 2);
		System.out.println(e1+" : "+e2);
		double s1=c.power(4, 2);
		System.out.println(s1);
		// for a parent obj refering the child obj is possible only when the child method has in parent 
//		but in case of child class it doesn't required to have parent class method it can refer the parent class methods
//	multilevel inheritance over up because we are inherting 2 times over there
		
	}
}
