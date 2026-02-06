package Chapter6Labs.Loops;
public class PowerGeneratorRunner
{
    public static void main(String[] args)
    {
        PowerGenerator myGenerator = new PowerGenerator(10.0);

        for(int i = 0; i < 12; i++)
        {
            System.out.println(myGenerator.nextPower());
        }
    }
}
