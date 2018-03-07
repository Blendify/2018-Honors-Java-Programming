/**
 * @(#)calcTeacherPay.java
 *
 * calcTeacherPay application
 *
 * Discription: This program inputs a teacher's pay,
 *				pay increase, and number years to display.
 *				The program then calculates the pay for these years.
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/3/7
 */

import TerminalIO.KeyboardReader; // Used for user input

public class calcTeacherPay {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	
		double salaryStarting = 0;
		double salaryIncrease; // Should be a percentage
		double salaryCurrent;
		int numYears;
		
		salaryStarting = reader.readDouble("Enter the starting salary: ");
		salaryCurrent = salaryStarting;
		salaryIncrease = reader.readDouble("Enter the starting increase percent (e.g. 5%): ");
		numYears = reader.readInt("Enter the number of years to display: ");
		
		// convert to decimal
		salaryIncrease *= 0.01;
		
		System.out.println("Year 1: " + salaryCurrent);
		
		// i serves as the current year
		for (int i = 2; i != numYears + 2; i++) {
			if (i < 11) {
				salaryCurrent += salaryCurrent * salaryIncrease;
				System.out.println("Year " + i + ": " + salaryCurrent);
			// all years after 10 get same pay
			} else {
				System.out.println("Year " + i + ": " + salaryCurrent);
			}
		}
    }
}

/*
--------------------Configuration: calcTeacherPay - JDK version 1.6.0_14 <Default> - <Default>--------------------
Enter the starting salary: 20000
Enter the starting increase percent (e.g. 5%): 12
Enter the number of years to display: 15
Year 1: 20000.0
Year 2: 22400.0
Year 3: 25088.0
Year 4: 28098.56
Year 5: 31470.3872
Year 6: 35246.833664
Year 7: 39476.453703679996
Year 8: 44213.62814812159
Year 9: 49519.26352589618
Year 10: 55461.57514900372
Year 11: 55461.57514900372
Year 12: 55461.57514900372
Year 13: 55461.57514900372
Year 14: 55461.57514900372
Year 15: 55461.57514900372
Year 16: 55461.57514900372

Process completed.
 */