package pages;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class ViewAccountPage extends BaseClass{
	@Then("Account should be created")
	public LogoutPage verifyAccount() {
		System.out.println("Account is created");
		return new LogoutPage();

	}

}
