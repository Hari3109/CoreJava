package Test;

public class studentMain {
	public static void main(String[] args) {
        studentDatabase db = new studentDatabase();
        db.addStudent("Hari Priyanka", 1, 94);
        db.addStudent("santhu", 2, 90);
        
        int studentId = 1;
        student student = db.searchById(studentId);
        if (student != null) {
            System.out.printf("Student with ID %d: Name: %s, Score: %.2f%n", studentId, student.getStudentName(), student.getScore());
        } else {
            System.out.printf("No student found with ID %d%n", studentId);
        }
        String studentName = "santhu";
        student = db.searchByName(studentName);
        if (student != null) {
            System.out.printf("Student with name '%s': ID: %d, Score: %.2f%n", studentName, student.getRollNumber(), student.getScore());
        } else {
            System.out.printf("No student found with name '%s'%n", studentName);
        }
    }
}
