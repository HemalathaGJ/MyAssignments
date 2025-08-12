package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowestPhonePriceAmazon {

	public static void main(String[] args) throws InterruptedException {
		// Launching the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		// Maximizing the window
		driver.manage().window().maximize();
		// Typing Mobile Phones in the Search field
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones");
		// Clicking the Search icon
		driver.findElement(By.id("nav-search-submit-button")).click();
		// Defining Array List
		List<WebElement> ele = new ArrayList<WebElement>();
		// Getting all the webelements selected using the xpath
		ele = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		// Defining array list of Integer data type
		List<Integer> priceList = new ArrayList<Integer>();
		// Counting the number of elements in the list
		int size = ele.size();
		// Declaring a String variable to store the Price of all items in the List
		String text;

		for (int i = 0; i < size; i++) {
			// Storing the Price as a text in the String variable
			text = ele.get(i).getText();
			// Replacing comma in the Price values with empty String
			text = text.replace(",", "");
			// Parsing the String values to Integer values if the text value is not empty
			// and adding the Integer values to list of Integer data type
			if (!text.isEmpty()) {
				int price = Integer.parseInt(text);
				priceList.add(price);
			}
		}
		// Sorting the list of Integer data type in ascending order
		Collections.sort(priceList);
		// Getting the lowest price
		int lowestPrice = priceList.get(0);
		// Printing the lowest Price value
		System.out.println("Lowest Price of Mobile phones listed in the page: " + lowestPrice);

	}

}
