package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LogoutPage extends ProjectSpecificMethods{
    public LogoutPage(ChromeDriver driver) {
    	this.driver=driver;
		
	}
    public void clickLogoutLink() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logged out from Leaftaps application");

	}
}
