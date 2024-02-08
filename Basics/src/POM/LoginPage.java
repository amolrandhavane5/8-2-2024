package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterCred(String user, String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void clcikButton() {
		
		button.click();
	}
	
	public String getText() {
		
		return button.getText();
	}
}