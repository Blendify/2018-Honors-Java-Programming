/**
 * @(#)TestRational.java
 *
 * TestRational application
 *
 * @author 
 * @version 1.00 2018/4/5
 */

import TerminalIO.KeyboardReader; // used to input rationals

public class TestRational {
    
    public static void main(String[] args) {
    
    KeyboardReader reader = new KeyboardReader();
    Rational rat1, rat2;
    
    int rat1_num   = reader.readInt("rat 1 num: ");
    int rat1_denom = reader.readInt("rat 1 denom: ");
    int rat2_num   = reader.readInt("rat 2 num: ");
    int rat2_denom = reader.readInt("rat 2 denom: ");
    
    rat1 = new Rational(rat1_num, rat1_denom);
    rat2 = new Rational(rat2_num, rat2_denom);

	//rat1.simplify();
    rat1.add(rat2);

    System.out.println(rat1);
    }
}
