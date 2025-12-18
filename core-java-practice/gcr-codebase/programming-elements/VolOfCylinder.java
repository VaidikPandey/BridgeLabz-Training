
import java.util.Scanner;
public class VolOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of cylinder with radius %.4f and height %.4f is %.4f%n", radius, height, volume);
        scanner.close();
    }
}