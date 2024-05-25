import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

public class CalculatorFunction extends CalculatorDisplay implements ActionListener, KeyListener {
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;	
	
	public CalculatorFunction() {
		
		addListeners();
		addToFrame();
		
	}

	private void addListeners() {
		
		for (int i = 0; i < this.getFunctionButtons().length; i++) {
			this.getFunctionButtons()[i].addActionListener(this);		
			this.getFunctionButtons()[i].setFont(CalcConstants.FONT_OCR);				
			this.getFunctionButtons()[i].setFocusable(CalcConstants.FUNCTION_BUTTON_FOCUSABLE);	
		}
		
		for (int i = 0; i < this.getNumberButtons().length; i++) {
			this.getNumberButtons()[i] = new JButton(String.valueOf(i));	
			this.getNumberButtons()[i].addActionListener(this);		
			this.getNumberButtons()[i].setFont(CalcConstants.FONT_OCR);		
			this.getNumberButtons()[i].setFocusable(CalcConstants.NUMBER_BUTTON_FOCUSABLE);	
		}
		
		this.getFrame().addKeyListener(this);
		
	}

	private void addToFrame() {
		
		this.getPanel().add(this.getSqrButton());
		this.getPanel().add(this.getSqrRootButton());
		this.getPanel().add(this.getReciButton());
		this.getPanel().add(this.getPercentButton());
		
		this.getPanel().add(this.getNumberButtons()[1]);
		this.getPanel().add(this.getNumberButtons()[2]);
		this.getPanel().add(this.getNumberButtons()[3]);
		this.getPanel().add(this.getAddButton());
		
		this.getPanel().add(this.getNumberButtons()[4]);
		this.getPanel().add(this.getNumberButtons()[5]);
		this.getPanel().add(this.getNumberButtons()[6]);
		this.getPanel().add(this.getSubButton());
		
		this.getPanel().add(this.getNumberButtons()[7]);
		this.getPanel().add(this.getNumberButtons()[8]);
		this.getPanel().add(this.getNumberButtons()[9]);
		this.getPanel().add(this.getMulButton());
		
		this.getPanel().add(this.getDecButton());
		this.getPanel().add(this.getNumberButtons()[0]);
		this.getPanel().add(this.getEquButton());
		this.getPanel().add(this.getDivButton());
		
		this.getFrame().add(this.getPanel()); 									
		this.getFrame().add(this.getNegButton());
		this.getFrame().add(this.getDelButton());								
		this.getFrame().add(this.getClrButton());								
		this.getFrame().add(this.getTextField());	 
		this.getFrame().add(this.getLabel());
		this.getFrame().setFocusable(true);
		this.getFrame().setVisible(true);
		
	}
	
	public void clearLabel() {
		this.getLabel().setText("");
	}
	
	public void clearTextField() {
		this.getTextField().setText("");
	}
	
	public static String removeZeroDecimal(String s) {
		String string = s;
		if (string.endsWith(".0")) {
			string.replace(".0", "");
		} 
		return string;
	}
	
	public void addition() {
		num2 = num1;
		num1 = Double.parseDouble(this.getTextField().getText());
		operator = '+';		
		num1 += num2;
		this.getLabel().setText(removeZeroDecimal(Double.toString(num1)) + operator);
	}
	
	public void subtraction() {
		num2 = num1;
		num1 = Double.parseDouble(this.getTextField().getText());	
		operator = '-';	
		num1 -= num2;
		this.getLabel().setText(removeZeroDecimal(Double.toString(num1)) + operator);
	}
	
	public void multiply() {
		num2 = num1;
		num1 = Double.parseDouble(this.getTextField().getText());	
		operator = '*';									
		num1 *= num2;
		this.getLabel().setText(removeZeroDecimal(Double.toString(num1)) + operator);
	}
	
	public void division() {
		num2 = num1;
		num1 = Double.parseDouble(this.getTextField().getText());	
		operator = '/';									
		num1 /= num2;
		this.getLabel().setText(removeZeroDecimal(Double.toString(num1)) + operator);
	}
	
