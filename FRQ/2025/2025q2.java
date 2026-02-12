public class SignatureMod {
    private String first;
    private String last;

    public SignatureMod(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getSignature() {
        if (first.length() == 0) {
            return last;
        }
        return first.substring(0, 1) + "-" + last;
    }

    public String addSignature(String text) {
        String sig = getSignature();
        int idx = text.indexOf(sig);
        if (idx == -1) {
            // Signature not found: append to end
            return text + sig;
        } else if (idx + sig.length() == text.length()) {
            // Signature at end: return unchanged
            return text;
        } else {
            // Signature at beginning: remove from beginning, append to end
            return text.substring(sig.length()) + sig;
        }
    }
}
