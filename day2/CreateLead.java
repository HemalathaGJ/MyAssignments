package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		// Launch the browser		
		ChromeDriver driver = new ChromeDriver(options);				
		driver.get("http://leaftaps.com/opentaps/control/main");		
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.xpath("//input[contains(@id,'word')]")).sendKeys("crmsfa");
		// Click the Login button		
		driver.findElement(By.className("decorativeSubmit")).click();
		// Clcik on the CRMSFA link		
		driver.findElement(By.partialLinkText("CRM")).click();
		// Click on the Leads link		
		driver.findElement(By.linkText("Leads")).click();
		// Click on the Create Lead link		
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter company name		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Enter first name		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemalatha");
		// Enter the last name		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("GJ");
		// Step1: Find the dropdown element	
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Lead");
		driver.findElement(By.name("submitButton")).click();
		driver.close();


	}

}
