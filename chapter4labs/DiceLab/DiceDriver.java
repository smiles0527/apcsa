package Chapter4Labs.DiceLab;

public class DiceDriver
{
    public static void main(String[] args)
    {
        Dice d = new Dice();
        d.roll();

        int a = d.getDie1();
        int b = d.getDie2();
        int total = a + b;

        System.out.println("The first die comes up " + a);
        System.out.println("The second die comes up " + b);
        System.out.println("Your total roll is " + total);
    }
}
