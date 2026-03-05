public static String scramble(String str) {
    if (str.length() == 1) {
        return str;
    }

    int mid = (str.length() + 1) / 2;
    String left = str.substring(0, mid);
    String right = str.substring(mid);

    return scramble(right) + scramble(left);
}
