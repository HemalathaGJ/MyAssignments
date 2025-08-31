package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC_002_Logout extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setFilename() {
		fileName="CreateAccount";

	}

	@Test(dataProvider = "sendData")
	public void createAccount(String uName, String pwd, String accName) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uName)
		.enterPassword(pwd)
		.clickLoginButton()
		.clickcrmsfa()
		.clickAccountsLink()
		.clickCreateAccountLink()
		.enterAccountNme(accName)
		.clickCreateAccountButton()
		.verifyAccount().
		clickLogoutLink();

		
	}


}
