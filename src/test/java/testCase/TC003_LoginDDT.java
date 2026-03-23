package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = { "Master", "ddt" })
	public void verify_loginDDT(String em, String pwd, String exp) {

		try {
			logger.info("Starting Test case TC003");

			HomePage HM = new HomePage(driver);
			logger.info("Clicked on my account");
			HM.clickacc();
			logger.info("Clicked on login");
			HM.clicklogin();

			LoginPage LP = new LoginPage(driver);
			logger.info("Providing customer details");
			LP.setemailadd(em);
			LP.setpass(pwd);
			LP.clickloginbtn();

			logger.info("Validating");
			MyAccountPage ac = new MyAccountPage(driver);
			boolean targetpage = ac.ismyaccountpageexists();

			if (exp.equalsIgnoreCase("Valid")) {
				if (targetpage == true) {
					ac.clicklogout();
					Assert.assertTrue(true);

				} else {
					Assert.assertTrue(false);
				}
			}

			if (exp.equalsIgnoreCase("Invalid")) {
				if (targetpage == true) {
					ac.clicklogout();
					Assert.assertTrue(false);

				} else {
					Assert.assertTrue(true);
				}
			}

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("TC003 Execution completed");

	}
}
