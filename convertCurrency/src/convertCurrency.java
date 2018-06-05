/**
 * @(#)convertCurrency.java
 *
 * convertCurrency application
 *
 * @author Aaron Carlisle
 * @description: converts from euros to dollars and vice versa
 * @version 1.00 2018/6/5
 */
 
import javax.swing.*; // Used for GUI
import BreezySwing.*; // Used for GUI

public class convertCurrency extends GBFrame {
	private JLabel       rateLabel;
	private JLabel       euroLabel;
	private JLabel       dollarLabel;
	private DoubleField  rateField;
	private DoubleField  euroField;
	private DoubleField  dollarField;
	private JButton      toEuroButton;
	private JButton      toDollarButton;

  public convertCurrency() {
  	// Constructor
  	rateLabel      = addLabel("Exchange Rate:", 1,1,1,1);
  	rateField      = addDoubleField(1.0,        1,2,1,1);
  	euroLabel      = addLabel("Euros:",         2,1,1,1);
  	dollarLabel    = addLabel("Dollars:",       2,2,1,1);
  	euroField      = addDoubleField(1.0,        3,1,1,1);
  	dollarField    = addDoubleField(1.0,        3,2,1,1);
  	toDollarButton = addButton("To Dollars",    4,1,1,1);
  	toEuroButton   = addButton("To Euros",      4,2,1,1);
  	
  	euroField.setPrecision(2);
  	dollarField.setPrecision(2);
  }

	public void buttonClicked(JButton buttonObj) {
		double rate    = rateField.getNumber();
		double euros   = euroField.getNumber();
		double dollars = dollarField.getNumber();
		
		if (buttonObj == toDollarButton) {
			dollarField.setNumber(euros * rate);
		} else {
			euroField.setNumber(dollars / rate);
		}
	}

    public static void main(String[] args) {
		convertCurrency gui = new convertCurrency();
		gui.setTitle("Currency Converter");
		gui.setSize(500, 250);
		gui.setVisible(true);
    }
}
