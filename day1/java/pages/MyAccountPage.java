package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyAccountPage extends BaseClass{
	
	@And("Click on the Create Account link")
	public CreateAccountPage clickCreateAccountLink() {
		getDriver().findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();

	}

}
