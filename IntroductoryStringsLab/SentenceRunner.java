package IntroductoryStringsLab;

public class SentenceRunner {
    public static void main(String[] args) {
        // Test Default Constructor
        Sentence s1 = new Sentence();
        System.out.println("s1 (empty): " + s1);
        System.out.println("s1 isEmpty: " + s1.emptySentence());

        // Test Parameter Constructor
        Sentence s2 = new Sentence("Hello World");
        System.out.println("s2: " + s2);
        System.out.println("s2 isEmpty: " + s2.emptySentence());

        // Test Add
        s1.add("Java");
        System.out.println("s1 after add('Java'): " + s1);
        System.out.println("s1 isEmpty: " + s1.emptySentence());

        s2.add("!");
        System.out.println("s2 after add('!'): " + s2);

        // Test Remove
        s2.remove("World");
        System.out.println("s2 after remove('World'): " + s2);
        
        s2.remove("z"); // Remove something not there
        System.out.println("s2 after remove('z') (should be same): " + s2);

        // Test isSame
        Sentence s3 = new Sentence("Java");
        System.out.println("s1 isSame s3 (true): " + s1.isSame(s3));
        
        Sentence s4 = new Sentence("Hello !");
        System.out.println("s2 isSame s4 (true): " + s2.isSame(s4));

        // Test sameLength
        Sentence s5 = new Sentence("Four");
        Sentence s6 = new Sentence("Five"); // Same length 4
        System.out.println("s5 sameLength s6 (true): " + s5.sameLength(s6));
        System.out.println("s1 sameLength s5 (true): " + s1.sameLength(s5)); // Java vs Four

        // Test charCount
        Sentence s7 = new Sentence("mississippi");
        System.out.println("s7: " + s7);
        System.out.println("Count of 'i' in s7: " + s7.charCount("i"));
        System.out.println("Count of 's' in s7: " + s7.charCount("s"));
        System.out.println("Count of 'p' in s7: " + s7.charCount("p"));
        
        // Test getSentence
        System.out.println("s7 getSentence(): " + s7.getSentence());
    }
}

