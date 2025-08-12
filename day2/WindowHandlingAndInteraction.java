package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAndInteraction {

	public static void main(String[] args) throws InterruptedException {
		// 1.Launching the Browser in guest mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// 2.Loading the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Maximizing the window
		driver.manage().window().maximize();
		// Adding implicit wait to ensure the web elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Entering the username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Clicking the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Clicking on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		// Clicking on the Contacts link
		driver.findElement(By.linkText("Contacts")).click();

		// Clicking on Merge Contacts link
		driver.findElement(By.linkText("Merge Contacts")).click();
		// Clicking on the widget of the "From Contact"
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		// Getting the window handles as a Set
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();

		// Defining a List as ArrayList to store the values of window addresses
		List<String> address = new ArrayList<String>(windowHandles);
		// Switching to the Find Contacts window
		driver.switchTo().window(address.get(1));
		// Clicking on the first resulting contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a")).click();
		// Transfer focus to the parent window
		driver.switchTo().window(address.get(0));
		// Clicking on the widget of the "To Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		/*
		 * Since the address of the Find Contacts window changes for the second time we
		 * need to get all the window handles once again and transfer focus to the
		 * windows based on the index of the addresses
		 */
		Thread.sleep(3000);
		Set<String> windowHandles1 = driver.getWindowHandles();

		// Defining a List as ArrayList to store the values of window addresses
		List<String> address1 = new ArrayList<String>(windowHandles1);
		// Switching to the Find Contacts window
		driver.switchTo().window(address1.get(1));

		// Click on the second resulting contact
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]/tbody/tr/td/div/a")).click();
		// Transfer focus to the parent window
		driver.switchTo().window(address1.get(0));
		// Clicking on the Merge button
		driver.findElement(By.className("buttonDangerous")).click();
		// Tranfer focus to Alert window
		Alert alert = driver.switchTo().alert();
		// Accepting the alert
		alert.accept();
		// Verifying the title of the page
		System.out.println(driver.getTitle());
	}

}
