package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import steps.BaseClass;

public class HooksImplementation extends BaseClass {
	
	@Before
	public void preConditions() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	
	@After
	public void postConditions() {
		driver.close();

	}

}
