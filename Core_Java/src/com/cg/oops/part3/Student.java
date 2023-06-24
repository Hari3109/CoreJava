package com.cg.oops.part3;

public class Student {
	private int studId;
	private String studName;
	private float grade;
	private static String courseName;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public static String getCourseName() {
		return courseName;
	}
	public static void setCourseName(String courseName) {
		Student.courseName = courseName;
	}
	

}
