package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewAccountSalesforce {

	public ChromeDriver driver;
	String accountName;

	@Given("Launch the chrome browser")
	public void launch_the_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
	}

	@And("Load the Salesforce url")
	public void load_the_salesforce_url() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("Enter the username as bhuvanesh.moorthy@testleaf.com")
	public void enter_the_username_as_bhuvanesh_moorthy_testleaf_com() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("bhuvanesh.moorthy@testleaf.com");
	}

	@And("Enter the password")
	public void enter_the_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys("Test@2025");
	}

	@When("Click Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//div[@id='theloginform']//input[@id='Login']")).click();
	}

	@Then("should be able to login")
	public void should_be_able_to_login() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Logged in to Salesforce application successfully");
	}

	@And("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By
				.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']"))
				.click();
	}

	@And("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//lightning-input[@class='searchBar slds-form-element']")).sendKeys("Sales",
				Keys.ENTER);
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
	}

	@And("Click on Accounts tab")
	public void click_on_accounts_tab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement accountsTab = driver.findElement(By.xpath("//a/span[text()='Accounts']"));
		js.executeScript("arguments[0].click();", accountsTab);
	}

	@And("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//a[@title='New']/div[text()='New']")).click();
	}

	@And("Enter Hemalatha as account name")
	public void enter_hemalatha_as_account_name() {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[5]")).sendKeys("Hemalatha");
	}

	@And("Select Ownership as Public")
	public void select_ownership_as_public() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ownership = driver.findElement(By.xpath("(//div[@class='slds-form-element__control'])[6]"));
		js.executeScript("arguments[0].scrollIntoView();", ownership);
		Actions action = new Actions(driver);
		action.moveToElement(ownership).perform();
		action.click(ownership).perform();
		// js.executeScript("arguments[0].click();", ownership);
		driver.findElement(By.xpath("(//lightning-base-combobox-item)[2]//span[text()='Public']")).click();
	}

	@And("Click save and verify Account name")
	public void click_save_and_verify_account_name() {
		driver.findElement(By.xpath("(//lightning-button)[6]/button")).click();
		accountName = driver.findElement(By.xpath("(//div[@class='slds-media__body'])[10]//lightning-formatted-text"))
				.getText();
	}

	@Then("The Account name displayed in the screen should be Hemalatha")
	public void the_account_name_displayed_in_the_screen_should_be_hemalatha() {
		if (accountName.equalsIgnoreCase("Hemalatha")) {
			System.out.println("The account with name Hemalatha has been created");
		} else
			System.out.println("Account name is not Hemalatha");
	}
}
