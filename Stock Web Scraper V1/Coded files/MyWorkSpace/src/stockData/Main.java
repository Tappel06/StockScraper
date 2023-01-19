package stockData;
import guiInterface.*;

public class Main extends mainFrame{

	
	public static void main(String[] args) {

		FileLoad.loadFile();
		if(DataVariables.FilesCreated == false) {
			System.out.println("Create");
			FileCreateEngine.FileCreate();
		}
		
		FileLoad.tickerLoad3();
		FileLoad.tickerLoad2();
		FileLoad.tickerLoad();
		FileLoad.websiteLoads();
		FileLoad.settingsListLoads();
		mainFrame.MainFrame();
		

	}
}
