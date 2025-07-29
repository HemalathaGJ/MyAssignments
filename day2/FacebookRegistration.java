package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Keerthi");
		driver.findElement(By.name("lastname")).sendKeys("Pugazh");
		WebElement day = driver.findElement(By.id("day"));
		Select dropdown = new Select(day);
		dropdown.selectByIndex(20);
		WebElement month = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(month);
		dropdown1.selectByValue("8");
		WebElement year = driver.findElement(By.id("year"));
		Select dropdown2 = new Select(year);
		dropdown2.selectByValue("1997");
		driver.findElement(By.xpath("//input[@wfd-id='id6']")).click();
		driver.findElement(By.xpath("//input[@wfd-id='id10']")).sendKeys("gjhema@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("TstAuto1_Chk");
		driver.findElement(By.name("websubmit")).click();
		driver.close();

	}

}
