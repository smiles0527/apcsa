package Chapter6Labs/PerfectNumbers;
import java.util.Scanner;

public class MyMath
{
  public static int sumUpTo(int n)
  {
    int sum = 0;

    for (int i = 1; i <= n; i++)
      sum += i;

    return sum;
  }

  public static long factorial(int n)
  {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  public static boolean isPrime(int n)
  {
    if (n <= 1)
      return false;

    int m = 2;

    while (m * m <= n)
    {
      if (n % m == 0)
        return false;
      m++;
    }

    return true;
  }

  public static boolean testGoldbach(int bigNum)
  {
    for (int n = 6; n <= bigNum; n += 2)
    {
      boolean found2primes = false;

      for (int p = 3; p <= n/2; p += 2)
      {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes)
      {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }

  public static int sumProperDivisors(int n)
  {
    if(n <= 1) return 0;

    int sum = 1;

    for(int d = 2; d * d <= n; d++)
    {
      if(n % d == 0)
      {
        sum += d;
        int other = n / d;
        if(other != d)
          sum += other;
      }
    }

    return sum;
  }

  public static boolean isPerfect(int n)
  {
    if(n <= 1) return false;
    return sumProperDivisors(n) == n;
  }

  public static long pow2(int exp)
  {
    long v = 1;
    for(int i = 0; i < exp; i++)
      v *= 2;
    return v;
  }

  public static int mersenne(int p)
  {
    return (int)(pow2(p) - 1);
  }

  public static long perfectFromMersenneExponent(int p)
  {
    long m = pow2(p) - 1;
    long two = pow2(p - 1);
    return two * m;
  }

  /*********************************************************************/

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    int n;

    do
    {
      System.out.print("Enter an integer from 4 to 20: ");
      n = kb.nextInt();
    } while (n < 4 || n > 20);

    System.out.println();
    System.out.println("1 + ... + " + n + " = " + sumUpTo(n));
    System.out.println(n + "! = " + factorial(n));
    System.out.println("Primes: ");
    for (int k = 1; k <= n; k++)
      if (isPrime(k))
        System.out.print(k + " ");
    System.out.println();
    System.out.println("Goldbach conjecture up to " + n + ": " + testGoldbach(n));

    System.out.println();
    System.out.println("First four perfect numbers (by checking):");

    int foundPerfect = 0;
    int test = 2;

    while(foundPerfect < 4)
    {
      if(isPerfect(test))
      {
        foundPerfect++;
        System.out.println(foundPerfect + ": " + test);
      }
      test++;
    }

    System.out.println();
    System.out.println("First six Mersenne primes and the first six perfect numbers:");

    int foundMersenne = 0;
    int p = 2;

    while(foundMersenne < 6)
    {
      int m = mersenne(p);

      if(isPrime(m))
      {
        foundMersenne++;
        long perfect = perfectFromMersenneExponent(p);
        System.out.println(foundMersenne + ": p=" + p + ", M=" + m + ", perfect=" + perfect);
      }

      p++;
    }

    kb.close();
  }
}
