package oopsExercises;

public class getCircleObj {
public static void main(String[] args) {
	circle c=new circle();
	c.setRadius(4);
	c.setColour("blue");
	System.out.println(c.getRadius());
	System.out.println(c.getArea());
	System.out.println(c.getColour());
}
}
