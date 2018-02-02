/**
 * @(#)Project2_6.java
 *
 * Project2_6 application
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/1/31
 */

import TurtleGraphics.StandardPen;
 
public class Project2_6 {
    public static void main(String[] args) {
    	StandardPen pen = new StandardPen();
    	
    	pen.up();
    	pen.turn(90);
    	// draw top line
    	pen.move(25);
    	pen.down();
    	pen.turn(180);
    	pen.move(50);
    	
    	// Upper arrow right
    	pen.turn(45);
    	pen.move(25);
    	pen.move(-25);
    	pen.turn(270);
    	pen.move(25);
    	// go back to right of straight line
    	pen.move(-25);
    	pen.turn(45);
    	pen.move(-50);
    	
    	// draw left up arrow
		pen.turn(225);
		pen.move(25);
    	pen.up();
    	pen.move(-25);
    	pen.turn(270);
    	pen.down();
    	pen.move(25);
    	pen.up();
    	pen.move(-25);
    	pen.turn(-45);
    	pen.move(-50); // down
    	
    	// Draw lower line
    	pen.turn(-90);
    	pen.down();
    	pen.move(50);
    	
    	// draw right error
    	pen.turn(225);
		pen.move(25);
    	pen.move(-25);
    	pen.turn(270);
    	pen.move(25);
    	pen.move(-25);
    	pen.turn(45);
    	pen.move(50);
    	
    	// draw left up arrow
		pen.turn(225);
		pen.move(25);
    	pen.move(-25);
    	pen.turn(270);
    	pen.move(25);
    }
}
