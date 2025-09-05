package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceLogin extends BaseClassSalesforce{

	@Given("Enter username (.*)$")
	public void enter_username(String uname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@And("Enter password (.*)$")
	public void enter_password(String pwd) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@Given("Enter uname {string}")
	public void enter_uname(String uname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@And("Enter pword {string}")
	public void enter_pword(String pwd) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(pwd);
	}


	@When("Click Login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//div[@id='theloginform']//input[@id='Login']")).click();
	}

	@Then("should be able to login")
	public void should_be_able_to_login() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in to Salesforce application successfully");
	}

}
