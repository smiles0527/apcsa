package Chapter7Labs/ArrayListLab;
import java.util.ArrayList;

public class StringList
{
    public static int length(ArrayList<String> words)
    {
        return words.size();
    }

    public static int totalLength(ArrayList<String> words)
    {
        int sum = 0;
        for(int i = 0; i < words.size(); i++)
        {
            sum += words.get(i).length();
        }
        return sum;
    }

    public static ArrayList<String> add(ArrayList<String> words, String newWord)
    {
        words.add(newWord);
        return words;
    }

    public static int indexOf(ArrayList<String> words, String target)
    {
        for(int i = 0; i < words.size(); i++)
        {
            if(words.get(i).equals(target))
            {
                return i;
            }
        }
        return -1;
    }

    public static int count(ArrayList<String> words, String target)
    {
        int c = 0;
        for(int i = 0; i < words.size(); i++)
        {
            if(words.get(i).equals(target))
            {
                c++;
            }
        }
        return c;
    }

    public static ArrayList<String> addOrder(ArrayList<String> words, String newWord)
    {
        int spot = words.size();

        for(int i = 0; i < words.size(); i++)
        {
            if(newWord.compareTo(words.get(i)) < 0)
            {
                spot = i;
                break;
            }
        }

        words.add(spot, newWord);
        return words;
    }
}
