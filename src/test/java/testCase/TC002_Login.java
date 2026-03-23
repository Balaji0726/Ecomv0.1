package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_Login extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verfiylogin() {

		try {
			logger.info("Starting Test case TC002");

			HomePage HM = new HomePage(driver);
			logger.info("Clicked on my account");
			HM.clickacc();
			logger.info("Clicked on login");
			HM.clicklogin();

			LoginPage LP = new LoginPage(driver);
			logger.info("Providing customer details");
			LP.setemailadd(prop.getProperty("email"));
			LP.setpass(prop.getProperty("password"));
			LP.clickloginbtn();

			logger.info("Validating expected page");
			MyAccountPage ac = new MyAccountPage(driver);
			boolean targetpage = ac.ismyaccountpageexists();

			Assert.assertEquals(targetpage, true, "Login failed");

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("TC002 Execution completed");

	}
}
