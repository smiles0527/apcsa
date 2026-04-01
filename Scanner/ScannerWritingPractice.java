import java.util.Scanner;

public class ScannerWritingPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter the price of an item: ");
        double price = input.nextDouble();

        System.out.print("Enter your favorite color: ");
        String color = input.next();

        input.nextLine();
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Favorite color: " + color);
        System.out.println("Full name: " + fullName);

        input.close();
    }
}
