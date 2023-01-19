package stockData;

import java.io.FileWriter;
import java.io.IOException;

public interface FileCreateEngine {

	public static void FileCreate() {
		tickerSaveFile();
		tickerSaveFile2();
		tickerSaveFile3();
		Web1Save();
		Web2Save();
		Web3Save();
		Web4Save();
		Web5Save();
		Web6Save();
		Web7Save();
		Web8Save();
		Web9Save();
		Web10Save();
		tickerPriceListSave();
		priceWebOptionSave();
		priceWebConstructorSave1();
		priceWebConstructorSave2();
		priceWebConstructorSave3();
		priceHTMLSourceSave();
		priceIndexSourceSave();
		tickerPEListSave();
		PEWebOptionSave();
		PEWebConstructorSave1();
		PEWebConstructorSave2();
		PEWebConstructorSave3();
		PEHTMLSourceSave();
		PEIndexSourceSave();
		PEParametersSave();
		tickerEPSListSave();
		EPSWebOptionSave();
		EPSWebConstructorSave1();
		EPSWebConstructorSave2();
		EPSWebConstructorSave3();
		EPSHTMLSourceSave();
		EPSIndexSourceSave();
		FileCreator();
		EPSParametersSave();
		tickerBETAListSave();
		BETAWebOptionSave();
		BETAWebConstructorSave3();
		BETAHTMLSourceSave();
		BETAIndexSourceSave();
		BETAParametersSave();

	}
	
