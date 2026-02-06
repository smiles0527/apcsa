package Chapter4Labs/PeriodEncryption;

import java.util.Scanner;

public class FixedPeriodDriver
{
    public static void main(String[] args)
    {
        int d = 5;
        int[] order = {4, 2, 3, 1, 5};

        FixedPeriodCipher cipher = new FixedPeriodCipher(d, order);

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String msg = in.nextLine();

        String encrypted = cipher.encrypt(msg);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = cipher.decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);

        in.close();
    }
}
