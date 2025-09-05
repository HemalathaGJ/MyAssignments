package steps;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStepDefinition extends BaseClass{
	
	/*@Given("Launch the browser")
	public void launch_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
	}
	@Given("Load the url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@Given("Enter the username as Demosalesmanager")
	public void enter_the_username_as_demosalesmanager() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	}
	@Given("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}*/
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String uname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("It should be able to login")
	public void it_should_be_able_to_login() {
		System.out.println("Login successful");
	}

}
