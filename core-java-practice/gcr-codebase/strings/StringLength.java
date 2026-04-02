import java.util.Scanner;

class StringLength {

    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught when end of string is reached
        }
        return count;
    }

    public static void main(String[] args) {
        // Create scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a string (no spaces): ");
            String input = scanner.next();

            // Get custom length using exception-based counting
            int customLength = getStringLength(input);
            // Get built-in length using String.length()
            int builtInLength = input.length();

            System.out.println("Custom Length: " + customLength);
            System.out.println("Built-in Length: " + builtInLength);
        } finally {
            // Close scanner to prevent resource leak
            scanner.close();
        }
    }
}
