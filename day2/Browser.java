package week3.day2;

public class Browser {	
	//Method to open URL
	public void openURL() {
		System.out.println("URL opened");
	}
	//Method to close the browser
	public void closeBrowser() {
		System.out.println("Browser Closed");
	}
	//Method to navigate back
	public void navigateBack() {
		System.out.println("Navigated Back");
	}

	//Declaring global variables
	public String browserName;
	public String browserVersion;

	public static void main(String[] args) {
		
		//Creating object for Browser class
		Browser browser=new Browser();
		
		//Defining the variables 
		browser.browserName = "Browser";
		browser.browserVersion="1.0";
		
		//Printing the variables
		System.out.println("Browser Name: "+browser.browserName);
		System.out.println("Browser Version: "+browser.browserVersion);
		
		//Calling the methods
		browser.openURL();
		browser.navigateBack();
		browser.closeBrowser();

	}

}
