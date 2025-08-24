package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobileServiceNow {

	public static void main(String[] args) throws InterruptedException {
		// Launching ServiceNow application
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev355356.service-now.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		// Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		// Login with valid credentials username as admin and password
		driver.findElement(By.id("user_name")).sendKeys("admin");
		// Enter the password
		driver.findElement(By.id("user_password")).sendKeys("u-pN7/dGjKC4");
		// Click the Login button
		driver.findElement(By.id("sysverb_login")).click();
		// Creating object for Shadow class to access web elements under shadow root tag
		Shadow shadow = new Shadow(driver);
		// Clicking-All and Entering Service catalog in filter navigator
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		// Clicking the ServiceCatalog
		shadow.findElementByXPath("//mark[@class='filter-match']").click();
		// Clicking on mobiles
		WebElement frameelm = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameelm);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement mobiles = driver.findElement(By.xpath(
				"(//table//tr//td[@id='dropzone2']/div)[4]/div/div[@class='widget_body']/div[@class='homepage_category_only']/a"));
		js.executeScript("arguments[0].scrollIntoView();", mobiles);
		js.executeScript("arguments[0].click();", mobiles);
		// Selecting Apple iphone13pro
		WebElement mobileName = driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']"));
		Actions action = new Actions(driver);
		action.moveToElement(mobileName).perform();
		action.click().perform();
		// Choosing yes option in lost or broken iPhone
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		// Entering phonenumber as 99 in original phonenumber field
		driver.findElement(By.xpath("//span[text()='What was the original phone number?']/following::div/input[2]"))
				.sendKeys("99");
		// Selecting Unlimited from the dropdown in Monthly data allowance
		WebElement allowance = driver
				.findElement(By.xpath("//span[text()='Monthly data allowance']/following::div/select"));
		action.moveToElement(allowance).perform();
		Select dropdown = new Select(allowance);
		dropdown.selectByValue("unlimited");
		// Updating color field to SierraBlue and storage field to 512GB
		WebElement color = driver.findElement(By.xpath("//label[text()='Sierra Blue']"));
		action.moveToElement(color).perform();
		color.click();
		// Updating Storage field to 512GB
		WebElement storage = driver.findElement(By.xpath("//label[contains(text(),'512 GB')]"));
		action.moveToElement(storage);
		storage.click();
		// Clicking on Order now option
		WebElement ordernow = driver.findElement(By.xpath("//button[@id='oi_order_now_button']"));
		action.moveToElement(ordernow);
		ordernow.click();
		// Verifying order is placed
		String submitRequest = driver.findElement(By.xpath("//span[contains(text(),'submitted')]")).getText();
		if (!(submitRequest.isEmpty())) {
			System.out.println("Order is Placed");
		}
		// Printing the Date and time at which the order is placed
		String orderplaced = driver.findElement(By.xpath("//div/dl/dt[1]/following-sibling::dd")).getText();
		System.out.println("Date and Time of placing the order: " + orderplaced);
		// Printing the request number
		WebElement requestelm = driver.findElement(By.xpath("//div/dl/dt[2]/following-sibling::dd/a/b"));
		String requestNumber = requestelm.getText();
		System.out.println("Request Number: " + requestNumber);
		// Taking Screenshot and storing in a specified location
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String destinationPath = "C:/Testleaf/screenshot.png";
		File destinationFile = new File(destinationPath);
		try {
			FileUtils.copyFile(sourceFile, destinationFile);
			System.out.println("Screenshot saved to: " + destinationPath);
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
		}

	}

}
