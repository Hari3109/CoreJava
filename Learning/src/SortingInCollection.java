import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Students implements Comparable{
	int age;
	String name;
	@Override
	public String toString() {
		return "Students [age=" + age + ", name=" + name + "]";
	}
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int compareTo(Students that) {
		
		return this.age>that.age?1:-1;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
public class SortingInCollection {
public static void main(String[] args) {
	Comparator<Students> com =(Students i, Students j) ->{
//			if(i%10>j%10) {
//				return 1;
//			}else
//			return -1;
		return i.age>j.age?1:-1;
	};
	Students s1=new Students(21,"hari");
	Students s2=new Students(22,"santhi");
	List<Students>stud=new ArrayList<>();
	stud.add(s1);
	stud.add(s2);
	
	Collections.sort(stud,com);
	for(Students n:stud)
	System.out.println(n);
	
	}
//comparable- u are giving the class itself a permission to sort elements 
//comparator- if u want to specify on which logic it is going to sort the elements that is compator
}
