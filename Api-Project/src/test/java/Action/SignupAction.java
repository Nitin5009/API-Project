package Action;

import org.openqa.selenium.WebDriver;

import pageobjects.IndexPage;
import pageobjects.SignUpPage;

public class SignupAction {
	
	
	WebDriver driver;
    SignUpPage signuppage;

    public SignupAction(WebDriver driver) {
        this.driver = driver;
        signuppage = new SignUpPage(driver);
    }
    
    
    public void enterSignUpDetails(String emailid , String Password)
    {
    	signuppage.signUp();
    	signuppage.enterEmailID(emailid);
    	signuppage.enterPassword(Password);
    	signuppage.clickSignIn();
    	
    }
    
    

}
