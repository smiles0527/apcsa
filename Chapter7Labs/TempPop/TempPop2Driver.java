package Chapter7Labs.TempPop;
public class TempPop2Driver
{
    public static void main(String[] args)
    {
        TempPop2 tp = new TempPop2("Tokyo", "Japan");

        tp.setTemps();
        System.out.println();
        tp.getTemps();
        System.out.println("Highest monthly high (rounded): " + tp.getHigh());
        System.out.println("Average monthly high (rounded): " + tp.getAv());

        System.out.println();
        tp.changeMonth();

        System.out.println();
        tp.getTemps();

        System.out.println();
        tp.setPops();
        System.out.println();
        tp.printPopulationStats();
    }
}