	public void sum() {
		num2 = Double.parseDouble(this.getTextField().getText());	

		//addition method review & subsequent others
		switch (operator) {		 
			case '+': 
				result = num1 + num2;
				break;
			case '-': 
				result = num1 - num2;
				break;
			case '*': 
				result = num1 * num2;
				break;
			case '/': 
				result = num1 / num2;
				break;
		}

		this.getTextField().setText(removeZeroDecimal(Double.toString(result)));

		this.getLabel().setText(removeZeroDecimal(String.valueOf(result)));
		clearTextField();		
		num2=result;
		num1=0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		for(int i = 0; i < 10; i++) {
			if(source == this.getNumberButtons()[i]) {
				this.getTextField().setText(this.getTextField().getText().concat(String.valueOf(i)));
			}
		}
		
		if(source == this.getDecButton()) {	 
			this.getTextField().setText(this.getTextField().getText().concat(CalcConstants.STRING_DEC_BUTTON));
		}
		
		if(source == this.getAddButton()) {			
			addition();
			clearTextField();		
		}
		
		if(source == this.getSubButton()) {	
			subtraction();
			clearTextField();
		}
		
		if(source == this.getMulButton()) {	
			multiply();
			clearTextField();							
		}
		
		if(source == this.getDivButton()) {	  
			division();
			clearTextField();							
		}
		
		if(source == this.getSqrRootButton()) {
			num1 = Double.parseDouble(this.getTextField().getText());
			Double squareRoot = Math.sqrt(num1);
			this.getTextField().setText(removeZeroDecimal(Double.toString(squareRoot)));
		}
		
		if(source == this.getSqrButton()) {
			num1 = Double.parseDouble(this.getTextField().getText());
			double square = Math.pow(num1, 2);
			String string = removeZeroDecimal(Double.toString(square));
			this.getTextField().setText(string);
		}
		
		if(source == this.getReciButton()) {
			num1 = Double.parseDouble(this.getTextField().getText());
			double reciprocal = 1 / num1;
			String string = removeZeroDecimal(Double.toString(reciprocal));
			this.getTextField().setText(string);
		}
		
		///needs work to improve the printing and memory functionality
		if (source == this.getPercentButton()) {
			num2 = num1;
			num1 = Double.parseDouble(this.getTextField().getText());
			result = (num2 / num1) * 100;
			this.getLabel().setText(removeZeroDecimal(Double.toString(result)));
			clearTextField();
		}
		
		if(source == this.getEquButton()) {				 
			sum();
		}
		
		if(source == this.getClrButton()) { 				
			clearLabel();
			clearTextField();
			num1 = 0;
			num2 = 0;
			result = 0;
		}
		
		if(source == this.getDelButton()) {							
			String textMemory = this.getTextField().getText();		
			clearTextField();							
			for (int i = 0; i < textMemory.length() - 1; i++) {	
				this.getTextField().setText(this.getTextField().getText() + textMemory.charAt(i));
			}
		}
		
		if(source == this.getNegButton()) {		
			double temporaryValue = Double.parseDouble(this.getTextField().getText());	
			temporaryValue*=-1;								
			this.getTextField().setText(removeZeroDecimal(String.valueOf(temporaryValue)));	
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		switch (e.getKeyChar()) {
			case '1':
				this.getTextField().setText(this.getTextField().getText() + 1);
				break;
			case '2':
				this.getTextField().setText(this.getTextField().getText() + 2);
				break;
			case '3':
				this.getTextField().setText(this.getTextField().getText() + 3);
				break;
			case '4':
				this.getTextField().setText(this.getTextField().getText() + 4);
				break;
			case '5':
				this.getTextField().setText(this.getTextField().getText() + 5);
				break;
			case '6':
				this.getTextField().setText(this.getTextField().getText() + 6);
				break;
			case '7':
				this.getTextField().setText(this.getTextField().getText() + 7);
				break;
			case '8':
				this.getTextField().setText(this.getTextField().getText() + 8);
				break;
			case '9':
				this.getTextField().setText(this.getTextField().getText() + 9);
				break;
			case '0':
				this.getTextField().setText(this.getTextField().getText() + 0);
				break;
			case '+':
				addition();
				clearTextField();
				break;
			case '-':
				subtraction();
				clearTextField();
				break;
			case '*':
				multiply();
				clearTextField();
				break;
			case '/':
				division();
				clearTextField();
				break;
			case '.':
				this.getTextField().setText(this.getTextField().getText() + ".");
				break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == 10) {
			sum();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