	public static void tickerSaveFile() {
		DataVariables.tickerFileSaver = "";
		for(int i = 0; i < DataVariables.tickerListA.size();i++) {
			DataVariables.tickerFileSaver = DataVariables.tickerFileSaver + DataVariables.tickerListA.get(i) + ",";
		}
		
		try {
			FileWriter tickerFileWriter = new FileWriter("tickersListA.txt");
			tickerFileWriter.write("");
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
			tickerFileWriter2.write("");
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
			tickerFileWriter3.write("");
			tickerFileWriter3.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web1Save() {
		try {
			FileWriter Web1File = new FileWriter("website1.txt");
			Web1File.write("");
			Web1File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void Web2Save() {
		try {
			FileWriter Web2File = new FileWriter("website2.txt");
			Web2File.write("");
			Web2File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web3Save() {
		try {
			FileWriter Web3File = new FileWriter("website3.txt");
			Web3File.write("");
			Web3File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web4Save() {
		try {
			FileWriter Web4File = new FileWriter("website4.txt");
			Web4File.write("");
			Web4File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web5Save() {
		try {
			FileWriter Web5File = new FileWriter("website5.txt");
			Web5File.write("");
			Web5File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web6Save() {
		try {
			FileWriter Web6File = new FileWriter("website6.txt");
			Web6File.write("");
			Web6File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web7Save() {
		try {
			FileWriter Web7File = new FileWriter("website7.txt");
			Web7File.write("");
			Web7File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web8Save() {
		try {
			FileWriter Web8File = new FileWriter("website8.txt");
			Web8File.write("");
			Web8File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web9Save() {
		try {
			FileWriter Web9File = new FileWriter("website9.txt");
			Web9File.write("");
			Web9File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Web10Save() {
		try {
			FileWriter Web10File = new FileWriter("website10.txt");
			Web10File.write("");
			Web10File.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tickerPriceListSave() {
		try {
			FileWriter TPLS = new FileWriter("tickerPriceList.txt");
			TPLS.write("");
			TPLS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void priceWebOptionSave() {
		try {
			FileWriter PWOS = new FileWriter("priceWebOption.txt");
			PWOS.write("");
			PWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void priceWebConstructorSave1() {
		try {
			FileWriter PWCS1 = new FileWriter("priceWebsite1.txt");
			PWCS1.write("");
			PWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void priceWebConstructorSave2() {
		try {
			FileWriter PWCS1 = new FileWriter("priceWebsite1.txt");
			PWCS1.write("");
			PWCS1.close();
			FileWriter PWCS2 = new FileWriter("priceWebsite2.txt");
			PWCS2.write("");
			PWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void priceWebConstructorSave3() {
		try {
			FileWriter PWCS1 = new FileWriter("priceWebsite1.txt");
			PWCS1.write("");
			PWCS1.close();
			FileWriter PWCS2 = new FileWriter("priceWebsite2.txt");
			PWCS2.write("");
			PWCS2.close();
			FileWriter PWCS3 = new FileWriter("priceWebsite3.txt");
			PWCS3.write("");
			PWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void priceHTMLSourceSave() {
		try {
			FileWriter PHTMLSS = new FileWriter("priceHTMLSourceCode.txt");
			PHTMLSS.write("");
			PHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void priceIndexSourceSave() {
		try {
			FileWriter PISS = new FileWriter("priceIndexSourceCode.txt");
			PISS.write("0");
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
			TPELS.write("");
			TPELS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebOptionSave() {
		try {
			FileWriter PEWOS = new FileWriter("PEWebOption.txt");
			PEWOS.write("");
			PEWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebConstructorSave1() {
		try {
			FileWriter PEWCS1 = new FileWriter("PEWebsite1.txt");
			PEWCS1.write("");
			PEWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebConstructorSave2() {
		try {
			FileWriter PEWCS1 = new FileWriter("PEWebsite1.txt");
			PEWCS1.write("");
			PEWCS1.close();
			FileWriter PEWCS2 = new FileWriter("PEWebsite2.txt");
			PEWCS2.write("");
			PEWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEWebConstructorSave3() {
		try {
			FileWriter PEWCS1 = new FileWriter("PEWebsite1.txt");
			PEWCS1.write("");
			PEWCS1.close();
			FileWriter PEWCS2 = new FileWriter("PEWebsite2.txt");
			PEWCS2.write("");
			PEWCS2.close();
			FileWriter PEWCS3 = new FileWriter("PEWebsite3.txt");
			PEWCS3.write("");
			PEWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void PEHTMLSourceSave() {
		try {
			FileWriter PEHTMLSS = new FileWriter("PEHTMLSourceCode.txt");
			PEHTMLSS.write("");
			PEHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void PEIndexSourceSave() {
		try {
			FileWriter PISS = new FileWriter("PEIndexSourceCode.txt");
			PISS.write("0");
			PISS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void PEParametersSave() {
		try {
			FileWriter PEMIN = new FileWriter("PEMin.txt");
			PEMIN.write("");
			PEMIN.close();
			FileWriter PEMAX = new FileWriter("PEMax.txt");
			PEMAX.write("");
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
			TEPSLS.write("");
			TEPSLS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebOptionSave() {
		try {
			FileWriter EPSWOS = new FileWriter("EPSWebOption.txt");
			EPSWOS.write("");
			EPSWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebConstructorSave1() {
		try {
			FileWriter EPSWCS1 = new FileWriter("EPSWebsite1.txt");
			EPSWCS1.write("");
			EPSWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebConstructorSave2() {
		try {
			FileWriter EPSWCS1 = new FileWriter("EPSWebsite1.txt");
			EPSWCS1.write("");
			EPSWCS1.close();
			FileWriter EPSWCS2 = new FileWriter("EPSWebsite2.txt");
			EPSWCS2.write("");
			EPSWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSWebConstructorSave3() {
		try {
			FileWriter EPSWCS1 = new FileWriter("EPSWebsite1.txt");
			EPSWCS1.write("");
			EPSWCS1.close();
			FileWriter EPSWCS2 = new FileWriter("EPSWebsite2.txt");
			EPSWCS2.write("");
			EPSWCS2.close();
			FileWriter EPSWCS3 = new FileWriter("EPSWebsite3.txt");
			EPSWCS3.write("");
			EPSWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void EPSHTMLSourceSave() {
		try {
			FileWriter EPSHTMLSS = new FileWriter("EPSHTMLSourceCode.txt");
			EPSHTMLSS.write("");
			EPSHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void EPSIndexSourceSave() {
		try {
			FileWriter EPSISS = new FileWriter("EPSIndexSourceCode.txt");
			EPSISS.write("0");
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
			EPSMIN.write("");
			EPSMIN.close();
			FileWriter EPSMAX = new FileWriter("EPSMax.txt");
			EPSMAX.write("");
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
			TBETALS.write("");
			TBETALS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebOptionSave() {
		try {
			FileWriter BETAWOS = new FileWriter("BETAWebOption.txt");
			BETAWOS.write("");
			BETAWOS.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebConstructorSave1() {
		try {
			FileWriter BETAWCS1 = new FileWriter("BETAWebsite1.txt");
			BETAWCS1.write("");
			BETAWCS1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebConstructorSave2() {
		try {
			FileWriter BETAWCS1 = new FileWriter("BETAWebsite1.txt");
			BETAWCS1.write("");
			BETAWCS1.close();
			FileWriter BETAWCS2 = new FileWriter("BETAWebsite2.txt");
			BETAWCS2.write("");
			BETAWCS2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAWebConstructorSave3() {
		try {
			FileWriter BETAWCS1 = new FileWriter("BETAWebsite1.txt");
			BETAWCS1.write("");
			BETAWCS1.close();
			FileWriter BETAWCS2 = new FileWriter("BETAWebsite2.txt");
			BETAWCS2.write("");
			BETAWCS2.close();
			FileWriter BETAWCS3 = new FileWriter("BETAWebsite3.txt");
			BETAWCS3.write("");
			BETAWCS3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void BETAHTMLSourceSave() {
		try {
			FileWriter BETAHTMLSS = new FileWriter("BETAHTMLSourceCode.txt");
			BETAHTMLSS.write("");
			BETAHTMLSS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void BETAIndexSourceSave() {
		try {
			FileWriter BETAISS = new FileWriter("BETAIndexSourceCode.txt");
			BETAISS.write("0");
			BETAISS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void BETAParametersSave() {
		try {
			FileWriter BETAMIN = new FileWriter("BETAMin.txt");
			BETAMIN.write("");
			BETAMIN.close();
			FileWriter BETAMAX = new FileWriter("BETAMax.txt");
			BETAMAX.write("");
			BETAMAX.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
