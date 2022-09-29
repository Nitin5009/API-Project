package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WebBasePage;

public class SignUpPage extends WebBasePage {
	
	
	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		 super(driver, " Index Page");
	        this.driver = driver;
	        
	}
	
	
	public void signUp()
	{
		click(By.xpath("//a[@class='login']")," Sign Up Link",25);
	}
	
	 public void enterEmailID(String value)
	 {
		 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value);
	 }
	
	 public void enterPassword(String value)
	 {
		 driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(value);
	 }
	 
	  public void clickSignIn()
	  {
		  click(By.xpath("//button[@id='SubmitLogin']"),"Sign In Button",25);
	  }

}
