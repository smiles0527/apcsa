public class LabRunner {
    public static void main(String[] args) {
        System.out.println(AlphabetAligner.merge("AD", "BC"));
        System.out.println(AlphabetAligner.align("dcba"));
        System.out.println(AlphabetAligner.align("banana"));

        StringProcessor sp = new StringProcessor();
        sp.processFile("words.txt");

        System.out.println("Processed words:");
        sp.displayWords();

        sp.sortList();
        System.out.println("Sorted list:");
        sp.displayWords();
    }
}
