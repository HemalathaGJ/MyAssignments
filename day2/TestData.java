package week3.day2;

public class TestData {

	// Method to enter credentials
	public void enterCredentials() {
		System.out.println("Parent class enter Credentials method");
		System.out.println("Username:Hema");
		System.out.println("Password:welcome123!");
	}

	// Method to navigate to home page
	public void navigateToHomePage() {
		System.out.println("Parent class navigation to home page method");
	}

	public static void main(String[] args) {
		// Creating an object for TestData class
		TestData td = new TestData();
		// Invoking the methods of TestData class using its object
		td.enterCredentials();
		td.navigateToHomePage();

	}

}
