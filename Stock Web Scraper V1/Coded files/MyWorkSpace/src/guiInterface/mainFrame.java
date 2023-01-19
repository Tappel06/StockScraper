package guiInterface;

import java.awt.BorderLayout;


import javax.swing.JFrame;

public class mainFrame{


	
	public static MainMenuPanel mainMenuPanel;
	public static StockAnalysisPanel stockAnalysisPanel;
	public static StocksPanel stocksPanel;
	public static SettingsPanel settingsPanel;
	public static SearchPanel searchPanel;
	public static JFrame window;

	public static void MainFrame(){
		stockAnalysisPanel = new StockAnalysisPanel();
		mainMenuPanel = new MainMenuPanel();
		stocksPanel = new StocksPanel();
		settingsPanel = new SettingsPanel();
		searchPanel = new SearchPanel();
		
		window = new JFrame();
		window.setTitle("Tappel's Stock Valuator");
		window.setSize(600, 600);
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		window.setLocationRelativeTo(null);
		window.setLayout(new BorderLayout());
		window.add(mainMenuPanel);
		
		
		

		
		window.setVisible(true);
		
		
	}



	
}
