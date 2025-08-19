package week5.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
    @Parameters({"param1", "param2", "param3"})
    @BeforeMethod
    public void precondition(String p1,String p2,String p3) {
    	// 1.Launching the Browser in guest mode
    			ChromeOptions options = new ChromeOptions();
    			options.addArguments("guest");

    			// Launch the browser
    			driver = new ChromeDriver(options);

    			
    			driver.manage().window().maximize();
    			
    			driver.get(p1);
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    			
    			driver.findElement(By.id("username")).sendKeys(p2);
    			driver.findElement(By.id("password")).sendKeys(p3);
    			driver.findElement(By.xpath("//div[@id='theloginform']//input[@id='Login']")).click();

	}
    @AfterMethod
    public void postcondition() {
		//driver.close();

	}

}
