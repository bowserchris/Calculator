import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorDisplay {
	
	private JFrame frame;							
	private JPanel panel;	
	private JLabel label;
	private JTextField textField;						
	private JButton[] numberButtons = new JButton[10];	
	private JButton[] functionButtons = new JButton[12];
	private JButton addButton, subButton, mulButton, divButton, 
					sqrButton, sqrRootButton, decButton, equButton,
					delButton, clrButton, negButton, reciButton, percentButton;		
	
	public CalculatorDisplay() {
		
		createGUI();
		createComponents();
		createButtons();
		
	}

	private void createGUI() {
		
		ImageIcon icon = new ImageIcon(CalcConstants.APP_ICON_PATH);
		
		frame = new JFrame(CalcConstants.APP_TITLE);			//instantiates the frame with my designated title 'bowser calculator' or whatever else i wish to input
		frame.setDefaultCloseOperation(CalcConstants.FRAME_CLOSE_METHOD);//what the x button does on clicking
		frame.setSize(CalcConstants.FRAME_WIDTH,CalcConstants.FRAME_HEIGHT);								//this sets the size and customability measured by pixels 420 pixels by 550
		frame.getContentPane().setLayout(CalcConstants.FRAME_LAYOUT_MANAGER);	
		frame.getContentPane().setBackground(CalcConstants.FRAME_BACKGROUND);
		frame.setResizable(CalcConstants.FRAME_RESIZABLE);	
		frame.setLocationRelativeTo(CalcConstants.FRAME_SPAWN_OPEN);//sets popup location to centre of screen
		frame.setIconImage(icon.getImage());
		
	}
	
	private void createComponents() {
		
		label = new JLabel();
		label.setBounds(CalcConstants.LABEL_XPOSITION,CalcConstants.LABEL_YPOSITION,
						CalcConstants.LABEL_WIDTH,CalcConstants.LABEL_HEIGHT);
		label.setBackground(CalcConstants.LABEL_BACKGROUND);
		label.setForeground(CalcConstants.LABEL_FOREGROUND);
		label.setFont(CalcConstants.FONT_OCR);
		label.setHorizontalAlignment(CalcConstants.LABEL_TEXT_HORIZONTAL_ALIGNMENT);
		
		textField = new JTextField();				
		textField.setBounds(CalcConstants.TEXTFIELD_XPOSITION,CalcConstants.TEXTFIELD_YPOSITION,
							CalcConstants.TEXTFIELD_WIDTH,CalcConstants.TEXTFIELD_HEIGHT);	
		textField.setFont(CalcConstants.FONT_OCR);							
		textField.setEditable(CalcConstants.TEXTFIELD_EDITABLE);
		textField.setHorizontalAlignment(CalcConstants.TEXTFIELD_TEXT_HORIZONTAL_ALIGNMENT);
		
		panel = new JPanel();			
		panel.setBounds(CalcConstants.PANEL_XPOSITION, CalcConstants.PANEL_YPOSITION, 
						CalcConstants.PANEL_WIDTH, CalcConstants.PANEL_HEIGHT);
		panel.setLayout(CalcConstants.PANEL_LAYOUT_MANAGER); 
		panel.setBackground(CalcConstants.PANEL_BACKGROUND);
		
	}
	
	private void createButtons() {

		addButton = new JButton(CalcConstants.STRING_ADD_BUTTON);
		addButton.setBackground(CalcConstants.BUTTON_FUNCTION_BACKGROUND);
		subButton = new JButton(CalcConstants.STRING_SUB_BUTTON);
		subButton.setBackground(CalcConstants.BUTTON_FUNCTION_BACKGROUND);
		mulButton = new JButton(CalcConstants.STRING_MUL_BUTTON);
		mulButton.setBackground(CalcConstants.BUTTON_FUNCTION_BACKGROUND);
		divButton = new JButton(CalcConstants.STRING_DIV_BUTTON);
		divButton.setBackground(CalcConstants.BUTTON_FUNCTION_BACKGROUND);
		decButton = new JButton(CalcConstants.STRING_DEC_BUTTON);
		equButton = new JButton(CalcConstants.STRING_EQU_BUTTON);
		equButton.setBackground(CalcConstants.BUTTON_FUNCTION_BACKGROUND);
		delButton = new JButton(CalcConstants.STRING_DEL_BUTTON);
		delButton.setBackground(CalcConstants.BUTTON_BACKGROUND);
		delButton.setForeground(CalcConstants.BUTTON_FOREGROUND);
		clrButton = new JButton(CalcConstants.STRING_CLR_BUTTON);
		clrButton.setBackground(CalcConstants.BUTTON_BACKGROUND);
		clrButton.setForeground(CalcConstants.BUTTON_FOREGROUND);
		negButton = new JButton(CalcConstants.STRING_NEG_BUTTON);
		sqrButton = new  JButton(CalcConstants.STRING_SQR_BUTTON);
		sqrRootButton = new JButton(CalcConstants.STRING_SQRROOT_BUTTON);
		reciButton = new JButton(CalcConstants.STRING_RECI_BUTTON);
		percentButton = new JButton(CalcConstants.STRING_PERCENT_BUTTON);
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = percentButton;
		functionButtons[9] = sqrButton;
		functionButtons[10] = sqrRootButton;
		functionButtons[11] = reciButton;
		
		negButton.setBounds(CalcConstants.BUTTON_NEG_XPOSITION,CalcConstants.BUTTON_NEG_YPOSITION,
							CalcConstants.BUTTON_NEG_WIDTH,CalcConstants.BUTTON_NEG_HEIGHT);
		delButton.setBounds(CalcConstants.BUTTON_DEL_XPOSITION,CalcConstants.BUTTON_DEL_YPOSITION,
							CalcConstants.BUTTON_DEL_WIDTH,CalcConstants.BUTTON_DEL_HEIGHT);		
		clrButton.setBounds(CalcConstants.BUTTON_CLR_XPOSITION,CalcConstants.BUTTON_CLR_YPOSITION,
							CalcConstants.BUTTON_CLR_WIDTH,CalcConstants.BUTTON_CLR_HEIGHT);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JButton[] getNumberButtons() {
		return numberButtons;
	}

	public void setNumberButtons(JButton[] numberButtons) {
		this.numberButtons = numberButtons;
	}

	public JButton[] getFunctionButtons() {
		return functionButtons;
	}

	public void setFunctionButtons(JButton[] functionButtons) {
		this.functionButtons = functionButtons;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public JButton getSubButton() {
		return subButton;
	}

	public void setSubButton(JButton subButton) {
		this.subButton = subButton;
	}

	public JButton getMulButton() {
		return mulButton;
	}

	public void setMulButton(JButton mulButton) {
		this.mulButton = mulButton;
	}

	public JButton getDivButton() {
		return divButton;
	}

	public void setDivButton(JButton divButton) {
		this.divButton = divButton;
	}

	public JButton getSqrButton() {
		return sqrButton;
	}

	public void setSqrButton(JButton sqrButton) {
		this.sqrButton = sqrButton;
	}

	public JButton getSqrRootButton() {
		return sqrRootButton;
	}

	public void setSqrRootButton(JButton sqrRootButton) {
		this.sqrRootButton = sqrRootButton;
	}

	public JButton getDecButton() {
		return decButton;
	}

	public void setDecButton(JButton decButton) {
		this.decButton = decButton;
	}

	public JButton getEquButton() {
		return equButton;
	}

	public void setEquButton(JButton equButton) {
		this.equButton = equButton;
	}

	public JButton getDelButton() {
		return delButton;
	}

	public void setDelButton(JButton delButton) {
		this.delButton = delButton;
	}

	public JButton getClrButton() {
		return clrButton;
	}

	public void setClrButton(JButton clrButton) {
		this.clrButton = clrButton;
	}

	public JButton getNegButton() {
		return negButton;
	}

	public void setNegButton(JButton negButton) {
		this.negButton = negButton;
	}

	public JButton getReciButton() {
		return reciButton;
	}

	public void setReciButton(JButton reciButton) {
		this.reciButton = reciButton;
	}

	public JButton getPercentButton() {
		return percentButton;
	}

	public void setPercentButton(JButton percentButton) {
		this.percentButton = percentButton;
	}
	
	

}
