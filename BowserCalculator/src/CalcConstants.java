import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class CalcConstants {
	
	// Application general info
	public static final String APP_TITLE = "Bowser Calculator";
	public static final String APP_ICON_PATH = "img/calcIcon.png";
	public static final String APP_FOTO_PATH = "img/tousMini.jpg";
	
	// Dimensions for components within app
	public static final int FRAME_WIDTH = 420;
	public static final int FRAME_HEIGHT = 550;
	
	public static final int LABEL_XPOSITION = 0;
	public static final int LABEL_YPOSITION = 0;
	public static final int LABEL_WIDTH = 380;
	public static final int LABEL_HEIGHT = 50;
	
	public static final int TEXTFIELD_XPOSITION = 10;
	public static final int TEXTFIELD_YPOSITION = 40;
	public static final int TEXTFIELD_WIDTH = 380;
	public static final int TEXTFIELD_HEIGHT = 40;
	
	public static final int PANEL_XPOSITION = 10;
	public static final int PANEL_YPOSITION = 90;
	public static final int PANEL_WIDTH = 385;
	public static final int PANEL_HEIGHT = 350;
	
	public static final int BUTTON_NEG_XPOSITION = 20;
	public static final int BUTTON_NEG_YPOSITION = 450;
	public static final int BUTTON_NEG_WIDTH = 75;
	public static final int BUTTON_NEG_HEIGHT = 50;
	
	public static final int BUTTON_DEL_XPOSITION = 98;
	public static final int BUTTON_DEL_YPOSITION = 450;
	public static final int BUTTON_DEL_WIDTH = 150;
	public static final int BUTTON_DEL_HEIGHT = 50;
	
	public static final int BUTTON_CLR_XPOSITION = 250;
	public static final int BUTTON_CLR_YPOSITION = 450;
	public static final int BUTTON_CLR_WIDTH = 140;
	public static final int BUTTON_CLR_HEIGHT = 50;
	
	// Personalization of app details
	public static final Font FONT_OCR = new Font("OCR A Extended", Font.BOLD,30);
	public static final Font FONT_WESTMINSTER = new Font("Westminster", Font.BOLD,20);
	
	public static final int FRAME_CLOSE_METHOD = JFrame.EXIT_ON_CLOSE;
	public static final Color FRAME_BACKGROUND = Color.BLACK;
	public static final boolean FRAME_RESIZABLE = false;
	public static final Component FRAME_SPAWN_OPEN = null;
	public static final LayoutManager FRAME_LAYOUT_MANAGER = null;
	
	public static final Color LABEL_BACKGROUND = Color.BLACK;
	public static final Color LABEL_FOREGROUND = Color.WHITE;
	public static final int LABEL_TEXT_HORIZONTAL_ALIGNMENT = SwingConstants.RIGHT;
	
	public static final boolean TEXTFIELD_EDITABLE = false;
	public static final int TEXTFIELD_TEXT_HORIZONTAL_ALIGNMENT = SwingConstants.RIGHT;
	
	public static final LayoutManager PANEL_LAYOUT_MANAGER = new GridLayout(5,4,2,2);
	public static final Color PANEL_BACKGROUND = Color.BLACK;
	
	public static final String STRING_ADD_BUTTON = "+";
	public static final String STRING_SUB_BUTTON = "-";
	public static final String STRING_MUL_BUTTON = "*";
	public static final String STRING_DIV_BUTTON = "/";
	public static final String STRING_DEC_BUTTON = ".";
	public static final String STRING_EQU_BUTTON = "=";
	public static final String STRING_DEL_BUTTON = "Delete";
	public static final String STRING_CLR_BUTTON = "Clear";
	public static final String STRING_NEG_BUTTON = "(-)";
	public static final String STRING_SQR_BUTTON = "x\u00B2";
	public static final String STRING_SQRROOT_BUTTON = "\u221A";
	public static final String STRING_RECI_BUTTON = "1/x";
	public static final String STRING_PERCENT_BUTTON = "%";
	
	public static final Color BUTTON_BACKGROUND = Color.RED;
	public static final Color BUTTON_FOREGROUND = Color.WHITE;
	public static final Color BUTTON_FUNCTION_BACKGROUND = new Color(239,188,2);
	
	
	public CalcConstants() {	}

}
