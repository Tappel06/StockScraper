package guiInterface;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import stockData.DataVariables;

public class StockDetailsPanel extends JPanel implements ScrapeFunctions {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static JPanel display = new JPanel();
	public static int test = 1;
	public static JPanel[] tempPanelName = new JPanel[100];
	public static JPanel[] tempTickPanel = new JPanel[100];
	public static JLabel[] tempLabelName = new JLabel[100];
	public static JPanel[] tempPricePanel = new JPanel[100];
	public static JLabel[] tempPriceLabel = new JLabel[100];
	public static JPanel[] tempPEPanel = new JPanel[100];
	public static JLabel[] tempPELabel = new JLabel[100];
	public static JPanel[] tempEPSPanel = new JPanel[100];
	public static JLabel[] tempEPSLabel = new JLabel[100];
	public static JPanel[] tempBetaPanel = new JPanel[100];
	public static JLabel[] tempBetaLabel = new JLabel[100];
	public static JPanel[] tempRatePanel = new JPanel[100];
	public static JLabel[] tempRateLabel = new JLabel[100];
	public static Boolean[] exists = new Boolean[100];
	public static Boolean exists2 = false;
	public static JPanel categoriesPanel;
	public static Thread1 thread1 = new Thread1();
	
	public static void displaySetup() {
		display.setBackground(Color.black);
		display.setLayout(new GridLayout(0,1, 0,0));
		categoriesPanel = new JPanel();
		categoriesPanel.setLayout(new GridLayout(1,0));
		categoriesPanel.setBackground(Color.black);
		JLabel tickerNameLabel = new JLabel("Ticker");
		tickerNameLabel.setHorizontalAlignment(JLabel.CENTER);
		tickerNameLabel.setVerticalAlignment(JLabel.CENTER);
		tickerNameLabel.setForeground(Color.white);
		categoriesPanel.add(tickerNameLabel);
		JLabel priceLabel = new JLabel("Price");
		priceLabel.setHorizontalAlignment(JLabel.CENTER);
		priceLabel.setVerticalAlignment(JLabel.CENTER);
		priceLabel.setForeground(Color.white);
		categoriesPanel.add(priceLabel);
		JLabel PELabel = new JLabel("P/E");
		PELabel.setHorizontalAlignment(JLabel.CENTER);
		PELabel.setVerticalAlignment(JLabel.CENTER);
		PELabel.setForeground(Color.white);
		categoriesPanel.add(PELabel);
		JLabel EPSLabel = new JLabel("EPS");
		EPSLabel.setHorizontalAlignment(JLabel.CENTER);
		EPSLabel.setVerticalAlignment(JLabel.CENTER);
		EPSLabel.setForeground(Color.white);
		categoriesPanel.add(EPSLabel);
		JLabel BetaLabel = new JLabel("Beta");
		BetaLabel.setHorizontalAlignment(JLabel.CENTER);
		BetaLabel.setVerticalAlignment(JLabel.CENTER);
		BetaLabel.setForeground(Color.white);
		categoriesPanel.add(BetaLabel);
		JLabel RateLabel = new JLabel("Rating");
		RateLabel.setHorizontalAlignment(JLabel.CENTER);
		RateLabel.setVerticalAlignment(JLabel.CENTER);
		RateLabel.setForeground(Color.white);
		categoriesPanel.add(RateLabel);
		display.add(categoriesPanel);
		for(int i = 0; i < exists.length; i++) {
			exists[i] = false;
		}
	}
	
	public static void removeStockDisplay() {
		display.remove(categoriesPanel);
		for(int i = 0; i < DataVariables.tickerListA.size(); i++) {
			if(exists[i] == true) {
				display.remove(tempPanelName[i]);
				exists[i] = false;
			}
		}
	}
	
