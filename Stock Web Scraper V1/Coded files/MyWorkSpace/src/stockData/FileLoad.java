package stockData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public interface FileLoad {
	
	
	public static void loadFile() {
		try {
			//FileLoadStatus
			DataVariables.FilesCreated = false;
			FileReader FilesCreated = new FileReader("FileStatus.txt");
			int FilesCreateData = FilesCreated.read();
			while(FilesCreateData != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == FilesCreateData) {
						DataVariables.FilesCreatedString = DataVariables.characters[i];
					}
				}
				FilesCreateData = FilesCreated.read();
			}
			FilesCreated.close();
			if (DataVariables.FilesCreatedString == '1') {
				DataVariables.FilesCreated = true;
				System.out.println(DataVariables.FilesCreated);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readTotalTickers() {
		try {
			FileReader tickerReader = new FileReader("tickersListA.txt");
			int Data = tickerReader.read();
			while(Data != -1) {
				if(DataVariables.comma == Data) {
					DataVariables.totalTickers = DataVariables.totalTickers +1;
				} else if(DataVariables.semiColon == Data) {
					DataVariables.totalTickers = DataVariables.totalTickers +1;
				}
				Data = tickerReader.read();
			}
			tickerReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readTotalTickers2() {
		try {
			FileReader tickerReader2 = new FileReader("tickersListB.txt");
			int Data = tickerReader2.read();
			while(Data != -1) {
				if(DataVariables.comma == Data) {
					DataVariables.totalTickers2 = DataVariables.totalTickers2 +1;
				} else if(DataVariables.semiColon == Data) {
					DataVariables.totalTickers2 = DataVariables.totalTickers2 +1;
				}
				Data = tickerReader2.read();
			}
			tickerReader2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void tickerLoad() {
		DataVariables.tickerLoad = "";
		try {
			FileReader tickRead = new FileReader("tickersListA.txt");
			int data = tickRead.read();
			while(data != -1) {
				if(data == DataVariables.comma) {
					String replace = DataVariables.tickerLoad;
					DataVariables.tickerListA.add(replace);
					DataVariables.tickerLoad = "";
				} else {
					for(int i = 0; i < DataVariables.characters.length; i++) {
						if(DataVariables.characters[i] == data) {
							DataVariables.tickerLoad = DataVariables.tickerLoad + DataVariables.alphabetEquavalent[i];
						}
					}
				}
				data = tickRead.read();
			}
			tickRead.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public static void tickerLoad2() {
		DataVariables.tickerLoad2 = "";
		try {
			FileReader tickRead2 = new FileReader("tickersListB.txt");
			int data2 = tickRead2.read();
			while(data2 != -1) {
				if(data2 == DataVariables.comma) {
					String replace2 = DataVariables.tickerLoad2;
					DataVariables.tickerListB.add(replace2);
					DataVariables.tickerLoad2 = "";
				} else {
					for(int i = 0; i < DataVariables.characters.length; i++) {
						if(DataVariables.characters[i] == data2) {
							DataVariables.tickerLoad2 = DataVariables.tickerLoad2 + DataVariables.alphabetEquavalent[i];
						}
					}
				}
				data2 = tickRead2.read();
			}
			tickRead2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public static void tickerLoad3() {
		DataVariables.tickerLoad3 = "";
		try {
			FileReader tickRead3 = new FileReader("tickersListC.txt");
			int data3 = tickRead3.read();
			while(data3 != -1) {
				if(data3 == DataVariables.comma) {
					String replace3 = DataVariables.tickerLoad3;
					DataVariables.tickerListC.add(replace3);
					DataVariables.tickerLoad3 = "";
				} else {
					for(int i = 0; i < DataVariables.characters.length; i++) {
						if(DataVariables.characters[i] == data3) {
							DataVariables.tickerLoad3 = DataVariables.tickerLoad3 + DataVariables.alphabetEquavalent[i];
						}
					}
				}
				data3 = tickRead3.read();
			}
			tickRead3.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public static void websiteLoads() {
		try {
			FileReader web1Read = new FileReader("website1.txt");
			int data1 = web1Read.read();
			while(data1 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data1) {
						DataVariables.website1 = DataVariables.website1 + DataVariables.alphabetEquavalent[i];
					}
				}
				data1 = web1Read.read();
			}
			web1Read.close();
			
			FileReader web2Read = new FileReader("website2.txt");
			int data2 = web2Read.read();
			while(data2 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data2) {
						DataVariables.website2 = DataVariables.website2 + DataVariables.alphabetEquavalent[i];
					}
				}
				data2 = web2Read.read();
			}
			web2Read.close();
			
			FileReader web3Read = new FileReader("website3.txt");
			int data3 = web3Read.read();
			while(data3 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data3) {
						DataVariables.website3 = DataVariables.website3 + DataVariables.alphabetEquavalent[i];
					}
				}
				data3 = web3Read.read();
			}
			web3Read.close();
			
			FileReader web4Read = new FileReader("website4.txt");
			int data4 = web4Read.read();
			while(data4 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data4) {
						DataVariables.website4 = DataVariables.website4 + DataVariables.alphabetEquavalent[i];
					}
				}
				data4 = web4Read.read();
			}
			web4Read.close();
			
			FileReader web5Read = new FileReader("website5.txt");
			int data5 = web5Read.read();
			while(data5 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data5) {
						DataVariables.website5 = DataVariables.website5 + DataVariables.alphabetEquavalent[i];
					}
				}
				data5 = web5Read.read();
			}
			web5Read.close();
			
			FileReader web6Read = new FileReader("website6.txt");
			int data6 = web6Read.read();
			while(data6 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data6) {
						DataVariables.website6 = DataVariables.website6 + DataVariables.alphabetEquavalent[i];
					}
				}
				data6 = web6Read.read();
			}
			web6Read.close();
			
			FileReader web7Read = new FileReader("website7.txt");
			int data7 = web7Read.read();
			while(data7 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data7) {
						DataVariables.website7 = DataVariables.website7 + DataVariables.alphabetEquavalent[i];
					}
				}
				data7 = web7Read.read();
			}
			web7Read.close();
			
			FileReader web8Read = new FileReader("website8.txt");
			int data8 = web8Read.read();
			while(data8 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data8) {
						DataVariables.website8 = DataVariables.website8 + DataVariables.alphabetEquavalent[i];
					}
				}
				data8 = web8Read.read();
			}
			web8Read.close();
			
			FileReader web9Read = new FileReader("website9.txt");
			int data9 = web9Read.read();
			while(data9 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data9) {
						DataVariables.website9 = DataVariables.website9 + DataVariables.alphabetEquavalent[i];
					}
				}
				data9 = web9Read.read();
			}
			web9Read.close();
			
			FileReader web10Read = new FileReader("website10.txt");
			int data10 = web10Read.read();
			while(data10 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == data10) {
						DataVariables.website10 = DataVariables.website10 + DataVariables.alphabetEquavalent[i];
					}
				}
				data10 = web10Read.read();
			}
			web10Read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void settingsListLoads() {
		try {
			//Price Ticker List
			FileReader tickerPriceList = new FileReader("tickerPriceList.txt");
			int Data = tickerPriceList.read();
			while(Data != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data) {
					DataVariables.tickerPriceList = DataVariables.characters[i];
				}
			}
			Data = tickerPriceList.read();
			}
			tickerPriceList.close();
			
			//Price Web Option
			FileReader priceWebOptionFile = new FileReader("priceWebOption.txt");
			int Data2 = priceWebOptionFile.read();
			while(Data2 != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data2) {
					DataVariables.priceWebOption = DataVariables.characters[i];
				}
			}
			Data2 = priceWebOptionFile.read();
			}
			priceWebOptionFile.close();
			
			//PriceWebConstructor1
			DataVariables.priceWebsite1 = "";
			FileReader priceWebConstructor1 = new FileReader("priceWebsite1.txt");
			int Data3 = priceWebConstructor1.read();
			while(Data3 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data3) {
						DataVariables.priceWebsite1 = DataVariables.priceWebsite1 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data3 = priceWebConstructor1.read();
			}
			priceWebConstructor1.close();
			
			//PriceWebConstructor2
			DataVariables.priceWebsite2 = "";
			FileReader priceWebConstructor2 = new FileReader("priceWebsite2.txt");
			int Data4 = priceWebConstructor2.read();
			while(Data4 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data4) {
						DataVariables.priceWebsite2 = DataVariables.priceWebsite2 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data4 = priceWebConstructor2.read();
			}
			priceWebConstructor2.close();
			
			//PriceWebConstructor3
			DataVariables.priceWebsite3 = "";
			FileReader priceWebConstructor3 = new FileReader("priceWebsite3.txt");
			int Data5 = priceWebConstructor3.read();
			while(Data5 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data5) {
						DataVariables.priceWebsite3 = DataVariables.priceWebsite3 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data5 = priceWebConstructor3.read();
			}
			priceWebConstructor3.close();
			
			//PriceHTMLSourceLoad
			DataVariables.priceHTMLSourceCode = "";
			FileReader priceHTMLSourceLoad = new FileReader("priceHTMLSourceCode.txt");
			int Data6 = priceHTMLSourceLoad.read();
			while(Data6 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data6) {
						DataVariables.priceHTMLSourceCode = DataVariables.priceHTMLSourceCode + DataVariables.alphabetEquavalent[i];
					}
				}
				Data6 = priceHTMLSourceLoad.read();
			}
			priceHTMLSourceLoad.close();
			
			//PriceIndexSourceLoad
			DataVariables.indexPriceString = "";
			FileReader priceIndexSourceLoad = new FileReader("priceIndexSourceCode.txt");
			int Data7 = priceIndexSourceLoad.read();
			while(Data7 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data7) {
						DataVariables.indexPriceString = DataVariables.indexPriceString + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				Data7 = priceIndexSourceLoad.read();
			}
			priceIndexSourceLoad.close();
			DataVariables.indexPrice = Integer.parseInt(DataVariables.indexPriceString);
			
			
			//PE Ticker List
			FileReader tickerPEList = new FileReader("tickerPEList.txt");
			int Data8 = tickerPEList.read();
			while(Data8 != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data8) {
					DataVariables.tickerPEList = DataVariables.characters[i];
				}
			}
			Data8 = tickerPEList.read();
			}
			tickerPEList.close();
			
			//PE Web Option
			FileReader PEWebOptionFile = new FileReader("PEWebOption.txt");
			int Data9 = PEWebOptionFile.read();
			while(Data9 != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data9) {
					DataVariables.PEWebOption = DataVariables.characters[i];
				}
			}
			Data9 = PEWebOptionFile.read();
			}
			PEWebOptionFile.close();
			
			//PEWebConstructor1
			DataVariables.PEWebsite1 = "";
			FileReader PEWebConstructor1 = new FileReader("PEWebsite1.txt");
			int Data10 = PEWebConstructor1.read();
			while(Data10 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data10) {
						DataVariables.PEWebsite1 = DataVariables.PEWebsite1 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data10 = PEWebConstructor1.read();
			}
			PEWebConstructor1.close();
			
			//PEWebConstructor2
			DataVariables.PEWebsite2 = "";
			FileReader PEWebConstructor2 = new FileReader("PEWebsite2.txt");
			int Data11 = PEWebConstructor2.read();
			while(Data11 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data11) {
						DataVariables.PEWebsite2 = DataVariables.PEWebsite2 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data11 = PEWebConstructor2.read();
			}
			PEWebConstructor2.close();
			
			//PEWebConstructor3
			DataVariables.PEWebsite3 = "";
			FileReader PEWebConstructor3 = new FileReader("PEWebsite3.txt");
			int Data12 = PEWebConstructor3.read();
			while(Data12 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data12) {
						DataVariables.PEWebsite3 = DataVariables.PEWebsite3 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data12 = PEWebConstructor3.read();
			}
			PEWebConstructor3.close();
			
			//PEHTMLSourceLoad
			DataVariables.PEHTMLSourceCode = "";
			FileReader PEHTMLSourceLoad = new FileReader("PEHTMLSourceCode.txt");
			int Data13 = PEHTMLSourceLoad.read();
			while(Data13 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data13) {
						DataVariables.PEHTMLSourceCode = DataVariables.PEHTMLSourceCode + DataVariables.alphabetEquavalent[i];
					}
				}
				Data13 = PEHTMLSourceLoad.read();
			}
			PEHTMLSourceLoad.close();
			
			//PEIndexSourceLoad
			DataVariables.indexPEString = "";
			FileReader PEIndexSourceLoad = new FileReader("PEIndexSourceCode.txt");
			int Data14 = PEIndexSourceLoad.read();
			while(Data14 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data14) {
						DataVariables.indexPEString = DataVariables.indexPEString + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				Data14 = PEIndexSourceLoad.read();
			}
			PEIndexSourceLoad.close();
			DataVariables.indexPE = Integer.parseInt(DataVariables.indexPEString);
			
			//PEParametersMinLoad
			DataVariables.PEMinimum = "";
			FileReader PEIminParLoad = new FileReader("PEMin.txt");
			int PEMINData = PEIminParLoad.read();
			while(PEMINData != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == PEMINData) {
						DataVariables.PEMinimum = DataVariables.PEMinimum + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				PEMINData = PEIminParLoad.read();
			}
			PEIminParLoad.close();
			
			//PEParametersMaxLoad
			DataVariables.PEMaximum = "";
			FileReader PEIMaxParLoad = new FileReader("PEMax.txt");
			int PEMaxData = PEIMaxParLoad.read();
			while(PEMaxData != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == PEMaxData) {
						DataVariables.PEMaximum = DataVariables.PEMaximum + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				PEMaxData = PEIMaxParLoad.read();
			}
			PEIMaxParLoad.close();
			
			
			
			//EPS
			//EPS Ticker List
			FileReader tickerEPSList = new FileReader("tickerEPSList.txt");
			int Data15 = tickerEPSList.read();
			while(Data15 != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data15) {
					DataVariables.tickerEPSList = DataVariables.characters[i];
				}
			}
			Data15 = tickerEPSList.read();
			}
			tickerEPSList.close();
			
			//EPS Web Option
			FileReader EPSWebOptionFile = new FileReader("EPSWebOption.txt");
			int Data16 = EPSWebOptionFile.read();
			while(Data16 != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data16) {
					DataVariables.EPSWebOption = DataVariables.characters[i];
				}
			}
			Data16 = EPSWebOptionFile.read();
			}
			EPSWebOptionFile.close();
			
			//EPSWebConstructor1
			DataVariables.EPSWebsite1 = "";
			FileReader EPSWebConstructor1 = new FileReader("EPSWebsite1.txt");
			int Data17 = EPSWebConstructor1.read();
			while(Data17 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data17) {
						DataVariables.EPSWebsite1 = DataVariables.EPSWebsite1 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data17 = EPSWebConstructor1.read();
			}
			EPSWebConstructor1.close();
			
			//EPSWebConstructor2
			DataVariables.EPSWebsite2 = "";
			FileReader EPSWebConstructor2 = new FileReader("EPSWebsite2.txt");
			int Data18 = EPSWebConstructor2.read();
			while(Data18 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data18) {
						DataVariables.EPSWebsite2 = DataVariables.EPSWebsite2 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data18 = EPSWebConstructor2.read();
			}
			EPSWebConstructor2.close();
			
			//EPSWebConstructor3
			DataVariables.EPSWebsite3 = "";
			FileReader EPSWebConstructor3 = new FileReader("EPSWebsite3.txt");
			int Data19 = EPSWebConstructor3.read();
			while(Data19 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data19) {
						DataVariables.EPSWebsite3 = DataVariables.EPSWebsite3 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data19 = EPSWebConstructor3.read();
			}
			EPSWebConstructor3.close();
			
			//EPSHTMLSourceLoad
			DataVariables.EPSHTMLSourceCode = "";
			FileReader EPSHTMLSourceLoad = new FileReader("EPSHTMLSourceCode.txt");
			int Data20 = EPSHTMLSourceLoad.read();
			while(Data20 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data20) {
						DataVariables.EPSHTMLSourceCode = DataVariables.EPSHTMLSourceCode + DataVariables.alphabetEquavalent[i];
					}
				}
				Data20 = EPSHTMLSourceLoad.read();
			}
			EPSHTMLSourceLoad.close();
			
			//EPSIndexSourceLoad
			DataVariables.indexEPSString = "";
			FileReader EPSIndexSourceLoad = new FileReader("EPSIndexSourceCode.txt");
			int Data21 = EPSIndexSourceLoad.read();
			while(Data21 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data21) {
						DataVariables.indexEPSString = DataVariables.indexEPSString + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				Data21 = EPSIndexSourceLoad.read();
			}
			EPSIndexSourceLoad.close();
			DataVariables.indexEPS = Integer.parseInt(DataVariables.indexEPSString);
			
			//EPSParametersMinLoad
			DataVariables.EPSMinimum = "";
			FileReader EPSIminParLoad = new FileReader("EPSMin.txt");
			int EPSMINData = EPSIminParLoad.read();
			while(EPSMINData != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == EPSMINData) {
						DataVariables.EPSMinimum = DataVariables.EPSMinimum + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				EPSMINData = EPSIminParLoad.read();
			}
			EPSIminParLoad.close();
			
			//EPSParametersMaxLoad
			DataVariables.EPSMaximum = "";
			FileReader EPSIMaxParLoad = new FileReader("EPSMax.txt");
			int EPSMaxData = EPSIMaxParLoad.read();
			while(EPSMaxData != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == EPSMaxData) {
						DataVariables.EPSMaximum = DataVariables.EPSMaximum + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				EPSMaxData = EPSIMaxParLoad.read();
			}
			EPSIMaxParLoad.close();
			
			//BETA
			//BETA Ticker List
			FileReader tickerBETAList = new FileReader("tickerBETAList.txt");
			int Data22 = tickerBETAList.read();
			while(Data22 != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data22) {
					DataVariables.tickerBETAList = DataVariables.characters[i];
				}
			}
			Data22 = tickerBETAList.read();
			}
			tickerBETAList.close();
			
			//BETA Web Option
			FileReader BETAWebOptionFile = new FileReader("BETAWebOption.txt");
			int Data23 = BETAWebOptionFile.read();
			while(Data23 != -1) {
			for(int i = 0; i < DataVariables.characters.length; i++) {
				if(DataVariables.characters[i] == Data23) {
					DataVariables.BETAWebOption = DataVariables.characters[i];
				}
			}
			Data23 = BETAWebOptionFile.read();
			}
			BETAWebOptionFile.close();
			
			//BETAWebConstructor1
			DataVariables.BETAWebsite1 = "";
			FileReader BETAWebConstructor1 = new FileReader("BETAWebsite1.txt");
			int Data24 = BETAWebConstructor1.read();
			while(Data24 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data24) {
						DataVariables.BETAWebsite1 = DataVariables.BETAWebsite1 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data24 = BETAWebConstructor1.read();
			}
			BETAWebConstructor1.close();
			
			//BETAWebConstructor2
			DataVariables.BETAWebsite2 = "";
			FileReader BETAWebConstructor2 = new FileReader("BETAWebsite2.txt");
			int Data25 = BETAWebConstructor2.read();
			while(Data25 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data25) {
						DataVariables.BETAWebsite2 = DataVariables.BETAWebsite2 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data25 = BETAWebConstructor2.read();
			}
			BETAWebConstructor2.close();
			
			//BETAWebConstructor3
			DataVariables.BETAWebsite3 = "";
			FileReader BETAWebConstructor3 = new FileReader("BETAWebsite3.txt");
			int Data26 = BETAWebConstructor3.read();
			while(Data26 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data26) {
						DataVariables.BETAWebsite3 = DataVariables.BETAWebsite3 + DataVariables.alphabetEquavalent[i];
					}
				}
				Data26 = BETAWebConstructor3.read();
			}
			BETAWebConstructor3.close();
			
			//BETAHTMLSourceLoad
			DataVariables.BETAHTMLSourceCode = "";
			FileReader BETAHTMLSourceLoad = new FileReader("BETAHTMLSourceCode.txt");
			int Data27 = BETAHTMLSourceLoad.read();
			while(Data27 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data27) {
						DataVariables.BETAHTMLSourceCode = DataVariables.BETAHTMLSourceCode + DataVariables.alphabetEquavalent[i];
					}
				}
				Data27 = BETAHTMLSourceLoad.read();
			}
			BETAHTMLSourceLoad.close();
			
			//BETAIndexSourceLoad
			DataVariables.indexBETAString = "";
			FileReader BETAIndexSourceLoad = new FileReader("BETAIndexSourceCode.txt");
			int Data28 = BETAIndexSourceLoad.read();
			while(Data28 != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == Data28) {
						DataVariables.indexBETAString = DataVariables.indexBETAString + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				Data28 = BETAIndexSourceLoad.read();
			}
			BETAIndexSourceLoad.close();
			DataVariables.indexBETA = Integer.parseInt(DataVariables.indexBETAString);
			
			//BETAParametersMinLoad
			DataVariables.BETAMinimum = "";
			FileReader BETAIminParLoad = new FileReader("BETAMin.txt");
			int BETAMINData = BETAIminParLoad.read();
			while(BETAMINData != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == BETAMINData) {
						DataVariables.BETAMinimum = DataVariables.BETAMinimum + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				BETAMINData = BETAIminParLoad.read();
			}
			BETAIminParLoad.close();
			
			//BETAParametersMaxLoad
			DataVariables.BETAMaximum = "";
			FileReader BETAIMaxParLoad = new FileReader("BETAMax.txt");
			int BETAMaxData = BETAIMaxParLoad.read();
			while(BETAMaxData != -1) {
				for(int i = 0; i < DataVariables.characters.length; i++) {
					if(DataVariables.characters[i] == BETAMaxData) {
						DataVariables.BETAMaximum = DataVariables.BETAMaximum + DataVariables.alphabetEquavalent[i]  ;
					}
				}
				BETAMaxData = BETAIMaxParLoad.read();
			}
			BETAIMaxParLoad.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Settings load error");
		}
		
		
	}
}
