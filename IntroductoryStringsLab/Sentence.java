package IntroductoryStringsLab;

public class Sentence {

    private String holder;
    private boolean isEmpty;

    // Creates a new Sentence with Holder empty and isEmpty true
    public Sentence() {
        holder = "";
        isEmpty = true;
    }

    // Creates a new Sentence from take
    public Sentence(String take) {
        holder = take;
        isEmpty = (holder == null || holder.length() == 0);
    }

    // Adds adder to the Sentence
    public void add(String adder) {
        holder = holder + adder;
        isEmpty = (holder.length() == 0);
    }

    // Removes check from the sentence if it is present
    public void remove(String check) {
        if (holder != null && check != null) {
            int index = holder.indexOf(check);
            if (index != -1) {
                holder = holder.substring(0, index) + holder.substring(index + check.length());
            }
        }
        isEmpty = (holder == null || holder.length() == 0);
    }

    // Returns true if the Sentence is empty, false otherwise
    public boolean emptySentence() {
        return isEmpty;
    }

    // Returns true if the two sentences are the same, false otherwise
    public boolean isSame(Sentence input) {
        return holder.equals(input.getSentence());
    }

    // Returns true if the two sentences are the same length, false otherwise
    public boolean sameLength(Sentence input) {
        return holder.length() == input.getSentence().length();
    }

    // Returns how many times letter appears in the Sentence
    public int charCount(String letter) {
        int count = 0;
        // Check to avoid infinite loop or errors if letter is empty
        if (letter == null || letter.length() == 0) {
            return 0;
        }
        
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = holder.indexOf(letter, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += letter.length(); // Move past the found substring
            }
        }
        return count;
    }

    // Returns the entire Sentence
    public String getSentence() {
        return holder;
    }

    // Overrides the toString method and returns a representation of this
    public String toString() {
        return holder;
    }
}

