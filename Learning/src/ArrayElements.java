class Student{
	int rollNo;
	String name;
	double marks;
	
}
public class ArrayElements {
public static void main(String[] args) {
	int num[]=new int[4];
	num[0]=4;
	num[1]=3;
	num[2]=5;
	num[3]=8;
//	for(int i=0;i<num.length;i++) {
//		System.out.println(num[i]);
//	}
	for(int ele:num) {
		System.out.println(ele);
	}
	Student s=new Student();
	s.rollNo=1;
	s.name="Hari Priyanka";
	s.marks=39.5;
	Student s1=new Student();
	s1.rollNo=2;
	s1.name="Hari ";
	s1.marks=78.5;
	Student student[]=new Student[2];
	student[0]=s;
	student[1]=s1;
//	for(int i=0;i<student.length;i++) {
//		System.out.println(student[i].name+":"+student[i].marks);
//		
//	}
   for(Student stu:student) {
	   System.out.println(stu.name+": "+stu.marks);
   }
	
}
}
