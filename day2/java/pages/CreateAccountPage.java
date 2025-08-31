package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateAccountPage enterAccountNme(String accName) {
		
		driver.findElement(By.id("accountName")).sendKeys(accName);
		return this;

	}
	public ViewAccountPage clickCreateAccountButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		return new ViewAccountPage(driver);

	}
	

}
