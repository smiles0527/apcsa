package iflab;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Rock Paper Scissors Game");
        System.out.println("1. Two Players");
        System.out.println("2. One Player (vs Computer)");
        System.out.print("Select mode (1 or 2): ");
        int mode = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String player1Choice = "";
        String player2Choice = "";

        if (mode == 1) {
            System.out.print("Player 1, enter Rock, Paper, or Scissors: ");
            player1Choice = scanner.nextLine();
            System.out.print("Player 2, enter Rock, Paper, or Scissors: ");
            player2Choice = scanner.nextLine();
        } else if (mode == 2) {
            System.out.print("Player 1, enter Rock, Paper, or Scissors: ");
            player1Choice = scanner.nextLine();
            
            // Computer choice
            int rand = random.nextInt(3); // 0, 1, 2
            if (rand == 0) player2Choice = "Rock";
            else if (rand == 1) player2Choice = "Paper";
            else player2Choice = "Scissors";
            
            System.out.println("Computer chose: " + player2Choice);
        } else {
            System.out.println("Invalid mode selected.");
            scanner.close();
            return;
        }

        determineWinner(player1Choice, player2Choice);
        scanner.close();
    }

    public static void determineWinner(String p1, String p2) {
        // Normalize inputs
        p1 = p1.trim().toLowerCase();
        p2 = p2.trim().toLowerCase();

        if (!isValid(p1) || !isValid(p2)) {
            System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
            return;
        }

        if (p1.equals(p2)) {
            System.out.println("It's a tie!");
        } else if (p1.equals("rock")) {
            if (p2.equals("scissors")) System.out.println("Player 1 wins! Rock crushes Scissors.");
            else System.out.println("Player 2 wins! Paper covers Rock.");
        } else if (p1.equals("paper")) {
            if (p2.equals("rock")) System.out.println("Player 1 wins! Paper covers Rock.");
            else System.out.println("Player 2 wins! Scissors cuts Paper.");
        } else if (p1.equals("scissors")) {
            if (p2.equals("paper")) System.out.println("Player 1 wins! Scissors cuts Paper.");
            else System.out.println("Player 2 wins! Rock crushes Scissors.");
        }
    }

    public static boolean isValid(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }
}
