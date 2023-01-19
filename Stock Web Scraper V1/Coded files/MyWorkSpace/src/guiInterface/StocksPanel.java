package guiInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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

public class StocksPanel extends JPanel implements ActionListener, Functions, FileStorage{

	private static final long serialVersionUID = 1L;
	
	public static JButton mainMenu;
	public static JButton addButton;
	public static JTextField addField;
	public static JRadioButton ListARadioButton;
	public static JRadioButton ListBRadioButton;
	public static JRadioButton ListCRadioButton;
	public static JButton remove;
	public static JPanel center;
	public static JComboBox<Object> removeComboBox;

	public StocksPanel() {
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		
		//Navigator
		JPanel navigator = new JPanel();
		navigator.setPreferredSize(new Dimension(80,80));
		navigator.setLayout(new GridLayout(0,1));
		navigator.setBackground(Color.green);
		
		JPanel title = new JPanel();
		title.setLayout(new BorderLayout());
		title.setBackground(Color.BLACK);
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Stocks");
		titleLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		titleLabel.setForeground(Color.GREEN);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		title.add(titleLabel, BorderLayout.CENTER);
		navigator.add(title, BorderLayout.CENTER);
		
		JPanel navigation = new JPanel();
		navigation.setLayout(new GridLayout(1,0, 5, 5));
		navigation.setBackground(Color.black);
		mainMenu = new JButton("Main Menu");
		mainMenu.addActionListener(this);
		navigation.add(mainMenu);
		JPanel radioButtonPanel = new JPanel();
		radioButtonPanel.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		radioButtonPanel.setLayout(new GridLayout(1,0));
		radioButtonPanel.setBackground(Color.black);
		JLabel listALabel = new JLabel("A");
		listALabel.setForeground(Color.white);
		listALabel.setHorizontalAlignment(JLabel.RIGHT);
		radioButtonPanel.add(listALabel);
		ListARadioButton = new JRadioButton();
		ListARadioButton.addActionListener(this);
		ListARadioButton.setBackground(Color.black);
		radioButtonPanel.add(ListARadioButton);
		JLabel listBLabel = new JLabel("B");
		listBLabel.setHorizontalAlignment(JLabel.RIGHT);
		listBLabel.setForeground(Color.white);
		radioButtonPanel.add(listBLabel);
		ListBRadioButton = new JRadioButton();
		ListBRadioButton.addActionListener(this);
		ListBRadioButton.setBackground(Color.black);
		radioButtonPanel.add(ListBRadioButton);
		JLabel listCLabel = new JLabel("C");
		listCLabel.setHorizontalAlignment(JLabel.RIGHT);
		listCLabel.setForeground(Color.white);
		radioButtonPanel.add(listCLabel);
		ListCRadioButton = new JRadioButton();
		ListCRadioButton.addActionListener(this);
		ListCRadioButton.setBackground(Color.black);
		radioButtonPanel.add(ListCRadioButton);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(ListARadioButton);
		buttonGroup.add(ListBRadioButton);
		buttonGroup.add(ListCRadioButton);
		
		navigation.add(radioButtonPanel);
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		navigation.add(addButton);
		addField = new JTextField();
		navigation.add(addField);
		remove = new JButton("Remove");
		remove.addActionListener(this);
		navigation.add(remove);
		removeComboBox = new JComboBox<Object>();
		removeComboBoxList();
		removeComboBox.addItem("Default");
		navigation.add(removeComboBox);
		navigator.add(navigation,BorderLayout.SOUTH);
		this.add(navigator, BorderLayout.NORTH);
		
		JPanel display = new JPanel();
		display.setLayout(new BorderLayout());
		display.setBackground(Color.black);
		JPanel north = new JPanel();
		north.setPreferredSize(new Dimension(20,20));
		north.setBackground(Color.black);
		display.add(north, BorderLayout.NORTH);
		JPanel south = new JPanel();
		south.setPreferredSize(new Dimension(20,20));
		south.setBackground(Color.black);
		display.add(south, BorderLayout.SOUTH);
		JPanel east = new JPanel();
		east.setPreferredSize(new Dimension(20,20));
		east.setBackground(Color.black);
		display.add(east, BorderLayout.EAST);
		JPanel west = new JPanel();
		west.setPreferredSize(new Dimension(20,20));
		west.setBackground(Color.black);
		display.add(west, BorderLayout.WEST);
		center = new JPanel();
		center.setLayout(new GridLayout());
		center.setBackground(Color.black);
		center.add(CurrentStockDisplay.display);
		center.add(CurrenStockDisplay2.display);
		center.add(CurrentStockDisplay3.display);
		center.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
		
		CurrentStockDisplay.displaySetup();
		CurrentStockDisplay.currentStockDisplay();
		CurrenStockDisplay2.displaySetup2();
		CurrenStockDisplay2.currentStockDisplay2();
		CurrentStockDisplay3.displaySetup3();
		CurrentStockDisplay3.currentStockDisplay3();
		display.add(center, BorderLayout.CENTER);
		this.add(display,BorderLayout.CENTER);
	}
	
	
	public static void removeComboBoxList() {
		removeComboBox.removeAllItems();
		for(int i = 0; i < DataVariables.tickerListA.size();i++) {
			removeComboBox.addItem(DataVariables.tickerListA.get(i));;
			
		}
	}
	
