package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateAccountPage extends BaseClass{
	@And("Enter the Accountname as {string}")
	public CreateAccountPage enterAccountNme(String accName) {
		
		getDriver().findElement(By.id("accountName")).sendKeys(accName);
		return this;

	}
	@When("Click on the Create Account button")
	public ViewAccountPage clickCreateAccountButton() {
		getDriver().findElement(By.xpath("//input[@type='submit']")).click();
		return new ViewAccountPage();

	}
	

}
