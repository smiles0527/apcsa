public static boolean isPathComplete(int[] path, int index) {
    if (path[index] == 0) {
        return false;
    }

    int nextIndex = index + path[index];

    if (nextIndex >= path.length - 1) {
        return true;
    }

    return isPathComplete(path, nextIndex);
}
