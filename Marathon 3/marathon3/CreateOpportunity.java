package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateOpportunity extends OpportunityBaseClass{

	@BeforeTest
	public void setValues() {
		System.out.println("CreateOpportunity");
		fileName="CreateOpportunity";

	}

    @Test(dataProvider ="sendData")
	public void createNewOpportunity(String opportunityName,String amount) throws InterruptedException {
    	// Clicking on the "New" button.
        driver.findElement(By.xpath("//a[@title='New']")).click();
       // Entering the Opportunity name as 'Salesforce Automation by Hemalatha'.
        driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys(opportunityName);
        //Entering Amount as 75,000
        driver.findElement(By.xpath("(//label[text()='Amount']/following::input)[1]")).sendKeys(amount);
        //Choosing the close date as Today.
        WebElement closeDate = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input"));
        js.executeScript("arguments[0].scrollIntoView();", closeDate);
        closeDate.click();
        WebElement todayDate = driver.findElement(By.xpath("//button[text()='Today']"));
        todayDate.click();
        // Selecting 'Stage' as 'Need Analysis'
        driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']")).click();
        driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Needs Analysis']")).click();
        // Click on the 'Save' button 
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        //  verifying the Opportunity Name.
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(opportunityName),"Verify the Opportunity name");
    }

}
