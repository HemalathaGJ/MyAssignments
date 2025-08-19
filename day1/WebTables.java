package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) {
		// 1.Launching the Browser
		ChromeDriver driver = new ChromeDriver();
		// 2.Loading the erail URL.
		driver.get("https://erail.in/");
		// Maximizing the window
		driver.manage().window().maximize();
		// Adding implicit wait to ensure the web elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Entering "MAS" as the "From" station
		WebElement fromStation = driver.findElement(By.xpath("//table//td/input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		driver.findElement(By.xpath("//div/div[@title='Mgr Chennai Ctr']/div")).click();
		// Entering "MDU" as the "To" station.
		WebElement toStation = driver
				.findElement(By.xpath("//table[@id='tableTopMenu']//td/input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("MDU");
		driver.findElement(By.xpath("//div[@title='Madurai Jn']/div")).click();
		// Unchecking the "Sort on Date" checkbox
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		// Retrieving the train names from the web table
		List<WebElement> trainNames = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		// Getting the train count from the list
		int initialCount = trainNames.size();
		// Declaring a HashSet of String data type to store train names
		// HashSet ignore duplicate values
		Set<String> trnNames = new HashSet<>();
		// Getting the size of the list of trainnames
		int countTrainNames = trainNames.size();
		// Iterating through the list trainNames to get the trainName and add it to the
		// HashSet trnNames as a String
		for (int i = 0; i < countTrainNames; i++) {
			String text = trainNames.get(i).getText();
			trnNames.add(text);
		}
		// Getting the train count from the Set
		int finalCount = trnNames.size();
		// Verifying if there is any duplicate and printing the result
		if (initialCount == finalCount) {
			System.out.println("No duplicate train names");
		} else if (initialCount > finalCount) {
			System.out.println("Duplicate train names were present");
		}
		// Printing all the train names from the Set
		System.out.println("The train names are: " + trnNames);
	}
}
