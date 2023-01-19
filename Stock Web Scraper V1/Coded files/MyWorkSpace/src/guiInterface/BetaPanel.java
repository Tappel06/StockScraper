package guiInterface;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import stockData.DataVariables;
import stockData.FileStorage;

public class BetaPanel extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static JRadioButton listARadioButton;
	public static JRadioButton listBRadioButton;
	public static JRadioButton listCRadioButton;
	public static JRadioButton addOption0RadioButton;
	public static JRadioButton addOption1RadioButton;
	public static JRadioButton addOption2RadioButton;
	public static JComboBox<Object> mainWebsiteCombo;
	public static JComboBox<Object> alternative1Combo;
	public static JComboBox<Object> alternative2Combo;
	public static JButton changeButton;
	public static JTextField HTMLField;
	public static JTextField index;
	public static JButton HTMLChangeButton;
	public static JLabel webLabel;
	public static JLabel currentSource;
	public static JLabel currentBETAIndex;
	public static JTextField minimumTextField;
	public static JLabel minimumLabel;
	public static JTextField maxTextField;
	public static JLabel maxLabel;
	public static JButton setLimitsButton;
	
	BetaPanel(){
		this.setBackground(Color.black);
		this.setLayout(new GridLayout(0,1));
		
		//WEB PANEL
		JPanel webPanel = new JPanel();
		webPanel.setLayout(new GridLayout(0,1));
		webPanel.setBackground(Color.black);
		webPanel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		
		JPanel webPanel1 = new JPanel();
		webPanel1.setBackground(Color.black);
		webPanel1.setLayout(new GridLayout(1,0));
		JPanel webPanel1A = new JPanel();
		webPanel1A.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		webPanel1A.setBackground(Color.black);
		webPanel1A.setLayout(new GridLayout(1,0));
		JLabel mainLabel = new JLabel("Website: ");
		mainLabel.setForeground(Color.white);
		mainLabel.setHorizontalAlignment(JLabel.RIGHT);
		webPanel1A.add(mainLabel);
		webLabel = new JLabel("");
		webLabel.setForeground(Color.green);
		webLabel.setHorizontalAlignment(JLabel.LEFT);
		webPanel1A.add(webLabel);
		webPanel1.add(webPanel1A);
		JPanel webPanel1B = new JPanel();
		webPanel1B.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		webPanel1B.setBackground(Color.black);
		webPanel1B.setLayout(new GridLayout(0,2));
		JLabel listALabel = new JLabel("List A");
		listALabel.setForeground(Color.white);
		listALabel.setBackground(Color.black);
		listALabel.setHorizontalAlignment(JLabel.RIGHT);;
		webPanel1B.add(listALabel);
		listARadioButton = new JRadioButton();
		listARadioButton.addActionListener(this);
		listARadioButton.setBackground(Color.black);
		webPanel1B.add(listARadioButton);
		JLabel listBLabel = new JLabel("List B");
		listBLabel.setForeground(Color.white);
		listBLabel.setBackground(Color.black);
		listBLabel.setHorizontalAlignment(JLabel.RIGHT);
		webPanel1B.add(listBLabel);
		listBRadioButton = new JRadioButton();
		listBRadioButton.addActionListener(this);
		listBRadioButton.setBackground(Color.black);
		webPanel1B.add(listBRadioButton);
		JLabel listCLabel = new JLabel("List C");
		listCLabel.setForeground(Color.white);
		listCLabel.setBackground(Color.black);
		listCLabel.setHorizontalAlignment(JLabel.RIGHT);
		webPanel1B.add(listCLabel);
		listCRadioButton = new JRadioButton();
		listCRadioButton.addActionListener(this);
		listCRadioButton.setBackground(Color.black);
		webPanel1B.add(listCRadioButton);
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(listARadioButton);
		buttonGroup1.add(listBRadioButton);
		buttonGroup1.add(listCRadioButton);
		webPanel1.add(webPanel1B);
		webPanel.add(webPanel1);
		
		JPanel webPanel2 = new JPanel();
		webPanel2.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		webPanel2.setLayout(new GridLayout(0,1));
		JPanel webPanel2Top = new JPanel();
		webPanel2Top.setLayout(new GridLayout(1,0));
		addOption0RadioButton = new JRadioButton();
		addOption0RadioButton.addActionListener(this);
		addOption0RadioButton.setHorizontalAlignment(JRadioButton.CENTER);
		addOption0RadioButton.setBackground(Color.black);
		webPanel2Top.add(addOption0RadioButton);
		addOption1RadioButton = new JRadioButton();
		addOption1RadioButton.addActionListener(this);
		addOption1RadioButton.setHorizontalAlignment(JRadioButton.CENTER);
		addOption1RadioButton.setBackground(Color.black);
		webPanel2Top.add(addOption1RadioButton);
		addOption2RadioButton = new JRadioButton();
		addOption2RadioButton.addActionListener(this);
		addOption2RadioButton.setHorizontalAlignment(JRadioButton.CENTER);
		addOption2RadioButton.setBackground(Color.black);
		webPanel2Top.add(addOption2RadioButton);
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(addOption0RadioButton);
		buttonGroup2.add(addOption1RadioButton);
		buttonGroup2.add(addOption2RadioButton);
		JPanel panelBlank2 = new JPanel();
		panelBlank2.setBackground(Color.black);
		webPanel2Top.add(panelBlank2);
		webPanel2.add(webPanel2Top);
		JPanel webPanel2Bottom = new JPanel();
		webPanel2Bottom.setLayout(new GridLayout(1,0));
		mainWebsiteCombo = new JComboBox<Object>();
		mainWebsiteCombo.addItem(DataVariables.website1);
		mainWebsiteCombo.addItem(DataVariables.website2);
		mainWebsiteCombo.addItem(DataVariables.website3);
		mainWebsiteCombo.addItem(DataVariables.website4);
		mainWebsiteCombo.addItem(DataVariables.website5);
		mainWebsiteCombo.addItem(DataVariables.website6);
		mainWebsiteCombo.addItem(DataVariables.website7);
		mainWebsiteCombo.addItem(DataVariables.website8);
		mainWebsiteCombo.addItem(DataVariables.website9);
		mainWebsiteCombo.addItem(DataVariables.website10);
		webPanel2Bottom.add(mainWebsiteCombo);
		alternative1Combo = new JComboBox<Object>();
		alternative1Combo.addItem(DataVariables.website1);
		alternative1Combo.addItem(DataVariables.website2);
		alternative1Combo.addItem(DataVariables.website3);
		alternative1Combo.addItem(DataVariables.website4);
		alternative1Combo.addItem(DataVariables.website5);
		alternative1Combo.addItem(DataVariables.website6);
		alternative1Combo.addItem(DataVariables.website7);
		alternative1Combo.addItem(DataVariables.website8);
		alternative1Combo.addItem(DataVariables.website9);
		alternative1Combo.addItem(DataVariables.website10);
		webPanel2Bottom.add(alternative1Combo);
		alternative2Combo = new JComboBox<Object>();
		alternative2Combo.addItem(DataVariables.website1);
		alternative2Combo.addItem(DataVariables.website2);
		alternative2Combo.addItem(DataVariables.website3);
		alternative2Combo.addItem(DataVariables.website4);
		alternative2Combo.addItem(DataVariables.website5);
		alternative2Combo.addItem(DataVariables.website6);
		alternative2Combo.addItem(DataVariables.website7);
		alternative2Combo.addItem(DataVariables.website8);
		alternative2Combo.addItem(DataVariables.website9);
		alternative2Combo.addItem(DataVariables.website10);
		webPanel2Bottom.add(alternative2Combo);
		changeButton = new JButton("Change");
		changeButton.addActionListener(this);
		webPanel2Bottom.add(changeButton);
		webPanel2.add(webPanel2Bottom);
		webPanel.add(webPanel2);
		
		this.add(webPanel);
		
		// Scrape Panel
		JPanel scrapePanel = new JPanel();
		scrapePanel.setLayout(new GridLayout(0,1));
		scrapePanel.setBackground(Color.black);
		scrapePanel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		
		JPanel scrapeDisplayPanel = new JPanel();
		scrapeDisplayPanel.setLayout(new GridLayout(1,0));
		scrapeDisplayPanel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		scrapeDisplayPanel.setBackground(Color.black);
		JPanel HTMLLabelPanel = new JPanel();
		HTMLLabelPanel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		HTMLLabelPanel.setBackground(Color.black);
		HTMLLabelPanel.setLayout(new GridLayout(1,0));
		scrapeDisplayPanel.add(HTMLLabelPanel);
		JLabel HTMLTitle = new JLabel("HTML Source Code: ");
		HTMLTitle.setHorizontalAlignment(JLabel.RIGHT);
		HTMLTitle.setForeground(Color.white);
		HTMLLabelPanel.add(HTMLTitle);
		scrapeDisplayPanel.add(HTMLLabelPanel);
		currentSource = new JLabel(DataVariables.BETAHTMLSourceCode);
		currentSource.setForeground(Color.green);
		HTMLLabelPanel.add(currentSource);
		
		JPanel HTMLBlankPanel = new JPanel();
		HTMLBlankPanel.setLayout(new GridLayout(1,0));
		HTMLBlankPanel.setBackground(Color.black);
		HTMLBlankPanel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		JLabel indexName = new JLabel("Index no: ");
		indexName.setForeground(Color.white);
		indexName.setVerticalAlignment(JLabel.CENTER);
		indexName.setHorizontalAlignment(JLabel.RIGHT);
		HTMLBlankPanel.add(indexName);
		currentBETAIndex = new JLabel(DataVariables.indexBETAString);
		currentBETAIndex.setForeground(Color.green);
		HTMLBlankPanel.add(currentBETAIndex);
		scrapeDisplayPanel.add(HTMLBlankPanel);
		scrapePanel.add(scrapeDisplayPanel);
		
		JPanel addScrapePanel = new JPanel();
		addScrapePanel.setLayout(new GridLayout(1,0));
		addScrapePanel.setBackground(Color.black);
		HTMLField = new JTextField();
		HTMLField.addActionListener(this);
		addScrapePanel.add(HTMLField);
		index = new JTextField();
		index.addActionListener(this);
		addScrapePanel.add(index);
		HTMLChangeButton = new JButton("Change");
		HTMLChangeButton.addActionListener(this);
		addScrapePanel.add(HTMLChangeButton);
		scrapePanel.add(addScrapePanel);
		
		JPanel parametersPanel = new JPanel();
		parametersPanel.setBackground(Color.black);
		parametersPanel.setLayout(new GridLayout(1,0));
		JPanel minPanel = new JPanel();
		minPanel.setLayout(new GridLayout(1,0));
		minPanel.setBackground(Color.black);
		JLabel minLabelText = new JLabel("Min: ");
		minLabelText.setVerticalAlignment(JLabel.CENTER);
		minLabelText.setHorizontalAlignment(JLabel.RIGHT);
		minLabelText.setForeground(Color.white);
		minPanel.add(minLabelText);
		minimumLabel = new JLabel(DataVariables.BETAMinimum);
		minimumLabel.setHorizontalAlignment(JLabel.LEFT);
		minimumLabel.setVerticalAlignment(JLabel.CENTER);
		minimumLabel.setForeground(Color.green);
		minPanel.add(minimumLabel);
		parametersPanel.add(minPanel);
		minimumTextField = new JTextField();
		parametersPanel.add(minimumTextField);
		JPanel maxPanel = new JPanel();
		maxPanel.setBackground(Color.black);
		maxPanel.setLayout(new GridLayout(1,0));
		JLabel maxLabelText = new JLabel("Max: ");
		maxLabelText.setForeground(Color.white);
		maxLabelText.setHorizontalAlignment(JLabel.RIGHT);
		maxLabelText.setVerticalAlignment(JLabel.CENTER);
		maxPanel.add(maxLabelText);
		maxLabel = new JLabel(DataVariables.BETAMaximum);
		maxLabel.setForeground(Color.green);
		maxLabel.setHorizontalAlignment(JLabel.LEFT);
		maxLabel.setVerticalAlignment(JLabel.CENTER);
		maxPanel.add(maxLabel);
		parametersPanel.add(maxPanel);
		maxTextField = new JTextField();
		parametersPanel.add(maxTextField);
		setLimitsButton = new JButton("Set");
		setLimitsButton.addActionListener(this);
		parametersPanel.add(setLimitsButton);
		scrapePanel.add(parametersPanel);
		this.add(scrapePanel);
		
		if(DataVariables.tickerBETAList == 'A') {
			listARadioButton.setSelected(true);
		} else if(DataVariables.tickerBETAList == 'B') {
			listBRadioButton.setSelected(true);
		} else if(DataVariables.tickerBETAList == 'C') {
			listCRadioButton.setSelected(true);
		}
		
		if(DataVariables.BETAWebOption == 'A') {
			addOption0RadioButton.setSelected(true);
		} else if(DataVariables.BETAWebOption == 'B') {
			addOption1RadioButton.setSelected(true);
		} else if(DataVariables.BETAWebOption == 'C') {
			addOption2RadioButton.setSelected(true);
		}
		if(addOption0RadioButton.isSelected() == true) {
			webLabel.setText(DataVariables.BETAWebsite1 + "(ticker)");
		}
		if(addOption1RadioButton.isSelected() == true) {
			webLabel.setText(DataVariables.BETAWebsite1 + "(ticker)" + DataVariables.BETAWebsite2);
		}
		if(addOption2RadioButton.isSelected() == true) {
			webLabel.setText(DataVariables.BETAWebsite1 + "(ticker)" + DataVariables.BETAWebsite2 + "(ticker)" + DataVariables.BETAWebsite3);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==listARadioButton) {
			DataVariables.tickerBETAList = 'A';
			FileStorage.tickerBETAListSave();
			
		}
		
		if(e.getSource()==listBRadioButton) {
			DataVariables.tickerBETAList = 'B';
			FileStorage.tickerBETAListSave();
			
		}
		
		if(e.getSource()==listCRadioButton) {
			DataVariables.tickerBETAList = 'C';
			FileStorage.tickerBETAListSave();
			
		}
		
		if(e.getSource()==addOption0RadioButton) {
			DataVariables.BETAWebOption = 'A';
			FileStorage.BETAWebOptionSave();
		}
		
		if(e.getSource()==addOption1RadioButton) {
			DataVariables.BETAWebOption = 'B';
			FileStorage.BETAWebOptionSave();
		}
		
		if(e.getSource()==addOption2RadioButton) {
			DataVariables.BETAWebOption = 'C';
			FileStorage.BETAWebOptionSave();
		}
		
		if(e.getSource()==changeButton) {
			
			if(addOption0RadioButton.isSelected() == true) {
				DataVariables.BETAWebsite1 = mainWebsiteCombo.getSelectedItem().toString();
				webLabel.setText(DataVariables.BETAWebsite1 + "(ticker)");
				FileStorage.BETAWebConstructorSave1();
			}
			
			if(addOption1RadioButton.isSelected() == true) {
				DataVariables.BETAWebsite1 = mainWebsiteCombo.getSelectedItem().toString();
				DataVariables.BETAWebsite2 = alternative1Combo.getSelectedItem().toString();
				webLabel.setText(DataVariables.BETAWebsite1 + "(ticker)" + DataVariables.BETAWebsite2);
				FileStorage.BETAWebConstructorSave2();
			}
			
			if(addOption2RadioButton.isSelected() == true) {
				DataVariables.BETAWebsite1 = mainWebsiteCombo.getSelectedItem().toString();
				DataVariables.BETAWebsite2 = alternative1Combo.getSelectedItem().toString();
				DataVariables.BETAWebsite3 = alternative1Combo.getSelectedItem().toString();
				webLabel.setText(DataVariables.BETAWebsite1 + "(ticker)" + DataVariables.BETAWebsite2 + "(ticker)" + DataVariables.BETAWebsite3);
				FileStorage.BETAWebConstructorSave3();
			}
			
		
	}
		
		if(e.getSource()==HTMLChangeButton) {
			DataVariables.BETAHTMLSourceCode = HTMLField.getText();
			currentSource.setText(HTMLField.getText());
			DataVariables.indexBETA = Integer.parseInt(index.getText());
			currentBETAIndex.setText(index.getText());
			FileStorage.BETAHTMLSourceSave();
			FileStorage.BETAIndexSourceSave();
	}
		if(e.getSource()==setLimitsButton) {
			minimumLabel.setText(minimumTextField.getText());
			maxLabel.setText(maxTextField.getText());
			DataVariables.BETAMinimum = minimumTextField.getText();
			DataVariables.BETAMaximum = maxTextField.getText();
			FileStorage.BETAParametersSave();
		}
	}

}
