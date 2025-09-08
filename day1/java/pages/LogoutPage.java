package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LogoutPage extends BaseClass{
	@And("Click on the Logout link")
    public LogoutPage clickLogoutLink() {
		getDriver().findElement(By.linkText("Logout")).click();
		return this;
	}
	@Then("It should be able to logout")
	public void verifyLogout(){
		System.out.println("Logged out of Leaftaps application successfully");
	}
}
