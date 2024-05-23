import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorFunction extends CalculatorDisplay implements ActionListener {
	
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
