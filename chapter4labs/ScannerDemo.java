package Chapter4Labs;
import java.util.Scanner;


/**
* Demonstrates the use of the Scanner class to read user input
* for Strings, integers, and doubles, as covered in AP CSA Unit 2.
*/
public class ScannerDemo {


   public static void main(String[] args) {
       // 1. Create a Scanner object to read from the keyboard (System.in)
       // This is the standard way to set up the Scanner object.
       Scanner taker = new Scanner(System.in);


       System.out.println("--- Welcome to the Scanner Demo ---");


       // --- A. Reading a String (token up to the first whitespace) ---
       System.out.print("What is your first name? ");
       String name = taker.next();


       // --- B. Reading an int ---
       System.out.print("How old are you? ");
       int age = taker.nextInt();


       // --- C. Reading a double ---
       System.out.print("Enter your GPA (e.g., 3.85): ");
       double gpa = taker.nextDouble();


       // --- D. Processing and Output ---


       // Calculate the age the user will be next year
       int nextAge = age + 1;


       System.out.println("\n--- Input Summary ---");
       System.out.println("Hello, " + name + "!");
       System.out.println("You are currently " + age + " years old.");
       System.out.printf("Your GPA is %.2f.\n", gpa); // Use printf for formatted output
       System.out.println("Next year, you will be " + nextAge + ".");


       // 2. IMPORTANT: Close the Scanner when you are done to release system resources.
       taker.close();


       System.out.println("--- Demo Complete ---");
   }
}

