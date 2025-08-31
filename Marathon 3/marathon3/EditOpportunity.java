package marathon3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditOpportunity extends OpportunityBaseClass{

	@BeforeTest
	public void setValues() {
		System.out.println("Edit Opportunity");
		fileName="EditOpportunity";

	}

	@Test(dataProvider ="sendData", dependsOnMethods = {"marathon3.CreateOpportunity.createNewOpportunity"})
	public void editExistingOpportunity(String searchText, String description) throws InterruptedException {
		// Searching for the Opportunity 'Salesforce Automation by my name'.
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(searchText + Keys.ENTER);
		// Clicking on the Dropdown icon and selecting 'Edit'.
		WebElement dropdown = driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]"));
		js.executeScript("arguments[0].scrollIntoView();", dropdown);
		Actions action=new Actions(driver);
		WebElement svgElm = driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]//*[name()='svg']//*[local-name()='path']"));
		//js.executeScript("arguments[0].click();",svgElm);
		//svgElm.click();
		action.moveToElement(svgElm).perform();
		svgElm = driver.findElement(By.xpath("//table/tbody/tr[1]/td[8]//*[name()='svg']//*[local-name()='path']"));
		action.click(svgElm).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		// Choosing the close date as Tomorrow's date.
		LocalDate tomorrowDate = LocalDate.now().plusDays(1);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedTomorrowDate = tomorrowDate.format(formatter);
		WebElement closeDate = driver.findElement(By.xpath(
				"//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input"));
		closeDate.clear();
		closeDate.sendKeys(formattedTomorrowDate);
		// Selecting the 'Stage' as 'Perception Analysis'.
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Perception Analysis']")).click();
		// Selecting 'Delivery/Installation Status' as 'In Progress'.
		WebElement diDropdown = driver.findElement(By.xpath("(//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']//button)[5]"));
		js.executeScript("arguments[0].scrollIntoView();", diDropdown);
		diDropdown.click();
		WebElement deliveryStatus = driver.findElement(By.xpath("//span[text()='In progress']"));
		//js.executeScript("arguments[0].scrollIntoView();", deliveryStatus);
		//deliveryStatus.click();
		action.moveToElement(deliveryStatus).perform();
		deliveryStatus=driver.findElement(By.xpath("//span[text()='In progress']"));
		action.click(deliveryStatus).perform();
		// Entering Description as 'SalesForce'.
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(description);
		// Clicking on 'Save' and verifying the message
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		System.out.println(searchText);
		String msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(msg);
		Assert.assertTrue(msg.contains(searchText), "Verify the Stage");
	}

}
