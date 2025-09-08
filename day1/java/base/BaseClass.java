package base;

import java.io.IOException;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<ChromeDriver> RemoteWebDriver = new ThreadLocal<ChromeDriver>();

	public void setDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		RemoteWebDriver.set(driver);

	}

	public ChromeDriver getDriver() {
		ChromeDriver driver = RemoteWebDriver.get();
		return driver;
	}

	public String fileName;

	@BeforeMethod
	public void preConditions() {

		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().window().maximize();

	}

	@AfterMethod
	public void postConditions() {
		getDriver().close();

	}

	@DataProvider
	public String[][] sendData() throws IOException {

		// String[][] readData = ReadExcel.readData();
		// return readData;
		return ReadExcel.readData(fileName); // CreateLead

	}

}
