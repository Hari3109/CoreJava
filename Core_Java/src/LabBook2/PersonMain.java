package LabBook2;

public class PersonMain {
    public static void main(String[] args) {
		Person p=new Person();
		p.setFirstName("Hari Priyanka");
		p.setLastName("Harry");
		p.setGender('F');
		System.out.println("person Details");
		System.out.println("----------------");
		
		System.out.println("firstname is:"+p.getFirstName());
		System.out.println("lastname is:"+p.getLastName());
		System.out.println("gender is:"+p.getGender());
		
	}
    
    
    
    
}
