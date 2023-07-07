import java.util.HashMap;


public class Map {
//it contains key and value pair
//	map is an inteface
	public static void main(String[] args) {
		java.util.Map<Integer, String>student=new HashMap<>();
		student.put(67, "Hari");
		student.put(78, "santhu");
		student.put(69, "uma");
		student.put(65, "dev");
		System.out.println(student);
		System.out.println(student.containsKey(67));
		System.out.println(student.get(67));
		System.out.println(student.keySet());
		for(Integer key:student.keySet()) {
			System.out.println(key+ ":" +student.get(key));
			
		}
		
	}
}
