package Chapter7Labs.FitnessTracker;
import java.io.File;
import java.util.Scanner;

public class FitnessClient
{
    public static void main(String[] args) throws Exception
    {
        StepTracker tracker = new StepTracker();

        File f = new File("steps.txt");
        Scanner fileIn = new Scanner(f);

        while(fileIn.hasNextLine())
        {
            String line = fileIn.nextLine().trim();

            if(line.length() == 0)
            {
                continue;
            }

            int value;
            try
            {
                value = Integer.parseInt(line);
            }
            catch(NumberFormatException e)
            {
                continue;
            }

            if(value >= 0)
            {
                tracker.addDailySteps(value);
            }
        }

        fileIn.close();

        int days = tracker.getDaysTracked();
        double avg = tracker.calculateAverage();
        int best = tracker.getHighestSteps();

        System.out.println("Total days tracked: " + days);
        System.out.printf("Average steps: %.2f%n", avg);
        System.out.println("Personal best: " + best);
    }
}
