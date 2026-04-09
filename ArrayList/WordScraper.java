public void processWord(String t) {
    for (int k = 0; k < allWords.size(); k++) {
        if (allWords.get(k).getText().equals(t)) {
            allWords.get(k).increment();
            return;
        }
    }

    allWords.add(new Word(t));
}

public int removeRareWords(int threshold) {
    int totalRemoved = 0;
    int k = 0;

    while (k < allWords.size()) {
        if (allWords.get(k).getCount() <= threshold) {
            totalRemoved += allWords.get(k).getCount();
            allWords.remove(k);
        } else {
            k++;
        }
    }

    return totalRemoved;
}
