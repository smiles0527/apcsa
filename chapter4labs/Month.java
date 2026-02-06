package Chapter4Labs;

public class Month
{
    public String getName(int n)
    {
        String all = "January February March April May June July August September October November December";
        int start = 0;

        for(int i = 1; i < n; i++)
        {
            int space = all.indexOf(" ", start);
            start = space + 1;
        }

        int end = all.indexOf(" ", start);
        if(end == -1)
        {
            end = all.length();
        }

        if(n < 1 || n > 12)
        {
            return "Invalid";
        }

        return all.substring(start, end);
    }
}
