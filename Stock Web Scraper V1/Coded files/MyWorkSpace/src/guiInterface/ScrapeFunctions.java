package guiInterface;
import stockData.DataVariables;
import java.io.IOException;
import org.jsoup.*;

public interface ScrapeFunctions {

	public static void PriceScrape(){
		if(stockData.DataVariables.priceWebOption == 'A') {
			stockData.DataVariables.priceHTMLScrape = stockData.DataVariables.priceWebsite1 + stockData.DataVariables.currentPriceTicker;
		} else
		if(stockData.DataVariables.priceWebOption == 'B') {
			stockData.DataVariables.priceHTMLScrape = stockData.DataVariables.priceWebsite1 + stockData.DataVariables.currentPriceTicker + 
				   stockData.DataVariables.priceWebsite2;
		} else
		if(stockData.DataVariables.priceWebOption == 'C') {
			stockData.DataVariables.priceHTMLScrape = stockData.DataVariables.priceWebsite1 + stockData.DataVariables.currentPriceTicker + 
				   stockData.DataVariables.priceWebsite2 + stockData.DataVariables.currentPriceTicker +
				   stockData.DataVariables.priceWebsite3;
		}
		try {
			stockData.DataVariables.document = Jsoup.connect(stockData.DataVariables.priceHTMLScrape).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DataVariables.link = stockData.DataVariables.document.select(DataVariables.priceHTMLSourceCode).get(DataVariables.indexPrice);
		String linkText = DataVariables.link.text();
		DataVariables.priceResult = linkText;
	}
	
	
	public static void PEScrape(){
		if(stockData.DataVariables.PEWebOption == 'A') {
			stockData.DataVariables.PEHTMLScrape = stockData.DataVariables.PEWebsite1 + stockData.DataVariables.currentPETicker;
		} else
		if(stockData.DataVariables.PEWebOption == 'B') {
			stockData.DataVariables.PEHTMLScrape = stockData.DataVariables.PEWebsite1 + stockData.DataVariables.currentPETicker + 
				   stockData.DataVariables.PEWebsite2;
		} else
		if(stockData.DataVariables.PEWebOption == 'C') {
			stockData.DataVariables.PEHTMLScrape = stockData.DataVariables.PEWebsite1 + stockData.DataVariables.currentPETicker + 
				   stockData.DataVariables.PEWebsite2 + stockData.DataVariables.currentPETicker +
				   stockData.DataVariables.PEWebsite3;
		}
		try {
			stockData.DataVariables.document = Jsoup.connect(stockData.DataVariables.PEHTMLScrape).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DataVariables.link = stockData.DataVariables.document.select(DataVariables.PEHTMLSourceCode).get(DataVariables.indexPE);
		String linkText = DataVariables.link.text();
		DataVariables.PEResult = linkText;
	}
	
	public static void EPSScrape(){
		if(stockData.DataVariables.EPSWebOption == 'A') {
			stockData.DataVariables.EPSHTMLScrape = stockData.DataVariables.EPSWebsite1 + stockData.DataVariables.currentEPSTicker;
		} else
		if(stockData.DataVariables.EPSWebOption == 'B') {
			stockData.DataVariables.EPSHTMLScrape = stockData.DataVariables.EPSWebsite1 + stockData.DataVariables.currentEPSTicker + 
				   stockData.DataVariables.EPSWebsite2;
		} else
		if(stockData.DataVariables.EPSWebOption == 'C') {
			stockData.DataVariables.EPSHTMLScrape = stockData.DataVariables.EPSWebsite1 + stockData.DataVariables.currentEPSTicker + 
				   stockData.DataVariables.EPSWebsite2 + stockData.DataVariables.currentEPSTicker +
				   stockData.DataVariables.EPSWebsite3;
		}
		try {
			stockData.DataVariables.document = Jsoup.connect(stockData.DataVariables.EPSHTMLScrape).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DataVariables.link = stockData.DataVariables.document.select(DataVariables.EPSHTMLSourceCode).get(DataVariables.indexEPS);
		String linkText = DataVariables.link.text();
		DataVariables.EPSResult = linkText;
	}
	
	//BETA
	public static void BETAScrape(){
		if(stockData.DataVariables.BETAWebOption == 'A') {
			stockData.DataVariables.BETAHTMLScrape = stockData.DataVariables.BETAWebsite1 + stockData.DataVariables.currentBETATicker;
		} else
		if(stockData.DataVariables.BETAWebOption == 'B') {
			stockData.DataVariables.BETAHTMLScrape = stockData.DataVariables.BETAWebsite1 + stockData.DataVariables.currentBETATicker + 
				   stockData.DataVariables.BETAWebsite2;
		} else
		if(stockData.DataVariables.BETAWebOption == 'C') {
			stockData.DataVariables.BETAHTMLScrape = stockData.DataVariables.BETAWebsite1 + stockData.DataVariables.currentBETATicker + 
				   stockData.DataVariables.BETAWebsite2 + stockData.DataVariables.currentBETATicker +
				   stockData.DataVariables.BETAWebsite3;
		}
		try {
			stockData.DataVariables.document = Jsoup.connect(stockData.DataVariables.BETAHTMLScrape).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DataVariables.link = stockData.DataVariables.document.select(DataVariables.BETAHTMLSourceCode).get(DataVariables.indexBETA);
		String linkText = DataVariables.link.text();
		DataVariables.BETAResult = linkText;
	}
		
	
	
	//String HTML = 
}
