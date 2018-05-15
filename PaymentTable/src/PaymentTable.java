/**
 * @(#)PaymentTable.java
 *
 * PaymentTable application
 *
 * @author Aaron Carlisle
 * @version 1.00 2018/5/3
 */

import javax.swing.*;
import BreezySwing.*;

public class PaymentTable extends GBFrame {
	private JLabel       purchasePriceLabel;
	private DoubleField  purchasePriceField;
	private JButton      calculateButton;
	private JTextArea    output;
	private String header = Format.justify('l', "Month",              5) +
  							Format.justify('r', "Total Owed ",        12) +
  							Format.justify('r', "Interest Owed ",     14) +
  							Format.justify('r', "Principle Owed ",    15) +
  							Format.justify('r', "Payment ",            9) +
  							Format.justify('r', "Remaining Balance",  17) + "\n";

  public PaymentTable() {
  	// Constructor
  	purchasePriceLabel = addLabel      ("Purchase Price:", 1,1,1,1);
	purchasePriceField = addDoubleField(0.0,               1,2,1,1);
  	calculateButton    = addButton     ("Calculate",       2,1,2,1);
  	output             = addTextArea   (header,            3,1,3,1);

	output.setEnabled(false);
  	// Formate as money values
  	purchasePriceField.setPrecision(2);
  }

	public void buttonClicked(JButton buttonObj) {
		String line;
		double p = purchasePriceField.getNumber();
		Interest debt = new Interest(p);

		output.setText(header);
		
		if (purchasePriceField.getNumber() <= 0) {
			output.setText("Please enter a valid price");
		} else {
			while (debt.getCurrentBalance() >= 0.0) {
				line =  Format.justify('l', debt.getMonth(),      5) +
  						Format.justify('r', debt.getTotalOwed(),  12, 2) +
  						Format.justify('r', debt.getInterest(),  14, 2) +
  						Format.justify('r', debt.getPrincipleOwed(), 15, 2) +
  						Format.justify('r', debt.getMonthlyPayment(), 9, 2) +
  						Format.justify('r', debt.getCurrentBalance(),  17, 2) + "\n";
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
