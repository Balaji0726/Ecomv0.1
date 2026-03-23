package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myacc;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement reg;

	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement login;

	public void clickacc() {

		myacc.click();
	}

	public void clickreg() {

		reg.click();
	}

	public void clicklogin() {

		login.click();
	}

}
