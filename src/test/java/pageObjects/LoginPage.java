package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement emailaddress;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement pass;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbttn;

	public void setemailadd(String em) {
		emailaddress.sendKeys(em);
	}

	public void setpass(String pa) {
		pass.sendKeys(pa);
	}

	public void clickloginbtn() {

		loginbttn.click();
	}
}
