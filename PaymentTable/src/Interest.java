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
	private int    month;
	private double principle;
	private double newBal;
	private double downPayment;
	private double monthlyPayment;
	private double beginBalance;
	private double interest;

	// Rates
	private final double RATE_DOWN_PAYMENT    = 0.10;
	private final double RATE_ANNUAL_INTEREST = 0.12;
	private final double RATE_MONTHLY_PAYMENT = 0.05;

	// Constructor
	public Interest(double p) {
		// initial calcualtions
		month = 0;
		principle = p;
		beginBalance = principle - downPayment;
		downPayment = principle * RATE_DOWN_PAYMENT;
		this.calculate();
	}
	
	public void calculate() {
		// calculations per month
		month++;
		this.interestCompond(beginBalance, RATE_ANNUAL_INTEREST, 12, 1);
		monthlyPayment = RATE_MONTHLY_PAYMENT * principle;
		beginBalance -= monthlyPayment;
		newBal = beginBalance - monthlyPayment;
		beginBalance = newBal;
	}

    private void interestCompond(double p, double r, int n, double t) {
    	beginBalance = p * Math.pow((1.0 + ((r *0.01) / (double)n)), (double)n * t);
    	interest       = beginBalance - p;
    }

	public int getMonth() {
		return month;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	
	public double getTotalOwed() {
		return newBal;
	}

	public double getBeginBalance() {
		return beginBalance;
	}

	public double getInterest() {
		return beginBalance * (RATE_ANNUAL_INTEREST / 12.0);
	}
	
	public double getPrincipleOwed() {
		return monthlyPayment - interest;
	}
}
