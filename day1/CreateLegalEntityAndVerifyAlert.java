package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateLegalEntityAndVerifyAlert extends StaticParameterization {
	@Test
	public void createLegalEntity() throws InterruptedException {
		// Clicking on the toggle menu button from the left corner
		driver.findElement(By
				.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']"))
				.click();
		// Clicking View All and click Legal Entities from App Launcher
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//lightning-input[@class='searchBar slds-form-element']"))
				.sendKeys("Legal Entities", Keys.ENTER);
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		// Clicking on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("(//*[name()='svg' and @data-key='chevrondown'])[10]")).click();
		// Clicking on New Legal Entity
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath(
				"//one-app-nav-bar-menu-item[@class='slds-dropdown__item']//a[@role='menuitem']//span[@class='slds-truncate']//span[text()='New Legal Entity']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		// Entering the Company name as 'TestLeaf'
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		// Entering Description as 'Salesforces'
		driver.findElement(By.xpath("(//label[text()='Description'])/following-sibling::div/textarea"))
				.sendKeys("Salesforces");
		// Selecting Status as 'Active'
		WebElement status = driver.findElement(
				By.xpath("//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']"));
		js.executeScript("arguments[0].scrollIntoView();", status);
		js.executeScript("arguments[0].click();", status);

		driver.findElement(By.xpath("//span[text()='Active']")).click();
		// Clicking on Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		// Verifying the Alert message (Complete this field) displayed for Name
		String alertMsg = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
		if (!(alertMsg.isEmpty())) {
			System.out.println("--------------------");
			System.out.println("The alert message displayed is:");
			System.out.println(alertMsg);
			System.out.println("--------------------");
		}

	}
}
