package guiInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import stockData.DataVariables;

public class CurrentStockDisplay3 extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static JPanel display = new JPanel();
	public static int test = 1;
	public static JPanel[] tempPanelName = new JPanel[100];
	public static JLabel[] tempLabelName = new JLabel[100];
	public static Boolean[] exists = new Boolean[100];

	
	public static void displaySetup3() {
		display.setBackground(Color.black);
		display.setLayout(new GridLayout(0,1, 0,0));
		for(int i = 0; i < exists.length; i++) {
			exists[i] = false;
		}
	}
	
	public static void removeStockDisplay3() {
		for(int i = 0; i < DataVariables.tickerListC.size(); i++) {
			if(exists[i] == true) {
				display.remove(tempPanelName[i]);
				exists[i] = false;
			}
		}
	}
	
	public static void currentStockDisplay3(){
		
		
		
		for(int i = 0; i < DataVariables.tickerListC.size(); i++) {
			if(exists[i] == true) {
				display.remove(tempPanelName[i]);
				exists[i] = false;
			}
			tempPanelName[i] = new JPanel();
			tempPanelName[i].setBackground(Color.black);
			tempPanelName[i].setBorder(BorderFactory.createLineBorder(Color.white, 1));
			tempPanelName[i].setLayout(new BorderLayout());
			tempLabelName[i] = new JLabel((i + 1) + ". " + DataVariables.tickerListC.get(i));
			tempLabelName[i].setForeground(Color.white);
			tempLabelName[i].setHorizontalAlignment(JLabel.CENTER);
			tempLabelName[i].setVerticalAlignment(JLabel.CENTER);
			tempPanelName[i].add(tempLabelName[i], BorderLayout.CENTER );
			display.add(tempPanelName[i]);
			exists[i] = true;

		}
		
	}

}
