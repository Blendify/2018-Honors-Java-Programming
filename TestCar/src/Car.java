/**
 * @(#)Car.java
 *
 * Car class
 *
 * Discription: Draws a red car at set positions
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/4/17
 */

import TurtleGraphics.*; // Used to draw a car
import java.awt.Color; // Needed for erase method

public class Car {
	private StandardPen pen;
	private double xPos, yPos;

	/* CONSTRUCTORS */
    public Car() {
    //Default constructor
    	xPos = 0;
    	yPos = 0;
    	pen = new StandardPen();
    	pen.setColor(Color.red);
    }
    
    public Car(double x, double y) {
    //Constructor with a defined position
		this();
		xPos = x;
		yPos = y;
    }
    
    public void draw(){
    //Draws a car
    	double carLength = 50.0;
    	double carHeight = 25.0;
    	double wheelRadius = 5.0;
    	drawRect(xPos, yPos, carLength, carHeight);
    	drawRect(xPos + (carLength / 5), yPos + (carHeight / 1.25), 30, 15);
    	drawCircle(xPos - (wheelRadius * 3.0), yPos - (wheelRadius * 2.5), wheelRadius);
    	drawCircle(xPos + (wheelRadius * 3.0), yPos - (wheelRadius * 2.5), wheelRadius);
    }
    
    public void erase(){
   //Redraws the car in white to make it erase
    	pen.setColor(Color.white);
    	draw();
    	pen.setColor(Color.red);
    }
    
    public void move(double x, double y){
    //Moves the car to a new position
    	xPos = x;
    	yPos = y;
    }
	
	private void drawCircle(double x, double y, double r){
	//Draws a circle at point x, y with a defined radius r
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
	//Draws a line between two points
		pen.up();
		pen.move(x1, y1);
		pen.down();
		pen.move(x2, y2);
	}
	
	private void drawRect(double x, double y, double length, double height){
	//Draws a rectangle with a center at point x, y and a length and height
		x = x - (length / 2.0);
		y = y - (height / 2.0);
		pen.setDirection(0);
		drawLine(x, y, x + length, y);
		pen.setDirection(90);
		drawLine(x + length, y, x + length, y + height);
		pen.setDirection(180);
		drawLine(x + length, y + height, x, y + height);
		pen.setDirection(270);
		drawLine(x, y + height, x, y);
	}
}