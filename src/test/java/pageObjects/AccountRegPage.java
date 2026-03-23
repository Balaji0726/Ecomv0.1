package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage {
	
	
public AccountRegPage (WebDriver driver)
{
	super(driver);
}
	
@FindBy(xpath = "//input[@id='input-firstname']")
WebElement fristname;

@FindBy(xpath = "//input[@id='input-lastname']")
WebElement lastname;

@FindBy(xpath = "//input[@id='input-email']")
WebElement email;

@FindBy(xpath = "//input[@id='input-password']")
WebElement pass;

@FindBy(xpath = "//input[@name='agree']")
WebElement privacyagree;

@FindBy(xpath = "//button[normalize-space()='Continue']")
WebElement continu;
	
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
WebElement confrimmsg;
	
	
	
public void setFristname (String fname) {
	
	fristname.sendKeys(fname);
}
	
public void setLastname (String Lname) {
	
	lastname.sendKeys(Lname);
}
	
public void setPass (String password) {
	
	pass.sendKeys(password);
}
	
public void setEmail (String mail) {
	
	email.sendKeys(mail);
}	
	
public void agree () {
	
	privacyagree.click();
}	

public void clickcon () {
	
	continu.click();
}	
	
public String getconfirmmsg() {
	try {
	return confrimmsg.getText();
	}
	catch(Exception e) {
		
		return e.getMessage();
	}
}
	
	
	

}
