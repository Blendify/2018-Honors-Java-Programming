/**
 * @(#)Car.java
 *
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/4/12
 */

import TurtleGraphics.*;
import java.awt.Color;

public class Car {
	private StandardPen pen;
	private double xPos, yPos;

    public Car() {
    	xPos = 0;
    	yPos = 0;
    	pen = new StandardPen();
    	pen.setColor(Color.red);
    }
    
    public Car() {
		this();
		xPos = x;
		yPos = y;
    }
    
    public void draw(){
    }
    
    public void erase(){
    	pen.setColor(Color.white);
    	draw();
    	pen.setColor(Color.red);
    }
    
    public void move(double x, double y){
    	xPos = x;
    	yPos = y;
    }
	
	private void drawCircle(double x, double y, double r){
		double side = 2.0 * Math.PI * r / 120.0;
		pen.up();
		pen.move(x + r, y - side / 2.0);
		pen.setDirection(90);
		pen.down();
		for (int i = 0; i < 120; i++){
			pen.move(side);
			pen.turn(3);
		}
	}
	
	private void drawLine(double x1, double y1, double x2, double y2){
		pen.up();
		pen.move(x1, y1);
		pen.down();
		pen.move(x2, y2);
	}
}