package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipKartLanding {
	WebDriver driver;
	//Page factory--> 
	@FindBy(xpath= "//input[@name='q']")WebElement	searchbox;
	//WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
	@FindBy(xpath="//a[text()='Login']")WebElement loginbtn;
	//driver.findElement(By.xpath("//button[text()='✕']")).click();
	@FindBy(xpath="//button[text()='✕']") WebElement popupcloser;
	
	
	public FlipKartLanding(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchProduct() {
		popupcloser.click();
		searchbox.sendKeys("Laptop table");
		searchbox.sendKeys(Keys.ENTER);
		
		
		
	}
	
	
	
	

}
