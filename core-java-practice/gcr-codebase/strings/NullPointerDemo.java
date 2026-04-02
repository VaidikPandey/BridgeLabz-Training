public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        // Check if text is null before calling methods on it
        if (text != null) {
            System.out.println("Length: " + text.length());
        } else {
            System.out.println("Text is null, cannot get length");
        }
    }

    public static void handleException() {
        String text = null;
        try {
            // Check if text is null before calling methods on it
            if (text != null) {
                System.out.println("Length: " + text.length());
            } else {
                System.out.println("Text is null, cannot get length");
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        handleException();
    }
}
