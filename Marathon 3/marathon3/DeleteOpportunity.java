package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteOpportunity extends OpportunityBaseClass{
	
	@BeforeTest
	public void setValues() {
		System.out.println("DeleteOpportunity");
		fileName="DeleteOpportunity";

	}


	@Test(dataProvider="sendData", dependsOnMethods = {"marathon3.CreateOpportunity.createNewOpportunity","marathon3.EditOpportunity.editExistingOpportunity"})
    public void deleteOpportunity(String searchText) throws InterruptedException {
		// Searching for the Opportunity 'Salesforce Automation by Hemalatha'.
      	driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(searchText + Keys.ENTER);
        Thread.sleep(2000);
        // Clicking on the Dropdown icon and selecting 'Delete'.
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
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		// Clicking Delete button in the confirmation dialog box
		driver.findElement(By.xpath("//button[@title='Delete']")).click();
		// Verifying whether the Opportunity is deleted using the Opportunity Name.
		String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		System.out.println(toastMessage);
		System.out.println(searchText);
		Assert.assertTrue(toastMessage.contains(searchText),"Verify the deleted Opportunity name");
		
        
    }


}
