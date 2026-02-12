package FRQ.2019;
import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimiters = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel)) {
                delimiters.add(token);
            }
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int balance = 0;
        for (String delimiter : delimiters) {
            balance += delimiter.equals(openDel) ? 1 : -1;
            if (balance < 0) return false;
        }
        return balance == 0;
    }

    public static void main(String[] args) {
        String[] tokens = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        Delimiters d = new Delimiters("<sup>", "</sup>");
        ArrayList<String> delimitersList = d.getDelimitersList(tokens);
        System.out.println(d.isBalanced(delimitersList));
    }
}
