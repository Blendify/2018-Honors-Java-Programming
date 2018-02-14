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
import TurtleGraphics.StandardPen; // Used for graph output

public class CalcWeeklyPayGraph {
    
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
	double WeeklyPay; // output var
	
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


    System.out.println("The employe's weekly pay is: $" + WeeklyPay);

	// Declare pen here to init window
	StandardPen pen = new StandardPen();
	pen.up();
	pen.setDirection(270);
	
	double LineSpacing = 25;

	// draw graph
	pen.drawString("Monday:    ");
	pen.move(LineSpacing);
	pen.drawString("Tuesday:   ");
	pen.move(LineSpacing);
	pen.drawString("Wednesday: ");
	pen.move(LineSpacing);
	pen.drawString("Thursday:  ");
	pen.move(LineSpacing);
	pen.drawString("Monday:    ");
	
	pen.home();
	pen.setDirection(0);
	pen.move(250);
	pen.setWidth(5);
	pen.down();
	pen.move();
    }
}
