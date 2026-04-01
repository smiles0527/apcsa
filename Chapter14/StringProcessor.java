import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StringProcessor {
    private ArrayList<String> sortedWords;

    public StringProcessor() {
        sortedWords = new ArrayList<String>();
    }

    public void processFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String word = input.next();
                sortedWords.add(AlphabetAligner.align(word));
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    public void displayWords() {
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }

    public void sortList() {
        for (int i = 0; i < sortedWords.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < sortedWords.size(); j++) {
                if (sortedWords.get(j).compareTo(sortedWords.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            String temp = sortedWords.get(i);
            sortedWords.set(i, sortedWords.get(minIndex));
            sortedWords.set(minIndex, temp);
        }
    }
}
