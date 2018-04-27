/**
 * @(#)InterestCompondGui.java
 *
 * InterestCompondGui application
 *
 * @author 
 * @version 1.00 2018/4/27
 */


import javax.swing.*;
import BreezySwing.*;

public class InterestCompondGui extends GBFrame {
	private JLabel       principleLabel;
	private JLabel       interestRateLabel;
	private JLabel       numPeriodsLabel;
	private JLabel       numYearsLabel;
	private JLabel       newAmountLabel;
	private JLabel       interestEarnedLabel;
	
	private DoubleField  principleField;
	private DoubleField  numPeriodsField;
	private IntegerField numPeriodsField;
	private DoubleField  Field;
	private DoubleField  Field;
	private DoubleField  Field;
	
	private JButton      calculateButton;

  public InterestCompondGui() {
  	// Constructor
  	iterationsLabel = addLabel("Iterations:",1,1,1,1);
  	piLabel         = addLabel("PI",         1,2,1,1);

  	iterationsField = addIntegerField   (0,  2,1,1,1);
  	piField         = addDoubleField    (0.0,2,2,1,1);
  	calculateButton = addButton         ("Calculate",3,1,2,1);
  }

	public void buttonClicked(JButton buttonObj) {
	}

    public static void main(String[] args) {
		InterestCompondGui gui = new InterestCompondGui();
		gui.setTitle("Compond Interest Calculator");
		gui.setSize(250, 100);
		gui.setVisible(true);
    }
}
