package week3.day2;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks() {
		// invoking performCommonTasks method of Parent class by using super keyword
		super.performCommonTasks();
		System.out.println("Child class perform common tasks method");

	}

	public static void main(String[] args) {
		// Creating an object for LoginPage class
		LoginPage lp = new LoginPage();
		// Invoking all the methods of Parent class BasePage except performCommonTasks
		// method
		// performCommonTasks method will be invoked from child class LoginPage if it is
		// called using the object of LoginPage
		lp.performCommonTasks();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		// Creating an object of Parent class BasePage
		BasePage bp = new BasePage();
		// Invoking performCommonTasks method of Parent class using Parent Class's
		// object
		bp.performCommonTasks();

	}

}
