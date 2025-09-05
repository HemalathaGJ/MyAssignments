package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccountStepDefinition extends BaseClass{
	@When("Click on the Deactivate Account button")
	public void click_on_the_deactivate_account_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.linkText("Deactivate Account")).click();
	}

	@When("Click on the Ok button in the alert message box")
	public void click_on_the_ok_button_in_the_alert_message_box() {
	    // Write code here that turns the phrase above into concrete actions
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.accept();
	}

	@Then("Account should be deactivated with the confirmation message")
	public void account_should_be_deactivated_with_the_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    String msg=driver.findElement(By.xpath("//span[@class='subSectionWarning']")).getText();
	    System.out.println("Account deactivated with the message: "+msg);
	}



}
