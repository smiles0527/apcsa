package Chapter6Labs.Loops;
import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter today's price of 1 USD in euro: ");
        double usdToEur = in.nextDouble();
        in.nextLine();

        System.out.print("Convert from Canadian or American dollars? (Can/US): ");
        String kind = in.nextLine();

        double factor;

        if(kind.equals("US"))
        {
            factor = usdToEur;
        }
        else
        {
            System.out.print("Enter today's price of 1 CAD in euro: ");
            factor = in.nextDouble();
            in.nextLine();
        }

        while(true)
        {
            System.out.print("Enter dollar amount to convert (or Q to quit): ");
            String s = in.nextLine();

            if(s.equals("Q"))
            {
                break;
            }

            double amt = Double.parseDouble(s);
            double eur = amt * factor;
            System.out.println("Euro: " + eur);
        }

        in.close();
    }
}
