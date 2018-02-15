/**
 * @(#)CalcWeeklyPay.java
 *
 * CalcWeeklyPay application
 *
 * Discription: Takes an employe's hourly wage and normal and
 *              overtime hours. Then the results per day are graphed.
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/2/15
 */

import TerminalIO.KeyboardReader; // Used for pay input
import TurtleGraphics.StandardPen; // Used for graph output

public class CalcWeeklyPayGraph {
    
    public static void main(String[] args) {
    
    KeyboardReader reader = new KeyboardReader();

	double hourlyWage;
	double mondayNormalHours, tuesdayNormalHours,
	       wednesdayNormalHours, thursdayNormalHours,
	       fridayNormalHours;
	double mondayOvertimeHours, tuesdayOvertimeHours,
	       wednesdayOvertimeHours, thursdayOvertimeHours,
	       fridayOvertimeHours;	
	
	// Ask for Wage and Hours
	hourlyWage = reader.readDouble("Input the employe's hourly wage: ");
	
	final double OVER_TIME_PAY = (1.5 * hourlyWage);
	
	// Ask for normal hours worked per day
	System.out.println("Input the number of normal hours worked for each of the following days:");
	mondayNormalHours    = reader.readDouble("Monday: ");
	tuesdayNormalHours   = reader.readDouble("Tuesday: ");
	wednesdayNormalHours = reader.readDouble("Wednesday: ");
	thursdayNormalHours  = reader.readDouble("Thursday: ");
	fridayNormalHours    = reader.readDouble("Friday: ");

	System.out.println("");

	// Ask for overtime hours worked per day
	System.out.println("Input the number of overtime hours worked for each of the following days:");
	mondayOvertimeHours    = reader.readDouble("Monday: ");
	tuesdayOvertimeHours   = reader.readDouble("Tuesday: ");
	wednesdayOvertimeHours = reader.readDouble("Wednesday: ");
	thursdayOvertimeHours  = reader.readDouble("Thursday: ");
	fridayOvertimeHours    = reader.readDouble("Friday: ");

	double mondayPay    = (mondayNormalHours    * hourlyWage) + (mondayOvertimeHours    * OVER_TIME_PAY);
	double tuesdayPay   = (tuesdayNormalHours   * hourlyWage) + (tuesdayOvertimeHours   * OVER_TIME_PAY);
    double wednesdayPay = (wednesdayNormalHours * hourlyWage) + (wednesdayOvertimeHours * OVER_TIME_PAY);
    double thursdayPay  = (thursdayNormalHours  * hourlyWage) + (thursdayOvertimeHours  * OVER_TIME_PAY);
    double fridayPay    = (fridayNormalHours    * hourlyWage) + (fridayOvertimeHours    * OVER_TIME_PAY);
    
	// Declare pen here to init window
	StandardPen pen = new StandardPen();
	pen.setWidth(10);
	pen.up();
	pen.setDirection(270);
	
	double LineSpacing = 25;

	// draw graph
	pen.drawString("Monday:");
	pen.move(LineSpacing);
	pen.drawString("Tuesday:");
	pen.move(LineSpacing);
	pen.drawString("Wednesday:");
	pen.move(LineSpacing);
	pen.drawString("Thursday:");
	pen.move(LineSpacing);
	pen.drawString("Monday:");

	pen.home();
	pen.setDirection(0);
	pen.move(85);

	// Monday
	pen.down();
	pen.move(mondayPay);
	pen.up();
    pen.move((-1.0) * mondayPay);
	pen.setDirection(270);
	pen.move(LineSpacing);
	
	// Tuesday
	pen.setDirection(0);
	pen.down();
	pen.move(mondayPay);
	pen.up();
    pen.move((-1.0) * mondayPay);
	pen.setDirection(270);
	pen.move(LineSpacing);
	
	// Wednesday
	pen.setDirection(0);
	pen.down();
	pen.move(wednesdayPay);
	pen.up();
    pen.move((-1.0) * wednesdayPay);
	pen.setDirection(270);
	pen.move(LineSpacing);
	
	// Thursday
	pen.setDirection(0);
	pen.down();
	pen.move(thursdayPay);
	pen.up();
    pen.move((-1.0) * thursdayPay);
	pen.setDirection(270);
	pen.move(LineSpacing);
	
	// Friday
	pen.setDirection(0);
	pen.down();
	pen.move(fridayPay);
    }
}

/*
--------------------Configuration: CalcWeeklyPayGraph - JDK version 1.6.0_14 <Default> - <Default>--------------------
Input the employe's hourly wage: 15.75
Input the number of normal hours worked for each of the following days:
Monday: 5
Tuesday: 6.25
Wednesday: 7
Thursday: 8
Friday: 4

Input the number of overtime hours worked for each of the following days:
Monday: 3
Tuesday: 2.5
Wednesday: 0
Thursday: 1
Friday: 0
*/
