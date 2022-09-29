package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WebBasePage;
import utils.WebTestBase;

public class IndexPage extends WebBasePage {
	
	 WebDriver driver;

	public IndexPage(WebDriver driver) {
		 super(driver, " Index Page");
	        this.driver = driver;
	        
	}
	
	
	public void openURL()
	{
		open("http://automationpractice.com/index.php");
	}
	
	
	public void VerifyTitle()
	{
		String Titlename = driver.getTitle();
	}
	
	 public void ClickDressSection()
	 {
		 click(By.xpath("//div[@id='block_top_menu']/ul/li[2]//a[text()='Dresses']"),"Dress menu Option",20);
	 }
	 
	 public void ClickWomenSection()
	 {
		 click(By.xpath("//a[text()='Women']"),"Women menu Option",20);
	 }
	 
	 public void ClickTshirtSection()
	 {
		 click(By.xpath("//div[@id='block_top_menu']/ul/li[3]//a[text()='T-shirts']"),"Tshirt menu Option",20);
	 }

}
