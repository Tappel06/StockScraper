package stockData;

import java.io.FileWriter;
import java.io.IOException;

import guiInterface.BetaPanel;
import guiInterface.EPSPanel;
import guiInterface.PEPanel;
import guiInterface.PricePanel;
import guiInterface.WebsiteSettingsPanel;

public interface FileStorage{
	
	
	public static void tickerSaveFile() {
		DataVariables.tickerFileSaver = "";
		for(int i = 0; i < DataVariables.tickerListA.size();i++) {
			DataVariables.tickerFileSaver = DataVariables.tickerFileSaver + DataVariables.tickerListA.get(i) + ",";
		}
		
		try {
			FileWriter tickerFileWriter = new FileWriter("tickersListA.txt");
			tickerFileWriter.write(DataVariables.tickerFileSaver);
			tickerFileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tickerSaveFile2() {
		DataVariables.tickerFileSaver2 = "";
		for(int i = 0; i < DataVariables.tickerListB.size();i++) {
			DataVariables.tickerFileSaver2 = DataVariables.tickerFileSaver2 + DataVariables.tickerListB.get(i) + ",";
		}
		
		try {
			FileWriter tickerFileWriter2 = new FileWriter("tickersListB.txt");
			tickerFileWriter2.write(DataVariables.tickerFileSaver2);
			tickerFileWriter2.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tickerSaveFile3() {
		DataVariables.tickerFileSaver3 = "";
		for(int i = 0; i < DataVariables.tickerListC.size();i++) {
			DataVariables.tickerFileSaver3 = DataVariables.tickerFileSaver3 + DataVariables.tickerListC.get(i) + ",";
		}
		
		try {
			FileWriter tickerFileWriter3 = new FileWriter("tickersListC.txt");
			tickerFileWriter3.write(DataVariables.tickerFileSaver3);
			tickerFileWriter3.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web1Save() {
		try {
			FileWriter Web1File = new FileWriter("website1.txt");
			Web1File.write(WebsiteSettingsPanel.W1TextField.getText());
			Web1File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website1 = WebsiteSettingsPanel.W1TextField.getText();
		WebsiteSettingsPanel.w1Web1Label.setText(WebsiteSettingsPanel.W1TextField.getText());
	}
	
	public static void Web2Save() {
		try {
			FileWriter Web2File = new FileWriter("website2.txt");
			Web2File.write(WebsiteSettingsPanel.W2TextField.getText());
			Web2File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website2 = WebsiteSettingsPanel.W2TextField.getText();
		WebsiteSettingsPanel.w2Web2Label.setText(WebsiteSettingsPanel.W2TextField.getText());
	}
	
	public static void Web3Save() {
		try {
			FileWriter Web3File = new FileWriter("website3.txt");
			Web3File.write(WebsiteSettingsPanel.W3TextField.getText());
			Web3File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website3 = WebsiteSettingsPanel.W3TextField.getText();
		WebsiteSettingsPanel.w3Web3Label.setText(WebsiteSettingsPanel.W3TextField.getText());
	}
	
	public static void Web4Save() {
		try {
			FileWriter Web4File = new FileWriter("website4.txt");
			Web4File.write(WebsiteSettingsPanel.W4TextField.getText());
			Web4File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website4 = WebsiteSettingsPanel.W4TextField.getText();
		WebsiteSettingsPanel.w4Web4Label.setText(WebsiteSettingsPanel.W4TextField.getText());
	}
	
	public static void Web5Save() {
		try {
			FileWriter Web5File = new FileWriter("website5.txt");
			Web5File.write(WebsiteSettingsPanel.W5TextField.getText());
			Web5File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website5 = WebsiteSettingsPanel.W5TextField.getText();
		WebsiteSettingsPanel.w5Web5Label.setText(WebsiteSettingsPanel.W5TextField.getText());
	}
	
	public static void Web6Save() {
		try {
			FileWriter Web6File = new FileWriter("website6.txt");
			Web6File.write(WebsiteSettingsPanel.W6TextField.getText());
			Web6File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website6 = WebsiteSettingsPanel.W6TextField.getText();
		WebsiteSettingsPanel.w6Web6Label.setText(WebsiteSettingsPanel.W6TextField.getText());
	}
	
	public static void Web7Save() {
		try {
			FileWriter Web7File = new FileWriter("website7.txt");
			Web7File.write(WebsiteSettingsPanel.W7TextField.getText());
			Web7File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website7 = WebsiteSettingsPanel.W7TextField.getText();
		WebsiteSettingsPanel.w7Web7Label.setText(WebsiteSettingsPanel.W7TextField.getText());
	}
	
	public static void Web8Save() {
		try {
			FileWriter Web8File = new FileWriter("website8.txt");
			Web8File.write(WebsiteSettingsPanel.W8TextField.getText());
			Web8File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website8 = WebsiteSettingsPanel.W8TextField.getText();
		WebsiteSettingsPanel.w8Web8Label.setText(WebsiteSettingsPanel.W8TextField.getText());
	}
	
	public static void Web9Save() {
		try {
			FileWriter Web9File = new FileWriter("website9.txt");
			Web9File.write(WebsiteSettingsPanel.W9TextField.getText());
			Web9File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website9 = WebsiteSettingsPanel.W9TextField.getText();
		WebsiteSettingsPanel.w9Web9Label.setText(WebsiteSettingsPanel.W9TextField.getText());
	}
	
	public static void Web10Save() {
		try {
			FileWriter Web10File = new FileWriter("website10.txt");
			Web10File.write(WebsiteSettingsPanel.W10TextField.getText());
			Web10File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataVariables.website10 = WebsiteSettingsPanel.W10TextField.getText();
		WebsiteSettingsPanel.w10Web10Label.setText(WebsiteSettingsPanel.W10TextField.getText());
	}
	
	public static void tickerPriceListSave() {
		try {
			FileWriter TPLS = new FileWriter("tickerPriceList.txt");
			TPLS.write(DataVariables.tickerPriceList);
			TPLS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void priceWebOptionSave() {
		try {
			FileWriter PWOS = new FileWriter("priceWebOption.txt");
			PWOS.write(DataVariables.priceWebOption);
			PWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void priceWebConstructorSave1() {
		try {
			FileWriter PWCS1 = new FileWriter("priceWebsite1.txt");
			PWCS1.write(DataVariables.priceWebsite1);
			PWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void priceWebConstructorSave2() {
		try {
			FileWriter PWCS1 = new FileWriter("priceWebsite1.txt");
			PWCS1.write(DataVariables.priceWebsite1);
			PWCS1.close();
			FileWriter PWCS2 = new FileWriter("priceWebsite2.txt");
			PWCS2.write(DataVariables.priceWebsite2);
			PWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void priceWebConstructorSave3() {
		try {
			FileWriter PWCS1 = new FileWriter("priceWebsite1.txt");
			PWCS1.write(DataVariables.priceWebsite1);
			PWCS1.close();
			FileWriter PWCS2 = new FileWriter("priceWebsite2.txt");
			PWCS2.write(DataVariables.priceWebsite2);
			PWCS2.close();
			FileWriter PWCS3 = new FileWriter("priceWebsite3.txt");
			PWCS3.write(DataVariables.priceWebsite3);
			PWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void priceHTMLSourceSave() {
		try {
			FileWriter PHTMLSS = new FileWriter("priceHTMLSourceCode.txt");
			PHTMLSS.write(DataVariables.priceHTMLSourceCode);
			PHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void priceIndexSourceSave() {
		try {
			FileWriter PISS = new FileWriter("priceIndexSourceCode.txt");
			PISS.write(PricePanel.index.getText());
			PISS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//PE
	public static void tickerPEListSave() {
		try {
			FileWriter TPELS = new FileWriter("tickerPEList.txt");
			TPELS.write(DataVariables.tickerPEList);
			TPELS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebOptionSave() {
		try {
			FileWriter PEWOS = new FileWriter("PEWebOption.txt");
			PEWOS.write(DataVariables.PEWebOption);
			PEWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebConstructorSave1() {
		try {
			FileWriter PEWCS1 = new FileWriter("PEWebsite1.txt");
			PEWCS1.write(DataVariables.PEWebsite1);
			PEWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebConstructorSave2() {
		try {
			FileWriter PEWCS1 = new FileWriter("PEWebsite1.txt");
			PEWCS1.write(DataVariables.PEWebsite1);
			PEWCS1.close();
			FileWriter PEWCS2 = new FileWriter("PEWebsite2.txt");
			PEWCS2.write(DataVariables.PEWebsite2);
			PEWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebConstructorSave3() {
		try {
			FileWriter PEWCS1 = new FileWriter("PEWebsite1.txt");
			PEWCS1.write(DataVariables.PEWebsite1);
			PEWCS1.close();
			FileWriter PEWCS2 = new FileWriter("PEWebsite2.txt");
			PEWCS2.write(DataVariables.PEWebsite2);
			PEWCS2.close();
			FileWriter PEWCS3 = new FileWriter("PEWebsite3.txt");
			PEWCS3.write(DataVariables.PEWebsite3);
			PEWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEHTMLSourceSave() {
		try {
			FileWriter PEHTMLSS = new FileWriter("PEHTMLSourceCode.txt");
			PEHTMLSS.write(DataVariables.PEHTMLSourceCode);
			PEHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void PEIndexSourceSave() {
		try {
			FileWriter PISS = new FileWriter("PEIndexSourceCode.txt");
			PISS.write(PEPanel.index.getText());
			PISS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void PEParametersSave() {
		try {
			FileWriter PEMIN = new FileWriter("PEMin.txt");
			PEMIN.write(PEPanel.minimumTextField.getText());
			PEMIN.close();
			FileWriter PEMAX = new FileWriter("PEMax.txt");
			PEMAX.write(PEPanel.maxTextField.getText());
			PEMAX.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//EPS
	public static void tickerEPSListSave() {
		try {
			FileWriter TEPSLS = new FileWriter("tickerEPSList.txt");
			TEPSLS.write(DataVariables.tickerEPSList);
			TEPSLS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebOptionSave() {
		try {
			FileWriter EPSWOS = new FileWriter("EPSWebOption.txt");
			EPSWOS.write(DataVariables.EPSWebOption);
			EPSWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebConstructorSave1() {
		try {
			FileWriter EPSWCS1 = new FileWriter("EPSWebsite1.txt");
			EPSWCS1.write(DataVariables.EPSWebsite1);
			EPSWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebConstructorSave2() {
		try {
			FileWriter EPSWCS1 = new FileWriter("EPSWebsite1.txt");
			EPSWCS1.write(DataVariables.EPSWebsite1);
			EPSWCS1.close();
			FileWriter EPSWCS2 = new FileWriter("EPSWebsite2.txt");
			EPSWCS2.write(DataVariables.EPSWebsite2);
			EPSWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebConstructorSave3() {
		try {
			FileWriter EPSWCS1 = new FileWriter("EPSWebsite1.txt");
			EPSWCS1.write(DataVariables.EPSWebsite1);
			EPSWCS1.close();
			FileWriter EPSWCS2 = new FileWriter("EPSWebsite2.txt");
			EPSWCS2.write(DataVariables.EPSWebsite2);
			EPSWCS2.close();
			FileWriter EPSWCS3 = new FileWriter("EPSWebsite3.txt");
			EPSWCS3.write(DataVariables.EPSWebsite3);
			EPSWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSHTMLSourceSave() {
		try {
			FileWriter EPSHTMLSS = new FileWriter("EPSHTMLSourceCode.txt");
			EPSHTMLSS.write(DataVariables.EPSHTMLSourceCode);
			EPSHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void EPSIndexSourceSave() {
		try {
			FileWriter EPSISS = new FileWriter("EPSIndexSourceCode.txt");
			EPSISS.write(EPSPanel.index.getText());
			EPSISS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void FileCreator() {
		try {
			FileWriter createFile = new FileWriter("FileStatus.txt");
			createFile.write("1");
			createFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void EPSParametersSave() {
		try {
			FileWriter EPSMIN = new FileWriter("EPSMin.txt");
			EPSMIN.write(EPSPanel.minimumTextField.getText());
			EPSMIN.close();
			FileWriter EPSMAX = new FileWriter("EPSMax.txt");
			EPSMAX.write(EPSPanel.maxTextField.getText());
			EPSMAX.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//BETA
	public static void tickerBETAListSave() {
		try {
			FileWriter TBETALS = new FileWriter("tickerBETAList.txt");
			TBETALS.write(DataVariables.tickerBETAList);
			TBETALS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebOptionSave() {
		try {
			FileWriter BETAWOS = new FileWriter("BETAWebOption.txt");
			BETAWOS.write(DataVariables.BETAWebOption);
			BETAWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebConstructorSave1() {
		try {
			FileWriter BETAWCS1 = new FileWriter("BETAWebsite1.txt");
			BETAWCS1.write(DataVariables.BETAWebsite1);
			BETAWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebConstructorSave2() {
		try {
			FileWriter BETAWCS1 = new FileWriter("BETAWebsite1.txt");
			BETAWCS1.write(DataVariables.BETAWebsite1);
			BETAWCS1.close();
			FileWriter BETAWCS2 = new FileWriter("BETAWebsite2.txt");
			BETAWCS2.write(DataVariables.BETAWebsite2);
			BETAWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebConstructorSave3() {
		try {
			FileWriter BETAWCS1 = new FileWriter("BETAWebsite1.txt");
			BETAWCS1.write(DataVariables.BETAWebsite1);
			BETAWCS1.close();
			FileWriter BETAWCS2 = new FileWriter("BETAWebsite2.txt");
			BETAWCS2.write(DataVariables.BETAWebsite2);
			BETAWCS2.close();
			FileWriter BETAWCS3 = new FileWriter("BETAWebsite3.txt");
			BETAWCS3.write(DataVariables.BETAWebsite3);
			BETAWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAHTMLSourceSave() {
		try {
			FileWriter BETAHTMLSS = new FileWriter("BETAHTMLSourceCode.txt");
			BETAHTMLSS.write(DataVariables.BETAHTMLSourceCode);
			BETAHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void BETAIndexSourceSave() {
		try {
			FileWriter BETAISS = new FileWriter("BETAIndexSourceCode.txt");
			BETAISS.write(BetaPanel.index.getText());
			BETAISS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void BETAParametersSave() {
		try {
			FileWriter BETAMIN = new FileWriter("BETAMin.txt");
			BETAMIN.write(BetaPanel.minimumTextField.getText());
			BETAMIN.close();
			FileWriter BETAMAX = new FileWriter("BETAMax.txt");
			BETAMAX.write(BetaPanel.maxTextField.getText());
			BETAMAX.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
