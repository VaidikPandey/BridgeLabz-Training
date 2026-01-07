public class StudentResult <T> {

    private T score;
    
    public StudentResult(T score) {
        this.score = score;
    }

    public T getScore() {
        return score;
    }
}
