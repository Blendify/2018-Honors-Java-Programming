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
	
	private int temp_numer1, temp_denom1, temp_numer2, temp_denom2;
	
	/* CONSTRUCTORS */
    public Rational() {
    // DEAFULT: create a fraction 0/1
    	numerator = 0;
    	denominator = 1;
    }
    
    public Rational(int numer, int denom) {
    // Create a fraction with client defined values
    	numerator = numer;
    	denominator = denom;
    }
    
    /* METHODS */
    public void add(Rational b){
    //Adds two rationals
    	this.common_factor(b);
		this.numerator   = temp_numer1 + temp_numer2;
    	this.denominator = temp_denom1;
		this.simplify();
    }
    
    public void subtract(Rational b){
    //Subtracts two rationals
		this.common_factor(b);
		this.numerator   = temp_numer1 - temp_numer2;
		this.denominator = temp_denom1;
		this.simplify();
    }

	public void multiply(Rational b){
	//Multiplies two fractions
	   	this.common_factor(b);
		this.numerator   = temp_numer1 * temp_numer2;
		this.denominator = temp_denom1 * temp_denom2;
		this.simplify();
	}
    
    public void divide(Rational b){
	//Divides two fractions
	   	this.common_factor(b);
		this.numerator   = temp_numer1 * temp_denom2;
		this.denominator = temp_denom1 * temp_numer2;
		this.simplify();
	}
	
	private void common_factor(Rational b){
		temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;
	}
	
	public void reciprocal(){
		temp_numer1 = this.numerator;
		temp_denom1 = this.denominator;

		this.numerator = temp_denom1;
		this.denominator = temp_numer1;
	}

    public void simplify(){
    //Simplifies a fraction to its simplist form
    	for (int i = Math.max(this.numerator, this.denominator); i >= 2; i--){
     		if ((this.numerator % i == 0) && (this.denominator % i == 0)){
    			this.numerator /= i;
    			this.denominator /= i;
    		}
   		}
    }
    
    public Boolean compare(Rational b){
    	this.common_factor(b);
    	if ((temp_numer1 == temp_numer2) && (temp_denom1 == temp_denom2))
    		return true;
    	else
    		return false;
    }

    public String toString(){
    //Construct and return a string representation of the fraction
    	String str;
    	str = numerator + "\n--\n" + denominator;
    	return str;
    }
}