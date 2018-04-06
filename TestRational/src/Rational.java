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
    
    public void add(Rational b){
		this.common_dedom(b);

		this.numerator += b.numerator;

    }
    
    public void common_dedom(Rational b){
    // Finds the common denomiator beween two numbers and sets the rational values accordingly
    
        int temp_numer1, temp_denom1, temp_numer2, temp_denom2;
    	temp_numer1 = this.numerator   * b.denominator;
    	temp_denom1 = this.denominator * b.denominator;
    	temp_numer2 = b.numerator   * this.denominator;
    	temp_denom2 = b.denominator * this.denominator;
    	
    	this.numerator   = temp_numer1;
    	this.denominator = temp_denom1;
    
    }
    
    public void simplify(Rational b){
    //simplifies a fraction to its simplist form
    
    }

    public String toString(){
    //Construct and return a string representation of the fraction
    	String str;
    	str = numerator + "\n--\n" + denominator;
    	return str;
    }
}