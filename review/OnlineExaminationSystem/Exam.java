import java.util.ArrayList;
import java.util.HashMap;

public class Exam {
    private int examId;
    private ArrayList<Question> questions;
    private HashMap<Integer , String> answers = new HashMap<>();
    private long endTime;
    
     public Exam(int examId, long durationMillis) {
        this.examId = examId;
        this.endTime = System.currentTimeMillis() + durationMillis;
    }

    public void addQuestion(Question question) {
        if (questions == null) {
            questions = new ArrayList<>();
        }
        questions.add(question);
    }
    public void submitAnswer(int studentId, String answer) throws ExamTimeExpiredException {
        if (System.currentTimeMillis() > endTime) {
            throw new ExamTimeExpiredException("Exam time is over");
        }
        answers.put(studentId, answer);
    }
    public StudentResult<Integer> evaluateExam(Student student, EvaluationStrategyObjective objectiveEvaluator, EvaluationStrategySubjective subjectiveEvaluator) {
        int totalScore = 0;
        for (Question question : questions) {
            String answer = answers.get(student.getStudentId());
            if (question.getIsObjective()) {
                totalScore += objectiveEvaluator.evaluateObjective(question, question.getOptions());
            } else {
                totalScore += subjectiveEvaluator.evaluateSubjective(question, answer);
            }
        }
        return new StudentResult<>(totalScore);
    }
}
