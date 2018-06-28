package hris;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "addstatustag")
	private WebElement timeSheet;
	
	@FindBy(className = "user-image")
	private WebElement userMenu;
	
	@FindBy(xpath = "//span[.='Logout']")
	private WebElement logout;
	
	public void clickTime() {
		timeSheet.click();
		
	}
	
	public void clickUserImage() {
		userMenu.click();
		
	}
	
	public void clickLogout() throws InterruptedException {
		Thread.sleep(3000);
		logout.click();
	    }
		
		
	}


