package chapter4labs;

public class DataSet {
    private int sum;
    private int count;

    public DataSet() {
        sum = 0;
        count = 0;
    }

    public void addValue(int x) {
        sum = sum + x;
        count++;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        if (count == 0) return 0;
        return (double) sum / count;
    }
}

