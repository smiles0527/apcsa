package iflab;

import java.util.Scanner;
import java.text.NumberFormat;

public class CSCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.print("Enter Previous Balance: ");
        double prevBalance = scan.nextDouble();

        System.out.print("Enter Additional Charges: ");
        double additionalCharges = scan.nextDouble();

        double interest = 0;
        if (prevBalance > 0) {
            interest = (prevBalance + additionalCharges) * 0.02;
        }

        double newBalance = prevBalance + additionalCharges + interest;
        double minPayment = 0;

        if (newBalance < 50) {
            minPayment = newBalance;
        } else if (newBalance >= 50 && newBalance <= 300) {
            minPayment = 50.00;
        } else {
            minPayment = newBalance * 0.20;
        }

        System.out.println();
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Previous Balance:      " + money.format(prevBalance));
        System.out.println("Additional Charges:    " + money.format(additionalCharges));
        System.out.println("Interest:              " + money.format(interest));
        System.out.println();
        System.out.println("New Balance:           " + money.format(newBalance));
        System.out.println();
        System.out.println("Minimum Payment:       " + money.format(minPayment));

        scan.close();
    }
}
