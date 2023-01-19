package guiInterface;

public class Thread1 extends Thread {

	@Override
	public void run() {
		StockAnalysisPanel.progressBar.setValue(30);
	}
}
