package guiInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import stockData.FileCreateEngine;


public class MainMenuPanel extends JPanel implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	
	
	public JButton settings;
	public JButton stocks;
	public JButton search;
	public JButton stockAnalysis;
	public JButton exit;
	public JButton majorReset;
	public JPanel northPanel;
	public JPanel southPanel;
	public JPanel eastPanel;
	public JPanel westPanel;
	public JPanel centerPanel;
	public JLabel title;
	

	public MainMenuPanel(){
		
		this.setLayout(new BorderLayout());
		
		northPanel = new JPanel();
		northPanel.setLayout(new BorderLayout());
		title = new JLabel("Tappel's Stock Valuator");
		title.setForeground(Color.GREEN);
		title.setVerticalAlignment(JLabel.CENTER);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setFont(new Font("Arial Black", Font.BOLD, 30));
		northPanel.add(title);
		northPanel.setBackground(Color.black);
		northPanel.setPreferredSize(new Dimension(150,150));
		this.add(northPanel, BorderLayout.NORTH);
		
		southPanel = new JPanel();
		southPanel.setBackground(Color.black);
		southPanel.setPreferredSize(new Dimension(150,150));
		this.add(southPanel, BorderLayout.SOUTH);
		
		eastPanel = new JPanel();
		eastPanel.setBackground(Color.black);
		eastPanel.setPreferredSize(new Dimension(150,150));
		this.add(eastPanel, BorderLayout.EAST);
		
		westPanel = new JPanel();
		westPanel.setBackground(Color.black);
		westPanel.setPreferredSize(new Dimension(150,150));
		this.add(westPanel, BorderLayout.WEST);
		
		centerPanel = new JPanel();
		centerPanel.setBackground(Color.black);
		centerPanel.setMaximumSize(new Dimension(40,40));
		centerPanel.setLayout(new GridLayout(0,1,15,15));
		
		//Buttons
		stockAnalysis = new JButton("Stock Analysis");
		stockAnalysis.addActionListener(this);
		stockAnalysis.setFont(new Font("Arial Black", Font.BOLD, 20));
		centerPanel.add(stockAnalysis);
		stocks = new JButton("Stocks");
		stocks.addActionListener(this);
		stocks.setFont(new Font("Arial Black", Font.BOLD, 20));
		centerPanel.add(stocks);
		search = new JButton("Search");
		search.addActionListener(this);
		search.setFont(new Font("Arial Black", Font.BOLD, 20));
		centerPanel.add(search);
		settings = new JButton("Settings");
		settings.addActionListener(this);
		settings.setFont(new Font("Arial Black", Font.BOLD, 20));
		centerPanel.add(settings);
		exit = new JButton("Exit");
		exit.setFont(new Font("Arial Black", Font.BOLD, 20));
		exit.addActionListener(this);
		centerPanel.add(exit);
		majorReset = new JButton("Major Reset");
		majorReset.addActionListener(this);
		majorReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		centerPanel.add(majorReset);
		
		
		this.add(centerPanel, BorderLayout.CENTER);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==majorReset) {
			FileCreateEngine.FileCreate();
		}
		
		if(e.getSource()==stockAnalysis) {
			mainFrame.window.remove(mainFrame.mainMenuPanel);
			mainFrame.window.add(mainFrame.stockAnalysisPanel);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==stocks) {
			mainFrame.window.remove(mainFrame.mainMenuPanel);
			mainFrame.window.add(mainFrame.stocksPanel);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==search) {
			mainFrame.window.remove(mainFrame.mainMenuPanel);
			mainFrame.window.add(mainFrame.searchPanel);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==settings) {
			mainFrame.window.remove(mainFrame.mainMenuPanel);
			mainFrame.window.add(mainFrame.settingsPanel);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==exit) {
			System.exit(0);
		}
	}
}
