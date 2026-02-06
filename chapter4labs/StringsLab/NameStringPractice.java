package Chapter4Labs.StringsLab;

import java.util.Scanner;

public class NameStringPractice
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your first name and last name, separated by a space.");
        String input = in.nextLine();

        int space = input.indexOf(" ");
        String first = input.substring(0, space);
        String last = input.substring(space + 1);

        System.out.println("Your first name is " + first + ", which has " + first.length() + " characters");
        System.out.println("Your last name is " + last + ", which has " + last.length() + " characters");
        System.out.println("Your initials are " + first.substring(0, 1) + last.substring(0, 1));

        String myFirst = "Curtis";
        String myLast = "Wei";

        if(first.equals(myFirst) && last.equals(myLast))
        {
            System.out.println("Awesome name, my friend!");
        }

        in.close();
    }
}
