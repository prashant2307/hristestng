package hris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testhris {
	WebDriver driver;
	String url = "https://hris.qainfotech.com";
	
	@BeforeTest
	public void startBrowser() {
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	@Test(priority = 0)
	public void submitlogin() {
	Login obj = new Login(driver);
	obj.chooseLogin();
	obj.clickSubmit();
	}
	
	@Test(priority = 1)
	public void checkTime() throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.clickTime();
		obj.clickUserImage();
		obj.clickLogout();
		
	}
	
	
	
//	@Test
//	public void foo() {
//		driver = new ChromeDriver();
//		driver.get("https://hris.qainfotech.com");
//		driver.findElement(By.xpath("//*[@id=\"demo-2\"]/div/div[2]/ul/li[1]/a")).click();
//		
//	}
//	@Test
//	public void g() {
//		
//		driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("prashant1");
//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Prashant@321#");
//		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[2]/div/input")).click();
//		
//	}
//	
//	@Test 
//	public void h() {
//		driver.findElement(By.id("addstatustag")).click();
//	}

}
