import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Examination examinations = new Examination();
        examinations.createExam(101, 600000);
        Exam exam = examinations.getExam(101);

        exam.addQuestion(new Question(1 , "What is 2+2?", "4", true, new char[]{'3', '4', '5', '6'}));
        exam.addQuestion(new Question(2 , "What is the capital of France?", "Paris", false, null));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = Integer.parseInt(scanner.nextLine().trim());

        ObjectiveEvaluation objectiveEvaluator = new ObjectiveEvaluation();
        SubjectiveEvaluation subjectiveEvaluator = new SubjectiveEvaluation();

        for (int i = 1; i <= n; i++) {
            System.out.print("Student " + i + " name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Answer for Q1: ");
            String ans1 = scanner.nextLine().trim();
            System.out.print("Answer for Q2: ");
            String ans2 = scanner.nextLine().trim();

            try {
                exam.submitAnswer(1, ans1);
                exam.submitAnswer(2, ans2);
            } catch (ExamTimeExpiredException e) {
                System.out.println(e.getMessage());
            }

            Student student = new Student(i, 0, name, null);
            StudentResult<Integer> result = exam.evaluateExam(student, objectiveEvaluator, subjectiveEvaluator);
            System.out.println(name + " Score: " + result.getScore());
        }

        scanner.close();
    }
}
