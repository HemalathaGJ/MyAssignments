package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String fileName;
	
	@DataProvider
    public String[][] sendData() throws IOException {
			return ReadExcel.readData(fileName);    
	}

	@BeforeMethod
	public void preconditions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}
	@AfterMethod
	public void postconditions() {
		driver.close();

	}
}
