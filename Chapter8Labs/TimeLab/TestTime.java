import java.util.Scanner;

public class TestTime{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter time A (hours then minutes):");
    int h1 = sc.nextInt();
    int m1 = sc.nextInt();

    Systen.out.println("Enter time B (hours then minutes):");
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    
    Time a = new Time(h1, m1);
    Time b = new Time(h2, m2);

    System.out.println("Time A = " + a);
    System.out.println("Time B = " + b);

    Systen.out.println("A lessThan B:" + a.lessThan(b));
    System.out.println("Minutes elapsed from A to B (assuming A <= B <= A + 24h): " + b.elapsedSince(a));

  }
}
