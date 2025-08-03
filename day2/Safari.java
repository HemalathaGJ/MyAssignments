package week3.day2;

//Safari class inherits Browser class
public class Safari extends Browser{
	//Method to open Safari in reader mode
	public void readerMode() {
		System.out.println("In reader mode");
	}
	//Method to open Safari in full screen mode
	public void fullScreenMode() {
		System.out.println("In full screen mode");
	}


public static void main(String[] args) {
		//Creating object for Safari class
		Safari safariBrowser=new Safari();
		//Defining super class variables
		safariBrowser.browserName="Safari";
		safariBrowser.browserVersion="18.4";
		//Printing the variables
		System.out.println("Browser Name: "+safariBrowser.browserName);
		System.out.println("Browser Version: "+safariBrowser.browserVersion);
		//Calling both Safari class and Browser class methods 
		safariBrowser.openURL();
		safariBrowser.navigateBack();
		safariBrowser.readerMode();
		safariBrowser.fullScreenMode();
		safariBrowser.closeBrowser();

	}

}
