import java.util.*;

public class ToggleCharCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += c;
        }
        System.out.println(result);
        sc.close();
    }
}
