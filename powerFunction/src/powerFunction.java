/**
 * @(#)powerFunction.java
 *
 * powerFunction application
 *
 * Discription: This program keeps calculating powers until the uses enters -1
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/3/1
 */

import TerminalIO.KeyboardReader; // Used for user input

public class powerFunction {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();

    	double base = reader.readDouble("Enter the base (x^n): ");;
    	int exponent;
    	
    	while (base != -1.0) {
    		exponent = reader.readInt("Enter the exponent (" + base +"^x): ");
			System.out.println(Math.pow(base, exponent));
    		base = reader.readDouble("Enter a new base or -1 to stop (x^n): ");
    	}
    }
}

/*
--------------------Configuration: powerFunction - JDK version 1.6.0_14 <Default> - <Default>--------------------
Enter the base (x^n): 5
Enter the exponent (5.0^x): 0
1.0
Enter a new base or -1 to stop (x^n): 5
Enter the exponent (5.0^x): 2
25.0
Enter a new base or -1 to stop (x^n): -1

Process completed.
 */
 