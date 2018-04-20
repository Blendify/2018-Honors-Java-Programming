/**
 * @(#)TestRational.java
 *
 * TestRational application
 *
 * Discription: test the rational class
 * @author Aaron Carlisle
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
    System.out.println(rat3);
    
    System.out.println("Subtracting:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
    rat3 = rat1.subtract(rat2);
    System.out.println(rat3);
    
    System.out.println("Multiplying:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
    rat3 = rat1.multiply(rat2);
    System.out.println(rat3);
    
    System.out.println("Dividing:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
	rat3 = rat1.divide(rat2);
    System.out.println(rat3);    
    
    System.out.println("Simplifing  fraction 1:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat1.simplify();
    System.out.println(rat1); 
    	
	System.out.println("Reciprocal fraction 1:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = rat1.reciprocal();
    System.out.println(rat2); 
    
    System.out.println("Comparing fractions:");
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);
	if (rat1.compare(rat2) == true)
		System.out.println("Fractions are equal");
	else
		System.out.println("Fractions are not equal");   
    
    System.out.println("Testing improper fraction:");
    int rat1_whole = reader.readInt("Fraction 1 whole number: ");
    Rational ratImproper1 = new Rational(rat1_num, rat1_denom, rat1_whole);
    
    System.out.println("Testing improper fraction:");
    int rat2_whole = reader.readInt("Fraction 2 whole number: ");
    Rational ratImproper2 = new Rational(rat2_num, rat2_denom, rat2_whole);
    
    System.out.println("Adding:");
	rat3 = ratImproper1.add(ratImproper2);
    System.out.println(rat3); 
    
    System.out.println("Subtracting:");
	rat3 = ratImproper1.subtract(ratImproper2);
    System.out.println(rat3);

    System.out.println("Multiply:");
	rat3 = ratImproper1.multiply(ratImproper2);
    System.out.println(rat3); 

    System.out.println("Dividing:");
	rat3 = ratImproper1.divide(ratImproper2);
    System.out.println(rat3);
    }
}


/*
--------------------Configuration: TestRational - JDK version 1.6.0_14 <Default> - <Default>--------------------
Default constructor:
0 0/1

Fraction 1 numerator: 1
Fraction 1 denominator: 3
Fraction 2 numerator: 1
Fraction 2 denominator: 3
Adding:
0 2/3

Subtracting:
0 0/1

Multiplying:
0 1/9

Dividing:
1 0/1

Simplifing  fraction 1:
0 1/3

Reciprocal fraction 1:
0 3/1

Comparing fractions:
Fractions are equal
Testing improper fraction:
Fraction 1 whole number: 5
Testing improper fraction:
Fraction 2 whole number: 3
Adding:
8 2/3

Subtracting:
2 0/1

Multiply:
15 1/9

Dividing:
1 0/1


Process completed.
 */
