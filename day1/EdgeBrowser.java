package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser=new Browser();
		String launchBrowser = browser.launchBrowser("Edge");
		System.out.println(launchBrowser);
		browser.loadUrl();

	}

}
