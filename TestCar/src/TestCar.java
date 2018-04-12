/**
 * @(#)TestCar.java
 *
 * TestCar application
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/4/12
 */

import TurtleGraphics.*;
import TerminalIO.*;

public class TestCar {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	double x, y;
    	//double radius;
    	
    	x = reader.readDouble("Intial x position: ");
    	y = reader.readDouble("Intial x position: ");
    	Car lambo = new car(x, y);
    	lambo.draw();
    	
    	while(true){
    		x = reader.readDouble("New x position: ");
    		y = reader.readDouble("New y position: ");
    		lambo.erase();
    		lambo.move();
    		lambo.draw();
    	}
    }
}
