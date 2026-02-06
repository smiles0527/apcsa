package Chapter4Labs.PeriodEncryption;

public class FixedPeriodCipher
{
    private int d;
    private int[] order;

    public FixedPeriodCipher(int period, int[] permutation)
    {
        d = period;
        order = new int[d];
        for(int i = 0; i < d; i++)
        {
            order[i] = permutation[i];
        }
    }

    public String encrypt(String plain)
    {
        String cleaned = clean(plain);
        String padded = pad(cleaned);

        String out = "";
        int i = 0;
        while(i < padded.length())
        {
            String block = padded.substring(i, i + d);
            String enc = "";

            for(int j = 0; j < d; j++)
            {
                int pick = order[j] - 1;
                enc = enc + block.charAt(pick);
            }

            out = out + enc;
            i += d;

            if(i < padded.length())
            {
                out = out + " ";
            }
        }

        return out;
    }

    public String decrypt(String cipher)
    {
        String cleaned = removeSpaces(cipher.toLowerCase());

        String out = "";
        int i = 0;
        while(i < cleaned.length())
        {
            String block = cleaned.substring(i, i + d);
            char[] plainBlock = new char[d];

            for(int j = 0; j < d; j++)
            {
                int pos = order[j] - 1;
                plainBlock[pos] = block.charAt(j);
            }

            out = out + new String(plainBlock);
            i += d;
        }

        return out;
    }

    private String clean(String s)
    {
        if(s == null)
        {
            return "";
        }

        String lower = s.toLowerCase();
        String out = "";

        for(int i = 0; i < lower.length(); i++)
        {
            char c = lower.charAt(i);
            if(c != ' ')
            {
                out = out + c;
            }
        }

        return out;
    }

    private String removeSpaces(String s)
    {
        String out = "";
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c != ' ')
            {
                out = out + c;
            }
        }
        return out;
    }

    private String pad(String s)
    {
        String out = s;
        int rem = out.length() % d;

        if(rem == 0)
        {
            return out;
        }

        int need = d - rem;
        for(int i = 0; i < need; i++)
        {
            out = out + "@";
        }

        return out;
    }
}
