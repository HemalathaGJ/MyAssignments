package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass {
	

@Given("Enter the Companyname as {string}")
	public CreateLeadPage enterCompanyName(String cName) {
	getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
        return this;
	}
	
@And("Enter the Firstname as {string}")
public CreateLeadPage enterFirstname(String fName) {
	getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
    return this;
	}

@And("Enter the lastname as {string}")
public CreateLeadPage enterLastname(String lName) {
	
	getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	return this;
}
@When("Click on the CreateLead button")
public ViewLeadPage clickCreateLeadButton() {
	getDriver().findElement(By.name("submitButton")).click();
	return new ViewLeadPage();

}
	
	
}
