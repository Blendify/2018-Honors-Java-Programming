/**
 * @(#)powerFunction.java
 *
 * powerFunction application
 *
 * Discription: This program calculats all positive powers up to a defined power
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/3/1
 */

import TerminalIO.KeyboardReader; // Used for user input

public class powerFunction {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	
    	System.out.println("This program calculats all positive powers up to a defined power");
    	
    	double base = reader.readDouble("Enter the base (x^n): ");
    	int exponent = reader.readInt("Enter the highest exponent (" + base +"^x): ");
    	
    	while (exponent != 1.0) {
			System.out.println(Math.pow(base, exponent));
    		exponent--;
    	}
    }
}

/*
--------------------Configuration: powerFunction - JDK version 1.6.0_14 <Default> - <Default>--------------------
This program calculats all positive powers up to a defined power
Enter the base (x^n): 2.5
Enter the highest exponent (2.5^x): 10
9536.7431640625
3814.697265625
1525.87890625
610.3515625
244.140625
97.65625
39.0625
15.625
6.25

Process completed.
 */
 