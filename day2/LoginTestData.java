package week3.day2;

// LoginTestData class inherits TestData class
public class LoginTestData extends TestData {

	// Method to enter username
	public void enterUsername() {
		System.out.println("Child class enter username method");
		System.out.println("Username:Hemalatha");
	}

	// Method to enter password
	public void enterPassword() {
		System.out.println("Child class enter password method");
		System.out.println("Password:Greetings123!");

	}

	public static void main(String[] args) {
		// Creating an object for the child class LogintestData
		LoginTestData ltd = new LoginTestData();
		// Invoking the parent class and child class methods using the child class
		// object
		ltd.enterCredentials();
		ltd.enterUsername();
		ltd.enterPassword();

	}

}
