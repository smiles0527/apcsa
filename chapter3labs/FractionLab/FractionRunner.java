package FractionRunner.java;

/**
 * FractionRunner - A driver class to test the Fraction class
 * This class demonstrates and tests all the functionality of the Fraction class
 * 
 * @author Curtis
 * @version 2025
 */
public class FractionRunner {
    
    public static void main(String[] args) {
        System.out.println("=== Testing Fraction Class ===\n");
        
        // Test 1: Default constructor
        System.out.println("Test 1: Default Constructor");
        Fraction frac1 = new Fraction();
        System.out.println("Default fraction: " + frac1);
        System.out.println("Value: " + frac1.getValue());
        System.out.println();
        
        // Test 2: Constructor with arguments
        System.out.println("Test 2: Constructor with Arguments");
        Fraction frac2 = new Fraction(6, 8);
        System.out.println("Fraction 6/8: " + frac2);
        System.out.println("Value: " + frac2.getValue());
        System.out.println();
        
        // Test 3: Testing reduce() method
        System.out.println("Test 3: Testing reduce() method");
        Fraction frac3 = new Fraction(12, 18);
        System.out.println("Before reduce: " + frac3);
        frac3.reduce();
        System.out.println("After reduce: " + frac3);
        System.out.println("Value: " + frac3.getValue());
        System.out.println();
        
        // Test 4: More reduction tests
        System.out.println("Test 4: More Reduction Tests");
        Fraction frac4 = new Fraction(24, 36);
        System.out.println("Before reduce: " + frac4);
        frac4.reduce();
        System.out.println("After reduce: " + frac4);
        System.out.println();
        
        Fraction frac5 = new Fraction(15, 25);
        System.out.println("Before reduce: " + frac5);
        frac5.reduce();
        System.out.println("After reduce: " + frac5);
        System.out.println();
        
        // Test 5: Testing with negative numbers
        System.out.println("Test 5: Negative Fractions");
        Fraction frac6 = new Fraction(-8, 12);
        System.out.println("Before reduce: " + frac6);
        frac6.reduce();
        System.out.println("After reduce: " + frac6);
        System.out.println("Value: " + frac6.getValue());
        System.out.println();
        
        Fraction frac7 = new Fraction(9, -15);
        System.out.println("Before reduce: " + frac7);
        frac7.reduce();
        System.out.println("After reduce: " + frac7);
        System.out.println("Value: " + frac7.getValue());
        System.out.println();
        
        // Test 6: Testing accessor methods
        System.out.println("Test 6: Accessor Methods");
        Fraction frac8 = new Fraction(7, 11);
        System.out.println("Fraction: " + frac8);
        System.out.println("Numerator: " + frac8.getNumerator());
        System.out.println("Denominator: " + frac8.getDenominator());
        System.out.println();
        
        // Test 7: Testing mutator methods
        System.out.println("Test 7: Mutator Methods");
        Fraction frac9 = new Fraction(1, 2);
        System.out.println("Original: " + frac9);
        frac9.setNumerator(3);
        frac9.setDenominator(4);
        System.out.println("After setting numerator to 3 and denominator to 4: " + frac9);
        System.out.println("Value: " + frac9.getValue());
        System.out.println();
        
        // Test 8: Testing zero numerator
        System.out.println("Test 8: Zero Numerator");
        Fraction frac10 = new Fraction(0, 5);
        System.out.println("Fraction: " + frac10);
        frac10.reduce();
        System.out.println("After reduce: " + frac10);
        System.out.println("Value: " + frac10.getValue());
        System.out.println();
        
        // Test 9: Testing edge case - already reduced fraction
        System.out.println("Test 9: Already Reduced Fraction");
        Fraction frac11 = new Fraction(5, 7);
        System.out.println("Before reduce: " + frac11);
        frac11.reduce();
        System.out.println("After reduce: " + frac11);
        System.out.println();
        
        // Test 10: Testing large numbers
        System.out.println("Test 10: Large Numbers");
        Fraction frac12 = new Fraction(100, 200);
        System.out.println("Before reduce: " + frac12);
        frac12.reduce();
        System.out.println("After reduce: " + frac12);
        System.out.println("Value: " + frac12.getValue());
        System.out.println();
        
        // Test 11: Testing improper fractions
        System.out.println("Test 11: Improper Fractions");
        Fraction frac13 = new Fraction(20, 6);
        System.out.println("Before reduce: " + frac13);
        frac13.reduce();
        System.out.println("After reduce: " + frac13);
        System.out.println("Value: " + frac13.getValue());
        System.out.println();
        
        // Test 12: Testing toString() method explicitly
        System.out.println("Test 12: Explicit toString() Call");
        Fraction frac14 = new Fraction(3, 5);
        System.out.println("Using println(fraction): " + frac14);
        System.out.println("Using println(fraction.toString()): " + frac14.toString());
        System.out.println();
        
        // Test 13: Testing zero denominator (should be handled)
        System.out.println("Test 13: Zero Denominator Protection");
        Fraction frac15 = new Fraction(5, 0);
        System.out.println("Fraction with zero denominator: " + frac15);
        System.out.println("Value: " + frac15.getValue());
        System.out.println();
        
        // ========== NEW TESTS FOR LAB 2 ==========
        
        // Test 14: Single integer constructor
        System.out.println("Test 14: Single Integer Constructor");
        Fraction frac16 = new Fraction(7);
        System.out.println("Fraction from integer 7: " + frac16);
        System.out.println("Value: " + frac16.getValue());
        System.out.println();
        
        Fraction frac17 = new Fraction(-5);
        System.out.println("Fraction from integer -5: " + frac17);
        System.out.println("Value: " + frac17.getValue());
        System.out.println();
        
        // Test 15: Copy constructor
        System.out.println("Test 15: Copy Constructor");
        Fraction original = new Fraction(3, 4);
        Fraction copy = new Fraction(original);
        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
        System.out.println("Are they equal? " + (original.getNumerator() == copy.getNumerator() && 
                                                  original.getDenominator() == copy.getDenominator()));
        // Modify original to verify copy is independent
        original.setNumerator(5);
        System.out.println("After modifying original to 5/4:");
        System.out.println("Original: " + original);
        System.out.println("Copy (should still be 3/4): " + copy);
        System.out.println();
        
        // Test 16: subtract() method
        System.out.println("Test 16: subtract() Method");
        Fraction frac18 = new Fraction(5, 6);
        Fraction frac19 = new Fraction(1, 3);
        Fraction diff = frac18.subtract(frac19);
        System.out.println(frac18 + " - " + frac19 + " = " + diff);
        System.out.println("Decimal check: " + frac18.getValue() + " - " + frac19.getValue() + 
                          " = " + diff.getValue());
        System.out.println();
        
        Fraction frac20 = new Fraction(1, 2);
        Fraction frac21 = new Fraction(1, 4);
        Fraction diff2 = frac20.subtract(frac21);
        System.out.println(frac20 + " - " + frac21 + " = " + diff2);
        System.out.println();
        
        Fraction frac22 = new Fraction(7, 8);
        Fraction frac23 = new Fraction(3, 8);
        Fraction diff3 = frac22.subtract(frac23);
        System.out.println(frac22 + " - " + frac23 + " = " + diff3);
        System.out.println();
        
        // Test 17: multiply(int) method
        System.out.println("Test 17: multiply(int) Method");
        Fraction frac24 = new Fraction(2, 3);
        Fraction product1 = frac24.multiply(4);
        System.out.println(frac24 + " * 4 = " + product1);
        System.out.println("Decimal check: " + frac24.getValue() + " * 4 = " + product1.getValue());
        System.out.println();
        
        Fraction frac25 = new Fraction(3, 5);
        Fraction product2 = frac25.multiply(-2);
        System.out.println(frac25 + " * -2 = " + product2);
        System.out.println();
        
        Fraction frac26 = new Fraction(1, 4);
        Fraction product3 = frac26.multiply(8);
        System.out.println(frac26 + " * 8 = " + product3);
        System.out.println();
        
        // Test 18: multiply(Fraction) method
        System.out.println("Test 18: multiply(Fraction) Method");
        Fraction frac27 = new Fraction(2, 3);
        Fraction frac28 = new Fraction(3, 4);
        Fraction product4 = frac27.multiply(frac28);
        System.out.println(frac27 + " * " + frac28 + " = " + product4);
        System.out.println("Decimal check: " + frac27.getValue() + " * " + frac28.getValue() + 
                          " = " + product4.getValue());
        System.out.println();
        
        Fraction frac29 = new Fraction(1, 2);
        Fraction frac30 = new Fraction(2, 5);
        Fraction product5 = frac29.multiply(frac30);
        System.out.println(frac29 + " * " + frac30 + " = " + product5);
        System.out.println();
        
        Fraction frac31 = new Fraction(4, 7);
        Fraction frac32 = new Fraction(7, 8);
        Fraction product6 = frac31.multiply(frac32);
        System.out.println(frac31 + " * " + frac32 + " = " + product6);
        System.out.println();
        
        // Test 19: divide() method
        System.out.println("Test 19: divide() Method");
        Fraction frac33 = new Fraction(3, 4);
        Fraction frac34 = new Fraction(1, 2);
        Fraction quotient1 = frac33.divide(frac34);
        System.out.println(frac33 + " / " + frac34 + " = " + quotient1);
        System.out.println("Decimal check: " + frac33.getValue() + " / " + frac34.getValue() + 
                          " = " + quotient1.getValue());
        System.out.println();
        
        Fraction frac35 = new Fraction(2, 3);
        Fraction frac36 = new Fraction(4, 5);
        Fraction quotient2 = frac35.divide(frac36);
        System.out.println(frac35 + " / " + frac36 + " = " + quotient2);
        System.out.println();
        
        Fraction frac37 = new Fraction(5, 6);
        Fraction frac38 = new Fraction(10, 3);
        Fraction quotient3 = frac37.divide(frac38);
        System.out.println(frac37 + " / " + frac38 + " = " + quotient3);
        System.out.println();
        
        // Test 20: Chaining operations
        System.out.println("Test 20: Chaining Operations");
        Fraction frac39 = new Fraction(1, 2);
        Fraction frac40 = new Fraction(1, 3);
        Fraction frac41 = new Fraction(1, 4);
        Fraction result = frac39.subtract(frac40).multiply(frac41);
        System.out.println("(" + frac39 + " - " + frac40 + ") * " + frac41 + " = " + result);
        System.out.println();
        
        Fraction frac42 = new Fraction(2, 3);
        Fraction frac43 = new Fraction(3, 4);
        Fraction result2 = frac42.multiply(frac43).divide(new Fraction(1, 2));
        System.out.println("(" + frac42 + " * " + frac43 + ") / (1/2) = " + result2);
        System.out.println();
        
        // Test 21: Edge cases for new methods
        System.out.println("Test 21: Edge Cases");
        Fraction frac44 = new Fraction(0, 1);
        Fraction frac45 = new Fraction(1, 2);
        Fraction result3 = frac44.subtract(frac45);
        System.out.println(frac44 + " - " + frac45 + " = " + result3);
        System.out.println();
        
        Fraction frac46 = new Fraction(1, 2);
        Fraction result4 = frac46.multiply(0);
        System.out.println(frac46 + " * 0 = " + result4);
        System.out.println();
        
        Fraction frac47 = new Fraction(1, 2);
        Fraction frac48 = new Fraction(0, 1);
        Fraction result5 = frac47.divide(frac48);
        System.out.println(frac47 + " / " + frac48 + " = " + result5 + " (should handle division by zero)");
        System.out.println();
        
        // Test 22: add() method
        System.out.println("Test 22: add() Method");
        Fraction frac49 = new Fraction(1, 2);
        Fraction frac50 = new Fraction(1, 3);
        Fraction sum = frac49.add(frac50);
        System.out.println(frac49 + " + " + frac50 + " = " + sum);
        System.out.println("Decimal check: " + frac49.getValue() + " + " + frac50.getValue() + 
                          " = " + sum.getValue());
        System.out.println();
        
        Fraction frac51 = new Fraction(3, 4);
        Fraction frac52 = new Fraction(1, 4);
        Fraction sum2 = frac51.add(frac52);
        System.out.println(frac51 + " + " + frac52 + " = " + sum2);
        System.out.println();
        
        // Test 23: greaterThan() method
        System.out.println("Test 23: greaterThan() Method");
        Fraction frac53 = new Fraction(1, 2);
        Fraction frac54 = new Fraction(1, 3);
        System.out.println("Is " + frac53 + " > " + frac54 + "? " + frac53.greaterThan(frac54));
        System.out.println("Is " + frac54 + " > " + frac53 + "? " + frac54.greaterThan(frac53));
        
        Fraction frac55 = new Fraction(1, 2);
        Fraction frac56 = new Fraction(2, 4);
        System.out.println("Is " + frac55 + " > " + frac56 + "? " + frac55.greaterThan(frac56));
        System.out.println();
        
        // Test 24: improper() method
        System.out.println("Test 24: improper() Method");
        Fraction frac57 = new Fraction(3, 4);
        System.out.println("Is " + frac57 + " improper? " + frac57.improper());
        
        Fraction frac58 = new Fraction(5, 4);
        System.out.println("Is " + frac58 + " improper? " + frac58.improper());
        
        Fraction frac59 = new Fraction(4, 4);
        System.out.println("Is " + frac59 + " improper? " + frac59.improper());
        
        Fraction frac60 = new Fraction(-5, 4);
        System.out.println("Is " + frac60 + " improper? " + frac60.improper());
        System.out.println();
        
        // Test 25: equals() method
        System.out.println("Test 25: equals() Method");
        Fraction frac61 = new Fraction(1, 2);
        Fraction frac62 = new Fraction(2, 4);
        Fraction frac63 = new Fraction(1, 3);
        System.out.println("Is " + frac61 + " equal to " + frac62 + "? " + frac61.equals(frac62));
        System.out.println("Is " + frac61 + " equal to " + frac63 + "? " + frac61.equals(frac63));
        
        Fraction frac64 = new Fraction(2, 3);
        Fraction frac65 = new Fraction(-2, -3);
        System.out.println("Is " + frac64 + " equal to " + frac65 + "? " + frac64.equals(frac65));
        System.out.println();
        
        System.out.println("=== All Tests Complete ===");
    }
}

