public class Student {
    private int studentId;
    private int studentRollNumber;
    private String studentName;
    private String studentEmail;

    public Student(int studentId, int studentRollNumber, String studentName, String studentEmail) {
        this.studentId = studentId;
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public int getStudentId() {
        return studentId;
    }
    public int getStudentRollNumber() {
        return studentRollNumber;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    
}