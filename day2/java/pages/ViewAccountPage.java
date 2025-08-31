package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods{
	public ViewAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LogoutPage verifyAccount() {
		System.out.println("Account is created");
		return new LogoutPage(driver);

	}

}
