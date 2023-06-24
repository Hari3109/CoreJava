package Test;

import java.util.ArrayList;
import java.util.List;

public class studentDatabase {
	private List<student> students;
	
	public studentDatabase() {
        this.students = new ArrayList<>();
    }

    public void addStudent(String studentName, int rollNumber, double score) {
        student student = new student(rollNumber,studentName, score);
        students.add(student);
    }

    public student searchById(int rollNumber) {
        for (student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public student searchByName(String studentName) {
        for (student student : students) {
            if (student.getStudentName().equalsIgnoreCase(studentName)) {
                return student;
            }
        }
        return null;
    }
}

