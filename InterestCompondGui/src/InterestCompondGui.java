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
	private DoubleField  interestRateField;
	private IntegerField numPeriodsField;
	private DoubleField  numYearsField;
	private DoubleField  newAmountField;
	private DoubleField  interestEarnedField;
	
	private JButton      calculateButton;

  public InterestCompondGui() {
  	// Constructor
  	principleLabel  = addLabel("Princliple:",      1,1,1,1);
  	principleLabel  = addLabel("Interest Rate:",   2,1,1,1);
  	principleLabel  = addLabel("No. of Periods:",  3,1,1,1);
  	principleLabel  = addLabel("No. of Years:",    4,1,1,1);
  	principleLabel  = addLabel("New Amount:",      5,1,1,1);
  	principleLabel  = addLabel("Interest Earned:", 6,1,1,1);

	principleField      = addDoubleField (0.0,1,2,1,1);
	interestRateField   = addDoubleField (0.0,2,2,1,1);
  	numPeriodsField     = addIntegerField(0,  3,2,1,1);
	numYearsField       = addDoubleField (0.0,4,2,1,1);
	newAmountField      = addDoubleField (0.0,5,2,1,1);
	interestEarnedField = addDoubleField (0.0,6,2,1,1);
  	
  	calculateButton = addButton("Calculate",7,1,2,1);
  	
  	newAmountField.setEditable(false);
  	interestEarnedField.setEditable(false);
  	
  	//newAmountField.setPrecision(2);
  	//interestEarnedField.setPrecision(2);
  }

	public void buttonClicked(JButton buttonObj) {
		Interest ci = new Interest();
		double p = principleField.getNumber();
		double r = interestRateField.getNumber();
		int    n = numPeriodsField.getNumber();
		double t = numYearsField.getNumber();
		double amount = ci.interestCompond(p, r, n, t);
		newAmountField.setNumber(amount);
		interestEarnedField.setNumber(ci.getInterestEarned());
	}

    public static void main(String[] args) {
		InterestCompondGui gui = new InterestCompondGui();
		gui.setTitle("Compond Interest Calculator");
		gui.setSize(250, 300);
		gui.setVisible(true);
    }
}
