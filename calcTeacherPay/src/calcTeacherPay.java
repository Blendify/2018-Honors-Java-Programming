/**
 * @(#)calcTeacherPay.java
 *
 * calcTeacherPay application
 *
 * @author 
 * @version 1.00 2018/3/1
 */

import TerminalIO.KeyboardReader; // Used for user input

public class calcTeacherPay {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	
		int salaryStarting = 0;
		int salaryIncrease; // Should be a percentage
		int salaryCurrent = salaryStarting;
		int numYears;
		
		salaryStarting = reader.readInt("Enter the starting salary: ");
		salaryIncrease = reader.readInt("Enter the starting increase percent: ");
		numYears = reader.readInt("Enter the number of years to display");
		
		// i serves as the current year
		for (int i; i != numYears; i++) {
			salaryCurrent = salaryCurrent * salaryIncrease;
			System.out.println(i + ": ");
		}
    }
}