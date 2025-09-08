package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyHomePage extends BaseClass {
	

	@And("Click on the Leads link")
public MyLeadsPage clickLeadsLink() {
		getDriver().findElement(By.linkText("Leads")).click();
	return new MyLeadsPage();
    }
	@And("Click on the Accounts link")
	public MyAccountPage clickAccountsLink() {
		getDriver().findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}

}
