package Chapter5Labs.IntroLab;
import java.util.Scanner;

public class LetterGuess
{
    public static void main(String[] args)
    {
        Scanner take = new Scanner(System.in);

        final String LETTER = randomLetter();

        boolean flag = true;

        while(flag)
        {
            System.out.print("Enter your guess (a single letter): ");
            String temp = take.next();

            temp = temp.toLowerCase();

            int cmp = temp.compareTo(LETTER);

            if(cmp == 0)
            {
                System.out.println("You guessed it!");
                flag = false;
            }
            else if(cmp < 0)
            {
                System.out.println("Too early in the alphabet.");
            }
            else
            {
                System.out.println("Too late in the alphabet.");
            }
        }

        take.close();
    }

    public static String randomLetter()
    {
        int code = (int)(Math.random() * 26) + 'a';
        char c = (char)code;
        return "" + c;
    }
}
