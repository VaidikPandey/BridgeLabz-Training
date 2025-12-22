import java.util.Scanner;

public class ComapreTwoStrings {
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String str1 = scanner.next();
        
        System.out.println("Enter second string:");
        String str2 = scanner.next();
        
        boolean charAtComparisonResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);
        
        System.out.println("charAt() comparison result: " + charAtComparisonResult);
        System.out.println("Built-in equals() comparison result: " + builtInResult);
        System.out.println("Both methods match: " + (charAtComparisonResult == builtInResult));
        
        scanner.close();
    }
}