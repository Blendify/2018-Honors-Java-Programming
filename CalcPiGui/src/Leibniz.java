/**
 * @(#)Leibniz.java
 *
 * Libniz class
 *
 * @discription Uses Gottfried Leibniz's formula to aproximate the value of pi:
 *				pi/4 = 1 - 1/3 + 1/5 - 1/7 + ...
 * @author Aaron Carlisle
 * @version 1.00 2018/4/27
 */


public class Leibniz {

    public double leibniz(int i) {
    	double pi = 1.0; // begin with 1 to so we can subtract from it first
    	double denominator = 1.0;

        for (int loopCount = 0; loopCount < i; loopCount++) {
        	denominator = (denominator + 2.0);
        	if ((loopCount % 2) != 0) { // Are we odd or even itererations
    			pi += (1.0 / denominator);
    		} else {
    			pi -= (1.0 / denominator);
        	}
        }
        pi *= 4.0;
    	return pi;
    }
}
