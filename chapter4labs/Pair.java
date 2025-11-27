package chapter4labs;

public class Pair {
    private double first;
    private double second;

    /**
     * Constructs a pair.
     * @param aFirst the first value of the pair
     * @param aSecond the second value of the pair
     */
    public Pair(double aFirst, double aSecond) {
        first = aFirst;
        second = aSecond;
    }

    /**
     * Computes the sum of the values of this pair.
     * @return the sum of the first and second values
     */
    public double getSum() {
        return first + second;
    }

    /**
     * Computes the difference of the values of this pair.
     * @return the difference of the first and second values
     */
    public double getDifference() {
        return first - second;
    }

    /**
     * Computes the product of the values of this pair.
     * @return the product of the first and second values
     */
    public double getProduct() {
        return first * second;
    }

    /**
     * Computes the average of the values of this pair.
     * @return the average of the first and second values
     */
    public double getAverage() {
        return (first + second) / 2.0;
    }

    /**
     * Computes the distance (absolute difference) of the values of this pair.
     * @return the distance between the first and second values
     */
    public double getDistance() {
        return Math.abs(first - second);
    }

    /**
     * Computes the maximum of the values of this pair.
     * @return the larger of the first and second values
     */
    public double getMaximum() {
        return Math.max(first, second);
    }

    /**
     * Computes the minimum of the values of this pair.
     * @return the smaller of the first and second values
     */
    public double getMinimum() {
        return Math.min(first, second);
    }
}

