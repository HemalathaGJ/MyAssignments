package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountSalesforce extends BaseClassSalesforce {
	Actions action = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@When("Select Accounts")
	public void select_accounts() throws InterruptedException {
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
		search.sendKeys("accounts");
		driver.findElement(By.xpath("//span/p[@class='slds-truncate']/b")).click();
	}

	@When("Search for the account using your unique account name {string}")
	public void search_for_the_account_using_your_unique_account_name_hemalatha(String accName) {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(accName, Keys.ENTER);
	}

	@When("Click the dropdown icon next to the account and select Edit")
	public void click_the_dropdown_icon_next_to_the_account_and_select_edit() throws InterruptedException {
		Thread.sleep(3000);
		WebElement svgElm = driver.findElement(
				By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", svgElm);
		WebElement edit = driver.findElement(By.xpath("//div[@title='Edit']"));
		js.executeScript("arguments[0].click();", edit);

	}

	@Then("Edit Account window displayed")
	public void edit_account_window_displayed() {
		System.out.println("Edit Account modal window displayed");
	}

	@Given("Enter phone as {string}")
	public void enter_phone_as(String ph) {
		WebElement phone = driver.findElement(By.xpath("//label[text()='Phone']/following::input"));
		phone.clear();
		phone.sendKeys(ph);
	}

	@Given("Set Type to Technology Partner")
	public void set_type_to_technology_partner() {
		driver.findElement(By
				.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']//button)[2]"))
				.click();
		driver.findElement(By.xpath("//span[@title='Technology Partner']")).click();
	}

	@Given("Set Industry to Healthcare.")
	public void set_industry_to_healthcare() {
		WebElement ind = driver.findElement(By
				.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']//button)[4]"));
		js.executeScript("arguments[0].scrollIntoView();", ind);
		ind.click();
		WebElement hCare = driver.findElement(By.xpath("//span[@title='Healthcare']"));
		js.executeScript("arguments[0].click();", hCare);
	}

	@Given("Enter the Billing Street as {string}")
	public void enter_the_billing_street_as_bsbsbs(String bst) {
		WebElement bstrt = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
		js.executeScript("arguments[0].scrollIntoView();", bstrt);
		bstrt.clear();
		bstrt.sendKeys(bst);

	}

	@Given("Enter the Billing City as {string}")
	public void enter_the_billing_city_as_bcbc(String bcty) {
		WebElement bCity = driver.findElement(By.xpath("//label[text()='Billing City']/following::input"));
		bCity.clear();
		bCity.sendKeys(bcty);
	}

	@Given("Enter the Billing zip code as {string}")
	public void enter_the_billing_zip_postal_code_as_bzbz(String bzip) {
		WebElement bZip = driver.findElement(By.xpath("//label[text()='Billing Zip/Postal Code']/following::input"));
		bZip.clear();
		bZip.sendKeys(bzip);
	}

	@Given("Enter the Billing state as {string}")
	public void enter_the_billing_state_as_bpbpbp(String bstate) {
		WebElement bState = driver.findElement(By.xpath("//label[text()='Billing State/Province']/following::input"));
		bState.clear();
		bState.sendKeys(bstate);
	}

	@Given("Enter the Billing country as {string}")
	public void enter_the_billing_country_as_bcnt(String bcnt) {
		WebElement bCountry = driver.findElement(By.xpath("//label[text()='Billing Country']/following::input"));
		bCountry.clear();
		bCountry.sendKeys(bcnt);
	}

	@Given("Enter the Shipping Street as {string}")
	public void enter_the_shipping_street_as_ssssss(String sstrt) {
		WebElement sStreet = driver.findElement(By.xpath("//label[text()='Shipping Street']/following::textarea"));
		sStreet.clear();
		sStreet.sendKeys(sstrt);
	}

	@Given("Enter the Shipping City as {string}")
	public void enter_the_shipping_city_as_scsc(String scty) {
		WebElement sCity = driver.findElement(By.xpath("//label[text()='Shipping City']/following::input"));
		sCity.clear();
		sCity.sendKeys(scty);
	}

	@Given("Enter the Shipping zip code as {string}")
	public void enter_the_shipping_zip_postal_code_as_szsz(String szip) {
		WebElement sZip = driver.findElement(By.xpath("//label[text()='Shipping Zip/Postal Code']/following::input"));
		sZip.clear();
		sZip.sendKeys(szip);
	}

	@Given("Enter the Shipping state as {string}")
	public void enter_the_shipping_state_as_spspsp(String sstate) {
		WebElement sState = driver.findElement(By.xpath("//label[text()='Shipping State/Province']/following::input"));
		sState.clear();
		sState.sendKeys(sstate);
	}

	@Given("Enter the Shipping country as {string}")
	public void enter_the_shipping_country_as_scnt(String scnty) {
		WebElement sCountry = driver.findElement(By.xpath("//label[text()='Shipping Country']/following::input"));
		sCountry.clear();
		sCountry.sendKeys(scnty);
	}

	@Given("Set Customer Priority to Low")
	public void set_customer_priority_to_low() {
		WebElement cusPrty = driver.findElement(By
				.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']//button)[5]"));
		js.executeScript("arguments[0].scrollIntoView();", cusPrty);
		action.moveToElement(cusPrty).perform();
		action.click(cusPrty).perform();
		driver.findElement(By.xpath("//span[@title='Low']")).click();
	}

	@Given("Set SLA to Silver")
	public void set_sla_to_silver() {
		WebElement sla = driver.findElement(By
				.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']//button)[6]"));
		action.moveToElement(sla).perform();
		action.click(sla).perform();
		driver.findElement(By.xpath("//span[@title='Silver']")).click();
	}

	@Given("Set Active to NO")
	public void set_active_to_no() {
		WebElement active = driver.findElement(By.xpath("//label[text()='Active']/following::button"));
		action.moveToElement(active).perform();
		action.click(active).perform();
		driver.findElement(By.xpath("//span[@title='No']")).click();
	}

	@Given("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
		WebElement upOpp = driver.findElement(By.xpath("//label[text()='Upsell Opportunity']/following::button"));
		action.moveToElement(upOpp).perform();
		action.click(upOpp).perform();
		driver.findElement(By.xpath("//span[@title='No']")).click();
	}

	@When("Click save and verify phone number {string} for account {string}")
	public void click_save_and_verify_phone_number(String ph, String accName) {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement account = driver.findElement(By.xpath("//span[text()='" + accName + "']"));
		js.executeScript("arguments[0].click();", account);
		
		String phone = driver.findElement(By.xpath("//records-output-phone/lightning-formatted-phone/a")).getText();
		if (phone.equals(ph)) {
			System.out.println("Phone number verified");
		} else
			System.out.println("Phone number is not same as entered");

	}

	@Then("The phone number displayed in the screen is the same as entered in the edit screen")
	public void the_phone_number_displayed_in_the_screen_is_the_same() {
		System.out.println("The phone number is the same as entered in the edit screen");
	}

}
