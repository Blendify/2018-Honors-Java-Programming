/**
 * @(#)CalcSphere.java
 *
 * CalcSphere application
 *
 * Discription: Takes a sphere's radius and calculates the
 *              diameter, cicumference, surfaceArea, and volume;
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/2/13
 */

import TerminalIO.KeyboardReader; // Used for radius input

 
public class CalcSphere {
    
    public static void main(String[] args) {
    	
    KeyboardReader reader = new KeyboardReader();
    
    final double PI = 3.14159;
    
	double radius;
	double diameter;
	double cicumference;
	double surfaceArea;
	double volume;
	
	radius = reader.readDouble("Input sphere's radius: ");
	
	diameter     = 2.0 * radius;
	cicumference = 2.0 * radius * PI;
	surfaceArea  = 4.0 * (radius * radius) * PI;
	volume       = (4.0/3.0) * (radius * radius * radius) * PI;

	System.out.println("Sphere diameter: " + diameter);
	System.out.println("Sphere cicumference: " + cicumference);
	System.out.println("Sphere surface area: " + surfaceArea);
	System.out.println("Sphere volume: " + volume);
	
    }
}

/*
--------------------Configuration: CalcSphere - JDK version 1.6.0_14 <Default> - <Default>--------------------
5Input sphere's radius: 4
Sphere diameter: 8.0
Sphere cicumference: 25.13272
Sphere surface area: 201.06176
Sphere volume: 268.08234666666664

Process completed.
*/