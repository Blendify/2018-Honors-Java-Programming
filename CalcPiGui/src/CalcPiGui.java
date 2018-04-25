/**
 * @(#)CalcPiGui.java
 *
 * CalcPiGui application
 *
 * @author
 * @version 1.00 2018/4/25
 */

import javax.swing.*;
import BreezySwing.*;

public class CalcPiGui extends GBFrame {
	private JLabel       iterationsLabel;
	private JLabel       piLabel;
	private IntegerField iterationsField;
	private DoubleField  piField;
	private JButton      calculateButton;

  public CalcPiGui() {
  	// Constructor
  	iterationsLabel = addLabel("Iterations:",1,1,1,1);
  	piLabel         = addLabel("PI",         1,1,1,1);

  	iterationsField = addIntegerField   (0,2,1,1,1);
  	piField         = addDoubleField    (0.0,2,1,1,1);
  	calculateButton = addButton         ("Calculate",3,1,2,1);
  }

	public void buttonCLicked(JButton buttonObj) {
	}

    /*
    public double Leibniz (int i){
        while (loopCount < i) {
        	denominator = (denominator + 2.0);
        	if ((loopCount % 2) != 0) // Are we odd or even itererations
    			pi += (1.0 / denominator);
    		else
    			pi -= (1.0 / denominator);
        	loopCount += 1;
        }
        pi *= 4.0;
    	renturn pi;
    }
    */
    public static void main(String[] args) {
		CalcPiGui gui = new CalcPiGui();
		gui.setTitle("Leibniz's Calculation of Pi");
		gui.setSize(250, 100);
		gui.setVisible(true);
    }
}
