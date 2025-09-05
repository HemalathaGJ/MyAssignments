package steps;

import org.openqa.selenium.By;

//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition extends BaseClass{

	/*@Given("Enter the username as {string}")
	public void enter_the_username_as(String uname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(pwd);
	}*/

	@When("Click on the CRMSFA link")
	public void click_on_the_crmsfa_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("CRM")).click();
	}

	@When("Click on the Accounts link")
	public void click_on_the_accounts_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Accounts")).click();
	}

	@When("Click on the Create Account link")
	public void click_on_the_create_account_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Create Account")).click();
	}

	@When("Enter the Accountname as {string}")
	public void enter_the_accountname_as(String accName) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("accountName")).sendKeys(accName);
	}

	@When("Click on the Create Account button")
	public void click_on_the_create_account_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Account should be created")
	public void account_should_be_created() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Account is created");
	}



}
