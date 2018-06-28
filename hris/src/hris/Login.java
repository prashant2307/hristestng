package hris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	public  Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className ="active ")
	private WebElement loginClick;
	
	@FindBy(id="txtUserName")
	private WebElement username;
	
	@FindBy(id = "txtPassword")
	private WebElement password;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement submit;
	
	public void chooseLogin() {
		loginClick.click();
	}
	
	public void clickSubmit() {
		username.sendKeys("prashant1");
		password.sendKeys("Prashant@321#");
		submit.click();
	}

}
