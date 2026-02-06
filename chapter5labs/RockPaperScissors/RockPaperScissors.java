package Chapter5Labs.RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors
{
    public static String winner(String p1, String p2)
    {
        if(p1.equals(p2)) return "Tie";

        if(p1.equals("rock") && p2.equals("scissors")) return "Player 1 wins";
        if(p1.equals("scissors") && p2.equals("paper")) return "Player 1 wins";
        if(p1.equals("paper") && p2.equals("rock")) return "Player 1 wins";

        return "Player 2 wins";
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Player 1 (rock/paper/scissors): ");
        String p1 = in.next().toLowerCase();

        System.out.print("Player 2 (rock/paper/scissors): ");
        String p2 = in.next().toLowerCase();

        System.out.println(winner(p1, p2));

        int r = (int)(Math.random() * 3);
        String comp = r == 0 ? "rock" : r == 1 ? "paper" : "scissors";

        System.out.println("Computer chose " + comp);
        System.out.println(winner(p1, comp));

        in.close();
    }
}
