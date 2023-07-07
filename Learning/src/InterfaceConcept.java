interface S{
//	int age;
public static final int age = 21 ;
	void mean();
	void What();
}
public class InterfaceConcept {
//intefaces are the not classes actually but they act as abstarct class and the we can eleminate the public and abstract keywords in the methods
//	to declare variables in interface it should declare final or static
//	it attains loose coupling
	public static void main(String[] args) {
		S obj =new S() {

			
			public void mean() {
				
			}

			
			public void What() {
				
			}
			
		};
		obj.mean();
		obj.What();
		System.out.println(S.age);
	}
}
//class- class =extends
//class-interface=implemnts
//interface -interface=extends
//interface-class=implements
