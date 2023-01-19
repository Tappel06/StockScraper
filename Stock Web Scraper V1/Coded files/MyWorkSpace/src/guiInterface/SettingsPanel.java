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

public class SettingsPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public static JButton mainMenuButton;
	public static JButton websitesConstructorsButton;
	public static JButton priceButton;
	public static JButton PEButton;
	public static JButton EPSButton;
	public static JButton BetaButton;
	
	public static WebsiteSettingsPanel websiteSettingsPanel;
	public static PricePanel pricePanel;
	public static PEPanel pePanel;
	public static EPSPanel epsPanel;
	public static BetaPanel betaPanel;
	public static JPanel center;

	public SettingsPanel() {
		websiteSettingsPanel = new WebsiteSettingsPanel();
		pricePanel = new PricePanel();
		pePanel = new PEPanel();
		epsPanel = new EPSPanel();
		betaPanel = new BetaPanel();
		
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
		titleLabel.setText("Settings");
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
		websitesConstructorsButton = new JButton("Websites");
		websitesConstructorsButton.addActionListener(this);
		websitesConstructorsButton.setEnabled(false);
		navigation.add(websitesConstructorsButton);
		priceButton = new JButton("Price");
		priceButton.addActionListener(this);
		priceButton.setEnabled(true);
		navigation.add(priceButton);
		PEButton = new JButton("P/E");
		PEButton.addActionListener(this);
		PEButton.setEnabled(true);
		navigation.add(PEButton);
		EPSButton = new JButton("EPS");
		EPSButton.addActionListener(this);
		EPSButton.setEnabled(true);
		navigation.add(EPSButton);
		BetaButton = new JButton("BETA");
		BetaButton.addActionListener(this);
		BetaButton.setEnabled(true);
		navigation.add(BetaButton);
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
		center.add(websiteSettingsPanel);
		settingsDisplayArea.add(center);
		this.add(settingsDisplayArea,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mainMenuButton) {
			mainFrame.window.remove(mainFrame.settingsPanel);
			mainFrame.window.add(mainFrame.mainMenuPanel);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
	}
		
		if(e.getSource() == websitesConstructorsButton) {
			center.add(websiteSettingsPanel);
			center.remove(pricePanel);
			center.remove(pePanel);
			center.remove(epsPanel);
			center.remove(betaPanel);
			websitesConstructorsButton.setEnabled(false);
			priceButton.setEnabled(true);
			PEButton.setEnabled(true);
			EPSButton.setEnabled(true);
			BetaButton.setEnabled(true);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==priceButton) {
			center.remove(websiteSettingsPanel);
			center.add(pricePanel);
			center.remove(pePanel);
			center.remove(epsPanel);
			center.remove(betaPanel);
			websitesConstructorsButton.setEnabled(true);
			priceButton.setEnabled(false);
			PEButton.setEnabled(true);
			EPSButton.setEnabled(true);
			BetaButton.setEnabled(true);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==PEButton) {
			center.remove(websiteSettingsPanel);
			center.remove(pricePanel);
			center.add(pePanel);
			center.remove(epsPanel);
			center.remove(betaPanel);
			websitesConstructorsButton.setEnabled(true);
			priceButton.setEnabled(true);
			PEButton.setEnabled(false);
			EPSButton.setEnabled(true);
			BetaButton.setEnabled(true);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==EPSButton) {
			center.remove(websiteSettingsPanel);
			center.remove(pricePanel);
			center.remove(pePanel);
			center.add(epsPanel);
			center.remove(betaPanel);
			websitesConstructorsButton.setEnabled(true);
			priceButton.setEnabled(true);
			PEButton.setEnabled(true);
			EPSButton.setEnabled(false);
			BetaButton.setEnabled(true);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==BetaButton) {
			center.remove(websiteSettingsPanel);
			center.remove(pricePanel);
			center.remove(pePanel);
			center.remove(epsPanel);
			center.add(betaPanel);
			websitesConstructorsButton.setEnabled(true);
			priceButton.setEnabled(true);
			PEButton.setEnabled(true);
			EPSButton.setEnabled(true);
			BetaButton.setEnabled(false);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
	}
}
