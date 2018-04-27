/**
 * @(#)CalcPiGui.java
 *
 * CalcPiGui application
 *
 * @discription A gui to calculate Pi using Leibniz approximation
 * @author Aaron Carlisle
 * @version 1.00 2018/4/27
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
  	piLabel         = addLabel("PI",         1,2,1,1);

  	iterationsField = addIntegerField   (0,  2,1,1,1);
  	piField         = addDoubleField    (0.0,2,2,1,1);
  	calculateButton = addButton         ("Calculate",3,1,2,1);
  }

	public void buttonClicked(JButton buttonObj) {
		Leibniz pi = new Leibniz();
		piField.setNumber(pi.leibniz(iterationsField.getNumber()));
	}

    public static void main(String[] args) {
		CalcPiGui gui = new CalcPiGui();
		gui.setTitle("Leibniz's Calculation of Pi");
		gui.setSize(250, 100);
		gui.setVisible(true);
    }
}
