public class ObjectiveEvaluation implements EvaluationStrategyObjective {
    
    @Override
    public int evaluateObjective(Question question, char[] options) {
        if (question.getCorrectAnswer().equals(options)) {
            return 1; // Correct answer
        } else {
            return 0; // Incorrect answer
        }
    }
}
