import java.util.Scanner;

class calculator{
	private int x;
	private int y;
	
	 public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int add(int x,int y){
	int	result=x+y;
		return result;
	}
}

public class objectsandclasses {
//	everything in this world is full of objects each object has its own properties and behaviour
//	object oriented programing
// for creating object in java we need class- it is blue print of object 
public static void main(String[] args) {
//	Scanner sca=new Scanner(System.in);
//	System.out.println("enter number1:");
//	System.out.println("enter number2:");
//	int x=sca.nextInt();
//	int y=sca.nextInt();
	calculator c= new calculator();
	System.out.println(c.add(8, 7));
	
	
}
}
