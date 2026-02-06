package Chapter5Labs/Salary;
import java.util.Scanner;

public class LakeLazyDays
{
    public static String activity(int temp)
    {
        if(temp > 95 || temp < 20)
        {
            return "Visit our shops!";
        }
        else if(temp >= 80)
        {
            return "Swimming";
        }
        else if(temp >= 60)
        {
            return "Tennis";
        }
        else if(temp >= 40)
        {
            return "Golf";
        }
        else
        {
            return "Skiing";
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int t = in.nextInt();

        System.out.println(activity(t));

        in.close();
    }
}
