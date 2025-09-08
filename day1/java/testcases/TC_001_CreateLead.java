package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_CreateLead extends BaseClass {
	
	
	@BeforeTest
	public void setValues() {
		fileName="CreateLead";

	}
	
	
	
	@Test(dataProvider = "sendData")
	public void createLead(String uName, String pWord, String cName, String fName, String lName) {
		LoginPage lp=new LoginPage();
		lp.enterUsername(uName)
		.enterPassword(pWord)
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstname(fName)
		.enterLastname(lName)
		.clickCreateLeadButton()
		.verifyLead();
	}

}
//@Test     @BeforeMethod    @AfterMethod