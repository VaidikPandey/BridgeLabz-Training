public class Question {
    private int questionId;
    private String questionText;
    private String correctAnswer;
    private boolean isObjective;
    private char[] options;

    public Question(int questionId , String questionText, String correctAnswer, boolean isObjective, char[] options) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.isObjective = isObjective;
        this.options = options;
    }

    public int getQuestionId(){
        return questionId;
    }
    public String getQuestionString(){
        return questionText;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public boolean getIsObjective(){
        return isObjective;
    }
    public char[] getOptions(){
        return options;
    }
}
