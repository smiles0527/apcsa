package chapter4labs;

public class DataSet2 {
    private int largest;
    private int smallest;

    public DataSet2() {
        largest = Integer.MIN_VALUE;
        smallest = Integer.MAX_VALUE;
    }

    public void addValue(int x) {
        largest = Math.max(largest, x);
        smallest = Math.min(smallest, x);
    }

    public int getLargest() {
        return largest;
    }

    public int getSmallest() {
        return smallest;
    }
}

