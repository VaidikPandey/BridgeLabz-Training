import java.util.Scanner;

public class CoffeCafeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRevenue = 0;
        
        while (true) {
            System.out.println("Select Coffee Type:");
            System.out.println("1. Espresso - INR 80");
            System.out.println("2. Americano - INR 100");
            System.out.println("3. Latte - INR 120");
            System.out.println("4. Cappuccino - INR 150");
            System.out.println("5. Mocha - INR 140");
            System.out.print("Enter choice (1-5) or 'exit' to quit: ");
            
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) { // equalsIgnoreCase to handle case variations and avoid potential NullPointerException
                System.out.println("\nTotal Revenue: INR" + totalRevenue);
                System.out.println("Thank you for visiting!");
                break;
            }
            
            int choice = Integer.parseInt(input);
            double price = 0;
            String coffeeType = "";
            
            switch (choice) {
                case 1:
                    price = 80;
                    coffeeType = "Espresso";
                    break;
                case 2:
                    price = 100;
                    coffeeType = "Americano";
                    break;
                case 3:
                    price = 120;
                    coffeeType = "Latte";
                    break;
                case 4:
                    price = 150;
                    coffeeType = "Cappuccino";
                    break;
                case 5:
                    price = 140;
                    coffeeType = "Mocha";
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
            
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            
            double billAmount = price * quantity;
            double gst = billAmount * 0.18;
            double totalBill = billAmount + gst;
            
            System.out.println("----- Bill Details -----");
            System.out.println("Coffee: " + coffeeType);
            System.out.println("Quantity: " + quantity);
            System.out.println("Base Amount: INR " + billAmount);
            System.out.println("GST (18%): INR " + gst);
            System.out.println("Total Bill: INR " + totalBill);
            
            totalRevenue += totalBill;
        }
        
        scanner.close();
    }
}