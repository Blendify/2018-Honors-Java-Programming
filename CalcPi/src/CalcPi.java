/**
 * @(#)CalcPi.java
 *
 * CalcPi application
 *
 * Discription: Uses Gottfried Leibniz's formula to aproximate the value of pi:
 *				pi/4 = 1 - 1/3 + 1/5 - 1/7 + ...
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/2/28
 */

 
import TerminalIO.KeyboardReader; // Used for user input

public class CalcPi {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	
    	double pi = 1.0; // begin with 1 to so we can subtract from it first
    	double denominator = 1.0;
    	int loopCount = 0;
    	int i;
    	
    	i = reader.readInt("Enter number of iterations: ");
    	
    	while (loopCount < i) {
    		denominator = (denominator + 2.0);
    		if ((loopCount % 2) != 0) // Are we odd or even itererations
				pi += (1.0 / denominator);
			else
				pi -= (1.0 / denominator);
    		loopCount += 1;
    	}
    	System.out.println("Pi: " + pi * 4.0);
    }
}

/*
--------------------Configuration: CalcPi - JDK version 1.6.0_14 <Default> - <Default>--------------------
Enter number of iterations: 2147483647
Pi: 3.1415926531226095

Process completed.
 */