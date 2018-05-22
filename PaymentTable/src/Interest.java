/**
 * @(#)Interest.java
 *
 * Interest class
 *
 * @discription: Calulates compond interest and interest earned
 * @author Aaron Carlisle
 * @version 1.00 2018/05/22
 */

public class Interest {
	private int    month;
	private double principle;
	private double newBal;
	private double downPayment;
	private double monthlyPayment;
	private double beginBalance;
	private double interest;
	
	private double temp; // Temp storage

	// Rates
	private final double RATE_DOWN_PAYMENT    = 0.10;
	private final double RATE_ANNUAL_INTEREST = 0.12;
	private final double RATE_MONTHLY_PAYMENT = 0.05;

	// Constructor
	public Interest(double p) {
		// Constructor
		// initial calcualtions
		month = 0;
		principle = p;
		downPayment = principle * RATE_DOWN_PAYMENT;
		beginBalance = principle - downPayment;
		temp = beginBalance;
		monthlyPayment = RATE_MONTHLY_PAYMENT * (principle - downPayment);
		this.calculate();
	}
	
	public void calculate() {
		// calculations per month
		month++;
		beginBalance = temp;
		this.interestCompond(beginBalance, RATE_ANNUAL_INTEREST, 12, 1);
		temp = beginBalance - (monthlyPayment - (beginBalance * (RATE_ANNUAL_INTEREST / 12.0)));
		if (temp < 0.0) {
			newBal = beginBalance - beginBalance;
			monthlyPayment = beginBalance;
		}
		else {	
			newBal = temp;
		}
	}

    private void interestCompond(double p, double r, int n, double t) {
    	// Calculate interest
    	interest = (p * Math.pow((1.0 + ((r *0.01) / (double)n)), (double)n * t)) - p;
    }

	public int getMonth() {
		// return month number
		return month;
	}

	public double getMonthlyPayment() {
		// return the monthly payment
		return monthlyPayment;
	}
	
	public double getTotalOwed() {
		// return the new balance
		return newBal;
	}

	public double getBeginBalance() {
		// return the begining balance
		return beginBalance;
	}

	public double getInterest() {
		// return the interest due per month
		return beginBalance * (RATE_ANNUAL_INTEREST / 12.0);
	}
	
	public double getPrincipleOwed() {
		// return the total interest owed
		return monthlyPayment - (beginBalance * (RATE_ANNUAL_INTEREST / 12.0));
	}
	
	public double getDownPayment() {
		// return the downpayment
		return downPayment;
	}
}
