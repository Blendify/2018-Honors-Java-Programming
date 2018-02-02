/**
 * @(#)Project2_5.java
 *
 * Project2_5 application
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/1/30
 */

import TerminalIO.KeyboardReader;

public class Project2_5 {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	double mass;
    	double velocity;
    	double momentum;
    	
    	System.out.print("Enter the object's mass in kilograms: ");
    	mass = reader.readDouble();

    	System.out.print("Enter the object's velocity in meters per second: ");
    	velocity = reader.readDouble();
    	
    	momentum = mass * velocity;
    	
    	System.out.print("The objects momentum is: ");
    	System.out.println(momentum);
    	
    }
}

/*

--------------------Configuration: Project2_5 - JDK version 1.6.0_14 <Default> - <Default>--------------------
Enter the object's mass in kilograms: 5
Enter the object's velocity in meters per second: 10
The objects momentum is: 50.0

Process completed.

*/
