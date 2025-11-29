package IntroductoryStringsLab;

import java.util.Scanner;

public class SentenceRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Hardwired d and order as requested for the first part
        int d = 5;
        int[] order = {4, 2, 3, 1, 5};
        
        System.out.println("--- Fixed Period Encryption ---");
        System.out.println("Default configuration: d=" + d + ", order={4, 2, 3, 1, 5}");
        
        // Prompt for sentence
        System.out.println("Please enter a sentence to encrypt:");
        String inputLine = scanner.nextLine();
        
        Sentence sentenceToEncrypt = new Sentence(inputLine);
        String encrypted = sentenceToEncrypt.encrypt(d, order);
        
        System.out.println("Encrypted message: " + encrypted);
        
        // Decryption part
        System.out.println("\n--- Decryption ---");
        // Create a new Sentence object with the encrypted text
        // Note: The encrypted text contains spaces between blocks, which we handle in decrypt
        Sentence sentenceToDecrypt = new Sentence(encrypted);
        String decrypted = sentenceToDecrypt.decrypt(d, order);
        
        System.out.println("Decrypted message: " + decrypted);
        
        // Extension: User defined d and order
        System.out.println("\n--- Extension: Custom Encryption ---");
        System.out.print("Do you want to try custom parameters? (y/n): ");
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter value for d: ");
            int customD = Integer.parseInt(scanner.nextLine());
            
            int[] customOrder = new int[customD];
            System.out.println("Enter the order numbers (1 to " + customD + ") separated by spaces or newlines:");
            for (int i = 0; i < customD; i++) {
                customOrder[i] = scanner.nextInt();
            }
            scanner.nextLine(); // consume newline
            
            System.out.println("Enter sentence to encrypt:");
            String customLine = scanner.nextLine();
            
            Sentence customSentence = new Sentence(customLine);
            String customEncrypted = customSentence.encrypt(customD, customOrder);
            System.out.println("Encrypted: " + customEncrypted);
            
            Sentence decryptCustom = new Sentence(customEncrypted);
            System.out.println("Decrypted: " + decryptCustom.decrypt(customD, customOrder));
        }
        
        scanner.close();
    }
}
