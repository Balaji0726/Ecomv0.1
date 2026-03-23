package testCase;

import org.testng.annotations.Test;

import pageObjects.AccountRegPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import org.testng.Assert;

public class TC001_AccountRegister extends BaseClass {

	@Test(groups = { "Master", "Regression" })
	public void verify_account_reg() {

		try {
			logger.info("Starting Test case TC001");

			HomePage Hm = new HomePage(driver);

			Hm.clickacc();
			logger.info("Clicked on my account");

			Hm.clickreg();
			logger.info("Clicked on register link");

			AccountRegPage acc = new AccountRegPage(driver);
			logger.info("Providing customer details");

			acc.setFristname(randoms());
			acc.setLastname(randoms());
			acc.setEmail(randoms() + "@gamil.com");
			acc.setPass(randoms() + "123gfg4df56");
			acc.agree();
			acc.clickcon();

			logger.info("Validating expected message");
			String confmsg = acc.getconfirmmsg();

			if (confmsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
			} else {
				logger.error("Test failed");
				logger.debug("Debug logs");
				Assert.assertTrue(false);
			}

			// Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		} catch (Exception e) {

			Assert.fail();
		}

		logger.info("TC001 Execution completed");
	}

}
