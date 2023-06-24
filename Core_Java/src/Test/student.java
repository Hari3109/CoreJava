package Test;

public class student {
	private int rollNumber;
	private String StudentName;
	private  double score;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public student(int rollNumber, String studentName, double score) {
		super();
		this.rollNumber = rollNumber;
		StudentName = studentName;
		this.score = score;
	}
	

}
