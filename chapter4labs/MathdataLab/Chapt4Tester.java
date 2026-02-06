package Chapter4Labs.MathdataLab;

import java.util.Scanner;

public class Chapt4Tester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = in.nextDouble();

        System.out.print("Enter second number: ");
        double b = in.nextDouble();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference (a - b): " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Average: " + ((a + b) / 2.0));
        System.out.println("Distance |a - b|: " + Math.abs(a - b));
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Minimum: " + Math.min(a, b));

        Pair p = new Pair(a, b);
        System.out.println();
        System.out.println("Pair.getSum(): " + p.getSum());
        System.out.println("Pair.getDifference(): " + p.getDifference());
        System.out.println("Pair.getProduct(): " + p.getProduct());
        System.out.println("Pair.getAverage(): " + p.getAverage());
        System.out.println("Pair.getDistance(): " + p.getDistance());
        System.out.println("Pair.getMaximum(): " + p.getMaximum());
        System.out.println("Pair.getMinimum(): " + p.getMinimum());

        System.out.println();

        DataSet ds = new DataSet();
        ds.addValue(10);
        ds.addValue(20);
        ds.addValue(30);
        ds.addValue(40);
        System.out.println("DataSet expected sum = 100, actual sum = " + ds.getSum());
        System.out.println("DataSet expected average = 25.0, actual average = " + ds.getAverage());

        System.out.println();

        DataSet2 ds2 = new DataSet2();
        ds2.addValue(10);
        ds2.addValue(20);
        ds2.addValue(30);
        ds2.addValue(40);
        System.out.println("DataSet2 expected largest = 40, actual largest = " + ds2.getLargest());
        System.out.println("DataSet2 expected smallest = 10, actual smallest = " + ds2.getSmallest());

        System.out.println();

        System.out.print("Enter soda can height: ");
        double h = in.nextDouble();
        System.out.print("Enter soda can diameter: ");
        double d = in.nextDouble();
        SodaCan can = new SodaCan(h, d);
        System.out.println("SodaCan volume: " + can.getVolume());
        System.out.println("SodaCan surface area: " + can.getSurfaceArea());

        System.out.println();

        System.out.print("Enter a measurement in meters: ");
        double meters = in.nextDouble();

        Converter metersToInches = new Converter(39.37007874015748);
        double totalInches = metersToInches.convertTo(meters);

        int feet = (int) (totalInches / 12.0);
        double inches = totalInches - 12.0 * feet;

        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);

        final double MILE_TO_KM = 1.609;
        Converter milesToMeters = new Converter(1000.0 * MILE_TO_KM);
        System.out.println("1 mile in meters: " + milesToMeters.convertTo(1.0));

        System.out.println();

        System.out.print("Enter a non-negative integer (up to 5 digits): ");
        int n = in.nextInt();
        DigitExtractor ex = new DigitExtractor(n);

        System.out.println(ex.nextDigit());
        System.out.println(ex.nextDigit());
