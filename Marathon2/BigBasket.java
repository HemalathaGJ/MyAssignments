package Marathon2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Loading the url
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Clicking on 'Shop By' dropdown
		driver.findElement(By.xpath("(//span[text()='Shop by'])[2]")).click();
		Thread.sleep(3000);
		// Selecting Foodgrains, oil & Masala
		WebElement foodgrains = driver.findElement(By.xpath("(//li[7]/a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(foodgrains).perform();
		// Selecting Organic Staples
		Thread.sleep(3000);
		WebElement organicStaples = driver.findElement(By.xpath("//li/a[text()='Organic Staples']"));
		action.moveToElement(organicStaples).perform();
		// Selecting Organic dry fruits
		Thread.sleep(3000);
		WebElement organicdryfruits = driver.findElement(By.xpath("//ul/li[2]/a[text()='Organic Dry Fruits']"));
		action.moveToElement(organicdryfruits).perform();
		action.click(organicdryfruits).perform();
		// Getting the price of all producted listed in the page and add them in an
		// array list
		Thread.sleep(3000);
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='mt-5 grid gap-6 grid-cols-9']/li"));
		System.out.println(lists.size());
		List<String> price = new ArrayList<String>();
		for (int i = 1; i < lists.size(); i++) {
			Thread.sleep(3000);
			// WebElement productelm =
			// driver.findElement(By.xpath("(//div[@class='break-words h-10
			// w-full'])["+i+"]/h3"));
			// String productName = productelm.getText();
			WebElement productpriceelm = driver
					.findElement(By.xpath("(//span[contains(@class,'Pricing___StyledLabel-sc-pldi2d')])[" + i + "]"));
			String productprice = productpriceelm.getText();
			price.add(productprice);
		}
		// Printing the price of all products
		System.out.println("Price of all products: " + price);
		// Clicking the first product
		driver.findElement(By.xpath("//div[@class='break-words h-10 w-full']/h3")).click();
		// Getting the price of the first product
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> address = new ArrayList<String>(windowHandles);
		driver.switchTo().window(address.get(1));
		String priceOfFirstItem = driver
				.findElement(
						By.xpath("//section[@class='Description___StyledSection-sc-82a36a-0 jMGGnR']//table/tr[2]/td"))
				.getText();
		String priceOfFirstItemInList = price.get(0).toString();
		// Verifying if the price of the first product and price of first item in the
		// list are same
		if (priceOfFirstItem.contains(priceOfFirstItemInList)) {
			System.out.println("The Price of first item in the List and the Price of the first item selected are same"
					+ priceOfFirstItem);
		}

	}

}
