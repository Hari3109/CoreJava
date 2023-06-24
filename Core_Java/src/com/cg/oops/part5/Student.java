package com.cg.oops.part5;

public class Student {
private int studentId;
private String studentName;
private float m1;
private float m2;
private float m3;
private float m4;
private float total;
private float average;


public Student(int studId, String studName, float m1, float m2, float m3, float m4) {
	super();
	this.studentId = studId;
	this.studentName = studName;
	this.m1 = m1;
	this.m2 = m2;
	this.m3 = m3;
	this.m4 = m4;
}
void calculateTotal() {
	total=m1+m2+m3+m4;
	
}
void calculateAverage() {
	average=(m1+m2+m3+m4)/4;
	
}
public int getStudentId() {
	return studentId;
}
public String getStudentName() {
	return studentName;
}
public float getM1() {
	return m1;
}
public float getM2() {
	return m2;
}
public float getM3() {
	return m3;
}
public float getM4() {
	return m4;
}
public float getTotal() {
	return total;
}
public float getAverage() {
	return average;
}

}
