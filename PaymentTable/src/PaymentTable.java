/**
 * @(#)PaymentTable.java
 *
 * PaymentTable application
 * 
 * @discription Displays a table for the payment of a loan
 * @author Aaron Carlisle
 * @version 1.00 2018/05/22
 */

import javax.swing.*; // Used for GUI
import BreezySwing.*; // Used for GUI

public class PaymentTable extends GBFrame {
	private JLabel       purchasePriceLabel;
	private JLabel       downPaymentLabel;
	private DoubleField  purchasePriceField;
	private DoubleField  downPaymentField;
	private JButton      calculateButton;
	private JTextArea    output;
	private String header = Format.justify('l', "Month",              5) +
  							Format.justify('r', "Beg. Balan ",        12) +
  							Format.justify('r', "Interest Owed ",     14) +
  							Format.justify('r', "Principle Owed ",    15) +
  							Format.justify('r', "Payment ",            9) +
  							Format.justify('r', "Remaining Balance",  17) + "\n";

  public PaymentTable() {
  	// Constructor
  	purchasePriceLabel = addLabel      ("Purchase Price:", 1,1,1,1);
	purchasePriceField = addDoubleField(0.0,               1,2,1,1);
	downPaymentLabel   = addLabel      ("Down Payment:",   2,1,1,1);
	downPaymentField   = addDoubleField(0.0,               2,2,1,1);
  	calculateButton    = addButton     ("Calculate",       3,1,2,1);
  	output             = addTextArea   (header,            4,1,3,1);

	// Return Fields
	output.setEnabled(false);
    downPaymentField.setEditable(false);

  	// Formate as money values
  	purchasePriceField.setPrecision(2);
  	downPaymentField.setPrecision(2);
  }

	public void buttonClicked(JButton buttonObj) {
		String line;
		double p = purchasePriceField.getNumber();
		Interest debt = new Interest(p);

		// Reset text area
		output.setText(header);
		
		// Sanity check
		if (purchasePriceField.getNumber() <= 0.0) {
			output.setText("Please enter a valid price");
		} else {
			downPaymentField.setNumber(debt.getDownPayment());
			// Add lines untill balance is 0
			while (debt.getBeginBalance() > 0.0) {
				line =  Format.justify('l', debt.getMonth(),      5) +
  						Format.justify('r', debt.getBeginBalance(),  12, 2) +
  						Format.justify('r', debt.getInterest(),  14, 2) +
  						Format.justify('r', debt.getPrincipleOwed(), 15, 2) +
  						Format.justify('r', debt.getMonthlyPayment(), 9, 2) +
  						Format.justify('r', debt.getTotalOwed(),  17, 2) + "\n";
				output.append(line);
				debt.calculate();
			}
		}
	}

    public static void main(String[] args) {
		PaymentTable gui = new PaymentTable();
		gui.setTitle("Payment Table");
		gui.setSize(500, 250);
		gui.setVisible(true);
    }
}
