package Chapter7Labs/ArrayListLab;
import java.util.ArrayList;

public class StringListDriver
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("banana");
        words.add("happy");
        words.add("banana");
        words.add("bob");

        System.out.println("length expected 4 -> " + StringList.length(words));
        System.out.println("totalLength expected 5+5+6+3=19 -> " + StringList.totalLength(words));

        StringList.add(words, "win");
        System.out.println("after add win, length expected 5 -> " + StringList.length(words));

        System.out.println("indexOf banana expected 0 -> " + StringList.indexOf(words, "banana"));
        System.out.println("indexOf bob expected 3 -> " + StringList.indexOf(words, "bob"));
        System.out.println("indexOf zzz expected -1 -> " + StringList.indexOf(words, "zzz"));

        System.out.println("count banana expected 2 -> " + StringList.count(words, "banana"));

        ArrayList<String> ordered = new ArrayList<String>();
        ordered.add("apple");
        ordered.add("banana");
        ordered.add("carrot");
        ordered.add("pear");

        StringList.addOrder(ordered, "blueberry");
        System.out.println("ordered after blueberry expected apple banana blueberry carrot pear -> " + ordered);
    }
}
