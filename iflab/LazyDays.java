package iflab;

import java.util.Scanner;

public class LazyDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temp = scan.nextInt();

        String activity = suggestActivity(temp);
        System.out.println("Suggested Activity: " + activity);

        if (temp > 95 || temp < 20) {
            System.out.println("Visit our shops!");
        }
        
        scan.close();
    }

    public static String suggestActivity(int temp) {
        if (temp >= 80) {
            return "swimming";
        } else if (temp >= 60) {
            return "tennis";
        } else if (temp >= 40) {
            return "golf";
        } else {
            return "skiing";
        }
    }
}
