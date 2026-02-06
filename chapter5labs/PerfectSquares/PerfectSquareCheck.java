package Chapter5Labs/PerfectSquares;

import java.util.Scanner;

public class PerfectSquareCheck
{
    public static boolean isPerfectSquare(int n)
    {
        if(n < 0) return false;
        int r = (int)Math.sqrt(n);
        return r * r == n;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = in.nextInt();

        System.out.print("Enter second integer: ");
        int b = in.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if(isPerfectSquare(min) && isPerfectSquare(max))
        {
            int r = (int)Math.sqrt(min);
            if((r + 1) * (r + 1) == max)
                System.out.println("They are consecutive perfect squares.");
            else
                System.out.println("Both are perfect squares but not consecutive.");
        }
        else
        {
            System.out.println("They are not consecutive perfect squares.");
        }

        in.close();
    }
}
