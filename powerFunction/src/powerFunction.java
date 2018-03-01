/**
 * @(#)powerFunction.java
 *
 * powerFunction application
 *
 * Discription: This program keeps calculating powers of a base
 *				up to a number until the uses enters -1
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/3/1
 */

import TerminalIO.KeyboardReader; // Used for user input

public class powerFunction {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();

    	int base = reader.readInt("Enter the base (x^n): ");
    	int exponent = 0, exponentMax;
    	
    	while (base != -1) {
    		exponentMax = reader.readInt("Enter the highest exponent (" + base +"^x): ");
    		while (exponentMax != 1) {
				exponent++;
				System.out.println(Math.pow(base, exponent));
    			exponentMax--;
    		}
    		base = reader.readInt("Enter a new base or -1 to stop (x^n): ");
    	}
    }
}

/*
--------------------Configuration: powerFunction - JDK version 1.6.0_14 <Default> - <Default>--------------------
Enter the base (x^n): 3
Enter the highest exponent (3^x): 5
3.0
9.0
27.0
81.0
Enter a new base or -1 to stop (x^n): 2
Enter the highest exponent (2^x): 10
32.0
64.0
128.0
256.0
512.0
1024.0
2048.0
4096.0
8192.0
Enter a new base or -1 to stop (x^n): -1

Process completed.
 */
 