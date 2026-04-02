
import java.util.Scanner;

public class MultiplicationTableRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int[] multiplicationResult = new int[4];

        for (int i = 6, j = 0; i <= 9; i++, j++) {
            multiplicationResult[j] = number * i;
        }

        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[j]);
        }
        scan.close();
    }
}
