import java.util.HashMap;
public class Examination {
    private HashMap<Integer, Exam> exams = new HashMap<>();

    public void createExam(int examId, long durationMillis) {
        Exam exam = new Exam(examId, durationMillis);
        exams.put(examId, exam);
    }
    public Exam getExam(int examId) {
        return exams.get(examId);
    }
}
