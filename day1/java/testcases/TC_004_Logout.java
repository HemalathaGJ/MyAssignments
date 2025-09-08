package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_004_Logout extends BaseClass{

	@BeforeTest
	public void setFilename() {
		fileName="CreateAccount";

	}

	@Test(dataProvider = "sendData")
	public void createAccount(String uName, String pwd, String accName) throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.enterUsername(uName)
		.enterPassword(pwd)
		.clickLoginButton()
		.clickCRMSFA()
		.clickAccountsLink()
		.clickCreateAccountLink()
		.enterAccountNme(accName)
		.clickCreateAccountButton()
		.verifyAccount()
		.clickLogoutLink();

		
	}

}
