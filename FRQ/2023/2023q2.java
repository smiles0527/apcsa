public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        if (message.length() == 0) {
            return 0;
        }
        // Ceiling division: total chars / width, rounded up
        return (message.length() + width - 1) / width;
    }

    public String getLines() {
        if (message.length() == 0) {
            return null;
        }
        String result = "";
        for (int i = 0; i < message.length(); i += width) {
            if (i > 0) {
                result += ";";
            }
            result += message.substring(i, Math.min(i + width, message.length()));
        }
        return result;
    }
}
