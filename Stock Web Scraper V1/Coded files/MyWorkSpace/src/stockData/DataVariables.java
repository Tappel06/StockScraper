package stockData;

import java.util.ArrayList;

import guiInterface.ScrapeFunctions;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class DataVariables implements FileLoad, ScrapeFunctions{
	
	//SystemRun
	public static boolean SystemSearchSwitch = false;
	public static boolean SystemRun = true;
	public static boolean SystemLoad = true;
	public static boolean FilesCreated = false;
	public static char FilesCreatedString;
	
	//TICKERS
	public static ArrayList<String> tickerListA = new ArrayList<String>();
	public static ArrayList<String> tickerListB = new ArrayList<String>();
	public static ArrayList<String> tickerListC = new ArrayList<String>();
	public static String tickerFileSaver;
	public static String tickerFileSaver2;
	public static String tickerFileSaver3;
	
	
	//WEBSITES
	public static String website1 = "";
	public static String website2 = "";
	public static String website3 = "";
	public static String website4 = "";
	public static String website5 = "";
	public static String website6 = "";
	public static String website7 = "";
	public static String website8 = "";
	public static String website9 = "";
	public static String website10 = "";
	
	//LINKCONSTRUCTORS
	public static String priceScrapeLink = "";
	public static String priceWebLink = "";
	public static String PEScrapeLink = "";
	public static String PEWebLink = "";
	public static String EPSScrapeLink = "";
	public static String EPSWebLink = "";
	public static String BETAScrapeLink = "";
	public static String BETAWebLink = "";
	
	//ADD AND REMOVE STOCKS
	public static String addStockField = "";
	
	//Load Data
	public static final char[] characters = {'a', 'b' , 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			 								 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
			 								 ' ', '-', '\'', '.','/', ':', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	public static final String[] alphabetEquavalent = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
											 "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
											 " ", "-", "'", ".", "/", ":", "?", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	public static final char comma = ',';
	public static final char semiColon = ';';
	public static String tickerLoad;
	public static String tickerLoad2;
	public static String tickerLoad3;
	public static int totalTickers;
	public static int totalTickers2;
	public static int totalTickers3;
	
	//PricePanel
	public static char tickerPriceList;
	public static char priceWebOption;
	public static String priceWebsite1 = "";
	public static String priceWebsite2 = "";
	public static String priceWebsite3 = "";
	public static String priceHTMLSourceCode = "";
	public static String indexPriceString = "";
	public static int indexPrice;
	
	//PEPanel
	public static char tickerPEList;
	public static char PEWebOption;
	public static String PEWebsite1 = "";
	public static String PEWebsite2 = "";
	public static String PEWebsite3 = "";
	public static String PEHTMLSourceCode = "";
	public static String indexPEString = "";
	public static int indexPE;
	public static String PEMinimum;
	public static String PEMaximum;
	
	//EPSPanel
	public static char tickerEPSList;
	public static char EPSWebOption;
	public static String EPSWebsite1 = "";
	public static String EPSWebsite2 = "";
	public static String EPSWebsite3 = "";
	public static String EPSHTMLSourceCode = "";
	public static String indexEPSString = "";
	public static int indexEPS;
	public static String EPSMinimum;
	public static String EPSMaximum;
	
	//BETAPanel
	public static char tickerBETAList;
	public static char BETAWebOption;
	public static String BETAWebsite1 = "";
	public static String BETAWebsite2 = "";
	public static String BETAWebsite3 = "";
	public static String BETAHTMLSourceCode = "";
	public static String indexBETAString = "";
	public static int indexBETA;
	public static String BETAMinimum;
	public static String BETAMaximum;
	
	//ScrapeData
	public static Document document;
	public static String docConvert;
	public static Document parsing;
	public static Element link;
	
	//StockDetails
	public static String currentPriceTicker;
	public static String priceResult;
	public static String priceHTMLScrape = "";
	
	public static String currentPETicker;
	public static String PEResult;
	public static String PEHTMLScrape = "";
	
	public static String currentEPSTicker;
	public static String EPSResult;
	public static String EPSHTMLScrape = "";
	
	public static String currentBETATicker;
	public static String BETAResult;
	public static String BETAHTMLScrape = "";
	


}
