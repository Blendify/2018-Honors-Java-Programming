/**
 * @(#)Rational.java
 *
 *
 * @author 
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
    
    public Rational(int numer1, int denom1) {
    // Create a fraction with client defined values
    	numerator = numer;
    	denominator = denom;
    }
    
    public void add(int numer1, int denom1, int numer2, int denom2){
    	int temp_numer1, temp_denom1, temp_numer2, temp_denum2;
    	temp_numer1 = numer1 * denom2;
    	temp_denom1 = denom1 * denom2;
    	temp_numer2 = numer2 * denom1;
    	temp_denum2 = denum2 * denom1;
    	
    	return temp_numer1 + temp_numer2
    	return temp_denom1 + temp_denum2
    }
    
    public String toString(){
    //Construct and return a string representation of the fraction
    	String str;
    	str = numerator + "\n--\n" + denominator;
    }
}