public class AlphabetAligner {
    public static String merge(String s1, String s2) {
        String result = "";
        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {
            String c1 = s1.substring(i, i + 1);
            String c2 = s2.substring(j, j + 1);

            if (c1.compareTo(c2) <= 0) {
                result += c1;
                i++;
            } else {
                result += c2;
                j++;
            }
        }

        while (i < s1.length()) {
            result += s1.substring(i, i + 1);
            i++;
        }

        while (j < s2.length()) {
            result += s2.substring(j, j + 1);
            j++;
        }

        return result;
    }

    public static String align(String str) {
        if (str.length() <= 1) {
            return str;
        }

        int mid = (str.length() + 1) / 2;
        String left = str.substring(0, mid);
        String right = str.substring(mid);

        String sortedLeft = align(left);
        String sortedRight = align(right);

        return merge(sortedLeft, sortedRight);
    }
}
