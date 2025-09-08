package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_003_CreateAccount extends BaseClass{
	
	@BeforeTest
	public void setFilename() {
		fileName="CreateAccount";

	}

	@Test(dataProvider = "sendData")
	public void createAccount(String uName, String pwd, String accName) {
		LoginPage lp=new LoginPage();
		lp.enterUsername(uName)
		.enterPassword(pwd)
		.clickLoginButton()
		.clickCRMSFA()
		.clickAccountsLink()
		.clickCreateAccountLink()
		.enterAccountNme(accName)
		.clickCreateAccountButton()
		.verifyAccount();

	}

}
