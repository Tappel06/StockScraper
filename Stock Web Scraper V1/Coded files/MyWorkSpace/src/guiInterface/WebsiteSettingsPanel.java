package guiInterface;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import stockData.DataVariables;
import stockData.FileStorage;

public class WebsiteSettingsPanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	public static JButton addWeb1;
	public static JButton addWeb2;
	public static JButton addWeb3;
	public static JButton addWeb4;
	public static JButton addWeb5;
	public static JButton addWeb6;
	public static JButton addWeb7;
	public static JButton addWeb8;
	public static JButton addWeb9;
	public static JButton addWeb10;
	
	public static JTextField W1TextField;
	public static JTextField W2TextField;
	public static JTextField W3TextField;
	public static JTextField W4TextField;
	public static JTextField W5TextField;
	public static JTextField W6TextField;
	public static JTextField W7TextField;
	public static JTextField W8TextField;
	public static JTextField W9TextField;
	public static JTextField W10TextField;
	
	public static JLabel w1Web1Label;
	public static JLabel w2Web2Label;
	public static JLabel w3Web3Label;
	public static JLabel w4Web4Label;
	public static JLabel w5Web5Label;
	public static JLabel w6Web6Label;
	public static JLabel w7Web7Label;
	public static JLabel w8Web8Label;
	public static JLabel w9Web9Label;
	public static JLabel w10Web10Label;

	public WebsiteSettingsPanel() {
		
		this.setLayout(new GridLayout(0,1));
		this.setBackground(Color.black);
		
		//WEBSITE PANEL 1
				JPanel website1Panel = new JPanel();
				website1Panel.setLayout(new GridLayout(0,1));
				website1Panel.setBackground(Color.black);
		
				JPanel w1PanelNorth = new JPanel();
				w1PanelNorth.setLayout(new GridLayout(1,0));
				w1PanelNorth.setBackground(Color.black);
				JLabel w1TitleLabel = new JLabel("Website 1:");
				w1TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w1TitleLabel.setForeground(Color.white);
				w1PanelNorth.add(w1TitleLabel);
				w1Web1Label = new JLabel(DataVariables.website1);
				w1Web1Label.setForeground(Color.green);
				w1PanelNorth.add(w1Web1Label);
				website1Panel.add(w1PanelNorth);
		
				JPanel w1PanelSouth = new JPanel();
				w1PanelSouth.setLayout(new GridLayout(1,0));
				addWeb1 = new JButton("Change Website 1");
				addWeb1.addActionListener(this);
				w1PanelSouth.add(addWeb1);
				W1TextField = new JTextField();
				w1PanelSouth.add(W1TextField);
				website1Panel.add(w1PanelSouth);
		
				this.add(website1Panel);
		
		//WEBSITE PANEL 2
				JPanel website2Panel = new JPanel();
				website2Panel.setLayout(new GridLayout(0,1));
				website2Panel.setBackground(Color.black);
				
				JPanel w2PanelNorth = new JPanel();
				w2PanelNorth.setLayout(new GridLayout(1,0));
				w2PanelNorth.setBackground(Color.black);
				JLabel w2TitleLabel = new JLabel("Website 2:");
				w2TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w2TitleLabel.setForeground(Color.white);
				w2PanelNorth.add(w2TitleLabel);
				w2Web2Label = new JLabel(DataVariables.website2);
				w2Web2Label.setForeground(Color.green);
				w2PanelNorth.add(w2Web2Label);
				website2Panel.add(w2PanelNorth);
				
				JPanel w2PanelSouth = new JPanel();
				w2PanelSouth.setLayout(new GridLayout(1,0));
				addWeb2 = new JButton("Change Website 2");
				addWeb2.addActionListener(this);
				w2PanelSouth.add(addWeb2);
				W2TextField = new JTextField();
				w2PanelSouth.add(W2TextField);
				website2Panel.add(w2PanelSouth);
		
				this.add(website2Panel);
		
		//WEBSITE PANEL 3
				JPanel website3Panel = new JPanel();
				website3Panel.setLayout(new GridLayout(0,1));
				website3Panel.setBackground(Color.black);
						
				JPanel w3PanelNorth = new JPanel();
				w3PanelNorth.setLayout(new GridLayout(1,0));
				w3PanelNorth.setBackground(Color.black);
				JLabel w3TitleLabel = new JLabel("Website 3:");
				w3TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w3TitleLabel.setForeground(Color.white);
				w3PanelNorth.add(w3TitleLabel);
				w3Web3Label = new JLabel(DataVariables.website3);
				w3Web3Label.setForeground(Color.green);
				w3PanelNorth.add(w3Web3Label);
				website3Panel.add(w3PanelNorth);
						
				JPanel w3PanelSouth = new JPanel();
				w3PanelSouth.setLayout(new GridLayout(1,0));
				addWeb3 = new JButton("Change Website 3");
				addWeb3.addActionListener(this);
				w3PanelSouth.add(addWeb3);
				W3TextField = new JTextField();
				w3PanelSouth.add(W3TextField);
				website3Panel.add(w3PanelSouth);
				
				this.add(website3Panel);
		
		//WEBSITE PANEL 4
				JPanel website4Panel = new JPanel();
				website4Panel.setLayout(new GridLayout(0,1));
				website4Panel.setBackground(Color.black);
						
				JPanel w4PanelNorth = new JPanel();
				w4PanelNorth.setLayout(new GridLayout(1,0));
				w4PanelNorth.setBackground(Color.black);
				JLabel w4TitleLabel = new JLabel("Website 4:");
				w4TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w4TitleLabel.setForeground(Color.white);
				w4PanelNorth.add(w4TitleLabel);
				w4Web4Label = new JLabel(DataVariables.website4);
				w4Web4Label.setForeground(Color.green);
				w4PanelNorth.add(w4Web4Label);
				website4Panel.add(w4PanelNorth);
						
				JPanel w4PanelSouth = new JPanel();
				w4PanelSouth.setLayout(new GridLayout(1,0));
				addWeb4 = new JButton("Change Website 4");
				addWeb4.addActionListener(this);
				w4PanelSouth.add(addWeb4);
				W4TextField = new JTextField();
				w4PanelSouth.add(W4TextField);
				website4Panel.add(w4PanelSouth);
				
				this.add(website4Panel);
				
		//WEBSITE PANEL 5
				JPanel website5Panel = new JPanel();
				website5Panel.setLayout(new GridLayout(0,1));
				website5Panel.setBackground(Color.black);
						
				JPanel w5PanelNorth = new JPanel();
				w5PanelNorth.setLayout(new GridLayout(1,0));
				w5PanelNorth.setBackground(Color.black);
				JLabel w5TitleLabel = new JLabel("Website 5:");
				w5TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w5TitleLabel.setForeground(Color.white);
				w5PanelNorth.add(w5TitleLabel);
				w5Web5Label = new JLabel(DataVariables.website5);
				w5Web5Label.setForeground(Color.green);
				w5PanelNorth.add(w5Web5Label);
				website5Panel.add(w5PanelNorth);
						
				JPanel w5PanelSouth = new JPanel();
				w5PanelSouth.setLayout(new GridLayout(1,0));
				addWeb5 = new JButton("Change Website 5");
				addWeb5.addActionListener(this);
				w5PanelSouth.add(addWeb5);
				W5TextField = new JTextField();
				w5PanelSouth.add(W5TextField);
				website5Panel.add(w5PanelSouth);
				
				this.add(website5Panel);
				
		//WEBSITE PANEL 6
				JPanel website6Panel = new JPanel();
				website6Panel.setLayout(new GridLayout(0,1));
				website6Panel.setBackground(Color.black);
						
				JPanel w6PanelNorth = new JPanel();
				w6PanelNorth.setLayout(new GridLayout(1,0));
				w6PanelNorth.setBackground(Color.black);
				JLabel w6TitleLabel = new JLabel("Website 6:");
				w6TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w6TitleLabel.setForeground(Color.white);
				w6PanelNorth.add(w6TitleLabel);
				w6Web6Label = new JLabel(DataVariables.website6);
				w6Web6Label.setForeground(Color.green);
				w6PanelNorth.add(w6Web6Label);
				website6Panel.add(w6PanelNorth);
						
				JPanel w6PanelSouth = new JPanel();
				w6PanelSouth.setLayout(new GridLayout(1,0));
				addWeb6 = new JButton("Change Website 6");
				addWeb6.addActionListener(this);
				w6PanelSouth.add(addWeb6);
				W6TextField = new JTextField();
				w6PanelSouth.add(W6TextField);
				website6Panel.add(w6PanelSouth);
				
				this.add(website6Panel);
				
		//WEBSITE PANEL 7
				JPanel website7Panel = new JPanel();
				website7Panel.setLayout(new GridLayout(0,1));
				website7Panel.setBackground(Color.black);
						
				JPanel w7PanelNorth = new JPanel();
				w7PanelNorth.setLayout(new GridLayout(1,0));
				w7PanelNorth.setBackground(Color.black);
				JLabel w7TitleLabel = new JLabel("Website 7:");
				w7TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w7TitleLabel.setForeground(Color.white);
				w7PanelNorth.add(w7TitleLabel);
				w7Web7Label = new JLabel(DataVariables.website7);
				w7Web7Label.setForeground(Color.green);
				w7PanelNorth.add(w7Web7Label);
				website7Panel.add(w7PanelNorth);
						
				JPanel w7PanelSouth = new JPanel();
				w7PanelSouth.setLayout(new GridLayout(1,0));
				addWeb7 = new JButton("Change Website 7");
				addWeb7.addActionListener(this);
				w7PanelSouth.add(addWeb7);
				W7TextField = new JTextField();
				w7PanelSouth.add(W7TextField);
				website7Panel.add(w7PanelSouth);
				
				this.add(website7Panel);
				
		//WEBSITE PANEL 8
				JPanel website8Panel = new JPanel();
				website8Panel.setLayout(new GridLayout(0,1));
				website8Panel.setBackground(Color.black);
						
				JPanel w8PanelNorth = new JPanel();
				w8PanelNorth.setLayout(new GridLayout(1,0));
				w8PanelNorth.setBackground(Color.black);
				JLabel w8TitleLabel = new JLabel("Website 8:");
				w8TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w8TitleLabel.setForeground(Color.white);
				w8PanelNorth.add(w8TitleLabel);
				w8Web8Label = new JLabel(DataVariables.website8);
				w8Web8Label.setForeground(Color.green);
				w8PanelNorth.add(w8Web8Label);
				website8Panel.add(w8PanelNorth);
						
				JPanel w8PanelSouth = new JPanel();
				w8PanelSouth.setLayout(new GridLayout(1,0));
				addWeb8 = new JButton("Change Website 8");
				addWeb8.addActionListener(this);
				w8PanelSouth.add(addWeb8);
				W8TextField = new JTextField();
				w8PanelSouth.add(W8TextField);
				website8Panel.add(w8PanelSouth);
				
				this.add(website8Panel);
				
		//WEBSITE PANEL 9
				JPanel website9Panel = new JPanel();
				website9Panel.setLayout(new GridLayout(0,1));
				website9Panel.setBackground(Color.black);
						
				JPanel w9PanelNorth = new JPanel();
				w9PanelNorth.setLayout(new GridLayout(1,0));
				w9PanelNorth.setBackground(Color.black);
				JLabel w9TitleLabel = new JLabel("Website 9:");
				w9TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w9TitleLabel.setForeground(Color.white);
				w9PanelNorth.add(w9TitleLabel);
				w9Web9Label = new JLabel(DataVariables.website9);
				w9Web9Label.setForeground(Color.green);
				w9PanelNorth.add(w9Web9Label);
				website9Panel.add(w9PanelNorth);
						
				JPanel w9PanelSouth = new JPanel();
				w9PanelSouth.setLayout(new GridLayout(1,0));
				addWeb9 = new JButton("Change Website 9");
				addWeb9.addActionListener(this);
				w9PanelSouth.add(addWeb9);
				W9TextField = new JTextField();
				w9PanelSouth.add(W9TextField);
				website9Panel.add(w9PanelSouth);
				
				this.add(website9Panel);
				
		//WEBSITE PANEL 10
				JPanel website10Panel = new JPanel();
				website10Panel.setLayout(new GridLayout(0,1));
				website10Panel.setBackground(Color.black);
						
				JPanel w10PanelNorth = new JPanel();
				w10PanelNorth.setLayout(new GridLayout(1,0));
				w10PanelNorth.setBackground(Color.black);
				JLabel w10TitleLabel = new JLabel("Website 10:");
				w10TitleLabel.setHorizontalAlignment(JLabel.CENTER);
				w10TitleLabel.setForeground(Color.white);
				w10PanelNorth.add(w10TitleLabel);
				w10Web10Label = new JLabel(DataVariables.website10);
				w10Web10Label.setForeground(Color.green);
				w10PanelNorth.add(w10Web10Label);
				website10Panel.add(w10PanelNorth);
						
				JPanel w10PanelSouth = new JPanel();
				w10PanelSouth.setLayout(new GridLayout(1,0));
				addWeb10 = new JButton("Change Website 10");
				addWeb10.addActionListener(this);
				w10PanelSouth.add(addWeb10);
				W10TextField = new JTextField();
				w10PanelSouth.add(W10TextField);
				website10Panel.add(w10PanelSouth);
				
				this.add(website10Panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == addWeb1) {
			FileStorage.Web1Save();	
		}
		
		if(e.getSource() == addWeb2) {
			FileStorage.Web2Save();	
		}
		
		if(e.getSource() == addWeb3) {
			FileStorage.Web3Save();	
		}
		
		if(e.getSource() == addWeb4) {
			FileStorage.Web4Save();	
		}
		
		if(e.getSource() == addWeb5) {
			FileStorage.Web5Save();	
		}
		
		if(e.getSource() == addWeb6) {
			FileStorage.Web6Save();	
		}
		
		if(e.getSource() == addWeb7) {
			FileStorage.Web7Save();	
		}
		
		if(e.getSource() == addWeb8) {
			FileStorage.Web8Save();	
		}
		
		if(e.getSource() == addWeb9) {
			FileStorage.Web9Save();	
		}
		
		if(e.getSource() == addWeb10) {
			FileStorage.Web10Save();	
		}
		
	}

}
