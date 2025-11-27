package chapter4labs;

public class DigitExtractor {
    private int integer;

    /**
     * Constructs a digit extractor that gets the digits
     * of an integer in reverse order.
     * @param anInteger the integer to break up into digits
     */
    public DigitExtractor(int anInteger) {
        integer = anInteger;
    }

    /**
     * Returns the next digit to be extracted.
     * @return the next digit
     */
    public int nextDigit() {
        int digit = integer % 10;
        integer = integer / 10;
        return digit;
    }
}

