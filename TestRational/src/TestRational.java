/**
 * @(#)TestRational.java
 *
 * TestRational application
 *
 * @author 
 * @version 1.00 2018/4/5
 */

import TerminalIO.KeyboardReader; // used to input rationals

public class TestRational {
    
    public static void main(String[] args) {
    
    KeyboardReader reader = new KeyboardReader();
    Rational rat1, rat2;
    
    // Test default constructor
    System.out.println("Default constructor:");
    Rational rat3 = new Rational();
    System.out.println(rat3);
    
    int rat1_num   = reader.readInt("Fraction 1 numerator: ");
    int rat1_denom = reader.readInt("Fraction 1 denominator: ");
    int rat2_num   = reader.readInt("Fraction 2 numerator: ");
    int rat2_denom = reader.readInt("Fraction 2 denominator: ");
    
    System.out.println("Adding:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
    rat3 = rat1.add(rat2);
    System.out.println(rat1);
    
    System.out.println("Subtracting:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
    rat3 = rat1.subtract(rat2);
    System.out.println(rat1);
    
    System.out.println("Multiplying:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
    rat3 = rat1.multiply(rat2);
    System.out.println(rat1);
    
    System.out.println("Dividing:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
	rat3 = rat1.divide(rat2);
    System.out.println(rat1);    
    
    System.out.println("Simplifing  fraction 1:");
    rat1 = new Rational(rat1_num, rat1_denom);
    System.out.println(rat1.simplify()); 
    	
	System.out.println("Reciprocal fraction 1:");
    rat1 = new Rational(rat1_num, rat1_denom);
    System.out.println(rat1.reciprocal()); 
    
    System.out.println("Comparing fractions:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
	if (rat1.compare(rat2) == true)
		System.out.println("Fractions are equal");
	else
		System.out.println("Fractions are not equal");   
    
    }
}
