package Chapter7Labs.FitnessTracker;
import java.util.ArrayList;

public class StepTracker
{
    private ArrayList<Integer> steps;

    public StepTracker()
    {
        steps = new ArrayList<Integer>();
    }

    public void addDailySteps(int s)
    {
        steps.add(s);
    }

    public double calculateAverage()
    {
        if(steps.size() == 0) return 0.0;

        long sum = 0;
        for(int i = 0; i < steps.size(); i++)
        {
            sum += steps.get(i);
        }
        return (double)sum / steps.size();
    }

    public int getHighestSteps()
    {
        if(steps.size() == 0) return 0;

        int high = steps.get(0);
        for(int i = 1; i < steps.size(); i++)
        {
            int v = steps.get(i);
            if(v > high) high = v;
        }
        return high;
    }

    public int getDaysTracked()
    {
        return steps.size();
    }
}
