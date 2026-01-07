class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}
public class AgeNotVaild {

    static void checkAge(int age) throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
