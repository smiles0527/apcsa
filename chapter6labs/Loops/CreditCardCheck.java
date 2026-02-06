package Chapter6Labs.Loops;
import java.util.Scanner;

public class CreditCardCheck8
{
    public static int digitSum(int x)
    {
        int s = 0;
        while(x > 0)
        {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public static int checkSum(int n8)
    {
        int sumOdd = 0;
        int sumEven = 0;

        int pos = 1;
        int temp = n8;

        while(temp > 0)
        {
            int d = temp % 10;

            if(pos % 2 == 1)
            {
                sumOdd += d;
            }
            else
            {
                sumEven += digitSum(2 * d);
            }

            temp /= 10;
            pos++;
        }

        return sumOdd + sumEven;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an 8-digit number: ");
        int n = in.nextInt();

        int sum = checkSum(n);

        if(sum % 10 == 0)
        {
            System.out.println("Valid.");
        }
        else
        {
            int need = (10 - (sum % 10)) % 10;
            int checkDigit = n % 10;
            int correctCheckDigit = (checkDigit + need) % 10;

            System.out.println("Not valid.");
            System.out.println("Check digit that would make it valid: " + correctCheckDigit);
        }

        in.close();
    }
}
