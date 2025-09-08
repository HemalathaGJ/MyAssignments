package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {	
	
@And("Enter the username as {string}")
	public LoginPage enterUsername(String username) {
	getDriver().findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		return this;
	}
@And("Enter the password as {string}")
	public LoginPage enterPassword(String password) {
	getDriver().findElement(By.id("password")).sendKeys(password);
		return this;
	}
@When("Click on the Login button")
	public WelcomePage clickLoginButton() {
	getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
