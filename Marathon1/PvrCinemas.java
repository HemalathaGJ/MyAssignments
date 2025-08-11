package Marathon1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		// 1.Launching the Browser
		ChromeDriver driver = new ChromeDriver();

		// 2.Loading the URL
		driver.get("https://www.pvrcinemas.com/");

		// Maximizing the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// 3. Choosing the location as Chennai
		driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//ul[@id='city_list'])/li[text()='Chennai']")).click();

		// 4.Clicking Cinema under Quick Book
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();

		// 5.Selecting the theatre
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();

		// 6.Selecting the date as Tomorrow
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.xpath("//option[text()='Select Date']")).click(); -
		 * clicking by default - so commented this line
		 */
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();

		// 7. Selecting Movie name
		/*
		 * driver.findElement(By.xpath("//span[text()='Select Movie']")).click(); -
		 * clicking by default - so commented this line
		 */
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[4]")).click();

		// 8.Selecting Show Time
		/*
		 * driver.findElement(By.xpath("//span[text()='Select Timing']")); - clicking by
		 * default - so commenting this line
		 */
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();

		// 9.Clicking on the Book button
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();

		// 10.Accepting Terms and Conditions
		driver.findElement(By.xpath("//button[text()='Accept']")).click();

		// 11.Clicking any one available seat
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='seat-current-pvr'][1]")).click();

		// 13.Printing Seat Info under book summary
		System.out.print("Seat Info: ");
		WebElement element = driver.findElement(By.xpath("(//h6[text()='Seat Info'])/following-sibling::p"));
		String seatInfo = element.getText();
		System.out.println(seatInfo);
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='seat-number'])/p"));
		String seatNumber = element2.getText();
		System.out.println(seatNumber);

		// 14.Printing grand total under book summary
		WebElement element4 = driver.findElement(By.xpath("(//div[@class='grand-prices'])/child::h6"));
		String grandTotal = element4.getText();
		System.out.println("Grand Total: " + grandTotal);

		// 12.Clicking Proceed button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

		// 15.Clicking continue button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();

		// 16.Closing the pop up
		Thread.sleep(7000);
		WebElement element3 = driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]"));
		element3.click();

		// 17.Printing current page title
		String title = driver.getTitle();
		System.out.println("Current Page Title: " + title);

		// Closing the browser
		driver.close();
	}
}
