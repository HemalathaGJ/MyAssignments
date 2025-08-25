package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends StaticParameterization{
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		String data[][]=new String[2][1];
		data[0][0]="Salesforce Automation by Hemalatha";
		data[1][0]="Salesforce Automation by Hemalatha GJ";
		return data;
	}
	
	@Test(dataProvider ="fetchData")
	public void createLegalEntity(String legalEntityName) throws InterruptedException {
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
		//Entering the legal entity name
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(legalEntityName);
		// Entering the Company name as 'TestLeaf'
		//driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyName);
		// Clicking Save
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		// Verifying the legal entity name
		WebElement leName = driver.findElement(By.xpath("//slot[@name='outputField']/lightning-formatted-text"));
		String leEnName=leName.getText();
		if(leEnName.equalsIgnoreCase(legalEntityName)) {
			System.out.println("The Legal Entity name displayed is the same as the name passed as a parameter for Legal Entity name "+legalEntityName);
		}
		}


}
