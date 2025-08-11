package Marathon1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {
	public static void main(String[] args) {
		// 1.Launching the Browser
		ChromeDriver driver = new ChromeDriver();
		// 2.Loading the URL
		driver.get("https://www.amazon.in/");
		// Maximizing the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		// Clicking the Search icon
		driver.findElement(By.id("nav-search-submit-button")).click();
		// Code to display the number of bags displayed in the page
		String resultsFor = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String searchText = driver.findElement(By.xpath("(//span[contains(text(),'results for')])/following-sibling::span[2]")).getText();
		System.out.println("Total result count: " + resultsFor + " " + searchText);
		// Clicking first 2 Brand names from left menu
		driver.findElement(By.xpath("//span/a/span[contains(text(),'Skybags')]")).click();
		driver.findElement(By.xpath("//span/a/span[contains(text(),'Safari')]")).click();
		// Clicking Newest Arrivals from sort by dropdown list
		driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
		driver.findElement(By.id("s-result-sort-select_4")).click();
		// Getting first resulting bag name and price
		String bagName = driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[1]/a/h2/span")).getText();
		String price = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getText();
		// Printing first resulting bag name and price
		System.out.println("First Resulting Bag Info: ");
		System.out.println("Bag Name: " + bagName);
		System.out.println("Price: " + price);
		// Getting the page title and printing
		String title = driver.getTitle();
		System.out.println("Page Title " + title);

	}
}