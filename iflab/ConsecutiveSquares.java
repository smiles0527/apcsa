package iflab;

import java.util.Scanner;

public class ConsecutiveSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        // Determine smaller and larger number to handle any order
        int min, max;
        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }

        if (isConsecutivePerfectSquares(min, max)) {
            System.out.println(num1 + " and " + num2 + " are consecutive perfect squares.");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT consecutive perfect squares.");
        }
        
        scanner.close();
    }

    public static boolean isConsecutivePerfectSquares(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return false;
        }

        double sqrt1 = Math.sqrt(n1);
        double sqrt2 = Math.sqrt(n2);

        // Check if they are perfect squares (integer root)
        boolean isPerfectSquare1 = (sqrt1 == (int) sqrt1);
        boolean isPerfectSquare2 = (sqrt2 == (int) sqrt2);

        if (isPerfectSquare1 && isPerfectSquare2) {
            // Check if roots are consecutive
            return (int) sqrt1 + 1 == (int) sqrt2;
        }

        return false;
    }
}
