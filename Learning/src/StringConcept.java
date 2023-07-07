
public class StringConcept {
public static void main(String[] args) {
//	String is an class but in case of assigning values to the string will be normal like{String name="Hari "}
//	but for class we usually assign value  by creating obj 
	
	String name= new String("Hari");
//	String name="hari"   even this works fine 
	System.out.println("hello "+name);
	System.out.println(name.hashCode());
	System.out.println(name.charAt(3));
	System.out.println(name.concat(" Priyanka"));
	name=name+ " sarvasuddi"; //appending name
	System.out.println(name);
	String s1="Santhu";
	String s2="Santhu";
	System.out.println(s1==s2);  // it was shared in string constant pool
//	concept of Muttable(Changed) And Immutable String(unchanged)
	
//	`by default Strings are immutable once u have created object u can't change
//	to use muttable String there are 2 different classes in String they r
//	String buffer -it  give u bugger size of 16 characters. it is thread safe
//	String builder -whereas it is not thread safe
	StringBuffer sb= new StringBuffer("Kowsalya");
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	sb.append(" Sarvasuddi");
	System.out.println(sb);
	sb.deleteCharAt(2);
	System.out.println(sb);
	sb.delete(0, 6);
	System.out.println(sb);
	sb.insert(0, "kowsaly");
	System.out.println(sb);
//	we can use toString to convert StringBuffer to String
//	String str=sb.toString();
	
	
}
}
