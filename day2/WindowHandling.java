package week4.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

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
		// Getting parent window handle
		String parent = driver.getWindowHandle();
		// Clicking on the flights link
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		// Getting the title of Flights window
		String title = driver.getTitle();
		// Printing the title of flights window
		System.out.println("We are currently in " + title + " page");
		// Transfer the focus to Parent window
		driver.switchTo().window(parent);
		// Closing the parent window
		driver.close();
	}

}
