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
   		int temp_numer1, temp_denom1, temp_numer2, temp_denom2;
    	temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;

		this.numerator   = temp_numer1 + temp_numer2;
    	this.denominator = temp_denom1;
		
		this.simplify();
    }
    
    public void subtract(Rational b){
    //Subtracts two rationals
   		int temp_numer1, temp_denom1, temp_numer2, temp_denom2;
    	temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;
    	
		this.numerator   = temp_numer1 - temp_numer2;
		this.denominator = temp_denom1;
		
		this.simplify();
    }

	public void multiply(Rational b){
	//Multiplies two fractions
	   	int temp_numer1, temp_denom1, temp_numer2, temp_denom2;
    	temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;
    	
		this.numerator   = temp_numer1 * temp_numer2;
		this.denominator = temp_denom1 * temp_denom2;
		
		this.simplify();
	}
    
    public void divide(Rational b){
	//Divides two fractions
	   	int temp_numer1, temp_denom1, temp_numer2, temp_denom2;
    	temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;
    	
		this.numerator   = temp_numer1 * temp_denom2;
		this.denominator = temp_denom1 * temp_numer2;
		
		this.simplify();
	}
	
	public void reciprocal(){
		int temp_numer1 = this.numerator;
		int temp_denom1 = this.denomitor

		this.numerator = temp_denom1;
		this.denominator = temp_numer1;
	}

    public void simplify(){
    //Simplifies a fraction to its simplist form
    	for (int i = 9; i >= 2; i--){
     		if ((this.numerator % i == 0) && (this.denominator % i == 0)){
    			this.numerator /= i;
    			this.denominator /= i;
    		}
   		}
    }
    
    public Boolean compare(Rational b){
    	int temp_numer1, temp_denom1, temp_numer2, temp_denom2;
    	temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;
    	
    	if ((temp_numer1 == temp_numer2) && (temp_denom1 == temp_denom2))
    		return True;
    	else
    		return False;
    }

    public String toString(){
    //Construct and return a string representation of the fraction
    	String str;
    	str = numerator + "\n--\n" + denominator;
    	return str;
    }
}