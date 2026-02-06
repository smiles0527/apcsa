package Chapter4Labs.StringsLab;

public class Sentence {

    private String holder;
    private boolean isEmpty;

    // Creates a new Sentence with holder empty and isEmpty true
    public Sentence() {
        holder = "";
        isEmpty = true;
    }

    // Creates a new Sentence from take
    public Sentence(String take) {
        if (take == null || take.length() == 0) {
            holder = "";
            isEmpty = true;
        } else {
            holder = take;
            isEmpty = false;
        }
    }

    // Adds adder to the Sentence
    public void add(String adder) {
        if (adder == null || adder.length() == 0) {
            return;
        }

        if (isEmpty) {
            holder = adder;
        } else {
            holder = holder + adder;
        }

        isEmpty = holder.length() == 0;
    }

    // Removes check from the sentence if it is present
    public void remove(String check) {
        if (check == null || check.length() == 0 || isEmpty) {
            return;
        }

        holder = holder.replace(check, "");
        isEmpty = holder.length() == 0;
    }

    // Returns true if the Sentence is empty, false otherwise
    public boolean emptySentence() {
        return isEmpty;
    }

    // Returns true if the two sentences are the same, false otherwise
    public boolean isSame(Sentence input) {
        if (input == null) {
            return false;
        }
        return holder.equals(input.holder);
    }

    // Returns true if the two sentences are the same length, false otherwise
    public boolean sameLength(Sentence input) {
        if (input == null) {
            return false;
        }
        return holder.length() == input.holder.length();
    }

    // Returns how many times letter appears in the Sentence
    public int charCount(String letter) {
        if (letter == null || letter.length() == 0 || isEmpty) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i <= holder.length() - letter.length(); i++) {
            if (holder.substring(i, i + letter.length()).equals(letter)) {
                count++;
            }
        }

        return count;
    }

    // Returns the entire Sentence
    public String getSentence() {
        return holder;
    }

    // Overrides toString and returns a representation of this object
    public String toString() {
        return holder;
    }
}
