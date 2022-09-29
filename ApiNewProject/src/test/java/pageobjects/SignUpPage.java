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
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 enter(By.xpath("//input[@id='email']"), value,"Enter Email ID", 30);
		 
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value);
	 }
	
	 public void enterPassword(String value)
	 
	 {
		 enter(By.xpath("//input[@id='passwd']"), value,"Enter Password", 30);
		 //driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(value);
	 }
	 
	  public void clickSignIn()
	  {
		  click(By.xpath("//button[@id='SubmitLogin']"),"Sign In Button",25);
	  }

}
