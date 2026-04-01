import java.util.Scanner;

public class ScannerDebuggingPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.nextLine();

        System.out.print("Enter your street name: ");
        String street = input.nextLine();

        System.out.print("Enter 'true' or 'false': ");
        boolean isReady = input.nextBoolean();

        System.out.println("GPA: " + gpa);
        System.out.println("Number: " + num);
        System.out.println("Street: " + street);
        System.out.println("Ready: " + isReady);

        input.close();
    }
}
