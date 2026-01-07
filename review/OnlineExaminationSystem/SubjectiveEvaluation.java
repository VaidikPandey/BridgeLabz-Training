public class SubjectiveEvaluation implements EvaluationStrategySubjective {

    @Override
    public int evaluateSubjective(Question question, String answer) {
        if (question.getCorrectAnswer().equals(answer)) {
            return 1; // Correct answer
        } else {
            return 0; // Incorrect answer
        }
} 
}
