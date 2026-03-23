package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement myaccountmsg;

	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logout;

	public void clicklogout() {
		logout.click();
	}

	public boolean ismyaccountpageexists() {
		try {
			return myaccountmsg.isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}

}
