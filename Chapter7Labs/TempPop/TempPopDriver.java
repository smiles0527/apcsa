package Chapter7Labs/TempPop;
public class TempPopDriver
{
    public static void main(String[] args)
    {
        TempPop tp = new TempPop("Tokyo", "Japan");

        tp.setTemps();
        System.out.println();
        tp.getTemps();
        System.out.println("Highest monthly high (rounded): " + tp.getHigh());
        System.out.println("Average monthly high (rounded): " + tp.getAv());

        System.out.println();
        tp.setPops();
        System.out.println();
        tp.printPopulationStats();
    }
}
