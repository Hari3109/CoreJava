
public class iteration {
public static void main(String[] args) {
//	iteration reusability of code by using loops ie.repeating same thing many times	
//	that is where the concept of loops comes into picture
//	loops-while loop,do while,for
//	for(int i=0;i<5;i++) {
//		System.out.println("hi");
//		
//	}
//	int i=1;
//	while(i<=7) {
//		System.out.println("Hi");
//		i++;
//		int j=1;
//		while(j<=2) {
//			System.out.println("bbye");
//			j++;
//		}
//	}
//	System.out.println("bye"+i);
	//first execute the statement and then it goes through the condition
//	do {
//		System.out.println("hi"+i);
//		i++;
//	}while(i<=4) ;
	for(int i=1;i<=5;i++) {
		System.out.println("day"+i);
		for(int j=1;j<=9;j++) {
			System.out.println("hours_"+(j+8)+"-"+(j+9));
			
		}
	}
	
}
}
