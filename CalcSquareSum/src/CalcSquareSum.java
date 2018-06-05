/**
 * @(#)CalcSquareSum.java
 *
 * CalcSquareSum application
 *
 * @author Aaron Carlisle
 * @discription: Adds the sum of squares from 1 to user defined int
 * @version 1.00 2018/6/5
 */

import TerminalIO.KeyboardReader; // used for user IO

public class CalcSquareSum {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	int highestInt = reader.readInt("Enter highest integer: ");
    	
    	while (highestInt > 0) {
    		int sum = 0;
    		for (int i = 1; i <= highestInt; i++) {
    			sum += Math.pow(i,2);
    		}
    		System.out.println("Sum:" + sum);
    		highestInt = reader.readInt("Enter new highest integer (or negative to exit): ");
    	}
    }
}

/*
Enter highest integer: 4
Sum:30
Enter new highest integer (or negative to exit): 1
Sum:1
Enter new highest integer (or negative to exit): 5
Sum:55
Enter new highest integer (or negative to exit): -5

Process completed.
*/