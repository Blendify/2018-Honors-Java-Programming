/**
 * @(#)Interest.java
 *
 *
 * @author 
 * @version 1.00 2018/5/1
 */


public class Interest {
	private double newAmount;
	private double interestEarned;

    public double interestCompond(double p, double r, int n, double t) {
    	newAmount = p * Math.pow((1.0 + (r / (double)n)), (double)n * t);
    	interestEarned = newAmount - p;
    	System.out.println(interestEarned);
    	return newAmount;
    }
    
    public double getNewAmount() {
    	return newAmount;
    }
    public double getInterestEarned() {
    	return interestEarned;
    }
    
}