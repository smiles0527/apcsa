package Chapter5Labs.Salary;
import java.text.NumberFormat;
import java.util.Scanner;

public class ChargeAccount
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.print("Previous balance: ");
        double prev = in.nextDouble();

        System.out.print("Additional charges: ");
        double add = in.nextDouble();

        double interest;
        if(prev == 0)
        {
            interest = 0;
        }
        else
        {
            interest = 0.02 * (prev + add);
        }

        double newBalance = prev + add + interest;

        double minPayment;
        if(newBalance < 50)
        {
            minPayment = newBalance;
        }
        else if(newBalance <= 300)
        {
            minPayment = 50;
        }
        else
        {
            minPayment = 0.20 * newBalance;
        }

        System.out.println();
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Previous Balance:      " + money.format(prev));
        System.out.println("Additional Charges:    " + money.format(add));
        System.out.println("Interest:              " + money.format(interest));
        System.out.println();
        System.out.println("New Balance:           " + money.format(newBalance));
        System.out.println();
        System.out.println("Minimum Payment:       " + money.format(minPayment));

        in.close();
    }
}
