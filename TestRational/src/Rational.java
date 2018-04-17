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
    public Rational add(Rational b){
    //Adds two rationals
    	this.common_factor(b);

		return new Rational(temp_numer1 + temp_numer2, temp_denom1).simplify(this);
    }

    public Rational subtract(Rational b){
    //Subtracts two rationals
		this.common_factor(b);

		return new Rational(temp_numer1 - temp_numer2, temp_denom1).simplify(this);
    }

    public Rational multiply(Rational b){
		//Multiplies two fractions
	  	this.common_factor(b);
			Rational c = new Rational (temp_numer1 * temp_numer2, temp_denom1 * temp_denom2);
			return c.simplify(c);
	}

    public Rational divide(Rational b){
		//Divides two fractions
	   	this.common_factor(b);

		return new Rational(temp_numer1 * temp_denom2, temp_denom1 * temp_numer2).simplify(this);
	}

	public Rational reciprocal(Rational b){
		temp_numer1 = b.numerator;
		temp_denom1 = b.denominator;

		return new Rational(temp_denom1, temp_numer1);
	}

    public Rational simplify(Rational a){
    //Simplifies a fraction to its simplist form
    	for (int i = Math.min(a.numerator, a.denominator); i >= 2; i--){
     		if ((a.numerator % i == 0) && (a.denominator % i == 0)){
    			return Rational(a.numerator /= i, a.denominator /= i);
    		}
   		}
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
			temp_numer1 = this.numerator   * b.denominator;
				temp_denom1 = this.denominator * b.denominator;
				temp_numer2 = b.numerator   * this.denominator;
				temp_denom2 = b.denominator * this.denominator;
		}
}
