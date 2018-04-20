/**
 * @(#)Rational.java
 *
 * Rational class
 *
 * Discription: Class to work with fractions and mixed fractions
 * @author Aaron Carlisle
 * @version 1.00 2018/4/5
 */


public class Rational {
	private int numerator;
	private int denominator;
	private int wholeNumber;

	private Rational temp1, temp2;

	/* CONSTRUCTORS */
    public Rational() {
    // DEAFULT: create a fraction 0/1
    	numerator = 0;
    	denominator = 1;
    	wholeNumber = 0;
    }

    public Rational(int numer, int denom) {
    // Create a fraction with defined values
    	this();
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
		Rational c = new Rational(temp1.numerator + temp2.numerator,
					temp1.denominator, this.wholeNumber + b.wholeNumber);
		c.simplify();
		return c;
    }

    public Rational subtract(Rational b){
    //Subtracts two rationals
		this.common_factor(b);
		Rational c = new Rational(temp1.numerator - temp2.numerator,
					temp1.denominator, this.wholeNumber - b.wholeNumber);
		c.simplify();
		return c;
    }

    public Rational multiply(Rational b){
    //Multiplies two fractions
	   	this.common_factor(b);
		Rational c = new Rational (temp1.numerator * temp2.numerator,
								temp1.denominator * temp2.denominator,
								this.wholeNumber * b.wholeNumber);
		c.simplify();
		return c;
	}

   public Rational divide(Rational b){
	//Divides two fractions
	   	this.common_factor(b);
		Rational c = new Rational(temp1.numerator * temp2.denominator,
					temp1.denominator * temp2.numerator);
		c.simplify();
		return c;
	}

	public Rational reciprocal(){
	//Finds the reciprocal of an rational
		int temp_numer = this.numerator;
		int temp_denom = this.denominator;
		
		Rational c = new Rational(temp_denom, temp_numer);
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
    	if (this.numerator % this.denominator == 0){
			this.wholeNumber += this.numerator / this.denominator;
			this.numerator = 0;
			this.denominator = 1;
		}
    }

	public Rational toMixed(){
		int temp_numer = this.numerator % this.denominator;
		int temp_denom = this.denominator;
		int whole = this.numerator / this.denominator;
		Rational c = new Rational(temp_numer, temp_denom, whole);
		c.simplify();
		return c;
	}

	public Rational toImproper(){
		int temp_numer = this.numerator + (this.wholeNumber * this.denominator);
		int temp_denom = this.denominator;
		Rational c = new Rational(temp_numer, temp_denom);
		c.simplify();
		return c;
	}

    public Boolean compare(Rational b){
   	//Compares two rationals for equality
    	this.common_factor(b);
    	if ((temp1.numerator == temp2.numerator) && (temp1.denominator == temp2.denominator))
    		return true;
    	else
    		return false;
    }

    public String toString(){
    //Construct and returns a string representation of the fraction
    	String str;
    	str = wholeNumber + " " + numerator + "/" + denominator + "\n";
    	return str;
    }
    
    private void common_factor(Rational b){
    //Quick and dirty method to find a common denominator by
    //mulitpling each fraction by the second's dedenominator
		temp1 = new Rational(this.numerator * Math.abs(b.denominator),
							this.denominator * Math.abs(b.denominator));
		temp2 = new Rational(b.numerator * Math.abs(this.denominator),
							b.denominator * Math.abs(this.denominator));
	}
}
