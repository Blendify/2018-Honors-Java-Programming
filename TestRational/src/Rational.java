/**
 * @(#)Rational.java
 *
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/4/5
 */


public class Rational {
	private int numerator;
	private int denominator;
	private int wholeNumber = 0;

	private int temp_numer1, temp_denom1, temp_numer2, temp_denom2;

	/* CONSTRUCTORS */
    public Rational() {
    // DEAFULT: create a fraction 0/1
    	numerator = 0;
    	denominator = 1;
    }

    public Rational(int numer, int denom) {
    // Create a fraction with defined values
    	numerator = numer;
    	denominator = denom;
    }

    public Rational(int numer, int denom, int whole) {
    // Create a fraction with defined values
    	numerator = numer;
    	denominator = denom;
    	wholeNumber = whole;
    }
	
    /* METHODS */
    public Rational add(Rational b){
    //Adds two rationals
    	this.common_factor(b);
		Rational c = new Rational(temp_numer1 + temp_numer2, temp_denom1);
		c.simplify();
		return c;
    }

    public Rational subtract(Rational b){
    //Subtracts two rationals
		this.common_factor(b);
		Rational c = new Rational(temp_numer1 - temp_numer2, temp_denom1);
		c.simplify();
		return c;
    }

    public Rational multiply(Rational b){
    //Multiplies two fractions
	   	this.common_factor(b);
		Rational c = new Rational (temp_numer1 * temp_numer2, temp_denom1 * temp_denom2);
		c.simplify();
		return c;
	}

    public Rational divide(Rational b){
	//Divides two fractions
	   	this.common_factor(b);
		Rational c = new Rational(temp_numer1 * temp_denom2, temp_denom1 * temp_numer2);
		c.simplify();
		return c;
	}

	public Rational reciprocal(){
	//Finds the reciprocal of an rational
		temp_numer1 = this.numerator;
		temp_denom1 = this.denominator;
		
		Rational c = new Rational(temp_denom1, temp_numer1);
		return c;
	}

    public void simplify(){
    //Simplifies a fraction to its simplist form
    	boolean is_negative;

    	if (this.numerator == 0){
			this.denominator = 1;
    	}
    	if ((this.numerator < 0) || (this.denominator < 0)){
    		is_negative = true;
			this.numerator = Math.abs(this.numerator);
			this.denominator = Math.abs(this.denominator);
    	} else {
    		is_negative = false;
    	}
    	for (int i = Math.min(this.numerator, this.denominator); i >= 2; i--){
     		if ((this.numerator % i == 0) && (this.denominator % i == 0)){
    			this.numerator /= i;
    			this.denominator /= i;
    		}
    	}
    	if (is_negative == true)
    		this.numerator *= -1;
    }

	public Rational toMixed(Rational B){
		Rational c = new Rational(temp_denom1, temp_numer1);
		return c;
	}
    public Boolean compare(Rational b){
   	//Compares two rationals for equality
    	this.common_factor(b);
    	if ((temp_numer1 == temp_numer2) && (temp_denom1 == temp_denom2))
    		return true;
    	else
    		return false;
    }

    public String toString(){
    //Construct and returns a string representation of the fraction
    	String str;
    	str = numerator + "\n--\n" + denominator + "\n";
    	return str;
    }
    
    private void common_factor(Rational b){
    //Quick and dirty method to find a common denominator by
    //mulitpling each fraction by the second's dedenominator
		temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;
	}
}
