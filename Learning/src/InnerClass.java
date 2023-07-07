class human1{
	int age=10;
	public void aging() {
		System.out.println("age:"+age);
	}
	class student{
		public void Studying() {
			System.out.println("studying");
		}
	}
}
public class InnerClass {
public static void main(String[] args) {
	human1 h=new human1();
	h.aging();
//	h.Studying();
//	we can't access studying method with human1 object 
	human1.student s=h.new student();
//	here we can't create object of student class directly we have to give the referance of human and the referance of human object 
//	if we declare is the static then we don't need the referance of human object 
//	u can't make static to the outer class
	s.Studying();
}
}
