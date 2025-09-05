package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountStepDefinition extends BaseClass{

	@When("Click on the Account displayed under Account List table")
	public void click_on_the_account_displayed_under_account_list_table() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr/td/div/a")).click();
	}

	@When("Click on the Edit button")
	public void click_on_the_edit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Edit")).click();
	}

	@When("Edit the Accountname as {string}")
	public void edit_the_accountname_as(String accName) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement acName = driver.findElement(By.xpath("//input[@id='accountName']"));
	    acName.clear();
	    acName.sendKeys(accName);
	}

	@When("Click on the Save button")
	public void click_on_the_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

	@Then("Account should be displayed with new Accountname")
	public void account_should_be_displayed_with_new_accountname() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Account editted");
	}



}
