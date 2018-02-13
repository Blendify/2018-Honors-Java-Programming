/**
 * @(#)CalcWeeklyPay.java
 *
 * CalcWeeklyPay application
 *
 * Discription: Takes an employe's hourly wage and normal and
 *              overtime hours and calculates their weekly pay.
 *
 *              Then Graphs the results per day on a graph
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
	double NormalHours;
	double OvertimeHours;	
	double WeeklyPay;
	
	// Ask for Wage and Hours
	HourlyWage = reader.readDouble("Input the employe's hourly wage: ");
	NormalHours = reader.readDouble("Input the amount of normal hours the employes worked: ");
    OvertimeHours = reader.readDouble("Input the amount of overtime hours the employes worked: ");
    
    // Calculate the weekly pay
    WeeklyPay = (NormalHours * HourlyWage) + (OvertimeHours * HourlyWage * OVER_TIME_PAY);

    System.out.println("The employe's weekly pay is: $" + WeeklyPay);

    }
}
