import java.util.Scanner;

public class CharArrayCompare {

    // Converts a string into a character array by iterating through each character
    public static char[] getCharsFromString(String input) {
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }
        return chars;
    }

    // Compares two character arrays for equality
    // Returns false if lengths differ or any character doesn't match
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length)
            return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a word: ");
        String input = scanner.next();
        
        // Convert string to char array using custom method
        char[] customChars = getCharsFromString(input);

        // Convert string to char array using built-in method
        char[] builtInChars = input.toCharArray();

        // Compare the two character arrays
        boolean isEqual = compareCharArrays(customChars, builtInChars);
        
        // Display custom character array
        System.out.print("Custom Characters: ");
        for (char c : customChars) System.out.print(c + " ");
        System.out.println();

        // Display built-in character array
        System.out.print("Built-in Characters: ");
        for (char c : builtInChars) System.out.print(c + " ");
        System.out.println();

        // Display the comparison result
        System.out.println("Are both character arrays equal? " + isEqual);
        scanner.close(); // Close the scanner resource
    }
}
