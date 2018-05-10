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
	private double principleOwed;
	private double totalOwed;
	private double downPayment;
	private double monthlyPayment;
	private double currentBalance;
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
		totalOwed = principle;
		currentBalance = principle;
		downPayment = principle * RATE_DOWN_PAYMENT;
		this.calculate();
		principleOwed = monthlyPayment - interest;
		System.out.println("Principle: " + principle);
		System.out.println("DownPayment: " + downPayment);
		System.out.println("Monthly Payment: " + monthlyPayment);
		System.out.println("Current Balance: " + currentBalance);
		System.out.println("Interest: " + interest);
	}
	
	public void calculate() {
		// calculations per month
		month++;
		this.interestCompond(currentBalance, RATE_ANNUAL_INTEREST, 12, 1);
		monthlyPayment = RATE_MONTHLY_PAYMENT * (principle - downPayment) + interest;
		if (month == 1) {
			monthlyPayment += downPayment;
		}
		totalOwed += interest;
	}

    private void interestCompond(double p, double r, int n, double t) {
    	currentBalance = p * Math.pow((1.0 + ((r *0.01) / (double)n)), (double)n * t);
    	interest       = currentBalance - p;
    	currentBalance = currentBalance - monthlyPayment;
    }

	public int getMonth() {
		return month;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	
	public double getTotalOwed() {
		return totalOwed;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public double getInterest() {
		return currentBalance * RATE_ANNUAL_INTEREST / 12.0;
	}
	
	public double getPrincipleOwed() {
		return principleOwed;
	}
	
	
	public double getRemainingBalance() {
		return currentBalance - monthlyPayment;
	}
	
}
