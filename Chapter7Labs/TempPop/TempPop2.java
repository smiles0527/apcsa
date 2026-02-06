package Chapter7Labs/TempPop;
import java.util.ArrayList;
import java.util.Scanner;

public class TempPop2
{
    private String city;
    private String country;
    private ArrayList<MonthTemp> temps;
    private ArrayList<Integer> population;
    private int startYear;

    public TempPop2(String cityName, String countryName)
    {
        city = cityName;
        country = countryName;
        temps = new ArrayList<MonthTemp>();
        population = new ArrayList<Integer>();
        startYear = 0;
    }

    public void setTemps()
    {
        Scanner in = new Scanner(System.in);

        temps.clear();

        String[] months = monthNames();
        for(int i = 0; i < 12; i++)
        {
            System.out.print("Enter high temperature for " + city + " in " + months[i] + ": ");
            double t = in.nextDouble();
            temps.add(new MonthTemp(months[i], t));
        }
    }

    public void setPops()
    {
        Scanner in = new Scanner(System.in);

        population.clear();

        System.out.print("Enter the starting year (oldest of the 10 years): ");
        startYear = in.nextInt();

        for(int i = 0; i < 10; i++)
        {
            int year = startYear + i;
            System.out.print("Enter population for " + country + " in " + year + " (tenths of a million, e.g. 389 = 38.9M): ");
            int tenthsMillion = in.nextInt();
            population.add(tenthsMillion);
        }
    }

    public void getTemps()
    {
        for(int i = 0; i < temps.size(); i++)
        {
            System.out.println(temps.get(i).toString());
        }
    }

    public int getHigh()
    {
        if(temps.size() == 0) return 0;

        double high = temps.get(0).getHigh();
        for(int i = 1; i < temps.size(); i++)
        {
            double v = temps.get(i).getHigh();
            if(v > high) high = v;
        }
        return (int)Math.round(high);
    }

    public int getAv()
    {
        if(temps.size() == 0) return 0;

        double sum = 0.0;
        for(int i = 0; i < temps.size(); i++)
        {
            sum += temps.get(i).getHigh();
        }
        double avg = sum / temps.size();
        return (int)Math.round(avg);
    }

    public void changeMonth()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter month name to change: ");
        String m = in.nextLine().trim();

        int idx = findMonthIndex(m);
        if(idx == -1)
        {
            System.out.println("Month not found.");
            return;
        }

        MonthTemp mt = temps.get(idx);
        double oldVal = mt.getHigh();

        System.out.print("Enter new high temperature for " + mt.getMonth() + ": ");
        double newVal = Double.parseDouble(in.nextLine().trim());

        mt.setHigh(newVal);

        System.out.println(mt.getMonth() + "'s temperature was " + oldVal + ", now is " + newVal + ".");
    }

    public void printPopulationStats()
    {
        if(population.size() == 0)
        {
            System.out.println("No population data.");
            return;
        }

        int maxVal = population.get(0);
        int minVal = population.get(0);
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 1; i < population.size(); i++)
        {
            int v = population.get(i);
            if(v > maxVal)
            {
                maxVal = v;
                maxIndex = i;
            }
            if(v < minVal)
            {
                minVal = v;
                minIndex = i;
            }
        }

        long maxPeople = (long)maxVal * 100000L;
        long minPeople = (long)minVal * 100000L;

        System.out.println("MAX POPULATION FOR " + country + " IN LAST 10 YEARS IS: " + maxPeople + " PEOPLE");
        System.out.println("MIN POPULATION FOR " + country + " IN LAST 10 YEARS IS: " + minPeople + " PEOPLE");

        int first = population.get(0);
        int last = population.get(population.size() - 1);
        long netChangePeople = (long)(last - first) * 100000L;

        System.out.println("TOTAL NET POPULATION CHANGE OF " + country + " IN LAST 10 YEARS IS " + netChangePeople + ".");

        if(startYear != 0)
        {
            System.out.println("YEAR OF MAX POPULATION: " + (startYear + maxIndex));
            System.out.println("YEAR OF MIN POPULATION: " + (startYear + minIndex));
        }
    }

    private int findMonthIndex(String monthName)
    {
        String target = monthName.toLowerCase();
        for(int i = 0; i < temps.size(); i++)
        {
            if(temps.get(i).getMonth().toLowerCase().equals(target))
            {
                return i;
            }
        }
        return -1;
    }

    private String[] monthNames()
    {
        return new String[] {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
        };
    }
}