	public static void stockDetailsPanel(){
		
		for(int i = 0; i < DataVariables.tickerListA.size(); i++) {
			if(exists[i] == true) {
				display.remove(tempPanelName[i]);
				exists[i] = false;
			}
			
			///if list Options
			//Price
			if(DataVariables.tickerPriceList == 'A') {
				DataVariables.currentPriceTicker = DataVariables.tickerListA.get(i);
			} else if (DataVariables.tickerPriceList == 'B') {
				DataVariables.currentPriceTicker = DataVariables.tickerListB.get(i);
			} else if (DataVariables.tickerPriceList == 'C') {
				DataVariables.currentPriceTicker = DataVariables.tickerListC.get(i);
			}
			
			ScrapeFunctions.PriceScrape();
			
			//PE
			if(DataVariables.tickerPEList == 'A') {
				DataVariables.currentPETicker = DataVariables.tickerListA.get(i);
			} else if (DataVariables.tickerPEList == 'B') {
				DataVariables.currentPETicker = DataVariables.tickerListB.get(i);
			} else if (DataVariables.tickerPEList == 'C') {
				DataVariables.currentPETicker = DataVariables.tickerListC.get(i);
			}
			
			ScrapeFunctions.PEScrape();
			
			//EPS
			if(DataVariables.tickerEPSList == 'A') {
				DataVariables.currentEPSTicker = DataVariables.tickerListA.get(i);
			} else if (DataVariables.tickerEPSList == 'B') {
				DataVariables.currentEPSTicker = DataVariables.tickerListB.get(i);
			} else if (DataVariables.tickerEPSList == 'C') {
				DataVariables.currentEPSTicker = DataVariables.tickerListC.get(i);
			}
			
			ScrapeFunctions.EPSScrape();
			
			//BETA
			if(DataVariables.tickerBETAList == 'A') {
				DataVariables.currentBETATicker = DataVariables.tickerListA.get(i);
			} else if (DataVariables.tickerBETAList == 'B') {
				DataVariables.currentBETATicker = DataVariables.tickerListB.get(i);
			} else if (DataVariables.tickerBETAList == 'C') {
				DataVariables.currentBETATicker = DataVariables.tickerListC.get(i);
			}
			
			ScrapeFunctions.BETAScrape();
			
			
			////setup
			tempPanelName[i] = new JPanel();
			tempPanelName[i].setLayout(new GridLayout(1,0));
			tempPanelName[i].setBackground(Color.black);
			tempPanelName[i].setBorder(BorderFactory.createLineBorder(Color.white, 1));
			//Ticker Name
			tempTickPanel[i] = new JPanel();
			tempTickPanel[i].setLayout(new GridLayout(1,0));
			tempTickPanel[i].setBackground(Color.black);
			tempLabelName[i] = new JLabel((i+1) + ". " + DataVariables.tickerListA.get(i));
			tempLabelName[i].setForeground(Color.white);
			tempLabelName[i].setHorizontalAlignment(JLabel.CENTER);
			tempLabelName[i].setVerticalAlignment(JLabel.CENTER);
			tempTickPanel[i].add(tempLabelName[i]);
			tempPanelName[i].add(tempTickPanel[i]);
			//Price
			tempPricePanel[i] = new JPanel();
			tempPricePanel[i].setLayout(new GridLayout(1,0));
			tempPricePanel[i].setBackground(Color.black);
			tempPriceLabel[i] = new JLabel(DataVariables.priceResult);
			tempPriceLabel[i].setForeground(Color.white);
			tempPriceLabel[i].setHorizontalAlignment(JLabel.CENTER);
			tempPriceLabel[i].setVerticalAlignment(JLabel.CENTER);
			tempPricePanel[i].add(tempPriceLabel[i]);
			tempPanelName[i].add(tempPricePanel[i]);
			//P/E
			tempPEPanel[i] = new JPanel();
			tempPEPanel[i].setLayout(new GridLayout(1,0));
			tempPEPanel[i].setBackground(Color.black);
			tempPELabel[i] = new JLabel(DataVariables.PEResult);
			tempPELabel[i].setForeground(Color.white);
			tempPELabel[i].setBackground(Color.red);
			tempPELabel[i].setHorizontalAlignment(JLabel.CENTER);
			tempPELabel[i].setVerticalAlignment(JLabel.CENTER);
			tempPEPanel[i].add(tempPELabel[i]);
			tempPanelName[i].add(tempPEPanel[i]);
			//EPS
			tempEPSPanel[i] = new JPanel();
			tempEPSPanel[i].setLayout(new GridLayout(1,0));
			tempEPSPanel[i].setBackground(Color.black);
			tempEPSLabel[i] = new JLabel(DataVariables.EPSResult);
			tempEPSLabel[i].setForeground(Color.white);
			tempEPSLabel[i].setHorizontalAlignment(JLabel.CENTER);
			tempEPSLabel[i].setVerticalAlignment(JLabel.CENTER);
			tempEPSPanel[i].add(tempEPSLabel[i]);
			tempPanelName[i].add(tempEPSPanel[i]);
			//Beta
			tempBetaPanel[i] = new JPanel();
			tempBetaPanel[i].setLayout(new GridLayout(1,0));
			tempBetaPanel[i].setBackground(Color.black);
			tempBetaLabel[i] = new JLabel(DataVariables.BETAResult);
			tempBetaLabel[i].setForeground(Color.white);
			tempBetaLabel[i].setHorizontalAlignment(JLabel.CENTER);
			tempBetaLabel[i].setVerticalAlignment(JLabel.CENTER);
			tempBetaPanel[i].add(tempBetaLabel[i]);
			tempPanelName[i].add(tempBetaPanel[i]);
			
			//Rating
			tempRatePanel[i] = new JPanel();
			tempRatePanel[i].setLayout(new GridLayout(1,0));
			tempRatePanel[i].setBackground(Color.black);
			tempRateLabel[i] = new JLabel();
			tempRateLabel[i].setForeground(Color.white);
			tempRateLabel[i].setHorizontalAlignment(JLabel.CENTER);
			tempRateLabel[i].setVerticalAlignment(JLabel.CENTER);
			tempRatePanel[i].add(tempRateLabel[i]);
			tempPanelName[i].add(tempRatePanel[i]);
			
			//PEColour
			try {
				if(Double.parseDouble(DataVariables.PEResult) <= Double.parseDouble(DataVariables.PEMinimum)) {
					tempPEPanel[i].setBackground(Color.green);
					tempPELabel[i].setForeground(Color.black);
				} else if ((Double.parseDouble(DataVariables.PEResult) > Double.parseDouble(DataVariables.PEMinimum)) && (Double.parseDouble(DataVariables.PEResult) < Double.parseDouble(DataVariables.PEMaximum))){
					tempPEPanel[i].setBackground(Color.yellow);
					tempPELabel[i].setForeground(Color.black);
				} else if (Double.parseDouble(DataVariables.PEResult) > Double.parseDouble(DataVariables.PEMaximum)) {
					tempPEPanel[i].setBackground(Color.red);
					tempPELabel[i].setForeground(Color.black);
				} else {
					tempPEPanel[i].setBackground(Color.black);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				tempPEPanel[i].setBackground(Color.blue);
				e.printStackTrace();
			}
			
			//EPSColour
			try {
				if(Double.parseDouble(DataVariables.EPSResult) < Double.parseDouble(DataVariables.EPSMinimum)) {
					tempEPSPanel[i].setBackground(Color.red);
					tempEPSLabel[i].setForeground(Color.black);
				} else if ((Double.parseDouble(DataVariables.EPSResult) >= Double.parseDouble(DataVariables.EPSMinimum)) && (Double.parseDouble(DataVariables.EPSResult) <= Double.parseDouble(DataVariables.EPSMaximum))){
					tempEPSPanel[i].setBackground(Color.yellow);
					tempEPSLabel[i].setForeground(Color.black);
				} else if (Double.parseDouble(DataVariables.EPSResult) > Double.parseDouble(DataVariables.EPSMaximum)) {
					tempEPSPanel[i].setBackground(Color.green);
					tempEPSLabel[i].setForeground(Color.black);
				} else {
					tempEPSPanel[i].setBackground(Color.black);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				tempEPSPanel[i].setBackground(Color.blue);
				e.printStackTrace();
			}
			
			//BETAColour
			try {
				if(Double.parseDouble(DataVariables.BETAResult) < Double.parseDouble(DataVariables.BETAMinimum)) {
					tempBetaPanel[i].setBackground(Color.green);
					tempBetaLabel[i].setForeground(Color.black);
				} else if ((Double.parseDouble(DataVariables.BETAResult) > Double.parseDouble(DataVariables.BETAMinimum)) && (Double.parseDouble(DataVariables.BETAResult) < Double.parseDouble(DataVariables.BETAMaximum))){
					tempBetaPanel[i].setBackground(Color.yellow);
					tempBetaLabel[i].setForeground(Color.black);
				} else if (Double.parseDouble(DataVariables.BETAResult) > Double.parseDouble(DataVariables.BETAMaximum)) {
					tempBetaPanel[i].setBackground(Color.red);
					tempBetaLabel[i].setForeground(Color.black);
				} else {
					tempBetaPanel[i].setBackground(Color.black);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				tempBetaPanel[i].setBackground(Color.blue);
				e.printStackTrace();
			}
			
			//Rate
			try {
				if((Double.parseDouble(DataVariables.PEResult) <= Double.parseDouble(DataVariables.PEMaximum)) 
						&& Double.parseDouble(DataVariables.EPSResult) >= Double.parseDouble(DataVariables.EPSMinimum)
						&& Double.parseDouble(DataVariables.BETAResult) <= Double.parseDouble(DataVariables.BETAMaximum)) {
					tempRatePanel[i].setBackground(Color.GREEN);
					tempRateLabel[i].setText("BUY");
					tempRateLabel[i].setForeground(Color.black);
					tempTickPanel[i].setBackground(Color.green);
					tempLabelName[i].setForeground(Color.black);
				} else
				if((Double.parseDouble(DataVariables.PEResult) <= Double.parseDouble(DataVariables.PEMaximum)) 
						&& Double.parseDouble(DataVariables.EPSResult) >= Double.parseDouble(DataVariables.EPSMinimum)
						&& Double.parseDouble(DataVariables.BETAResult) > Double.parseDouble(DataVariables.BETAMaximum)) {
					tempRatePanel[i].setBackground(Color.yellow);
					tempRateLabel[i].setText("HOLD");
					tempRateLabel[i].setForeground(Color.black);
					tempTickPanel[i].setBackground(Color.yellow);
					tempLabelName[i].setForeground(Color.black);
				} else
				if((Double.parseDouble(DataVariables.PEResult) > Double.parseDouble(DataVariables.PEMaximum)) 
						|| Double.parseDouble(DataVariables.EPSResult) < Double.parseDouble(DataVariables.EPSMinimum)) {
					tempRatePanel[i].setBackground(Color.RED);
					tempRateLabel[i].setText("SELL");
					tempRateLabel[i].setForeground(Color.black);
					tempTickPanel[i].setBackground(Color.RED);
					tempLabelName[i].setForeground(Color.black);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				tempRatePanel[i].setBackground(Color.blue);
				tempRateLabel[i].setText("NOT ENOUGH DATA!");
				tempRateLabel[i].setForeground(Color.black);
				tempLabelName[i].setForeground(Color.black);
				tempTickPanel[i].setBackground(Color.blue);
				e.printStackTrace();
			}
			
			
			display.add(tempPanelName[i]);
			exists[i] = true;
			
			
		}
		
	}

}
