package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyLeadsPage extends BaseClass {
	

	@And("Click on the CreateLead link")
public CreateLeadPage clickCreateLeadLink() {
		getDriver().findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage();
    }

}
