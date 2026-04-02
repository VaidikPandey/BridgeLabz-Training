import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + Math.pow(base, exponent));
        scanner.close();
    }
}