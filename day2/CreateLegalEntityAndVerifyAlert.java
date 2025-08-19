package week5.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateLegalEntityAndVerifyAlert extends ProjectSpecificMethod {
	@Test
	public void createLegalEntity() throws InterruptedException {
		driver.findElement(By
				.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']"))
				.click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//lightning-input[@class='searchBar slds-form-element']"))
				.sendKeys("Legal Entities", Keys.ENTER);

		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();

		driver.findElement(By.xpath("//*[name()='svg' and @data-key='chevrondown']")).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath(
				"//one-app-nav-bar-menu-item[@class='slds-dropdown__item']//a[@role='menuitem']//span[@class='slds-truncate']//span[text()='New Legal Entity']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//label[text()='Description'])/following-sibling::div/textarea"))
				.sendKeys("Salesforces");
		WebElement element2 = driver.findElement(
				By.xpath("//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		js.executeScript("arguments[0].click();", element2);

		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String alertMsg = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
		if(!(alertMsg.isEmpty())) {
			System.out.println("--------------------");
			System.out.println("The alert message displayed is:");
			System.out.println(alertMsg);
			System.out.println("--------------------");
		}

	}
}
