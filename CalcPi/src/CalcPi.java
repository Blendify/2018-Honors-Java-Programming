/**
 * @(#)CalcPi.java
 *
 * CalcPi application
 *
 * @author 
 * @version 1.00 2018/2/27
 */
 
import TerminalIO.KeyboardReader; // Used for radius input

public class CalcPi {
    
    public static void main(String[] args) {
    	KeyboardReader reader = new KeyboardReader();
    	
    	double pi = 0;
    	double count = 1.0;
    	int loopCount = 0;
    	int i;
    	
    	i = reader.readInt("Enter number of iterations: ");
    	
    	while (loopCount < i) {
    		count = ((count + 2.0) * -1.0);
    		pi = (1.0 / count);
    		loopCount += 1;
    		System.out.println(count);

    	}
    	System.out.println("Pi: " pi * 4.0);
    }
}
