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
    
    // Encrypts the sentence using fixed period encryption
    public String encrypt(int d, int[] order) {
        if (holder == null) return "";
        
        // Change to lower case and remove spaces
        String clean = holder.toLowerCase().replace(" ", "");
        
        // Pad with @ if needed
        while (clean.length() % d != 0) {
            clean += "@";
        }
        
        String result = "";
        
        // Process in blocks
        for (int i = 0; i < clean.length(); i += d) {
            String block = clean.substring(i, i + d);
            char[] encryptedBlock = new char[d];
            
            // Apply permutation
            // output[j] = source[order[j] - 1]
            for (int j = 0; j < d; j++) {
                int sourceIndex = order[j] - 1;
                if (sourceIndex >= 0 && sourceIndex < d) {
                    encryptedBlock[j] = block.charAt(sourceIndex);
                }
            }
            
            result += new String(encryptedBlock) + " ";
        }
        
        return result.trim();
    }
    
    // Decrypts the sentence assuming it contains encrypted text
    public String decrypt(int d, int[] order) {
        if (holder == null) return "";
        
        // Remove spaces (separators between blocks)
        String input = holder.replace(" ", "");
        
        // Input length should be multiple of d. If not, maybe something is wrong, but we proceed.
        
        String result = "";
        
        for (int i = 0; i < input.length(); i += d) {
            // Ensure we don't go out of bounds if last block is partial (shouldn't happen with padding)
            int endIndex = Math.min(i + d, input.length());
            String block = input.substring(i, endIndex);
            
            if (block.length() < d) {
                // Should not happen if padded correctly, but handle gracefully
                result += block; 
                continue;
            }
            
            char[] decryptedBlock = new char[d];
            
            // Reverse permutation
            // source[order[j] - 1] = output[j]
            for (int j = 0; j < d; j++) {
                int targetIndex = order[j] - 1; // This is where the char belongs in the original string
                if (targetIndex >= 0 && targetIndex < d) {
                    decryptedBlock[targetIndex] = block.charAt(j);
                }
            }
            
            result += new String(decryptedBlock);
        }
        
        // Remove trailing @ symbols
        // We iterate from the end and remove @
        int lastIndex = result.length() - 1;
        while (lastIndex >= 0 && result.charAt(lastIndex) == '@') {
            lastIndex--;
        }
        
        return result.substring(0, lastIndex + 1);
    }
}
