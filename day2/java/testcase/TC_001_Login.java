package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethods{
	@BeforeTest
	public void setFilename() {
		fileName="Login";

	}

	@Test(dataProvider = "sendData")
	public void createAccount(String uName, String pwd) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uName)
		.enterPassword(pwd)
		.clickLoginButton();
		
	}

}
