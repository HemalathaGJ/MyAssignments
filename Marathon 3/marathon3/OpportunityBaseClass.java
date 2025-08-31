package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class OpportunityBaseClass {
	public ChromeDriver driver;
	public JavascriptExecutor js; 
	public String fileName;
	
	@DataProvider
    public String[][] sendData() throws IOException {	
  	return ReadExcel.readData(fileName);  

	}

	@Parameters({"param1", "param2", "param3"})
	@BeforeMethod
	public void preconditions(String url,String username,String password) throws InterruptedException {
		// Launching the browser
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        // Adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Loading the url
        driver.get(url);
        // Entering credentials
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        // Clicking Login button
        driver.findElement(By.id("Login")).click();
        // Clicking on the toggle menu button in the left corner.
        driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(3000);
		// Clicking on "View All"
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		// selecting "Sales" from the App Launcher
		driver.findElement(By.xpath("//lightning-input[@class='searchBar slds-form-element']")).sendKeys("Sales",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
		// clicking Opportunity tab
		WebElement opportunitiesTab = driver.findElement(By.xpath("//a[@title='Opportunities']"));
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", opportunitiesTab);
}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}
