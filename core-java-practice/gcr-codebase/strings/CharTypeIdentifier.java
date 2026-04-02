import java.util.Scanner;

public class CharTypeIdentifier {

    public static void main(String[] args) {
        // Try-with-resources ensures Scanner is automatically closed
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            String[][] classified = classifyCharacters(input);
            displayClassification(classified);
        }
    }

    // Checks if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase for comparison
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Classifies each character in the input string
    public static String[][] classifyCharacters(String text) {
        int length = text.length();
        String[][] result = new String[length][2];
        // Store each character and its type
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    // Displays the classification in a formatted table
    public static void displayClassification(String[][] data) {
        System.out.println("Character | Type");
        System.out.println("----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("    %s     | %s%n", data[i][0], data[i][1]);
        }
    }
}
