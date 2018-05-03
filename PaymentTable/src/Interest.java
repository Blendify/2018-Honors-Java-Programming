/**
 * @(#)Interest.java
 *
 * Interest class
 *
 * @discription: Calulates compond interest and interest earned
 * @author Aaron Carlisle
 * @version 1.00 2018/05/03
 */


public class Interest {
	private double principle;
	private double downPayment;
	private double monthlyPayment;
	private double currentBalance;
	private double interest;

	// Rates
	private final double RATE_DOWN_PAYMENT    = 0.10;
	private final double RATE_ANNUAL_INTEREST = 0.12;
	private final double RATE_MONTHLY_PAYMENT = 0.05;
	
	// Constructor
	public double Interest(double p){
		principle = p;
		currentBalance = principle;
		downPayment = p * RATE_DOWN_PAYMENT;
		monthlyPayment = RATE_MONTHLY_PAYMENT * (principle - downPayment)
		this.interestCompond(currentBalance, RATE_ANNUAL_INTEREST, 12, 1)
	}

    private double interestCompond(double p, double r, int n, double t) {
    	currentBalance = p * Math.pow((1.0 + ((r *0.01) / (double)n)), (double)n * t);
    	interest = currentBalance - p;
    	return newAmount;
    }

	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public double getInterest() {
		return interest;
	}
}
