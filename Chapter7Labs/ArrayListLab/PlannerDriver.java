package Chapter7Labs/ArrayListLab;
import java.util.ArrayList;

public class PlannerDriver
{
    public static void main(String[] args)
    {
        ArrayList<Date> dates = new ArrayList<Date>();
        dates.add(new Date(2, 10, 2026));
        dates.add(new Date(2, 11, 2026));
        dates.add(new Date(2, 12, 2026));

        Planner p = new Planner(dates);

        System.out.println("dateLength expected 3 -> " + p.dateLength());

        p.addAssignment("Math worksheet");
        p.addAssignment("English essay");
        p.addAssignment("CS lab");

        System.out.println("assignmentLength expected 3 -> " + p.assignmentLength());
        p.printAssignments();

        System.out.println("contains 2/11/2026 expected true -> " + p.containsDate(new Date(2, 11, 2026)));
        System.out.println("contains 3/1/2026 expected false -> " + p.containsDate(new Date(3, 1, 2026)));
    }
}
