/**
 * @(#)powerFunction.java
 *
 * powerFunction application
 *
 * @author 
 * @version 1.00 2018/2/28
 */

import TerminalIO.KeyboardReader; // Used for user input

public class powerFunction {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	
    	double base, exponent;
    	
    	base       = reader.readDouble("Enter the base (x^n): ");
    	exponent   = reader.readDouble("Enter the highest exponent (" + base +"^x): ");
    	
    	while (exponent >= 1)
    		System.out.println(Math.pow(base, exponent));
    		exponent--;
	
    }
}
