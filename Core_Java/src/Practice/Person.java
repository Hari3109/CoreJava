package Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

enum Gender{
	MALE,FEMALE;
}
public class Person {
 final String name;
 final int age;
 private final Gender gender;
 public Person(String name,int age,Gender gender){
	 this.name=name;
	 this.age=age;
	 this.gender=gender;
 }
 public String getName() {
	 return name;
 }
 public int getAge() {
	 return age;
 }
 public Gender getGender() {
	 return gender;
 }
}
class Implementation{
	public ArrayList<Person>getFemaleList(ArrayList<Person>persons){
		ArrayList<Person>a=new ArrayList<>();
		for(Person i:persons) {
			if(i.getGender()==Gender.FEMALE) {
				a.add(i);
			}
			
		}
		return a;
	}
	public ArrayList<Person>sortPersonByAge(ArrayList<Person>persons){
		return (ArrayList<Person>) persons.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
	}
}
