package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_Login extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		fileName="Login";

	}
	
	@Test(dataProvider = "sendData")
	public void login(String username, String password) {
		LoginPage lp=new LoginPage();
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton();
	}

}
