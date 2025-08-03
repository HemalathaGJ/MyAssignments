package week3.day2;

//Chrome class inherits Browser class
public class Chrome extends Browser{
	//Method to open chrome in incognito mode
	public void openIncognito() {
		System.out.println("Opened in Incognito mode");
	}
	//Method to clear the cache
	public void clearCache() {
		System.out.println("Cache cleared");
	}

	public static void main(String[] args) {
		//Creating object for Chrome class
		Chrome chromeBrowser=new Chrome();
		//Defining the variables
		chromeBrowser.browserName="Chrome";
		chromeBrowser.browserVersion="139.0.7258.66";
		//Printing the variables
		System.out.println("Browser Name : "+chromeBrowser.browserName);
		System.out.println("Browser Version : "+chromeBrowser.browserVersion);
		//calling both Chrome and Browser class methods	
		chromeBrowser.openURL();
		chromeBrowser.navigateBack();
		chromeBrowser.openIncognito();
		chromeBrowser.clearCache();
		chromeBrowser.closeBrowser();

	}

}
