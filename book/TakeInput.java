package book;

import java.util.Scanner;

/**
 * Simple input helper used in the Chapter 2 Book Lab.
 * This version keeps the lab self-contained. If you link the original project provided
 * by your instructor you can remove this class.
 */
public final class TakeInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    private TakeInput() {
        // Prevent instantiation.
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(SCANNER.nextLine().trim());
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid integer for the ISBN.");
            }
        }
    }
}


