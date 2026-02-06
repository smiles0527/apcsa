package Chapter5Labs.Salary;

import java.util.Scanner;
// ***************************************************************
//   Salary.java
//   Computes the amount of a raise and the new salary for an 
//   employee.  The current salary and a performance rating 
//   (a String: "Excellent", "Good", or "Poor") are input.
// ***************************************************************
import java.text.NumberFormat;

public class Salary
{
    public static void main(String[] args)
    {
        double currentSalary;
        double raise = 0;
        double newSalary;
        String rating;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the current salary: ");
        currentSalary = in.nextDouble();
        in.nextLine();

        System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = in.nextLine();

        if(rating.equals("Excellent"))
        {
            raise = currentSalary * 0.06;
        }
        else if(rating.equals("Good"))
        {
            raise = currentSalary * 0.04;
        }
        else if(rating.equals("Poor"))
        {
            raise = currentSalary * 0.015;
        }
        else
        {
            System.out.println("Invalid rating. Raise set to 0.");
            raise = 0;
        }

        newSalary = currentSalary + raise;

        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println();
        System.out.println("Current Salary:       " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary:      " + money.format(newSalary));

        in.close();
    }
}
