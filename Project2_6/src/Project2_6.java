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
    	pen.move(25);
    	pen.down();
    	pen.turn(180);
    	pen.move(50);

    }
}
