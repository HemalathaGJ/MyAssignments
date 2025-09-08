package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {
	

	
@Then("It should be able to login")
public WelcomePage verifyLogin() {
	System.out.println("Login successful");
    return this;
}
@But("It throws error message")
public void verifyForWrongCredentials() {
	// TODO Auto-generated method stub

}

@When("Click on the CRMSFA link")
public MyHomePage clickCRMSFA() {
	getDriver().findElement(By.partialLinkText("CRM")).click();
	return new MyHomePage();
    }

}
