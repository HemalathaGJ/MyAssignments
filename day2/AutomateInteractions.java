package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutomateInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// driver.findElement(By.xpath("//input[contains(@id,'word')]")).sendKeys("crmsfa");
		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Hemalatha");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(industry);
		dropdown.selectByValue("IND_SOFTWARE");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown1 = new Select(ownership);
		dropdown1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select dropdown2 = new Select(source);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown3 = new Select(marketingCampaign);
		dropdown3.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown4 = new Select(state);
		dropdown4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();

	}

}
