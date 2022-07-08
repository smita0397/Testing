package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.FlipKartLanding;

public class TestSuiteDemo {
	
	WebDriver driver;
	FlipKartLanding fkl;
	
	@BeforeSuite
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuhin\\Downloads\\Compressed\\chromedriver_win32_5\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void testSearching() {
		fkl=new FlipKartLanding(driver);
		fkl.searchProduct();
	}

}
