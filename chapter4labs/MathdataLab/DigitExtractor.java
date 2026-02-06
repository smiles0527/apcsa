package Chapter4Labs/MathdataLab;

public class DigitExtractor
{
    private int remaining;

    public DigitExtractor(int anInteger)
    {
        remaining = anInteger;
    }

    public int nextDigit()
    {
        int d = remaining % 10;
        remaining = remaining / 10;
        return d;
    }
}
