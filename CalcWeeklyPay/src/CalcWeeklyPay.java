/**
 * @(#)CalcWeeklyPay.java
 *
 * CalcWeeklyPay application
 *
 * Discription: Takes an employe's hourly wage and normal and
 *              overtime hours and calculates their weekly pay.
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/2/13
 */

import TerminalIO.KeyboardReader; // Used for pay input

public class CalcWeeklyPay {
    
    public static void main(String[] args) {
    
    KeyboardReader reader = new KeyboardReader();
    
	final double OVER_TIME_PAY = 1.5;

	double HourlyWage;
	double MondayNormalHours, TuesdayNormalHours,
	       WednesdayNormalHours, ThursdayNormalHours,
	       FridayNormalHours;
	double MondayOvertimeHours, TuesdayOvertimeHours,
	       WednesdayOvertimeHours, ThursdayOvertimeHours,
	       FridayOvertimeHours;	
	double WeeklyPay;
	
	// Ask for Wage and Hours
	HourlyWage = reader.readDouble("Input the employe's hourly wage: ");
	
	// Ask for normal hours worked per day
	System.out.println("Input the number of normal hours worked for each of the following days:");
	MondayNormalHours    = reader.readDouble("Monday: ");
	TuesdayNormalHours   = reader.readDouble("Tuesday: ");
	WednesdayNormalHours = reader.readDouble("Wednesday: ");
	ThursdayNormalHours  = reader.readDouble("Thursday: ");
	FridayNormalHours    = reader.readDouble("Friday: ");

	System.out.println("");

	// Ask for overtime hours worked per day
	System.out.println("Input the number of Overtime hours worked for each of the following days:");
	MondayOvertimeHours    = reader.readDouble("Monday: ");
	TuesdayOvertimeHours   = reader.readDouble("Tuesday: ");
	WednesdayOvertimeHours = reader.readDouble("Wednesday: ");
	ThursdayOvertimeHours  = reader.readDouble("Thursday: ");
	FridayOvertimeHours    = reader.readDouble("Friday: ");
    
    // Calculate the weekly pay
    WeeklyPay = ((MondayNormalHours + TuesdayNormalHours +
	             WednesdayNormalHours + ThursdayNormalHours +
	             FridayNormalHours) * HourlyWage) + 
	             
	             // calculate Overtime pay
	             ((MondayOvertimeHours + TuesdayOvertimeHours +
	       		 WednesdayOvertimeHours + ThursdayOvertimeHours +
	     		 FridayOvertimeHours)) * (HourlyWage * OVER_TIME_PAY);

    System.out.println("The employe's weekly pay is: $" + WeeklyPay);

    }
}

/*
--------------------Configuration: CalcWeeklyPay - JDK version 1.6.0_14 <Default> - <Default>--------------------
Input the employe's hourly wage: 12.5
Input the number of normal hours worked for each of the following days:
Monday: 7
Tuesday: 8
Wednesday: 5
Thursday: 3
Friday: 7
Input the number of Overtime hours worked for each of the following days:
Monday: 1
Tuesday: 0
Wednesday: 3
Thursday: 2
Friday: 3
The employe's weekly pay is: $543.75

Process completed.
*/