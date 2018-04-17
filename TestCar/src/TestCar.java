/**
 * @(#)TestCar.java
 *
 * TestCar application
 *
 * Discription: Test car class by drawing a car then allowing it to be moved.
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/4/17
 */

import TerminalIO.*; // used for coordinate input

public class TestCar {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	double x, y;
    	
    	x = reader.readDouble("Intial x position: ");
    	y = reader.readDouble("Intial y position: ");
    	Car lambo = new Car(x, y);
    	lambo.draw();
    	
    	while(true){
    		x = reader.readDouble("New x position: ");
    		y = reader.readDouble("New y position: ");
    		lambo.erase();
    		lambo.move(x, y);
    		lambo.draw();
    	}
    }
}

/*
--------------------Configuration: TestCar - JDK version 1.6.0_14 <Default> - <Default>--------------------
Intial x position: 0
Intial y position: 0
New x position: 50
New y position: -50
New x position:
*/
