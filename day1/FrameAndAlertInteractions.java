package week5.day1;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlertInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Launching the Browser
		ChromeDriver driver = new ChromeDriver();
		// 2.Loading the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		// Maximizing the window
		driver.manage().window().maximize();
		// Switching to the frame
		driver.switchTo().frame(0);
		// Adding implicit wait to ensure the web elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// clicking the Try it button
		driver.findElement(By.tagName("button")).click();
		// Switching to Alert
		Alert promptAlert = driver.switchTo().alert();
		// Clicking ok button
		promptAlert.accept();
		// Clicking cancel button
		// promptAlert.dismiss();
		// Getting the text that is displayed after clicking one of the buttons of
		// prompt alert
		String action = driver.findElement(By.id("demo")).getText();
		// Verifying the text based on the action performed
		if (action.contains("cancelled")) {
			System.out.println("Cancel button clicked");
		} else
			System.out.println("Ok button clicked");
	}
}
