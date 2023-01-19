package guiInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class StockAnalysisPanel extends JPanel implements ActionListener, Functions{

	private static final long serialVersionUID = 2L;
	
	public static JButton mainMenuButton;
	public static JButton startStop;
	public static JProgressBar progressBar;
	public static boolean startStopState = false;
	
	public static JPanel center;
	public static StockDetailsPanel stockDetailsPanel;

	public StockAnalysisPanel() {
		stockDetailsPanel = new StockDetailsPanel();
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		
		JPanel navigator = new JPanel();
		navigator.setPreferredSize(new Dimension(80,80));
		navigator.setLayout(new GridLayout(0,1));
		navigator.setBackground(Color.green);
		
		JPanel title = new JPanel();
		title.setLayout(new BorderLayout());
		title.setBackground(Color.BLACK);
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Stock Analysis");
		titleLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		titleLabel.setForeground(Color.GREEN);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		title.add(titleLabel, BorderLayout.CENTER);
		navigator.add(title, BorderLayout.CENTER);
		
		JPanel navigation = new JPanel();
		navigation.setLayout(new GridLayout(1,0, 5, 5));
		navigation.setBackground(Color.black);
		mainMenuButton = new JButton("Main Menu");
		mainMenuButton.addActionListener(this);
		navigation.add(mainMenuButton);
		startStop = new JButton("Stopped");
		startStop.addActionListener(this);
		startStop.setBackground(Color.red);
		startStop.setForeground(Color.black);
		navigation.add(startStop);
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setValue(0);
		navigation.add(progressBar);
		navigator.add(navigation, BorderLayout.SOUTH);
		
		this.add(navigator, BorderLayout.NORTH);
		
		JPanel settingsDisplayArea = new JPanel();
		settingsDisplayArea.setLayout(new BorderLayout());
		JPanel north = new JPanel();
		north.setPreferredSize(new Dimension(20,20));
		north.setBackground(Color.black);
		settingsDisplayArea.add(north, BorderLayout.NORTH);
		JPanel south = new JPanel();
		south.setPreferredSize(new Dimension(20,20));
		south.setBackground(Color.black);
		settingsDisplayArea.add(south, BorderLayout.SOUTH);
		JPanel east = new JPanel();
		east.setPreferredSize(new Dimension(20,20));
		east.setBackground(Color.black);
		settingsDisplayArea.add(east, BorderLayout.EAST);
		JPanel west = new JPanel();
		west.setPreferredSize(new Dimension(20,20));
		west.setBackground(Color.black);
		settingsDisplayArea.add(west, BorderLayout.WEST);
		center = new JPanel();
		center.setLayout(new BorderLayout());
		center.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		center.setBackground(Color.black);
		settingsDisplayArea.add(center);
		this.add(settingsDisplayArea,BorderLayout.CENTER);
		center.add(StockDetailsPanel.display);
		
		StockDetailsPanel.displaySetup();
		/*StockDetailsPanel.stockDetailsPanel();*/
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mainMenuButton) {
			mainFrame.window.remove(mainFrame.stockAnalysisPanel);
			mainFrame.window.add(mainFrame.mainMenuPanel);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
	}
		
		if(startStopState == true) {
			startStopState = false;
			startStop.setText("Stopped");
			startStop.setBackground(Color.red);
		}
		else {
			startStopState = true;
			startStop.setText("Running");
			startStop.setBackground(Color.green);
			StockDetailsPanel.stockDetailsPanel();
		}
		
	}
	
}
