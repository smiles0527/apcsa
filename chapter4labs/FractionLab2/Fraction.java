package Chapter4Labs.FractionLab2;

/**
 * The Fraction class represents a mathematical fraction with a numerator and denominator.
 * It provides functionality to reduce fractions, get their decimal value, and perform basic operations.
 * 
 * @author Curtis
 * @version 2025
 */
public class Fraction {
    // Fields to store the numerator and denominator of the fraction
    private int numerator;
    private int denominator;
    
    /**
     * Default constructor - creates a fraction with default values of 0/1
     */
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }
    
    /**
     * Constructor that takes a numerator and denominator as arguments
     * 
     * @param num the numerator of the fraction
     * @param den the denominator of the fraction (must not be zero)
     */
    public Fraction(int num, int den) {
        numerator = num;
        // Prevent division by zero - if denominator is 0, set it to 1
        if (den == 0) {
            denominator = 1;
            System.out.println("Warning: Denominator cannot be zero. Setting denominator to 1.");
        } else {
            denominator = den;
        }
    }
    
    /**
     * Constructor that takes a single integer as an argument
     * Creates a fraction with the integer as the numerator and 1 as the denominator
     * 
     * @param num the integer value (becomes numerator, denominator is 1)
     */
    public Fraction(int num) {
        numerator = num;
        denominator = 1;
    }
    
    /**
     * Copy constructor that takes another Fraction as an argument
     * Creates a new Fraction object with the same values as the given Fraction
     * 
     * @param other the Fraction to copy
     */
    public Fraction(Fraction other) {
        if (other == null) {
            numerator = 0;
            denominator = 1;
            System.out.println("Warning: Cannot copy null Fraction. Creating default fraction 0/1.");
        } else {
            numerator = other.numerator;
            denominator = other.denominator;
        }
    }
    
    /**
     * Accessor method to get the numerator
     * 
     * @return the numerator of the fraction
     */
    public int getNumerator() {
        return numerator;
    }
    
    /**
     * Accessor method to get the denominator
     * 
     * @return the denominator of the fraction
     */
    public int getDenominator() {
        return denominator;
    }
    
    /**
     * Mutator method to set the numerator
     * 
     * @param num the new numerator value
     */
    public void setNumerator(int num) {
        numerator = num;
    }
    
    /**
     * Mutator method to set the denominator
     * 
     * @param den the new denominator value (must not be zero)
     */
    public void setDenominator(int den) {
        if (den == 0) {
            System.out.println("Warning: Denominator cannot be zero. Denominator not changed.");
        } else {
            denominator = den;
        }
    }
    
    /**
     * Returns a String representation of the fraction in the format "numerator/denominator"
     * 
     * @return a String representation of the fraction
     */
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    /**
     * Reduces this fraction to its lowest terms using the greatest common factor (GCF)
     * This method modifies the fraction object by dividing both numerator and denominator by their GCF
     */
    public void reduce() {
        // Handle the case where numerator is 0
        if (numerator == 0) {
            denominator = 1;
            return;
        }
        
        // Handle negative fractions - keep the sign in the numerator
        int sign = 1;
        if (denominator < 0) {
            sign = -1;
            denominator = -denominator;
        }
        if (numerator < 0) {
            sign *= -1;
            numerator = -numerator;
        }
        
        // Find the GCF and reduce
        int commonFactor = gcf(numerator, denominator);
        numerator = (numerator / commonFactor) * sign;
        denominator = denominator / commonFactor;
    }
    
    /**
     * Returns the decimal value of the fraction as a double
     * 
     * @return the decimal value of the fraction
     */
    public double getValue() {
        if (denominator == 0) {
            return 0.0; // Prevent division by zero
        }
        return (double) numerator / denominator;
    }
    
    /**
     * Returns the difference of this Fraction minus the other Fraction
     * Formula: (a/b) - (c/d) = (ad - bc) / bd
     * 
     * @param other the Fraction to subtract from this Fraction
     * @return a new Fraction representing the difference
     */
    public Fraction subtract(Fraction other) {
        if (other == null) {
            // If other is null, return a copy of this fraction
            return new Fraction(this);
        }
        
        // Calculate: (a/b) - (c/d) = (ad - bc) / bd
        int newNum = numerator * other.denominator - other.numerator * denominator;
        int newDen = denominator * other.denominator;
        
        Fraction result = new Fraction(newNum, newDen);
        result.reduce(); // Reduce to lowest terms
        return result;
    }
    
    /**
     * Returns the product of this Fraction multiplied by an integer
     * Formula: (a/b) * m = (a*m) / b
     * 
     * @param m the integer to multiply by
     * @return a new Fraction representing the product
     */
    public Fraction multiply(int m) {
        int newNum = numerator * m;
        Fraction result = new Fraction(newNum, denominator);
        result.reduce(); // Reduce to lowest terms
        return result;
    }
    
    /**
     * Returns the product of this Fraction multiplied by another Fraction
     * Formula: (a/b) * (c/d) = (a*c) / (b*d)
     * 
     * @param other the Fraction to multiply by
     * @return a new Fraction representing the product
     */
    public Fraction multiply(Fraction other) {
        if (other == null) {
            // If other is null, return 0/1
            return new Fraction(0, 1);
        }
        
        // Calculate: (a/b) * (c/d) = (a*c) / (b*d)
        int newNum = numerator * other.numerator;
        int newDen = denominator * other.denominator;
        
        Fraction result = new Fraction(newNum, newDen);
        result.reduce(); // Reduce to lowest terms
        return result;
    }
    
    /**
     * Returns the quotient of this Fraction divided by another Fraction
     * Formula: (a/b) / (c/d) = (a*d) / (b*c)
     * 
     * @param other the Fraction to divide by
     * @return a new Fraction representing the quotient
     */
    public Fraction divide(Fraction other) {
        if (other == null || other.numerator == 0) {
            System.out.println("Warning: Cannot divide by null or zero fraction. Returning 0/1.");
            return new Fraction(0, 1);
        }
        
        // Calculate: (a/b) / (c/d) = (a*d) / (b*c)
        int newNum = numerator * other.denominator;
        int newDen = denominator * other.numerator;
        
        Fraction result = new Fraction(newNum, newDen);
        result.reduce(); // Reduce to lowest terms
        return result;
    }

    /**
     * Returns the sum of this Fraction and other
     * Formula: (a/b) + (c/d) = (ad + bc) / bd
     * 
     * @param other the Fraction to add
     * @return a new Fraction representing the sum
     */
    public Fraction add(Fraction other) {
        if (other == null) {
            return new Fraction(this);
        }
        
        // Calculate: (a/b) + (c/d) = (ad + bc) / bd
        int newNum = numerator * other.denominator + other.numerator * denominator;
        int newDen = denominator * other.denominator;
        
        Fraction result = new Fraction(newNum, newDen);
        result.reduce(); // Reduce to lowest terms
        return result;
    }
    
    /**
     * Returns true if this fraction is larger than other
     * 
     * @param other the Fraction to compare with
     * @return true if this fraction is strictly greater than the other fraction
     */
    public boolean greaterThan(Fraction other) {
        if (other == null) {
            return this.getValue() > 0;
        }
        return this.getValue() > other.getValue();
    }
    
    /**
     * Returns true if this fraction is improper
     * An improper fraction is one where the numerator is greater than or equal to the denominator
     * 
     * @return true if the fraction is improper
     */
    public boolean improper() {
        return Math.abs(numerator) >= Math.abs(denominator);
    }
    
    /**
     * Returns true if this fraction is equal to other
     * 
     * @param other the Fraction to compare with
     * @return true if the fractions are equal in value
     */
    public boolean equals(Fraction other) {
        if (other == null) {
            return false;
        }
        // Cross multiply to check equality: a/b == c/d if ad == bc
        // Casting to long to prevent overflow during multiplication
        return (long)numerator * other.denominator == (long)other.numerator * denominator;
    }

    /**
     * Returns the sum of the values of this pair.
     * @return the sum of the first and second values
     */
    public Fraction add(int other) {
        Fraction o = new Fraction(other, 1);
        return this.add(o);
    }

    /**
     * Private helper method that finds and returns the Greatest Common Factor (GCF)
     * of two integers using the Euclidean algorithm (fast CP algorithm)
     * Time complexity: O(log(min(n, d)))
     * 
     * @param n the first number
     * @param d the second number
     * @return the greatest common factor of n and d
     */
    private int gcf(int n, int d) {
        // Use absolute values to handle negative numbers
        int a = Math.abs(n);
        int b = Math.abs(d);
        
        // Algorithm: gcd(a, b) = gcd(b, a mod b)
        // Continue until b becomes 0, then a is the GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        // If both numbers were 0, return 1 to avoid division by zero
        return a == 0 ? 1 : a;
    }
}
