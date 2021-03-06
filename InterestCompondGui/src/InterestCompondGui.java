/**
 * @(#)InterestCompondGui.java
 *
 * InterestCompondGui application
 *
 * @discription: GUI to calculate compond interest
 * @author Aaron Carlisle
 * @version 1.00 2018/05/03
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

	private JComboBox    numPeriodsMenu;
	private JButton      calculateButton;

  public InterestCompondGui() {
  	// Constructor
  	principleLabel  = addLabel("Princliple:",          1,1,1,1);
  	principleLabel  = addLabel("Interest Rate (%):",   2,1,1,1);
  	principleLabel  = addLabel("No. of Periods:",      3,1,1,1);
  	principleLabel  = addLabel("No. of Years:",        4,1,1,1);
  	principleLabel  = addLabel("New Amount:",          5,1,1,1);
  	principleLabel  = addLabel("Interest Earned:",     6,1,1,1);

	principleField      = addDoubleField (0.0,1,2,1,1);
	interestRateField   = addDoubleField (0.0,2,2,1,1);
  numPeriodsMenu      = addComboBox    (    3,2,1,1);
	numYearsField       = addDoubleField (0.0,4,2,1,1);
	newAmountField      = addDoubleField (0.0,5,2,1,1);
	interestEarnedField = addDoubleField (0.0,6,2,1,1);

  	calculateButton = addButton("Calculate",8,1,2,1);

  	// Menu options
  	numPeriodsMenu.addItem ("Annually"); // Default
    numPeriodsMenu.addItem ("Semiannually");
    numPeriodsMenu.addItem ("Quarterly");
    numPeriodsMenu.addItem ("Monthly");
    numPeriodsMenu.addItem ("Daily");

	// Answer fields
  	newAmountField.setEditable(false);
  	interestEarnedField.setEditable(false);

  	// Formate as money values
  	newAmountField.setPrecision(2);
  	interestEarnedField.setPrecision(2);
  }

	public void buttonClicked(JButton buttonObj) {
		Interest ci = new Interest();
		int n;

		if (numPeriodsMenu.getSelectedItem() == "Annually") {
			n = 1;
		}
		else if(numPeriodsMenu.getSelectedItem() == "Semiannually") {
			n = 2;
		}
		else if(numPeriodsMenu.getSelectedItem() == "Quarterly") {
			n = 4;
		}
		else if(numPeriodsMenu.getSelectedItem() == "Monthly") {
			n = 12;
		} else {
			n = 365;
		}
		double p = principleField.getNumber();
		double r = interestRateField.getNumber();
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
