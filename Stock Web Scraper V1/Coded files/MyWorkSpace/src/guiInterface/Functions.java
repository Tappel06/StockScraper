package guiInterface;

import java.awt.Color;

import stockData.DataVariables;
import stockData.FileLoad;

public interface Functions {

	public static void addStock() {
		String tickerName = StocksPanel.addField.getText();
		DataVariables.tickerListA.add(tickerName);
	}
	
	public static void addStock2() {
		String tickerName = StocksPanel.addField.getText();
		DataVariables.tickerListB.add(tickerName);
	}
	
	public static void addStock3() {
		String tickerName = StocksPanel.addField.getText();
		DataVariables.tickerListC.add(tickerName);
	}
	
	public static void priceWebsiteConstruct() {
		
	}
	
	public static void systemRun() {
		while(DataVariables.SystemRun == true) {
			
			if(DataVariables.SystemLoad == true) {
				DataVariables.SystemLoad = false;
				FileLoad.tickerLoad3();
				FileLoad.tickerLoad2();
				FileLoad.tickerLoad();
				FileLoad.websiteLoads();
				FileLoad.settingsListLoads();
				mainFrame.MainFrame();
			}
			if(DataVariables.SystemSearchSwitch == true) {
				System.out.println("Working");
				DataVariables.SystemSearchSwitch = false;
				StockAnalysisPanel.startStop.setBackground(Color.red);
				
			}
			
			
			
		}
	}
	
		
	
	
}
