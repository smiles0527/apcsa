package Chapter6Labs/Loops;
import java.util.Scanner;

public class Factors
{
    public static boolean isPrime(int n)
    {
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2)
        {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void printFactors(int n)
    {
        if(n == 0)
        {
            System.out.println("Factors: all integers (0 has infinitely many factors).");
            return;
        }

        int m = Math.abs(n);
        System.out.print("Factors: ");

        for(int i = 1; i <= m; i++)
        {
            if(m % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printPrimeFactorPhrase(int n)
    {
        if(n == 0)
        {
            System.out.println("Prime factorization: not defined for 0");
            return;
        }

        int m = Math.abs(n);

        if(m == 1)
        {
            System.out.println("Prime factorization: 1");
            return;
        }

        System.out.print("Prime factorization: ");

        boolean first = true;
        int p = 2;

        while(m > 1)
        {
            int count = 0;
            while(m % p == 0)
            {
                m /= p;
                count++;
            }

            if(count > 0)
            {
                if(!first) System.out.print(" * ");
                first = false;

                if(count == 1) System.out.print(p);
                else System.out.print(p + "^" + count);
            }

            if(p == 2) p = 3;
            else p += 2;

            if(p * p > m && m > 1)
            {
                if(!first) System.out.print(" * ");
                System.out.print(m);
                break;
            }
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        System.out.println("Is prime? " + isPrime(n));
        printFactors(n);
        printPrimeFactorPhrase(n);

        in.close();
    }
}
