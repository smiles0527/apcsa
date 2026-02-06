package Chapter7Labs/ArrayListLab;
import java.util.ArrayList;

public class Planner
{
    private ArrayList<Date> calendar;
    private ArrayList<String> assignments;

    public Planner(ArrayList<Date> dates)
    {
        calendar = dates;
        assignments = new ArrayList<String>();
    }

    public int dateLength()
    {
        return calendar.size();
    }

    public ArrayList<Date> getCalendar()
    {
        return calendar;
    }

    public ArrayList<String> getAssignments()
    {
        return assignments;
    }

    public void addAssignment(String a)
    {
        assignments.add(0, a);
    }

    public int assignmentLength()
    {
        return assignments.size();
    }

    public boolean containsDate(Date d)
    {
        for(int i = 0; i < calendar.size(); i++)
        {
            if(calendar.get(i).equals(d))
            {
                return true;
            }
        }
        return false;
    }

    public void printAssignments()
    {
        System.out.println(assignments);
    }
}
