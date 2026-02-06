package Chapter4Labs/StringsLab;

public class SentenceTester {

    public static void main(String[] args) {

        Sentence s1 = new Sentence();
        System.out.println("s1 empty? expected true -> " + s1.emptySentence());

        s1.add("Hello");
        System.out.println("s1 after add Hello -> " + s1);

        s1.add(" World");
        System.out.println("s1 after add World -> " + s1);

        Sentence s2 = new Sentence("Hello World");
        System.out.println("s2 -> " + s2);

        System.out.println("s1 same as s2? expected true -> " + s1.isSame(s2));
        System.out.println("same length? expected true -> " + s1.sameLength(s2));

        System.out.println("count of 'l' in s1 expected 3 -> " + s1.charCount("l"));

        s1.remove("World");
        System.out.println("s1 after remove World -> " + s1);

        System.out.println("s1 empty? expected false -> " + s1.emptySentence());

        s1.remove("Hello ");
        System.out.println("s1 after removing all -> " + s1);
        System.out.println("s1 empty? expected true -> " + s1.emptySentence());
    }
}
