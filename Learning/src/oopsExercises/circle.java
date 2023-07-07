package oopsExercises;

public class circle {

	 private double radius;
	private String colour;
	


public circle(double radius) {
		super();
		this.radius = radius;
		this.colour="red";
	}



public circle() {
	super();

}
public double getRadius() {
	return radius;
	
}
public double getArea() {
	return radius*radius*Math.PI;
}



public circle(double radius, String colour) {
	super();
	this.radius = radius;
	this.colour = colour;
}



public String getColour() {
	return colour;
}



public void setColour(String colour) {
	this.colour = colour;
}



public void setRadius(double radius) {
	this.radius = radius;
}

}