	public static void removeComboBoxList2() {
		removeComboBox.removeAllItems();
		for(int i = 0; i < DataVariables.tickerListB.size();i++) {
			removeComboBox.addItem(DataVariables.tickerListB.get(i));;
			
		}
	}
	
	public static void removeComboBoxList3() {
		removeComboBox.removeAllItems();
		for(int i = 0; i < DataVariables.tickerListC.size();i++) {
			removeComboBox.addItem(DataVariables.tickerListC.get(i));;
			
		}
	}
	
	public static void remove() {
		
		DataVariables.tickerListA.remove(removeComboBox.getSelectedIndex());
	}
	
	public static void remove2() {
		
		DataVariables.tickerListB.remove(removeComboBox.getSelectedIndex());
	}
	
	public static void remove3() {
		
		DataVariables.tickerListC.remove(removeComboBox.getSelectedIndex());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==ListBRadioButton) {
			removeComboBoxList2();
		}
		
		if(e.getSource()==ListARadioButton) {
			removeComboBoxList();
		}
		
		if(e.getSource()==ListCRadioButton) {
			removeComboBoxList3();
		}
		
		
		if(e.getSource()==mainMenu) {
			mainFrame.window.remove(mainFrame.stocksPanel);
			mainFrame.window.add(mainFrame.mainMenuPanel);
			mainFrame.window.setVisible(false);
			mainFrame.window.setVisible(true);
		}
		
		if(e.getSource()==addButton) {
			if(ListARadioButton.isSelected()) {
				Functions.addStock();
				removeComboBoxList();
				CurrentStockDisplay.currentStockDisplay();
				FileStorage.tickerSaveFile();;
			}
			if(ListBRadioButton.isSelected()) {
				Functions.addStock2();
				removeComboBoxList2();
				CurrenStockDisplay2.currentStockDisplay2();
				FileStorage.tickerSaveFile2();
			}
			if(ListCRadioButton.isSelected()) {
				Functions.addStock3();
				removeComboBoxList3();
				CurrentStockDisplay3.currentStockDisplay3();
				FileStorage.tickerSaveFile3();
			}
		}
		
		if(e.getSource()==remove){
			if(ListARadioButton.isSelected()) {
				System.out.println(removeComboBox.getSelectedIndex());
				CurrentStockDisplay.removeStockDisplay();
				remove();
				removeComboBoxList();
				CurrentStockDisplay.currentStockDisplay();
				FileStorage.tickerSaveFile();;
				mainFrame.window.setVisible(false);
				mainFrame.window.setVisible(true);
			}
			if(ListBRadioButton.isSelected()) {
				System.out.println(removeComboBox.getSelectedIndex());
				CurrenStockDisplay2.removeStockDisplay2();
				remove2();
				removeComboBoxList2();
				CurrenStockDisplay2.currentStockDisplay2();
				FileStorage.tickerSaveFile2();;
				mainFrame.window.setVisible(false);
				mainFrame.window.setVisible(true);
			}
			if(ListCRadioButton.isSelected()) {
				System.out.println(removeComboBox.getSelectedIndex());
				CurrentStockDisplay3.removeStockDisplay3();
				remove3();
				removeComboBoxList3();
				CurrentStockDisplay3.currentStockDisplay3();
				FileStorage.tickerSaveFile3();;
				mainFrame.window.setVisible(false);
				mainFrame.window.setVisible(true);
			}
		}
		
		
	}
}
