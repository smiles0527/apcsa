package chapter4labs;

import java.util.Scanner;

public class Chapt4Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Test Pair ---
        System.out.println("--- Pair Test ---");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Pair pair = new Pair(num1, num2);
        System.out.println("Sum: " + pair.getSum());
        System.out.println("Difference: " + pair.getDifference());
        System.out.println("Product: " + pair.getProduct());
        System.out.println("Average: " + pair.getAverage());
        System.out.println("Distance: " + pair.getDistance());
        System.out.println("Maximum: " + pair.getMaximum());
        System.out.println("Minimum: " + pair.getMinimum());
        System.out.println();

        // --- Test DataSet ---
        System.out.println("--- DataSet Test ---");
        DataSet dataSet = new DataSet();
        dataSet.addValue(10);
        dataSet.addValue(20);
        dataSet.addValue(30);
        dataSet.addValue(40);
        System.out.println("Expected Sum: 100, Actual: " + dataSet.getSum());
        System.out.println("Expected Average: 25.0, Actual: " + dataSet.getAverage());
        System.out.println();

        // --- Test DataSet2 ---
        System.out.println("--- DataSet2 Test ---");
        DataSet2 dataSet2 = new DataSet2();
        dataSet2.addValue(10);
        dataSet2.addValue(-5);
        dataSet2.addValue(100);
        dataSet2.addValue(0);
        System.out.println("Expected Largest: 100, Actual: " + dataSet2.getLargest());
        System.out.println("Expected Smallest: -5, Actual: " + dataSet2.getSmallest());
        System.out.println();

        // --- Test SodaCan ---
        System.out.println("--- SodaCan Test ---");
        SodaCan sodaCan = new SodaCan(10, 5);
        System.out.println("SodaCan (h=10, d=5) Volume: " + sodaCan.getVolume());
        System.out.println("SodaCan (h=10, d=5) Surface Area: " + sodaCan.getSurfaceArea());
        System.out.println();

        // --- Test Converter ---
        System.out.println("--- Converter Test ---");
        System.out.print("Enter measurement in meters: ");
        double meters = scanner.nextDouble();
        
        // 1 meter = 3.28084 feet
        Converter metersToFeet = new Converter(3.28084);
        double totalFeet = metersToFeet.convertTo(meters);
        int feet = (int) totalFeet;
        double fractionalFeet = totalFeet - feet;
        double inches = fractionalFeet * 12; // 12 inches in a foot
        
        System.out.println(meters + " meters is approximately " + feet + " feet and " + inches + " inches.");

        // Additional Converter test
        final double MILE_TO_KM = 1.609;
        Converter milesToMeters = new Converter(1000 * MILE_TO_KM);
        double miles = 1;
        System.out.println(miles + " miles is " + milesToMeters.convertTo(miles) + " meters.");
        System.out.println();

        // --- Test DigitExtractor ---
        System.out.println("--- DigitExtractor Test ---");
        System.out.print("Enter a 5-digit integer: ");
        int number = scanner.nextInt();
        DigitExtractor extractor = new DigitExtractor(number);
        System.out.println("Digits in reverse order:");
        System.out.println(extractor.nextDigit());
        System.out.println(extractor.nextDigit());
        System.out.println(extractor.nextDigit());
        System.out.println(extractor.nextDigit());
        System.out.println(extractor.nextDigit());

        scanner.close();
    }
}

