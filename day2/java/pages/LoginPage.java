package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
	public LoginPage enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;

	}
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;

	}
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);

	}

}
