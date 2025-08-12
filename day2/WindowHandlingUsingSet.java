package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandlingUsingSet {
	public static void main(String[] args) throws InterruptedException {
		// Launching the Browser
		ChromeDriver driver = new ChromeDriver();
		// Loading the URL
		driver.get("https://www.irctc.co.in/");
		// Maximizing the window
		driver.manage().window().maximize();
		// Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// closing the banner
		driver.findElement(By.id("disha-banner-close")).click();
		Thread.sleep(3000);
		// accepting the sweet alert window ( clicked ok button)
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		// Clicking on the flights link
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		// Getting the address of all the open windows
		Set<String> allAddress = driver.getWindowHandles();
		// Defining an array List to store the address of all open windows
		List<String> address = new ArrayList<String>(allAddress);
		// Transferring focus to Flights page
		driver.switchTo().window(address.get(1));
		// Getting the title of flights page
		String childTitle = driver.getTitle();
		// Printing the title of flights page
		System.out.println("Title of Flights Page: " + childTitle);
		// Transferring focus to Parent window
		driver.switchTo().window(address.get(0));
		// Closing the parent window
		driver.close();	}

}
